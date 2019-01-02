package com.my.controller.model;

public class ResultResponse<T> {

	protected int status = 200;
	protected String msg = "ok";
	private T result;

	public ResultResponse() {
		this.status = 200;
		this.msg = "ok";
	}

	public ResultResponse(int i) {
		this.status = i;
	}

	public ResultResponse(String message, int status) {
		this.msg = message;
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

}
