package com.guimei.zyh.pojo;


/***
 * 作者：朱宇欢
 */

public class OrderItem {
    private int id;
    private int oid;
    private int pid;

    private int num;
    private float discount;
    private  float total;
    private String codeOfOrder;
    private String telNumber;
    private String branchNumber;
    private String receiver;
    private String address;

    public OrderItem() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getCodeOfOrder() {
        return codeOfOrder;
    }

    public void setCodeOfOrder(String codeOfOrder) {
        this.codeOfOrder = codeOfOrder;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(String branchNumber) {
        this.branchNumber = branchNumber;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
