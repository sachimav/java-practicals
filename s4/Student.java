class Student{
	String name="sachin";
	int marks=100;
	
	Student(){
		name="no name";
	}
	
	Student(String n){
		name=n;
	}
	
	Student(String n, int m){
		name=n;
		marks=m;
	}
	
}



class Studentdemo{
	public static void main(String[] args){
		
	System.out.println("hi from student demo class");
	System.out.println("create an object of student class");
	
	
	Student a1 = new Student("nice name");
	System.out.println("name value of the object is : "+a1.name);
	System.out.println("marks of the object is "+a1.marks);
	a1.name="bob";
	a1.marks=10;
	
	System.out.println("name value of the object is : "+a1.name);
	System.out.println("marks of the object is "+a1.marks);
	}
}