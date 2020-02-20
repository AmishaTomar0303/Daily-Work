package com.cognizant.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class WorkerList {
	public static void main(String[] args) {
		
		ArrayList<Worker> list= new ArrayList<>();
		addWorker(list);
		//SortByName sbn=new SortByName();
		SortByDesignation sbn= new SortByDesignation();
		Collections.sort(list,sbn);
		System.out.println(list);
		/*System.out.println(list);
		for(Worker w: list) {
			System.out.println(w);
		}
		*/
	}
	private static void addWorker(ArrayList<Worker>list) {
		Worker w1= new Worker(4298, "vijay","bangalore","Developer",20,41241.86,785532);
		Worker w2= new Worker(4235, "nijay","bore","testerr",20,41241.86,785532);
		Worker w3= new Worker(4100, "sijay","mysore","Devopser",20,41241.86,785532);
		Worker w4= new Worker(1237, "qwijay","indore","software enginner",20,41241.86,785532);
		list.add(w1);
		list.add(w2);
		list.add(w3);
		list.add(w4);
	}
}


