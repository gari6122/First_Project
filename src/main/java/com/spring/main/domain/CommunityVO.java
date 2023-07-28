package com.spring.main.domain;

import java.util.Date;

public class CommunityVO {

	private int cm_bno;
	private String cm_title;
	private String cm_content;
	private Date cm_date;
	private MemberVO user_id;
	
	public CommunityVO() {
	}

	public CommunityVO(int cm_bno, String cm_title, String cm_content, Date cm_date, MemberVO user_id) {
		super();
		this.cm_bno = cm_bno;
		this.cm_title = cm_title;
		this.cm_content = cm_content;
		this.cm_date = cm_date;
		this.user_id = user_id;
	}

	public int getCm_bno() {
		return cm_bno;
	}

	public void setCm_bno(int cm_bno) {
		this.cm_bno = cm_bno;
	}

	public String getCm_title() {
		return cm_title;
	}

	public void setCm_title(String cm_title) {
		this.cm_title = cm_title;
	}

	public String getCm_content() {
		return cm_content;
	}

	public void setCm_content(String cm_content) {
		this.cm_content = cm_content;
	}

	public Date getCm_date() {
		return cm_date;
	}

	public void setCm_date(Date cm_date) {
		this.cm_date = cm_date;
	}

	public MemberVO getUser_id() {
		return user_id;
	}

	public void setUser_id(MemberVO user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "CommunityVO [cm_bno=" + cm_bno + ", cm_title=" + cm_title + ", cm_content=" + cm_content + ", cm_date="
				+ cm_date + ", user_id=" + user_id + "]";
	}
	
	
}
