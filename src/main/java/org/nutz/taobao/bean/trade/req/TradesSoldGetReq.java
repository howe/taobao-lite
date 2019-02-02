package org.nutz.taobao.bean.trade.req;

import org.nutz.taobao.bean.BaseReq;

/**
 * 查询卖家已卖出的交易数据（根据创建时间）
 * https://open.taobao.com/api.htm?docId=46&docType=2
 * Created by Jianghao on 2019/2/1
 *
 * @@author Freshplay Inc.
 */
public class TradesSoldGetReq extends BaseReq {

    /**
     * 需要返回的字段列表，多个字段用半角逗号分隔，可选值为返回示例中能看到的所有字段。rx_audit_status=0,处方药未审核
     */
    private String fields;

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    /**
     * 查询三个月内交易创建时间开始。格式:yyyy-MM-dd HH:mm:ss
     */
    private String start_created;

    public String getStart_created() {
        return start_created;
    }

    public void setStart_created(String start_created) {
        this.start_created = start_created;
    }

    /**
     * 查询交易创建时间结束。格式:yyyy-MM-dd HH:mm:ss
     */
    private String end_created;

    public String getEnd_created() {
        return end_created;
    }

    public void setEnd_created(String end_created) {
        this.end_created = end_created;
    }

    /**
     * 交易状态，默认查询所有交易状态的数据，除了默认值外每次只能查询一种状态。
     * <p>
     * WAIT_BUYER_PAY：等待买家付款
     * WAIT_SELLER_SEND_GOODS：等待卖家发货
     * SELLER_CONSIGNED_PART：卖家部分发货
     * WAIT_BUYER_CONFIRM_GOODS：等待买家确认收货
     * TRADE_BUYER_SIGNED：买家已签收（货到付款专用）
     * TRADE_FINISHED：交易成功
     * TRADE_CLOSED：交易关闭
     * TRADE_CLOSED_BY_TAOBAO：交易被淘宝关闭
     * TRADE_NO_CREATE_PAY：没有创建外部交易（支付宝交易）
     * WAIT_PRE_AUTH_CONFIRM：余额宝0元购合约中
     * PAY_PENDING：外卡支付付款确认中
     * ALL_WAIT_PAY：所有买家未付款的交易（包含：WAIT_BUYER_PAY、TRADE_NO_CREATE_PAY）
     * ALL_CLOSED：所有关闭的交易（包含：TRADE_CLOSED、TRADE_CLOSED_BY_TAOBAO）
     * PAID_FORBID_CONSIGN，该状态代表订单已付款但是处于禁止发货状态。
     */
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
     * 交易类型列表，同时查询多种交易类型可用逗号分隔。
     * 默认同时查询guarantee_trade,auto_delivery,ec,cod,step 这5种的交易类型的数据；
     * 查询所有交易类型的数据，需要设置下面全部可选值。
     * 可选值：
     * fixed(一口价)
     * auction(拍卖)
     * guarantee_trade(一口价、拍卖)
     * step(分阶段付款，万人团，阶梯团订单）
     * independent_simple_trade(旺店入门版交易)
     * independent_shop_trade(旺店标准版交易)
     * auto_delivery(自动发货)
     * ec(直冲)
     * cod(货到付款)
     * game_equipment(游戏装备)
     * shopex_trade(ShopEX交易)
     * netcn_trade(万网交易)
     * external_trade(统一外部交易)
     * instant_trade (即时到账)
     * b2c_cod(大商家货到付款)
     * hotel_trade(酒店类型交易)
     * super_market_trade(商超交易)
     * super_market_cod_trade(商超货到付款交易)
     * taohua(淘花网交易类型）
     * waimai(外卖交易类型）
     * o2o_offlinetrade（O2O交易）
     * nopaid（即时到帐/趣味猜交易类型）
     * step (万人团)
     * eticket(电子凭证)
     * tmall_i18n（天猫国际）
     * nopaid （无付款交易）
     * insurance_plus（保险）
     * finance（基金）
     * 注：guarantee_trade是一个组合查询条件，并不是一种交易类型，获取批量或单个订单中不会返回此种类型的订单。
     * pre_auth_type(预授权0元购)
     * lazada（获取lazada订单类型）
     */
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * 可选值有
     * ershou(二手市场的订单）
     * service（商城服务子订单）
     * mark（双十一大促活动异常订单）作为扩展类型筛选只能做单个ext_type查询，不能全部查询所有的ext_type类型
     */
    private String ext_type;

    public String getExt_type() {
        return ext_type;
    }

    public void setExt_type(String ext_type) {
        this.ext_type = ext_type;
    }

    /**
     * 评价状态，默认查询所有评价状态的数据，除了默认值外每次只能查询一种状态。
     * 可选值：
     * RATE_UNBUYER(买家未评)
     * RATE_UNSELLER(卖家未评)
     * RATE_BUYER_UNSELLER(买家已评，卖家未评)
     * RATE_UNBUYER_SELLER(买家未评，卖家已评)
     * RATE_BUYER_SELLER(买家已评,卖家已评)
     */
    private String rate_status;

    public String getRate_status() {
        return rate_status;
    }

    public void setRate_status(String rate_status) {
        this.rate_status = rate_status;
    }

    /**
     * 卖家对交易的自定义分组标签，
     * 目前可选值为：
     * time_card（点卡软件代充）
     * fee_card（话费软件代充）
     */
    private String tag;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * 页码
     * 取值范围:大于零的整数;
     * 默认值:1
     */
    private int page_no;

    public int getPage_no() {
        return page_no;
    }

    public void setPage_no(int page_no) {
        this.page_no = page_no < 1 ? 1 : page_no;
    }

    /**
     * 每页条数。
     * 取值范围:大于零的整数;
     * 默认值:40;最大值:100
     */
    private int page_size;

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        page_size = page_size < 1 ? 40 : page_size;
        page_size = page_size > 100 ? 100 : page_size;
        this.page_size = page_size;
    }

    /**
     * 是否启用has_next的分页方式
     * 如果指定true,则返回的结果中不包含总记录数，但是会新增一个是否存在下一页的的字段，
     * 通过此种方式获取增量交易，接口调用成功率在原有的基础上有所提升。
     */
    private boolean use_has_next;

    public boolean isUse_has_next() {
        return use_has_next;
    }

    public void setUse_has_next(boolean use_has_next) {
        this.use_has_next = use_has_next;
    }
}
