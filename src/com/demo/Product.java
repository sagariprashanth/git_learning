package com.demo;

public class Product {
	private int no;
	private String name;
	
	public Product(int no,String name) {
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [no=" + no + ", name=" + name + "]\n";
	}


	@Override
	public boolean equals(Object obj) {
		Product product = null;  
	 if(obj instanceof Product)
		 product = (Product)obj;
	 return this.no == product.no && this.name.equalsIgnoreCase(product.name);
	}
	
	

}
