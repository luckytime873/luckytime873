package com.guimei.zyh.web;

import com.guimei.zyh.pojo.Cart;
import com.guimei.zyh.pojo.CartItem;
import com.guimei.zyh.pojo.Page;
import com.guimei.zyh.pojo.Good;
import com.guimei.zyh.service.CartRecService;
import com.guimei.zyh.service.ProductService;
import com.guimei.zyh.service.impl.CartServiceImpl;
import com.guimei.zyh.service.impl.ProductServiceImpl;
import com.guimei.zyh.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/***
 * 作者：朱宇欢
 */

public class CartServlet {
    private CartRecService cartRecService=new CartServiceImpl();
    private ProductService productService=new ProductServiceImpl();

    //删除和修改购物车的操作只是和session进行交互，保存历史购物车记录才会恶化数据库进行交互
    protected  void deleteCartItem(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id=Integer.valueOf(req.getParameter("id"));
        HttpSession session=req.getSession();
        Map<Integer , CartItem> cartRecMap=(Map<Integer, CartItem>) session.getAttribute("cart");
        cartRecMap.remove(id);
        req.getRequestDispatcher("./pages/buy.jsp").forward(req,resp);

    }
    protected void modifyCartRec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id=Integer.valueOf(req.getParameter("id"));
        Integer num=Integer.valueOf(req.getParameter("num"));
        HttpSession session=req.getSession();
        Map<Integer , CartItem> cartRecMap=(Map<Integer, CartItem>) session.getAttribute("cart");
        CartItem cartItem =cartRecMap.get(id);
        cartItem.setNum(num);
        req.getRequestDispatcher("./pages/buy.jsp").forward(req,resp);
    }
    protected void page(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1 获取请求的参数 pageNo 和 pageSize
        int pageNo = WebUtils.parseInt(req.getParameter("pageNo"), 1);
        int pageSize = WebUtils.parseInt(req.getParameter("pageSize"), Page.PAGE_SIZE);

        Page<CartItem> page = cartRecService.getCartRecPages(pageNo,pageSize);
        page.setUrl("cartRecServlet?action=page");
        //3 保存Page对象到Request域中
        req.setAttribute("page",page);
        req.getRequestDispatcher("./pages/buy.jsp").forward(req,resp);
    }


    protected  void clear(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();//获取session中的uid；
        Integer uid=(Integer) session.getAttribute("uid");
        cartRecService.clearCart(uid);
        req.getRequestDispatcher("./pages/buy.jsp").forward(req,resp);
    }

    protected  void saveCart(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();//获取session中的uid；
        Map<Integer, CartItem> cartRecMap=(Map<Integer, CartItem> )session.getAttribute("cart");
        cartRecService.saveCart(cartRecMap);
        req.getRequestDispatcher("./pages/buy.jsp").forward(req,resp);
    }



    protected void addToCart(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();

        Map<Integer, CartItem> cartRecMap=(Map<Integer, CartItem>) session.getAttribute("cart");
        if(cartRecMap==null){
            cartRecMap=new HashMap<Integer, CartItem>() ;
            session.setAttribute("cart",cartRecMap);
        }else{
            Integer pid= Integer.valueOf(req.getParameter("pid"));
            CartItem cartItem =new CartItem();
            Good product=productService.getOneProduct(pid);
            cartItem.setpName(product.getpName());
            cartItem.setPri(product.getPrice());
            cartItem.setDiscount(product.getDiscount());
            Cart cart=new Cart();
            cart.setCart((Map<Integer, CartItem>) session.getAttribute("cart"));
            cart.addItem(cartItem);
        }
        req.getRequestDispatcher("./pages/buy.jsp").forward(req,resp);

    }






}
