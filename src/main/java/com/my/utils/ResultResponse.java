package com.my.utils;

import com.fasterxml.jackson.annotation.JsonView;

public class ResultResponse<T> extends RestResponse {

    private static final long serialVersionUID = 1L;

    @JsonView
    private T result;

    public ResultResponse() {
    }

    public ResultResponse(T obj) {
        result = obj;
    }

    public ResultResponse(T obj, int code) {
        this(obj);
        this.setCode(code);
    }

    public ResultResponse(T obj, int code, String msg) {
        this(obj, code);
        this.setMsg(msg);
    }

    public ResultResponse(T obj, RestResponse response) {
        this(obj);
        this.setCode(response.getCode());
        this.setMsg(response.getMsg());
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

}
