//this is java programm

import java.io.*; //this is how to import packages

class One {
	int a; // veriable definision
	int b;
	
	void printDetails(){
		System.out.println("From class one a = "+a);
		System.out.println("From class one b = "+b);
	}
}

class Two{
	int a;
	int c;
	
	void printDetails(){
		System.out.println("From class two a = "+a);
		System.out.println("From class two c = "+c);
	}
	
}

class App{
	
	public static void main(String[] args){
		One o1=new One();
		Two t1=new Two();
		
		o1.printDetails();
		t1.printDetails();
	}
	
}