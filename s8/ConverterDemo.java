class ConverterDemo{
	
	public static void main(String[] args){
		
		boolean bo=true;
		byte by=10; //-127 to 128
		short sh=50;
		char ch='s';
		long lo=434L;
		int in=352;
		float fl=43.36f;
		float f2= 7/2;
		double db=65.543;
		String st="sachin";
		
		//small container into a large container is ok
		lo = by;//(widining) type conversion
		
		//large container into a small container is not ok
		//sh=lo;
		
		sh=(short)lo;//casting
		
		fl=in;
		
		in=(int)db; // ooutput is 65 not 65.543
		
		in=ch; //print int value of charcter s
		
		ch=100;
		
		//ch=in;
		
		ch=(char)in;
		
	
		
		System.out.println("value of boolean is: "+bo);
		System.out.println("value of byte is: "+by);
		System.out.println("value of char is: "+ch);
		System.out.println("value of long is: "+lo);
		System.out.println("value of short is: "+sh);
		System.out.println("value of integer is: "+in);
		System.out.println("value of float f1 is: "+fl);
		System.out.println("value of float f2 is: "+f2);
		System.out.println("value of double is: "+db);
		System.out.println("value of string is: "+st);
		
	}

}