package org.nutz.taobao.bean;

/**
 * Created by Jianghao on 2019/1/30
 *
 * @@author Freshplay Inc.
 */
public class BaseReq {

    /**
     * API接口名称
     */
    private String method;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * TOP分配给应用的AppKey<br>
     * 这里要注意正式环境和沙箱环境的AppKey是不同的（包括AppSecret），使用时要注意区分；进入开放平台控制台“应用管理-概览” 和 “应用管理-沙箱环境管理”可分别查看正式环境及沙箱环境的AppKey、AppSecret
     */
    private String app_key;

    public String getApp_key() {
        return app_key;
    }

    public void setApp_key(String app_key) {
        this.app_key = app_key;
    }

    /**
     * 用户登录授权成功后，TOP颁发给应用的授权信息，详细介绍请点击这里。<br>
     * 当此API文档的标签上注明：“需要授权”，则此参数必传；“不需要授权”，则此参数不需要传；“可选授权”，则此参数为可选。
     */
    private String session;

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    /**
     * 时间戳，格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8，例如：2016-01-01 12:00:00。<br>
     * 淘宝API服务端允许客户端请求最大时间误差为10分钟。
     */
    private String timestamp;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 	响应格式。<br>
     * 	默认为xml格式，可选值：xml，json。
     */
    private String format;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * API协议版本，可选值：2.0。
     */
    private String v;

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    /**
     * 	合作伙伴身份标识
     */
    private String partner_id;

    public String getPartner_id() {
        return partner_id;
    }

    public void setPartner_id(String partner_id) {
        this.partner_id = partner_id;
    }

    /**
     * 被调用的目标AppKey，仅当被调用的API为第三方ISV提供时有效。
     */
    private String target_app_key;

    public String getTarget_app_key() {
        return target_app_key;
    }

    public void setTarget_app_key(String target_app_key) {
        this.target_app_key = target_app_key;
    }

    /**
     * 是否采用精简JSON返回格式，仅当format=json时有效，默认值为：false。
     */
    private boolean simplify;

    public boolean isSimplify() {
        return simplify;
    }

    public void setSimplify(boolean simplify) {
        this.simplify = simplify;
    }

    /**
     * 签名的摘要算法，可选值为：hmac，md5。
     */
    private String sign_method;

    public String getSign_method() {
        return sign_method;
    }

    public void setSign_method(String sign_method) {
        this.sign_method = sign_method;
    }

    /**
     * 	API输入参数签名结果
     */
    private String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
