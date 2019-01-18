package com.my.utils;

import com.fasterxml.jackson.annotation.JsonView;

public class PageInfo {
    
	private PageBean pageBean;
	
	public PageInfo(PageBean pageBean) {
		this.pageBean = pageBean;
	}
	
	@JsonView
	public int getRecordCount() {
		return this.pageBean.getRecordCount();
	}
	
	@JsonView
	public int getPageCount() {
		return this.pageBean.getPageCount();
	}
	
	@JsonView
	public int getPageSize() {
		return this.pageBean.getPageSize();
	}
	
	@JsonView
	public int getCurrentPage() {
		return this.pageBean.getCurrentPage();
	}

    /**
     * @return
     * @see chances.zeus.cms.ctrl.model.epg.data.PageBean#getNextPageNo()
     */
	@JsonView
    public int getNextPageNo() {
        return pageBean.getNextPageNo();
    }

    /**
     * @return
     * @see chances.zeus.cms.ctrl.model.epg.data.PageBean#getPrivPageNo()
     */
	@JsonView
    public int getPrivPageNo() {
        return pageBean.getPrivPageNo();
    }
	
	
	
}
