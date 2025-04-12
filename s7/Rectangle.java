class Rectangle{
	
	int height;
	int width;
	
	Rectangle(int h, int w){
		
		this.height=height=h;
		this.width=width=w;
		
		System.out.println("just created rectangle object with siz(h*w) "+height+"*"+width);
		print(width,height);
	}
	
	void print(int width, int height){
		
		for(int i=0; i<width; i++){
			
			for(int j=0; j<height; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}

class Main{
	public static void main(String[] args){
		
		Rectangle R1= new Rectangle(5,3);
		Rectangle R2= new Rectangle(3,6);
		//Rectangle R3= new Rectangle();
		//Rectangle R3=R1;
		//R1.print(10,7);
		
		System.out.println("r1 height= "+R1.height+" width= "+R1.width );
		System.out.println("r2 height= "+R2.height+" width= "+R2.width );
		//System.out.println("r1 height= "+r3.height+" width= "+r3.width );
	}
	
}