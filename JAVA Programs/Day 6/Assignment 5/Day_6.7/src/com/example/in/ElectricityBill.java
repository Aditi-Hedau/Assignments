package com.example.in;

public class ElectricityBill {
	
	String customerName;
	double unitsConsumed;
	double billAmount;
	
	
	public ElectricityBill(String customerName, double unitsConsumed) {
		super();
		this.customerName = customerName;
		this.unitsConsumed = unitsConsumed;
	}
	
	public void calculateBillAmount() {
		if(unitsConsumed <= 100) {
			billAmount = unitsConsumed * 5;
		} else if(unitsConsumed <=300) {
			billAmount = 100*5 + (unitsConsumed -100) * 7;
		} else {
			billAmount = 100*5+200*7+(unitsConsumed -300)*10;
		}
		
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public double getUnitsConsumed() {
		return unitsConsumed;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public static void main(String[] args) {
		
		
		ElectricityBill bill = new ElectricityBill("James Gosline", 250);
		
		bill.calculateBillAmount();
		
		System.out.println("Customer Name  :  " + bill.getCustomerName());
		System.out.println("Units Consumed  :  " +bill.getUnitsConsumed());
		System.out.println("Bill Amount: Rs.  " + bill.getBillAmount());
		

	}

}
