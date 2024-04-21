package com.guimei.zyh.pojo;



/***
 * 作者：朱宇欢
 */

//注意商品进入账单就算做售出，就要对销量进行修改

public class Good {
    private Integer id;

    private Integer catId; //类别id;
    private String catName;//商品类别名称
    private String pName;//商品名称

    private String tim; //商品的大图
    private String  sim1;
    private String sim2;
    private String sm3;
    private String sm4;
    private String sm5;
    private String alt;

    private Integer discount;

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    private Integer price;//商品价格
    private Integer trFee;  //商品运费
    private String claim;//商品交付说明
    private String des;//商品描述
    private String remainTime;//剩余时间
    private Integer  latterNUm;//销售数量
    private Integer  totalNUm; //总的销量
    private String tag;// 商品的新旧程度
    private String origin;//产地
    private Integer remain;//剩余的数量（未售出） 商品数量
    private Integer observeTimes;//浏览次数

    public Good(Integer id, Integer catId, String catName, String pName, String tim, String sim1, String sim2, String sm3, String sm4, String sm5, String alt, Integer price, Integer trFee, String claim, String des, String remainTime, Integer latterNUm, Integer totalNUm, String tag, String origin, Integer remain, Integer observeTimes) {
        this.id = id;
        this.catId = catId;
        this.catName = catName;
        this.pName = pName;
        this.tim = tim;
        this.sim1 = sim1;
        this.sim2 = sim2;
        this.sm3 = sm3;
        this.sm4 = sm4;
        this.sm5 = sm5;
        this.alt = alt;
        this.price = price;
        this.trFee = trFee;
        this.claim = claim;
        this.des = des;
        this.remainTime = remainTime;
        this.latterNUm = latterNUm;
        this.totalNUm = totalNUm;
        this.tag = tag;
        this.origin = origin;
        this.remain = remain;
        this.observeTimes = observeTimes;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Good() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getTim() {
        return tim;
    }

    public void setTim(String tim) {
        this.tim = tim;
    }

    public String getSim1() {
        return sim1;
    }

    public void setSim1(String sim1) {
        this.sim1 = sim1;
    }

    public String getSim2() {
        return sim2;
    }

    public void setSim2(String sim2) {
        this.sim2 = sim2;
    }

    public String getSm3() {
        return sm3;
    }

    public void setSm3(String sm3) {
        this.sm3 = sm3;
    }

    public String getSm4() {
        return sm4;
    }

    public void setSm4(String sm4) {
        this.sm4 = sm4;
    }

    public String getSm5() {
        return sm5;
    }

    public void setSm5(String sm5) {
        this.sm5 = sm5;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTrFee() {
        return trFee;
    }

    public void setTrFee(Integer trFee) {
        this.trFee = trFee;
    }

    public String getClaim() {
        return claim;
    }

    public void setClaim(String claim) {
        this.claim = claim;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getRemainTime() {
        return remainTime;
    }

    public void setRemainTime(String remainTime) {
        this.remainTime = remainTime;
    }

    public Integer getLatterNUm() {
        return latterNUm;
    }

    public void setLatterNUm(Integer latterNUm) {
        this.latterNUm = latterNUm;
    }

    public Integer getTotalNUm() {
        return totalNUm;
    }

    public void setTotalNUm(Integer totalNUm) {
        this.totalNUm = totalNUm;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Integer getRemain() {
        return remain;
    }

    public void setRemain(Integer remain) {
        this.remain = remain;
    }

    public Integer getObserveTimes() {
        return observeTimes;
    }

    public void setObserveTimes(Integer observeTimes) {
        this.observeTimes = observeTimes;
    }
}
