package org.nutz.taobao.bean.trade.biz;

/**
 * 服务子订单
 * Created by Jianghao on 2019/2/1
 *
 * @@author Freshplay Inc.
 */
public class ServiceOrder {

    /**
     * 虚拟服务子订单订单号
     */
    private String oid;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    /**
     * 服务所属的交易订单号
     * 如果服务为一年包换，则item_oid这笔订单享受改服务的保护
     */
    private String item_oid;

    public String getItem_oid() {
        return item_oid;
    }

    public void setItem_oid(String item_oid) {
        this.item_oid = item_oid;
    }

    /**
     * 服务数字id
     */
    private String service_id;

    public String getService_id() {
        return service_id;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }

    /**
     * 服务详情的URL地址
     */
    private String service_detail_url;

    public String getService_detail_url() {
        return service_detail_url;
    }

    public void setService_detail_url(String service_detail_url) {
        this.service_detail_url = service_detail_url;
    }

    /**
     * 购买数量，取值范围为大于0的整数
     */
    private Integer num;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 服务价格
     * 精确到小数点后两位：单位:元
     */
    private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 子订单实付金额
     * 精确到2位小数，单位:元。如:200.07，表示:200元7分。
     */
    private Double payment;

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    /**
     * 商品名称
     */
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 服务子订单总费用
     */
    private Double total_fee;

    public Double getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(Double total_fee) {
        this.total_fee = total_fee;
    }

    /**
     * 卖家昵称
     */
    private String  buyer_nick;

    public String getBuyer_nick() {
        return buyer_nick;
    }

    public void setBuyer_nick(String buyer_nick) {
        this.buyer_nick = buyer_nick;
    }

    /**
     * 	最近退款的id
     */
    private String refund_id;

    public String getRefund_id() {
        return refund_id;
    }

    public void setRefund_id(String refund_id) {
        this.refund_id = refund_id;
    }

    /**
     * 	卖家昵称
     */
    private String seller_nick;

    public String getSeller_nick() {
        return seller_nick;
    }

    public void setSeller_nick(String seller_nick) {
        this.seller_nick = seller_nick;
    }

    /**
     * 服务图片地址
     */
    private String pic_path;

    public String getPic_path() {
        return pic_path;
    }

    public void setPic_path(String pic_path) {
        this.pic_path = pic_path;
    }

    /**
     * 支持家装类物流的类型
     */
    private String tmser_spu_code;

    public String getTmser_spu_code() {
        return tmser_spu_code;
    }

    public void setTmser_spu_code(String tmser_spu_code) {
        this.tmser_spu_code = tmser_spu_code;
    }

    /**
     * 虚拟服务子订单订单号
     */
    private String oid_str;

    public String getOid_str() {
        return oid_str;
    }

    public void setOid_str(String oid_str) {
        this.oid_str = oid_str;
    }

    /**
     * 苹果支持邮件
     */
    private String apple_care_email;

    public String getApple_care_email() {
        return apple_care_email;
    }

    public void setApple_care_email(String apple_care_email) {
        this.apple_care_email = apple_care_email;
    }

    /**
     * 苹果支持热线
     */
    private String apple_care_mpn;

    public String getApple_care_mpn() {
        return apple_care_mpn;
    }

    public void setApple_care_mpn(String apple_care_mpn) {
        this.apple_care_mpn = apple_care_mpn;
    }
}
