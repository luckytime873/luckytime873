package com.guimei.zyh.web;

import com.guimei.zyh.pojo.User;
import com.guimei.zyh.service.UserService;
import com.guimei.zyh.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/***
 * 作者：朱宇欢
 */

@WebServlet(name = "UserServlet", value = "/UserServlet")
public class UserServlet extends BaseServlet {
    private UserService userService=new UserServiceImpl();


    //登陆成功之后把用户名和密码放在session中 ，判断用户当前的状态
    public void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String mima=req.getParameter("password");
       User user= userService.existUser(username);
       if(user==null){
           System.out.println("该用户不存在，注册之后再进行登录");
           req.setAttribute("key","login_fail");
           //登录失败跳转到注册页面
             //jsp页面取出登录注册的信息进行显示
           resp.sendRedirect("./pages/login_fail.jsp");

       }else{
           System.out.println("登陆成功");
           String userName=req.getParameter("username");
           HttpSession httpSession=req.getSession();
           httpSession.setAttribute("status","login_success");
           Integer uid=userService.getUid(userName);
           httpSession.setAttribute("uid",uid);
           resp.sendRedirect("./pages/login_success.jsp");
           //生成休眠器 休眠一段时间后跳转到拎一个页面
           try {
               // 使主线程休眠5秒（5000毫秒）
               System.out.println("开始休眠...");
               Thread.sleep(5000);
               resp.sendRedirect("./pages/index.jsp");
               System.out.println("休眠结束");
           } catch (InterruptedException e) {
               // 如果线程在休眠期间被中断，这里会捕获到InterruptedException
               System.out.println("休眠被中断");
           }

       }

    }

    public void register(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        User user=new User();
        String username=req.getParameter("username");
        String mima=req.getParameter("password");
        Integer sex=Integer.valueOf(req.getParameter("gender"));
        String hobby=req.getParameter("hobby");
        String hobby2=req.getParameter("hobby2");
        String hobby3=req.getParameter("hobby3");
        userService.addUser(user);//添加用户到数据库
        if(userService.addUser(user)==1){
            resp.sendRedirect("/pages/register_success.jsp");
        }else {
            resp.sendRedirect("/pages/register.jsp");
        }

    }






}
