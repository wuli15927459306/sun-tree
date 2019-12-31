package com.bw.entity;

public class Goods {
private  int id;
private String name;
private String datea;
private int tid;
private double price;
private int status;
private String tname;
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDatea() {
	return datea;
}
public void setDatea(String datea) {
	this.datea = datea;
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}

public Goods() {
	super();
	// TODO Auto-generated constructor stub
}

}
