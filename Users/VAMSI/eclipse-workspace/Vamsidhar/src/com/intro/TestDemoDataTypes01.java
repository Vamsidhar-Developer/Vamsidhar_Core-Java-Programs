package com.intro;

public class TestDemoDataTypes01 {
	int i= (int) 2147483648L;
	byte b;
	byte b1=(byte) 130;
	short s=(short)32768;
	long l=9223372036854775807l;
	
	float f=55.98080899994484164165468f;
	double d=9.54444444444454444444444444444444444444444444444444;
	 
	boolean booo;
	char c=64;
	int i9='j';
	boolean good=false;

	public static void main(String[] args) {
		
		TestDemoDataTypes01 v1=new TestDemoDataTypes01();
		
		System.out.println("Integer Default Value: "+v1.i);
		System.out.println("Byte Default Value: "+v1.b);
		System.out.println("Short Default Value: "+v1.s);
		System.out.println("Long Default Value: "+v1.l);
		
		System.out.println("Float Default Value: "+v1.f);
		System.out.println("Double Default Value: "+v1.d);
		
		System.out.println("Boolean Default Value: "+v1.booo);
		System.out.println("Character Default Value: "+v1.c);
	 System.out.println(v1.i9);
    if (v1.good) {
      System.out.println("good morning");
    }
	}

}
