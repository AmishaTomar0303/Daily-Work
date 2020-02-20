package com.cognizant.collection;

import java.util.Comparator;

public class SortById  implements Comparator<Worker> {

	@Override
	public int compare(Worker w1, Worker w2) {
		if(w1.getId() > w2.getId()) {
			return 1;
		}else if(w1.getId()==w2.getId()) {
			return 0;
		}else {
		
		return 0;
	}
		}

}

