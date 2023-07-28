package com.spring.main.domain;

import java.util.Date;

public class QnAVO {

	private int qna_bno;
	private String qna_title;
	private String qna_content;
	private Date qna_date;
	private AdminVO admin_id;
	
	public QnAVO() {
	}

	public QnAVO(int qna_bno, String qna_title, String qna_content, Date qna_date, AdminVO admin_id) {
		super();
		this.qna_bno = qna_bno;
		this.qna_title = qna_title;
		this.qna_content = qna_content;
		this.qna_date = qna_date;
		this.admin_id = admin_id;
	}

	public int getQna_bno() {
		return qna_bno;
	}

	public void setQna_bno(int qna_bno) {
		this.qna_bno = qna_bno;
	}

	public String getQna_title() {
		return qna_title;
	}

	public void setQna_title(String qna_title) {
		this.qna_title = qna_title;
	}

	public String getQna_content() {
		return qna_content;
	}

	public void setQna_content(String qna_content) {
		this.qna_content = qna_content;
	}

	public Date getQna_date() {
		return qna_date;
	}

	public void setQna_date(Date qna_date) {
		this.qna_date = qna_date;
	}

	public AdminVO getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(AdminVO admin_id) {
		this.admin_id = admin_id;
	}

	@Override
	public String toString() {
		return "QnAVO [qna_bno=" + qna_bno + ", qna_title=" + qna_title + ", qna_content=" + qna_content + ", qna_date="
				+ qna_date + ", admin_id=" + admin_id + "]";
	}
	
	
	
	
	
}
