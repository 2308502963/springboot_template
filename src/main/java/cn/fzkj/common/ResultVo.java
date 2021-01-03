package cn.fzkj.common;

/** 封装统一的返回类. */
public class ResultVo {

    /** 错误码. */
    private Integer code;
    /** 提示信息. */
    private String msg;
    /** 额外信息. */
    private String extraMsg;
    /** 数据. */
    private Object data;

    public static ResultVo ok(){
        ResultVo r = new ResultVo();
        r.setCodeMsg(ResultCode.SUCCESS);
        return r;
    }

    public static ResultVo okData(Object data){
        ResultVo r = new ResultVo();
        r.setCodeMsg(ResultCode.SUCCESS);
        r.setData(data);
        return r;
    }

    public static ResultVo fail(){
        ResultVo r = new ResultVo();
        r.setCodeMsg(ResultCode.FAILURE);
        return r;
    }

    public static ResultVo error(ResultCode rc){
        ResultVo r = new ResultVo();
        r.setCodeMsg(rc);
        return r;
    }

    public static ResultVo errorData(Object data){
        ResultVo r = new ResultVo();
        r.setCodeMsg(ResultCode.FAILURE);
        r.setData(data);
        return r;
    }

    private void setCodeMsg(ResultCode rc){
        this.code = rc.getCode();
        this.msg = rc.getMsg();
        this.extraMsg = rc.getExtraMsg();
    }

    @Override
    public String toString() {
        return "{" +
                "code:" + code +
                ", msg:'" + msg + '\'' +
                ", extraMsg:'" + extraMsg + '\'' +
                ", data:" + data +
                '}';
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
