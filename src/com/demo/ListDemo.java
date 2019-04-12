package com.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListDemo {
	public static void main(String[] args) {
     ArrayList<Product> list = new ArrayList<Product>();
     Product prod1= new Product(1,"Prashanth");
     add(prod1,list);
     
     Product prod2= new Product(1,"Prashanth");
     add(prod2,list);
     
     System.out.println(list);
     
	}
	
	
	
	public static void add(Product product,ArrayList<Product> list) {
		 if (!list.contains(product)) {
	    	   list.add(product);
	    	}
	}
}
