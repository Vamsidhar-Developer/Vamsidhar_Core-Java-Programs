package com.javaintro;

public class WrapperConversion {

	public static void main(String[] args) {
		 
		String value="101";
		
		int intvalue=Integer.parseInt(value);
		double doublevalue=Double.parseDouble(value);
		float floatvalue=Float.parseFloat(value);
		short shortvalue=Short.parseShort(value);
		byte bytevalue=Byte.parseByte(value);
		long longvalue=Long.parseLong(value);	 
		boolean booleanvalue=Boolean.parseBoolean(value);
		
		
		
	
		System.out.println("String Value: "+value);
		System.out.println("Integer Value: "+intvalue);
		System.out.println("Double Value: "+doublevalue);
		System.out.println("Float Point Value: "+floatvalue);
		System.out.println("Short Value: "+shortvalue);
		System.out.println("Byte Value: "+bytevalue);
		System.out.println("Long Value: "+longvalue);
		System.out.println("Boolean Value: "+booleanvalue);

	}

}
