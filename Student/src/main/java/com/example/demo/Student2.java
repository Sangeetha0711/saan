package com.example.demo;

public class Student2 {
	private int id;
	private int sid;
	private String sname;
	private String std;
	private char sec;
	private String gender;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public char getSec() {
		return sec;
	}
	public void setSec(char sec) {
		this.sec = sec;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student2(int id, int sid, String sname, String std, char sec, String gender, int age) {
		super();
		this.id = id;
		this.sid = sid;
		this.sname = sname;
		this.std = std;
		this.sec = sec;
		this.gender = gender;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student2 [id=" + id + ", sid=" + sid + ", sname=" + sname + ", std=" + std + ", sec=" + sec
				+ ", gender=" + gender + ", age=" + age + "]";
	}
	

}
