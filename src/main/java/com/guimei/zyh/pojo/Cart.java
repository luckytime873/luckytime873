package com.guimei.zyh.pojo;


import java.util.LinkedHashMap;
import java.util.Map;

/***
 * 作者：朱宇欢
 */

//对购物车进行增删改查操作
//对于购物车的设计有两种
//1，用户的购物车记录只是保存在session中每次用户重新进入系统的时候用户的购物车记录是空的
//2.用户的购物车记录保存在数据库中，那么用户不仅可以从商品页面添加新的商品到购物车，同时也可以在购物车中先择历史购物记录进行结算生成订单进行支付
// 同时会将用户的购物车记录保存在数据库中，成为历史的购物车记录，方便用户下次直接在购物车中筛选自己想要购买的商品
//购物车 一个用户对应一个购物车 一个购物车包含多个商品  每个商品对应各自的数量
public class Cart {
    private Integer uid;
    private Integer id;
    private Integer count;
    private Map<Integer, CartItem> cart= new LinkedHashMap<Integer, CartItem>();; //商品的id 根据商品的id查询到商品的相应信息  可放在sessions里面

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Map<Integer, CartItem> getCart() {
        return cart;
    }

    public void setCart(Map<Integer, CartItem> cart) {
        this.cart = cart;
    }

    public void addItem(CartItem cartItem) {
        // 先查看购物车中是否已经添加过此商品，如果已添加，则数量累加，总金额更新，如果没有添加过，直接放到集合中即可
        CartItem item = cart.get(cartItem.getId());

        if (item == null) {
            // 之前没添加过此商品
            cart.put(cartItem.getId(), cartItem);
        } else {
            // 已经 添加过的情况
            cartItem.setNum( cartItem.getNum() + 1 ); // 数量 累加
            cartItem.setTotal( cartItem.getPri()* cartItem.getNum()* cartItem.getDiscount() ); // 更新总金额
        }

    }

    public void deleteItem(Integer id) {
        cart.remove(id);
    }

    public Integer getId() {
        return id;
    }

    public void clear() {
        cart.clear();
    }

    public void updateCount(Integer id,Integer count) {
        // 先查看购物车中是否有此商品。如果有，修改商品数量，更新总金额
        CartItem cartItem = cart.get(id);
        if (cartItem != null) {
            cartItem.setNum(count);// 修改商品数量
            cartItem.setTotal( cartItem.getPri()*cartItem.getNum()* cartItem.getDiscount() ); // 更新总金额
        }
    }

//获取购物车的商品总数量
    public Integer getTotalCount() {
        Integer totalCount = 0;

        for (Map.Entry<Integer, CartItem>entry : cart.entrySet()) {
            totalCount += entry.getValue().getNum();
        }

        return totalCount;
    }


//获取购物车的总价
    public float getTotalPrice() {
        float totalPrice =0.0f;

        for (Map.Entry<Integer, CartItem>entry :cart.entrySet()) {
            totalPrice = totalPrice+=entry.getValue().getTotal();
        }

        return totalPrice;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Map<Integer, CartItem> getItems() {
        return cart;
    }

    public void setItems(Map<Integer, CartItem> items) {
        this.cart= items;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }


}
