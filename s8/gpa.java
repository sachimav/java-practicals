import java.util.*;

class GPA{
	
	public double getgpa(String x){
		
		double gpa = 0;
		switch(x){
			
			case "A+":
				gpa = 4.0;
				break;
				
			case "A":
				gpa = 4.0;
				break;
				
			case "A-":
				gpa = 3.7;
				break;

			case "B+":
				gpa = 3.3;
				break;
				
			case "B":
				gpa = 3.0;
				break;

			case "B-":
				gpa = 2.7;
				break;
				
			case "C+":
				gpa = 2.3;
				break;

			case "C":
				gpa = 2.0;
				break;
				
			case "C-":
				gpa = 1.7;
				break;
				
			case "D+":
				gpa = 1.3;
				break;

			case "D":
				gpa = 1.0;
				break;
				
			case "E":
				gpa = 0.0;
				break;	
	
		}
		return gpa;
	}
	
	public static void main(String[] args){
		
		String Grade;
		int points;
		int totalp=0;
		double value=0;
		double total=0;
		
		
		Scanner sr = new Scanner(System.in);
		GPA obj1 = new GPA();
		
		for(int i = 1; i<=5; i++){
			System.out.println("Enter Subject number "+i+" marks: ");
			Grade = sr.nextLine();
			value = obj1.getgpa(Grade);
			
			System.out.println("Enter Subject number "+i+" credit points: ");
			points = sr.nextInt();
			sr.nextLine();
			
			total += value*points;
			totalp += points;
			
		}
		System.out.println("your GPA is: "+total/totalp);
	}
}