package com.lqt.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Article {
	private int id;
	private int pid;
	private int rootid;
	private String title;
	private Date datetime;
	private boolean isleaf;
	private int grade;
	private String cont;
	public String getCont() {
		return cont;
	}
	public void setCont(String cont) {
		this.cont = cont;
	}
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
	
	public void initFromRs(ResultSet rs){
		try{
			setId(rs.getInt("id"));
			setPid(rs.getInt("pid"));
			setRootid(rs.getInt("rootid"));
			setTitle(rs.getString("title"));
			setCont(rs.getString("cont"));
			setDatetime(rs.getTimestamp("pdate"));
			setIsleaf(rs.getInt("isleaf") == 0 ? true : false);
			setGrade(grade);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
}
