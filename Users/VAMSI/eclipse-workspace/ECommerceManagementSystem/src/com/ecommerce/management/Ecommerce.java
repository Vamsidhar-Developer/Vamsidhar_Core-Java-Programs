package com.ecommerce.management;

public interface Ecommerce {

	public abstract String getCustomerId();

	public abstract String getCustomerName();

	public abstract String getCustomerEmail();
	
	public abstract String getCustomerPhone();

	public abstract boolean isEmailValid(String email);

	public abstract boolean isPhoneValid(String number);

	public abstract int getProductID();

	public abstract int getProductQuantity();

	public abstract double calculateTotalAmount();

	public abstract void displayWelcomeMessage();

	double CalculateTotalAmount();

 

}
