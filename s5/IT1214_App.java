class Students{
	
	int marks;
	String Name;
	
	Students(){
		System.out.println("create student object");
		Name= "Defult name";
	}
	
	Students(String n,int m){
		System.out.println("create a student object with name "+n+" and "+m);
		Name= n;
		marks=m;
	}
}

class Printer{
	
	void print(String x){
		System.out.println(x);
	}
	
}

class App{
	public static void main(String[] args){
		
		
	Printer p = new Printer();
	p.print("welcome to Demo class App");
	
	Students s1= new Students();
	s1.marks=70;
	s1.Name="sachin";
	
	System.out.println("marks of the students 1 is: "+s1.marks);
	System.out.println("name of the students 1 is: "+s1.Name);
	
	Students s2 = new Students("bob",60);
	//s2.marks= 80;
	//s2.Name= "jonny";
	
	System.out.println("marks of the students 2 is: "+s2.marks);
	System.out.println("name of the students 2 is: "+s2.Name);
	
	}
}