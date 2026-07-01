package com.Javaintro;

public class DemoBike {
	 
	  static int count=0;
	DemoBike()
	  {
		  count++;
			
	  }
	

	public static void main(String[] args) {
		DemoBike v1=new DemoBike();
		DemoBike s1=new DemoBike();
		DemoBike r1=new DemoBike();
		DemoBike z1=new DemoBike();
		 
		System.out.println("Number of object: "+DemoBike.count);
	    

	}

}
