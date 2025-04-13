import java.util.*;

class inputDemo{
	
	public static void main(String[] args){
	
	String name;
	int age;
	byte marks;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("hi enter your name: ");
	name = sc.nextLine();
	System.out.println("enter your age:");
	age=sc.nextInt();
	System.out.println("enter your marks:");
	marks = sc.nextByte();
	System.out.println("welcome "+name+" your age is "+age);
	System.out.println("your marks is "+marks);
	
	}
	
}