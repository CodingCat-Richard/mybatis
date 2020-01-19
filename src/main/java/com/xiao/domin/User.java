package com.xiao.domin;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User implements Serializable{
	private Integer id;
	private String name;
	private String sex;
	private Date date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		return id+"\t"+name+"\t"+format.format(date)+"\t"+sex;
	}	
	
}
