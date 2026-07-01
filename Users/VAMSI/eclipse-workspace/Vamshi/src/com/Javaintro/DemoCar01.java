package com.Javaintro;

public class DemoCar01 {
	@Override
	protected void finalize() {
		System.out.println("Object died");
		
	}

	public static void main(String[] args) {
		 
		DemoCar01 v1=new DemoCar01 ();
		System.out.println(v1);
		
		DemoCar01 s1=new DemoCar01 ();
		System.out.println(s1);
		
		DemoCar01 r1=new DemoCar01 ();
		System.out.println(r1);
		
		//System.gc();
		
		v1=null;
		r1=null;
		
		System.gc();
		
		
		System.out.println(v1);
		System.out.println(s1);
		System.out.println(r1);

	}

}
