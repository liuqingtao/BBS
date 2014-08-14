package com.lqt.test;

import java.util.Date;

public class Article {
	private int id;
	private int pid;
	private int rootid;
	private String title;
	private Date datetime;
	private boolean isleaf;
	private int grade;
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getRootid() {
		return rootid;
	}
	public void setRootid(int rootid) {
		this.rootid = rootid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public boolean getIsleaf() {
		return isleaf;
	}
	public void setIsleaf(boolean isleaf) {
		this.isleaf = isleaf;
	}
	
}
