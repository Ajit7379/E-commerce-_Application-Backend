package com.org.ShirtCollection;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	    ShirtService s=new ShirtService();
	    s.addShirt(new Shirt("Arrow",38,4000,"Bhagwa"));
	    s.addShirt(new Shirt("Blackbarry",40,4200,"brown"));
	    s.addShirt(new Shirt("Arrow",40,4500,"Gray"));
	    s.addShirt(new Shirt("Blackbarry",36,5040,"brown"));
	    s.addShirt(new Shirt("Arrow",36,3800,"Gray"));
	    s.addShirt(new Shirt("FreshFabric",40,4100,"brown"));
	    s.addShirt(new Shirt("FreshFabric",38,4200,"White"));
	    s.addShirt(new Shirt("FreshFabric",36,3500,"RadishGray"));
	    s.addShirt(new Shirt("Arrow",38,4100,"NavyBlue"));
	    s.addShirt(new Shirt("Allen Solly",40,4000,"Black")); 
	    s.addShirt(new Shirt("Allen Solly",38,3800,"brown"));
	    s.addShirt(new Shirt("Arrow",36,3800,"Gray"));
	    s.addShirt(new Shirt("Allen Solly",40,4567,"brown"));
	    
	    System.out.println("Shirts are added  into the list .....");
	    
	   
	    	System.out.println("Enter Your Choice Whatever You want to Perform .................");
	    	System.out.println("Enter:- 1 for Add Shirt\n Enter:- 2 for All Shirt \n Enter :- 3 for Get By Brand\n Enter :- 4 To Filter Based On Price\n Enter:- 5 for Sort Low to High By Price\n Enter:- "
	    			+ "6 sort Shirt High to Low\n Enter:- 7 for getting All Brands Name\n Enter:-8 for Filter Base On Requirement\n Enter:-9 Get Shirt By Size\n Enter:- 10 Get No Shirt By size\n Enter:- 11 Get the No of Shirt By Brand Name\n Enter:- 12 Get the No of Shirt By Color\\n");
	    	int choice=sc.nextInt();
	    	sc.nextLine();
	    	
	    	switch(choice)
	    	{
	    	case 1:
	    	{
	    		System.out.println("You are in Adding Choice Please Write the Details ..............");
	    		System.out.println("Enter your Brand Name");
	    		String bname=sc.nextLine();
	    		System.out.println("Enter your  Size");
	    		int  size=sc.nextInt();
	    		sc.nextLine();
	    		System.out.println("Enter your Price");
	    		Double  p=sc.nextDouble();
	    		sc.nextLine();
	    		
	    		System.out.println("Enter your Color");
	    		String color=sc.nextLine();
	    		
	    		
	    		System.out.println(bname);
	    		System.out.println(size);
	    		System.out.println(p);
	    		System.out.println(color);
	    		s.addShirt(new Shirt(bname,size,p,color));
	    		
	    	}
          	break;
	    	case 2:
	    	{
	    		   System.out.println("All the Shirts ...........");
	    		    s.getAllShirt();
	    	}
	    	break;
	    	case 3:
	    	{
	    		 System.out.println("All the Shirts from a particular Brand...........");
	    	     s.getShirtByBrand("Arrow");
	    	     
	    	}
	    	break;
	    	case 4:
	    	{
	    		     System.out.println("Shirts Between your Budget Price ...........");
	    		     System.out.println("Enter Minimum price you want to set");
	    		     int p=sc.nextInt();
	    		     System.out.println("Enter Maximum price you want to set");
	    		     int p1=sc.nextInt();
	    		     sc.nextLine();
	    		     s.getShirtByPrice(p,p1);
	    	
	    	}
	    	break;
	    	case 5:
	    	{
	    		 System.out.println("Sort the Shirt from Low to High price Using Comparator Sorting ...........");
	    	     s.sortBylowtoHighPrice();
	    	
	    	}
	    	break;
	    	case 6:
	    	{
	    		  System.out.println("Sort the Shirt from High to  Low  price Using Comparator Sorting ...........");
	    		  s.sortByHighToLowPrice();
	    		     
	    		    
	    	}
	    	break;
	    	case 7:
	    	{
	            System.out.println("All the Brands Name of the Shirt ...........");    
	            s.getAllBrandsOfShirt();
	    	}
	    	break;
	    	case 8:
	    	{
	    		     System.out.println("This Method filter based on your color and price filter ...........");
	    	         System.out.println("Enter price that you want to filter");
	    	         double p=sc.nextInt(); 
	    	         sc.nextLine();
	    	         
	    	         System.out.println("Enter color that you want to filter");
	    	         String c=sc.nextLine();         
	    	    
	    		     s.WithpriceAndColor(p,c);
	    	
	    	}
	    	break;
	    	case 9:
	    	{
	    		    System.out.println(" Shirts of Given size ...........");
	    	        System.out.println("Enter size that you want to search");
	    	        int  p=sc.nextInt();       
	    	        s.getShirtBySize(p);
	    	    
	    	}
	    	break;
	    	case 10:
	    	{
	    	     System.out.println("No of Shirts of Some particular Size As Per Your Willingness...........");    
	    	     System.out.println("Enter the Size you want to find out Count");
	    	     int p1=sc.nextInt();
	    	     sc.nextLine();
	    	     System.out.println(s.getNoOfShirtBySize(p1));
	    	
	    	}
	    	break;	
	    	case 11:
	    	{
	    	     System.out.println("No of Shirt Of some Particular Brand As Per Your Willingness ...........");    
	    	     System.out.println("Enter the Brand Name you want to find out Count");
	    	     String sa=sc.nextLine();
	    	     System.out.println(s.getNoOfShirtByBrand(sa)); 
	    	
	    	}
	    	case 12:
	    	{
	    		 System.out.println("No of Shirt Of some Particular Brand As Per Your Willingness ...........");    
	    	     System.out.println("Enter the Brand Name you want to find out Count");
	    	     String sa=sc.nextLine();
	    	     System.out.println(s.getNoOfShirtByBrand(sa)); 
	    	     
	    	}
	    	dafault:
	    	{
            System.out.println("Enter Choice is not valid, please enter your valid choice.");
            System.out.println("Enter Y/y to continue or any other key to exit.");
            Character  ch = sc.next().charAt(0);
            break;
            
    }


}

sc.close();
}
}