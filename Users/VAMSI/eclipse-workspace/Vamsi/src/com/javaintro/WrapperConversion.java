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
		//char charvalue=Character.parseCharacter(value);
		boolean booleanvalue=Boolean.parseBoolean(value);
		
		
		
	
		System.out.println("String Value: "+value);
		System.out.println("String Value: "+intvalue);
		System.out.println("String Value: "+doublevalue);
		System.out.println("String Value: "+floatvalue);
		System.out.println("String Value: "+shortvalue);
		System.out.println("String Value: "+bytevalue);
		System.out.println("String Value: "+longvalue);
		System.out.println("String Value: "+booleanvalue);

	}

}
