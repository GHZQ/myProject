package com.my.utils;

import java.util.List;

@SuppressWarnings("serial")
public class RestPageResultResponse<T> extends RestResponse {
	private RestPageBean page;
	private List<T> result;

	public RestPageResultResponse(RestPageBean pageBean, List<T> result) {
		this.page = pageBean;
		this.result = result;
	}

	public RestPageResultResponse(List<T> result) {
		this.page = new RestPageBean(result.size());
		this.result = result;
	}

	public RestPageBean getPage() {
		return page;
	}

	public void setPage(RestPageBean page) {
		this.page = page;
	}

	public List<T> getResult() {
		return result;
	}

	public void setResult(List<T> result) {
		this.result = result;
	}
}
