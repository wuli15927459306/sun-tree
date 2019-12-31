package com.bw.entity;

public class Querymodel {
private String key;
private int pagenum;
private int pagesize=2;
private int pages;
public String getKey() {
	return key;
}
public void setKey(String key) {
	this.key = key;
}
public int getPagenum() {
	return pagenum;
}
public void setPagenum(int pagenum) {
	this.pagenum = pagenum;
}
public int getPagesize() {
	return pagesize;
}
public void setPagesize(int pagesize) {
	this.pagesize = pagesize;
}
public int getPages() {
	return pages;
}
public void setPages(int pages) {
	this.pages = pages;
}

}
