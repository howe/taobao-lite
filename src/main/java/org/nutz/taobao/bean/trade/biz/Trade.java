package org.nutz.taobao.bean.trade.biz;

import java.util.List;

/**
 * Created by Jianghao on 2019/2/1
 *
 * @@author Freshplay Inc.
 */
public class Trade {

    /**
     * 卖家昵称
     */
    private String seller_nick;

    public String getSeller_nick() {
        return seller_nick;
    }

    public void setSeller_nick(String seller_nick) {
        this.seller_nick = seller_nick;
    }

    /**
     * 商品图片绝对途径
     */
    private String pic_path;

    public String getPic_path() {
        return pic_path;
    }

    public void setPic_path(String pic_path) {
        this.pic_path = pic_path;
    }

    /**
     * 实付金额
     * 精确到2位小数;单位:元。
     * 如:200.07，表示:200元7分
     */
    private Double payment;

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    /**
     * 卖家是否已评价。
     * 可选值:true(已评价),false(未评价)
     */
    private Boolean seller_rate;

    public Boolean getSeller_rate() {
        return seller_rate;
    }

    public void setSeller_rate(Boolean seller_rate) {
        this.seller_rate = seller_rate;
    }

    /**
     * 邮费
     * 精确到2位小数;单位:元。
     * 如:200.07，表示:200元7分
     */
    private Double post_fee;

    public Double getPost_fee() {
        return post_fee;
    }

    public void setPost_fee(Double post_fee) {
        this.post_fee = post_fee;
    }

    /**
     * 收货人的姓名
     */
    private String receiver_name;

    public String getReceiver_name() {
        return receiver_name;
    }

    public void setReceiver_name(String receiver_name) {
        this.receiver_name = receiver_name;
    }

    /**
     * 收货人的所在省份
     */
    private String receiver_state;

    public String getReceiver_state() {
        return receiver_state;
    }

    public void setReceiver_state(String receiver_state) {
        this.receiver_state = receiver_state;
    }

    /**
     * 收货人的详细地址
     */
    private String receiver_address;

    public String getReceiver_address() {
        return receiver_address;
    }

    public void setReceiver_address(String receiver_address) {
        this.receiver_address = receiver_address;
    }

    /**
     * 收货人的邮编
     */
    private String receiver_zip;

    public String getReceiver_zip() {
        return receiver_zip;
    }

    public void setReceiver_zip(String receiver_zip) {
        this.receiver_zip = receiver_zip;
    }

    /**
     * 收货人的手机号码
     */
    private String receiver_mobile;

    public String getReceiver_mobile() {
        return receiver_mobile;
    }

    public void setReceiver_mobile(String receiver_mobile) {
        this.receiver_mobile = receiver_mobile;
    }

    /**
     * 收货人的电话号码
     */
    private String receiver_phone;

    public String getReceiver_phone() {
        return receiver_phone;
    }

    public void setReceiver_phone(String receiver_phone) {
        this.receiver_phone = receiver_phone;
    }

    /**
     * 卖家发货时间。
     * 格式:yyyy-MM-dd HH:mm:ss
     */
    private String consign_time;

    public String getConsign_time() {
        return consign_time;
    }

    public void setConsign_time(String consign_time) {
        this.consign_time = consign_time;
    }

    /**
     * 卖家实际收到的支付宝打款金额
     * （由于子订单可以部分确认收货，这个金额会随着子订单的确认收货而不断增加，交易成功后等于买家实付款减去退款金额）。
     * 精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    private Double received_payment;

    public Double getReceived_payment() {
        return received_payment;
    }

    public void setReceived_payment(Double received_payment) {
        this.received_payment = received_payment;
    }

    /**
     * 收货人国籍
     */
    private String receiver_country;

    public String getReceiver_country() {
        return receiver_country;
    }

    public void setReceiver_country(String receiver_country) {
        this.receiver_country = receiver_country;
    }

    /**
     * 收货人街道地址
     */
    private String receiver_town;

    public String getReceiver_town() {
        return receiver_town;
    }

    public void setReceiver_town(String receiver_town) {
        this.receiver_town = receiver_town;
    }

    /**
     * 天猫国际官网直供主订单关税税费
     */
    private Double order_tax_fee;

    public Double getOrder_tax_fee() {
        return order_tax_fee;
    }

    public void setOrder_tax_fee(Double order_tax_fee) {
        this.order_tax_fee = order_tax_fee;
    }

    /**
     * 门店自提，总店发货，分店取货的门店自提订单标识
     */
    private String shop_pick;

    public String getShop_pick() {
        return shop_pick;
    }

    public void setShop_pick(String shop_pick) {
        this.shop_pick = shop_pick;
    }

    /**
     * 交易编号 (父订单的交易编号)
     */
    private String tid;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    /**
     * 商品购买数量。
     * 取值范围：大于零的整数,对于一个trade对应多个order的时候（一笔主订单，对应多笔子订单），num=0，num是一个跟商品关联的属性，一笔订单对应多比子订单的时候，主订单上的num无意义
     */
    private Integer num;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 商品数字编号
     */
    private String num_iid;

    public String getNum_iid() {
        return num_iid;
    }

    public void setNum_iid(String num_iid) {
        this.num_iid = num_iid;
    }

    /**
     * 交易状态
     * 可选值:
     * TRADE_NO_CREATE_PAY(没有创建支付宝交易)
     * WAIT_BUYER_PAY(等待买家付款)
     * SELLER_CONSIGNED_PART(卖家部分发货)
     * WAIT_SELLER_SEND_GOODS(等待卖家发货,即:买家已付款)
     * WAIT_BUYER_CONFIRM_GOODS(等待买家确认收货,即:卖家已发货)
     * TRADE_BUYER_SIGNED(买家已签收,货到付款专用)
     * TRADE_FINISHED(交易成功)
     * TRADE_CLOSED(付款以后用户退款成功，交易自动关闭)
     * TRADE_CLOSED_BY_TAOBAO(付款以前，卖家或买家主动关闭交易)
     * PAY_PENDING(国际信用卡支付付款确认中)
     * WAIT_PRE_AUTH_CONFIRM(0元购合约中)
     * PAID_FORBID_CONSIGN(拼团中订单或者发货强管控的订单，已付款但禁止发货)
     */
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 交易标题，以店铺名作为此标题的值
     * 注:taobao.trades.get接口返回的Trade中的title是商品名称
     */
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 交易类型列表，同时查询多种交易类型可用逗号分隔。
     * 默认同时查询guarantee_trade, auto_delivery, ec, cod的4种交易类型的数据
     * 可选值
     * fixed(一口价)
     * auction(拍卖)
     * guarantee_trade(一口价、拍卖)
     * auto_delivery(自动发货)
     * independent_simple_trade(旺店入门版交易)
     * independent_shop_trade(旺店标准版交易)
     * ec(直冲)
     * cod(货到付款)
     * fenxiao(分销)
     * game_equipment(游戏装备)
     * shopex_trade(ShopEX交易)
     * netcn_trade(万网交易)
     * external_trade(统一外部交易)
     * o2o_offlinetrade（O2O交易）
     * step (万人团)
     * nopaid(无付款订单)
     * pre_auth_type(预授权0元购机交易)
     */
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * 商品价格
     * 精确到2位小数；单位：元。
     * 如：200.07，表示：200元7分
     */
    private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 可以使用trade.promotion_details查询系统优惠系统优惠金额（如打折，VIP，满就送等）
     * 精确到2位小数，单位：元。
     * 如：200.07，表示：200元7分
     */
    private Double discount_fee;

    public Double getDiscount_fee() {
        return discount_fee;
    }

    public void setDiscount_fee(Double discount_fee) {
        this.discount_fee = discount_fee;
    }

    /**
     * 商品金额（商品价格乘以数量的总金额）
     * 精确到2位小数;单位:元。
     * 如:200.07，表示:200元7分
     */
    private Double total_fee;

    public Double getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(Double total_fee) {
        this.total_fee = total_fee;
    }

    /**
     * 交易创建时间。格式:yyyy-MM-dd HH:mm:ss
     */
    private String created;

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * 付款时间。格式:yyyy-MM-dd HH:mm:ss。订单的付款时间即为物流订单的创建时间。
     */
    private String pay_time;

    public String getPay_time() {
        return pay_time;
    }

    public void setPay_time(String pay_time) {
        this.pay_time = pay_time;
    }

    /**
     * 交易修改时间(用户对订单的任何修改都会更新此字段)。格式:yyyy-MM-dd HH:mm:ss
     */
    private String modified;

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * 交易结束时间。
     * 交易成功时间(更新交易状态为成功的同时更新)/确认收货时间或者交易关闭时间 。
     * 格式:yyyy-MM-dd HH:mm:ss
     */
    private String end_time;

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    /**
     * 卖家备注旗帜（与淘宝网上订单的卖家备注旗帜对应，只有卖家才能查看该字段）
     * 红、黄、绿、蓝、紫 分别对应 1、2、3、4、5
     */
    private Integer seller_flag;

    public Integer getSeller_flag() {
        return seller_flag;
    }

    public void setSeller_flag(Integer seller_flag) {
        this.seller_flag = seller_flag;
    }

    /**
     * 买家昵称
     */
    private String buyer_nick;

    public String getBuyer_nick() {
        return buyer_nick;
    }

    public void setBuyer_nick(String buyer_nick) {
        this.buyer_nick = buyer_nick;
    }

    /**
     * 判断订单是否有买家留言
     * 有买家留言返回true，否则返回false
     */
    private Boolean has_buyer_message;

    public Boolean getHas_buyer_message() {
        return has_buyer_message;
    }

    public void setHas_buyer_message(Boolean has_buyer_message) {
        this.has_buyer_message = has_buyer_message;
    }

    /**
     * 使用信用卡支付金额数
     */
    private Double credit_card_fee;

    public Double getCredit_card_fee() {
        return credit_card_fee;
    }

    public void setCredit_card_fee(Double credit_card_fee) {
        this.credit_card_fee = credit_card_fee;
    }

    /**
     * 分阶段付款的订单状态（例如万人团订单等）
     * 目前有三返回状态
     * FRONT_NOPAID_FINAL_NOPAID(定金未付尾款未付)
     * FRONT_PAID_FINAL_NOPAID(定金已付尾款未付)
     * FRONT_PAID_FINAL_PAID(定金和尾款都付)
     */
    private String step_trade_status;

    public String getStep_trade_status() {
        return step_trade_status;
    }

    public void setStep_trade_status(String step_trade_status) {
        this.step_trade_status = step_trade_status;
    }

    /**
     * 分阶段付款的已付金额（万人团订单已付金额）
     */
    private Double step_paid_fee;

    public Double getStep_paid_fee() {
        return step_paid_fee;
    }

    public void setStep_paid_fee(Double step_paid_fee) {
        this.step_paid_fee = step_paid_fee;
    }

    /**
     * 订单出现异常问题的时候，给予用户的描述,没有异常的时候，此值为空
     */
    private String mark_desc;

    public String getMark_desc() {
        return mark_desc;
    }

    public void setMark_desc(String mark_desc) {
        this.mark_desc = mark_desc;
    }

    /**
     * 创建交易时的物流方式（交易完成前，物流方式有可能改变，但系统里的这个字段一直不变）
     * 可选值：
     * free(卖家包邮)
     * post(平邮)
     * express(快递)
     * ems(EMS)
     * virtual(虚拟发货)
     * 25(次日必达)
     * 26(预约配送)
     */
    private String shipping_type;

    public String getShipping_type() {
        return shipping_type;
    }

    public void setShipping_type(String shipping_type) {
        this.shipping_type = shipping_type;
    }

    /**
     * 卖家手工调整金额
     * 精确到2位小数，单位：元。
     * 如：200.07，表示：200元7分。
     * 来源于订单价格修改，如果有多笔子订单的时候，这个为0，单笔的话则跟[order].adjust_fee一样
     */
    private Double adjust_fee;

    public Double getAdjust_fee() {
        return adjust_fee;
    }

    public void setAdjust_fee(Double adjust_fee) {
        this.adjust_fee = adjust_fee;
    }

    /**
     * 交易内部来源
     * WAP(手机)
     * HITAO(嗨淘)
     * TOP(TOP平台)
     * TAOBAO(普通淘宝)
     * JHS(聚划算)
     * 一笔订单可能同时有以上多个标记，则以逗号分隔
     */
    private String trade_from;


    public String getTrade_from() {
        return trade_from;
    }

    public void setTrade_from(String trade_from) {
        this.trade_from = trade_from;
    }

    /**
     * 服务子订单列表
     */
    private List<ServiceOrder> service_orders;

    public List<ServiceOrder> getService_orders() {
        return service_orders;
    }

    public void setService_orders(List<ServiceOrder> service_orders) {
        this.service_orders = service_orders;
    }

    /**
     * 买家是否已评价
     * 可选值:true(已评价),false(未评价)。如买家只评价未打分，此字段仍返回false
     */
    private Boolean buyer_rate;

    public Boolean getBuyer_rate() {
        return buyer_rate;
    }

    public void setBuyer_rate(Boolean buyer_rate) {
        this.buyer_rate = buyer_rate;
    }

    /**
     * 收货人的所在城市
     * 注：因为国家对于城市和地区的划分的有：省直辖市和省直辖县级行政区（区级别的）划分的，淘宝这边根据这个差异保存在不同字段里面比如：广东广州：广州属于一个直辖市是放在的receiver_city的字段里面；而河南济源：济源属于省直辖县级行政区划分，是区级别的，放在了receiver_district里面
     * 建议：程序依赖于城市字段做物流等判断的操作，最好加一个判断逻辑：如果返回值里面只有receiver_district参数，该参数作为城市
     */
    private String receiver_city;

    public String getReceiver_city() {
        return receiver_city;
    }

    public void setReceiver_city(String receiver_city) {
        this.receiver_city = receiver_city;
    }

    /**
     * 收货人的所在地区
     * 注：因为国家对于城市和地区的划分的有：省直辖市和省直辖县级行政区（区级别的）划分的，淘宝这边根据这个差异保存在不同字段里面比如：广东广州：广州属于一个直辖市是放在的receiver_city的字段里面；而河南济源：济源属于省直辖县级行政区划分，是区级别的，放在了receiver_district里面
     * 建议：程序依赖于城市字段做物流等判断的操作，最好加一个判断逻辑：如果返回值里面只有receiver_district参数，该参数作为城市
     */
    private String receiver_district;

    public String getReceiver_district() {
        return receiver_district;
    }

    public void setReceiver_district(String receiver_district) {
        this.receiver_district = receiver_district;
    }

    /**
     * 导购宝=crm
     */
    private String o2o;

    public String getO2o() {
        return o2o;
    }

    public void setO2o(String o2o) {
        this.o2o = o2o;
    }

    /**
     * 	导购员id
     */
    private String o2o_guide_id;

    public String getO2o_guide_id() {
        return o2o_guide_id;
    }

    public void setO2o_guide_id(String o2o_guide_id) {
        this.o2o_guide_id = o2o_guide_id;
    }

    /**
     * 导购员门店id
     */
    private String o2o_shop_id;

    public String getO2o_shop_id() {
        return o2o_shop_id;
    }

    public void setO2o_shop_id(String o2o_shop_id) {
        this.o2o_shop_id = o2o_shop_id;
    }

    /**
     * 导购员名称
     */
    private String o2o_guide_name;

    public String getO2o_guide_name() {
        return o2o_guide_name;
    }

    public void setO2o_guide_name(String o2o_guide_name) {
        this.o2o_guide_name = o2o_guide_name;
    }

    /**
     * 导购门店名称
     */
    private String o2o_shop_name;

    public String getO2o_shop_name() {
        return o2o_shop_name;
    }

    public void setO2o_shop_name(String o2o_shop_name) {
        this.o2o_shop_name = o2o_shop_name;
    }

    /**
     * 导购宝提货方式
     * inshop：店内提货
     * online：线上发货
     */
    private String o2o_delivery;

    public String getO2o_delivery() {
        return o2o_delivery;
    }

    public void setO2o_delivery(String o2o_delivery) {
        this.o2o_delivery = o2o_delivery;
    }

    /**
     * 订单列表
     */
    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
