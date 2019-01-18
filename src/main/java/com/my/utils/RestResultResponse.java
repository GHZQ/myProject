package com.my.utils;

@SuppressWarnings("serial")

public class RestResultResponse<T> extends RestResponse {

	private T result;

	public RestResultResponse(T result) {
		super();
		this.result = result;
	}

	public RestResultResponse(T result, int code, String message) {
		super(code, message);
		this.result = result;
	}

	public RestResultResponse(int i) {
		this.code = i;
	}

	public RestResultResponse() {
		this.code = 200;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}
}
