package com.spring.main.domain;

public class MemberVO {

	private int user_no;
	private String user_id;
	private String user_pw;
	private String user_name;
	private String user_phone;
	private String user_birth;
	private String user_add;
	
	public MemberVO() {
	
	}
	
	public MemberVO(int user_no, String user_id, String user_pw, String user_name, String user_phone, String user_birth,
			String user_add) {
		super();
		this.user_no = user_no;
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.user_phone = user_phone;
		this.user_birth = user_birth;
		this.user_add = user_add;
	}

	public int getUser_no() {
		return user_no;
	}

	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_birth() {
		return user_birth;
	}

	public void setUser_birth(String user_birth) {
		this.user_birth = user_birth;
	}

	public String getUser_add() {
		return user_add;
	}

	public void setUser_add(String user_add) {
		this.user_add = user_add;
	}

	@Override
	public String toString() {
		return "MemberVO [user_no=" + user_no + ", user_id=" + user_id + ", user_pw=" + user_pw + ", user_name="
				+ user_name + ", user_phone=" + user_phone + ", user_birth=" + user_birth + ", user_add=" + user_add
				+ "]";
	}

	
	
}
