package com.cognizant.collection;

import java.util.Comparator;

public class SortByDesignation implements Comparator<Worker> {

	@Override
	public int compare(Worker o1, Worker o2) {
		// TODO Auto-generated method stub
		return o1.getDesignation().compareTo(o2.getDesignation());
	}

}
