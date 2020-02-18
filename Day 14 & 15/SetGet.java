package com.cognizant;

public class SetGet {
 String name;
	int age;
private float salary;
private double acno;
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public double getAcno() {
	return acno;
}
public void setAcno(double acno) {
	this.acno = acno;
}
public static void main (String[]args) {
SetGet sg= new SetGet();
sg.setAcno(10000.09);
sg.setSalary(1829303);
sg.setAge(10);
sg.setName("Amisha");

System.out.println(sg.getAge());
System.out.println(sg.getAcno());
System.out.println(sg.getName());
System.out.println(sg.getSalary());


}
}
