package com.cafe.gitteam1.member;

public class MemberVo {
	private String member_id;
	
	private String member_name;
	
	private String password;
	
	private int member_phone;
	
	private String member_email;
	
	private String member_grade;
	
	
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMember_phone() {
		return member_phone;
	}
	public void setMember_phone(int member_phone) {
		this.member_phone = member_phone;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	public String getMember_grade() {
		return member_grade;
	}
	public void setMember_grade(String member_grade) {
		this.member_grade = member_grade;
	}
	
	@Override
	public String toString() {
		return "MemberVo [member_id=" + member_id + ", member_name=" + member_name + ", password=" + password
				+ ", member_phone=" + member_phone + ", member_email=" + member_email + ", member_grade=" + member_grade
				+ "]";
	}
	
}