package com.ibm.training.springblock.oopsprograms;



public class Address {
	
	String street_name,city_name,country_name;
	int street_num,pincode;
	public Address(int street_num,String street_name, String city_name, String country_name,  int pincode) {
		
		this.street_name = street_name;
		this.city_name = city_name;
		this.country_name = country_name;
		this.street_num = street_num;
		this.pincode = pincode;
	}
	
	public void getAddress() {
		System.out.println("address details");
		System.out.println(street_num+","+street_name+","
				+ ","+city_name+","+country_name+","+pincode);
	}
	
	
	

}
