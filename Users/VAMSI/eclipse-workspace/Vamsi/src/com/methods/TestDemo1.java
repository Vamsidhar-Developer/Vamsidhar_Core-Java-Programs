package com.methods;

public class TestDemo1 {

	public static void main(String[] args) {
		 
		TestDemo1 v1=new TestDemo1();
		 v1.ShowPlanDetails(); 
		 v1.PlanDetails("Recharge Successful !",299.0);
	}
	void ShowPlanDetails() {
		
		System.out.println("Plan Name:Unlimited Plan ");
		System.out.println("Validity:28 Days ");
		System.out.println("Data: 1.5 GB/Day");
		System.out.println("calls:Unlimited ");
	}
	void PlanDetails(String Recharge,double Amount) {

		System.out.println(Recharge);
		System.out.println("Recharge Amount: "+Amount);
		
		
	}

}
