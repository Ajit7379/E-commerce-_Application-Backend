package com.org.ShirtCollection;

import java.util.Comparator;

public class LowToHigh  implements Comparator<Shirt>{

	@Override
	public int compare(Shirt o1, Shirt o2) {
		return  (int)(o1.getPrice()-o2.getPrice());
		
	}

}
