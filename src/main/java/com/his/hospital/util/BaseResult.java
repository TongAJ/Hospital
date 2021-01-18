package com.his.hospital.util;

/**
 * Description:
 *
 * @author tong-aj
 * <p>
 * Create: 2021-01-18 10:45
 */
public class BaseResult<T> {
    private static final Integer successCode = 1;
    private static final String successMsg = "success";
    private static final Integer failCode = 0;
    private static final String failMsg = "fail";
    private Integer code;
    private Integer errorCode;
    private String msg;
    private T data;

    public static BaseResult fail(Integer errorCode, String msg) {
        return new BaseResult(failCode, errorCode, msg, (Object) null);
    }

    public static BaseResult fail(String msg) {
        return new BaseResult(failCode, failCode, msg, (Object) null);
    }

    public static <T> BaseResult success() {
        return success("success");
    }

    public static <T> BaseResult success(T data) {
        return success(data, "success");
    }

    public static <T> BaseResult<T> success(T data, String msg) {
        return success(msg, data);
    }

    public static <T> BaseResult<T> success(String msg, T data) {
        return new BaseResult(successCode, successCode, msg, data);
    }

    public BaseResult(Integer code, Integer errorCode, String msg, T data) {
        this.code = code;
        this.errorCode = errorCode;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return this.code;
    }

    public Integer getErrorCode() {
        return this.errorCode;
    }

    public String getMsg() {
        return this.msg;
    }

    public T getData() {
        return this.data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof BaseResult)) {
            return false;
        } else {
            BaseResult<?> other = (BaseResult) o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label59:
                {
                    Object this$code = this.getCode();
                    Object other$code = other.getCode();
                    if (this$code == null) {
                        if (other$code == null) {
                            break label59;
                        }
                    } else if (this$code.equals(other$code)) {
                        break label59;
                    }

                    return false;
                }

                Object this$errorCode = this.getErrorCode();
                Object other$errorCode = other.getErrorCode();
                if (this$errorCode == null) {
                    if (other$errorCode != null) {
                        return false;
                    }
                } else if (!this$errorCode.equals(other$errorCode)) {
                    return false;
                }

                Object this$msg = this.getMsg();
                Object other$msg = other.getMsg();
                if (this$msg == null) {
                    if (other$msg != null) {
                        return false;
                    }
                } else if (!this$msg.equals(other$msg)) {
                    return false;
                }

                Object this$data = this.getData();
                Object other$data = other.getData();
                if (this$data == null) {
                    if (other$data != null) {
                        return false;
                    }
                } else if (!this$data.equals(other$data)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof BaseResult;
    }

    public int hashCode() {
        int result = 1;
        Object $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        Object $errorCode = this.getErrorCode();
        result = result * 59 + ($errorCode == null ? 43 : $errorCode.hashCode());
        Object $msg = this.getMsg();
        result = result * 59 + ($msg == null ? 43 : $msg.hashCode());
        Object $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    public String toString() {
        return "BaseResult(code=" + this.getCode() + ", errorCode=" + this.getErrorCode() + ", msg=" + this.getMsg() + ", data=" + this.getData() + ")";
    }
}
