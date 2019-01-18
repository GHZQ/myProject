package com.my.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;

@SuppressWarnings("serial")
public class RestResponse implements java.io.Serializable {

    private static final int SUCCESS_CODE = 200;
    private static final int ERROR_CODE = 9999;
	protected int code = 200;

	protected String msg = "ok";

	public RestResponse(int code, String message) {
		super();
		this.code = code;
		this.msg = message;
	}

	public RestResponse() {
		super();
	}
	
    @JsonIgnore
    public boolean isError() {
        return code != SUCCESS_CODE;
    }

    @JsonIgnore
    public boolean isSuccess() {
        return code == SUCCESS_CODE;
    }
    
    public void setErrorInfo(String msg) {
        this.msg = msg;
        this.code = ERROR_CODE;
    }

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String message) {
		this.msg = message;
	}

}
