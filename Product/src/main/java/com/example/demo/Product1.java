package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="productinfo")
public class Product1 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	private int pid;
	private String pname;
	private String type;
	private int price;
	private String expdate;
	private String mfgdate;
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
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	public String getMfgdate() {
		return mfgdate;
	}
	public void setMfgdate(String mfgdate) {
		this.mfgdate = mfgdate;
	}
//	public Product1(int id, int pid, String pname, String type, int price, String expdate, String mfgdate) {
//		super();
//		this.id = id;
//		this.pid = pid;
//		this.pname = pname;
//		this.type = type;
//		this.price = price;
//		this.expdate = expdate;
//		this.mfgdate = mfgdate;
//	}
//	public Product1() {
//		
//	}
	

}
