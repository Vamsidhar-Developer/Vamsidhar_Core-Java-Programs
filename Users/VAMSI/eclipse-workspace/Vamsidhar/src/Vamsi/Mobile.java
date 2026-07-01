package Vamsi;

public class Mobile {
   @Override
    protected void finalize() {
	   
    	System.out.println("Object Died");
    	
    }
 

	public static void main(String[] args) {
	 
		Mobile vivo=new Mobile ();
		System.out.println(vivo); 
	 
		
		
		Mobile oppo=new Mobile();
		System.out.println(oppo);
		
		Mobile mi=new Mobile();
		System.out.println(oppo);
	    
		vivo=null;
		oppo=null;
		System.out.println("----------");
		
		System.gc();
		
		System.out.println(vivo); 
		System.out.println(oppo);
		System.out.println(mi);
		
	}

}
