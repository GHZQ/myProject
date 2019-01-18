package com.my.utils;

public class RestPageBean {
    int size;
    long totalElements;// recordCount
    int totalPages;// pageCount
    int number;// currentPage

    public RestPageBean() {
        super();
    }

    public RestPageBean(int size) {
        this.size = size;
        this.totalElements = size;
        this.totalPages = 1;
        this.number = 0;
    }

    public RestPageBean(int number, int size, int page, long elements) {
        this.setNumber(number);
        this.setSize(size);
        this.setTotalPages(page);
        this.setTotalElements(elements);
    }

    public int getCurrentPageFirstRecord() {
        return (this.number - 1) * this.size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
