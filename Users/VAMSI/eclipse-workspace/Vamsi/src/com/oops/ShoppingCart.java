package com.oops;

public class ShoppingCart {

	private int cartItems;
	private double totalAmount;

	public void setCartItems(int cartItems) {
		this.cartItems = cartItems;
	}

	public int getCartItems() {
		return cartItems;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void addItems(int items, double price) {

		cartItems = cartItems + items;
		totalAmount = totalAmount + (items * price);

	}

	public void removeItems(int items, double price) {

		if(items < cartItems) {
			cartItems = cartItems - items;
			totalAmount = totalAmount - (items * price);
		} else {
			System.out.println("Cannot remove more items than present in cart");
		}

	}
	public double getTotal() {
		return totalAmount;

	}
	
}
