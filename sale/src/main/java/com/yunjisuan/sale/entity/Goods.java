package com.yunjisuan.sale.entity;


import javax.persistence.Entity;

@Entity
public class Goods {

    private String goods_id;
    private String  goods_name;
    private String goods_char;
    private String goods_type;
    private String goods_dis;
    private int goods_num;
    private int goods_sold;
    private float goods_price;
    private String goods_dir;
    private String goods_act;
    private long goods_time;
    private String goods_other;

    public Goods(String goods_id, String goods_name, String goods_char, String goods_type, String goods_dis, int goods_num, int goods_sold, float goods_price, String goods_dir, String goods_act, int goods_time, String goods_other) {
        this.goods_id = goods_id;
        this.goods_name = goods_name;
        this.goods_char = goods_char;
        this.goods_type = goods_type;
        this.goods_dis = goods_dis;
        this.goods_num = goods_num;
        this.goods_sold = goods_sold;
        this.goods_price = goods_price;
        this.goods_dir = goods_dir;
        this.goods_act = goods_act;
        this.goods_time = goods_time;
        this.goods_other = goods_other;
    }


    public void setGoods_time(long goods_time) {
        this.goods_time = goods_time;
    }

    public String getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(String goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_char() {
        return goods_char;
    }

    public void setGoods_char(String goods_char) {
        this.goods_char = goods_char;
    }

    public String getGoods_type() {
        return goods_type;
    }

    public void setGoods_type(String goods_type) {
        this.goods_type = goods_type;
    }

    public String getGoods_dis() {
        return goods_dis;
    }

    public void setGoods_dis(String goods_dis) {
        this.goods_dis = goods_dis;
    }

    public int getGoods_num() {
        return goods_num;
    }

    public void setGoods_num(int goods_num) {
        this.goods_num = goods_num;
    }

    public int getGoods_sold() {
        return goods_sold;
    }

    public void setGoods_sold(int goods_sold) {
        this.goods_sold = goods_sold;
    }

    public float getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(float goods_price) {
        this.goods_price = goods_price;
    }

    public String getGoods_dir() {
        return goods_dir;
    }

    public void setGoods_dir(String goods_dir) {
        this.goods_dir = goods_dir;
    }

    public String getGoods_act() {
        return goods_act;
    }

    public void setGoods_act(String goods_act) {
        this.goods_act = goods_act;
    }

    public long getGoods_time() {
        return goods_time;
    }

    public String getGoods_other() {
        return goods_other;
    }

    public void setGoods_other(String goods_other) {
        this.goods_other = goods_other;
    }
}
