package com.org.ShirtCollection;

import java.util.Comparator;

public class HighToLow  implements Comparator<Shirt>{


	@Override
	public int compare(Shirt o1, Shirt o2) {
		
		return (int)(o2.getPrice()-o1.getPrice());
	}

}
