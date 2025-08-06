package com.org.ShirtCollection;

import java.util.Comparator;

public class LowToHighSize implements Comparator<Shirt> {

	@Override
	public int compare(Shirt o1, Shirt o2) {
		
		return (int)(o1.getSize()-o2.getSize());
	}

}
