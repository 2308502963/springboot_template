package cn.fzkj.common;

/** 全局返回枚举. */
public enum ResultCode {

    FAILURE(0,"FAILURE","请求失败"),
    SUCCESS(1,"SUCCESS","请求成功"),
    /** 可以添加很多状态，比如说登录异常，没有权限等等 */
    LOGIN_ERROR(501,"LOGIN_ERROR","登录异常")
    ;

    /** 全局返回错误码. */
    private Integer code;
    /** 全局返回信息. */
    private String msg;
    /** 全局返回额外信息. */
    private String extraMsg;

    public static ResultCode getEnumByCode(Integer code){
        for (ResultCode r: ResultCode.values()) {
            if (r.getCode() == code)return r;
        }
        return null;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getExtraMsg() {
        return extraMsg;
    }

    public void setExtraMsg(String extraMsg) {
        this.extraMsg = extraMsg;
    }

    ResultCode(Integer code, String msg, String extraMsg) {
        this.code = code;
        this.msg = msg;
        this.extraMsg = extraMsg;
    }
}
