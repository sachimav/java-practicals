import java.util.Scanner ; 

class ShopDemo {
	
	static String[] description={"Bred","Milkpowder","Toothpaste"};
	static int[] unitPrice = {160,1060,260};
	
	Scanner sc = new Scanner(System.in);
	static byte[] itemBasketIndex= new byte[3];
	static int [] itemBasketQuentity= new int[3];
	
	static int basketIndex=0;
	
	void getitem(){
		System.out.println("-----welcome to Demo Shop-------");
		System.out.println("Please select an item:");
		
		char Useroption ='y';
		
		
		do{
			for(int i = 0 ; i< description.length ; i++){
				
				System.out.println("enter "+i+" for "+description[i]);
				
				
			}
			
			int itemIndex= sc.nextInt();
			
			System.out.println("you have choosen " + description[itemIndex]);
			System.out.println("unit price of " + description[itemIndex]+" is "+ unitPrice[itemIndex] );
			
			System.out.println("Enter the qauntity" );
			
			int numberofUnit = sc.nextInt();
			itemBasketIndex[basketIndex] =(byte) itemIndex;
			itemBasketQuentity[basketIndex] = (byte) numberofUnit;
			
			basketIndex++;
			
			
			System.out.println("enter y continue press any cahrcter to exit");
			
			Scanner sc1 = new Scanner(System.in);
			Useroption =sc1.nextLine().charAt(0);
		}
		while(Useroption == 'y');
		

	}
	
	static int totalPrice;		
	static void showbasket() {
			System.out.println("\n----- Your Basket -----");
			System.out.println("No\tItem\t\tUnit Price\tQuantity\tPrice");
		
			for(int i = 0; i<basketIndex; i++){
				System.out.println(i+1+" \t"+description[itemBasketIndex[i]]+"\t \t"
				+unitPrice[itemBasketIndex[i]]+ " \t \t" + itemBasketQuentity[i]+"\t\t "
				+itemBasketQuentity[i]*unitPrice[itemBasketIndex[i]]	);
				
				totalPrice += itemBasketQuentity[i]*unitPrice[itemBasketIndex[i]];
				
			}

		System.out.println("Total price is: "+totalPrice);
		}
	
	
	public static void main(String[] args){
		
		ShopDemo demo = new ShopDemo();
		demo.getitem();
		demo.showbasket();
	}
	
	
}