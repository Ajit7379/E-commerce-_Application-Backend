package com.org.ShirtCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.org.ProductProject.Product;

public class ShirtService {
	
	
	private List<Shirt> ll=new ArrayList<>();
	
	public void addShirt(Shirt s)
	{
		 ll.add(s);
		 
		 
	}
	
	
	public void getAllShirt()
	{
		for(Shirt s:ll)
		{
			System.out.println(s);
		}
	
	}
	
	
	public void getShirtByBrand(String b)
	{
		for(Shirt s:ll)
		{
			if(s.getBname()==b)
			{
				System.out.println(s);
			}
			
		}
	
	}
	
	
	public void getShirtBySize(int s)
	{
		  boolean found = false;
		for(Shirt sp:ll)
		{
			if(sp.getSize()==s)
			{
				System.out.println(sp);
			       found = true;
			}
			
		}
		
		   if (!found) {
	            System.out.println("No shirts found matching the given criteria.");
	        }
		
		
		
	
	}
	
	
	public void getShirtByPrice(int p,int p1)
	{
		for(Shirt s:ll)
		{
			if(s.getPrice()>=p && p1<s.getPrice())
			{
				System.out.println(s);
			}
			
		}
	
	}
	
	public void sortBylowtoHighPrice( )
	{
		  Collections.sort(ll,new LowToHigh());
		  
		  for(Shirt s:ll)
		  {
			  System.out.println(s);
		  }
	}
	
	public void sortByHighToLowPrice( )
	{
		  Collections.sort(ll,new HighToLow());
		  for(Shirt s:ll)
		  {
			  System.out.println(s);
		  }
	}
	
    public void WithpriceAndColor(double price, String color) {
        boolean found = false;
        for (Shirt s : ll) {
            if (s.getPrice() <= price && s.getColor().equalsIgnoreCase(color)) {
                System.out.println(s);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No shirts found matching the given criteria.");
        }
  
    
    
    }
    
	public void sortByLowToHighSize( )
	{
		  Collections.sort(ll,new LowToHighSize());
		  for(Shirt s:ll)
		  {
			  System.out.println(s);
		  }
	}
	
	public void sortByHighToLowSize( )
	{
		  Collections.sort(ll,new HighToLowSize());
		  for(Shirt s:ll)
		  {
			  System.out.println(s);
		  }
	}
	public void getAllBrandsOfShirt()
	{
		  Set<String> set=new HashSet<>();
		  
		  for(Shirt s:ll)
		  {
			  set.add(s.getBname());
		  }
		  
		  System.out.println(set);
		  
	}
	
	public int getNoOfShirtByBrand(String name)
	{
		int count=0;
		for(Shirt s:ll)
		{
			if(s.getBname().equals(name))
			{
				count++;
			}
		}
	    return count;
	
	}
	
	public int getNoOfShirtBySize(int size)
	{
		int count=0;
		for(Shirt s:ll)
		{
			if(s.getSize()==size)
			{
				count++;
			}
		}
	return count;
	
	}
	
	
	public int getNoOfShirtByColor(String color)
	{
		int count=0;
		for(Shirt s:ll)
		{
			if(s.getColor().equals(color))
			{
				count++;
			}
		}
	return count;
	
	}
	public void removeProduct()
	{
		
		Iterator itr=ll.iterator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to remove on brand");
		System.err.println("Press 2 to remove on brand");
		int choice=sc.nextInt();
		
	
		if(choice==1)
		{
			System.out.println("Enter the brand Please :::::");
			sc.nextLine();
			String brand=sc.nextLine();
			while(itr.hasNext())
			{
				Product x=null;
			}
		}
		else if(choice ==2)
		{
			System.out.println("Enter the brand Category :::::");
		}
	}
}


