package com.org.ShirtCollection;

import java.util.Comparator;

public class HighToLowSize  implements Comparator<Shirt>{

	@Override
	public int compare(Shirt o1, Shirt o2) {
		
		return (int)(o2.getSize()-o1.getSize());
	}

}
