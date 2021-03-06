package com.aeert.mlock.exception;

/**
 * @Author l'amour solitaire
 * @Description MLock异常
 * @Date 2020/11/17 下午2:42
 **/
public class MLockException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String msg;
    private int code = 500;

    public MLockException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public MLockException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public MLockException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public MLockException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


}
