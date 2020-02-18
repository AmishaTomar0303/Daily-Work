package com.cognizant;

public class Employee {

	private int eid;
	 private String ename;
	private String designation;
	private String address;
	private double phonenumber;
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(double phonenumber) {
		this.phonenumber = phonenumber;
	}
	public static void main(String args[]) {
		Employee emp= new Employee();
		emp.setAddress("vijay nagar");
		emp.setDesignation("manager");
		emp.setEid(101);
		emp.setEname("rahul");
		emp.setPhonenumber(7354050);
		System.out.println(emp.getAddress());
		System.out.println(emp.getDesignation());
		System.out.println(emp.getEid());
		System.out.println(emp.getEname());
		System.out.println(emp.getPhonenumber());
	}
	
}
