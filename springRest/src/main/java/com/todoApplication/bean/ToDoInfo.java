package com.todoApplication.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ToDoInfo{

	private int id;
	private String desc;
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date targetDate;
	private boolean isDone;
	

	
	public ToDoInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ToDoInfo(int id, String desc, Date targetDate, boolean isDone) {
		super();
		this.id = id;
		this.desc = desc;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	
	
	
}
