package com.capg.Sprint1.pms.model;

public class Account {
	  private long acNo;
	  private String name;
	  private long contact;
	  private String address;
	public long getAcNo() {
		return acNo;
	}
	public void setAcNo(long acNo) {
		this.acNo = acNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Account(long acNo, String name, long contact, String address) {
		super();
		this.acNo = acNo;
		this.name = name;
		this.contact =contact;
		this.address = address;
	}

	
}
