package com.cognizant.classes;

public class GenericDemo {
	public static void main(String[] args) {
		Test<Integer> t= new Test<>();
		Test<String> t1= new Test<>();
		t.set(5);
		int i=(int)t.get();
		System.out.println(i);
	t1.set("hello");
	String s= t1.get();
		System.out.println(s);
	}

}
class Test<T>{
	private T obj;
	public T get() {
		return obj;
	} public void set(T ob) {
		this.obj=ob;
	}
}