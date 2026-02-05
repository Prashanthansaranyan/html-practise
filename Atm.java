import java.util.Scanner;
class Atm{
	public static void main (String [] args){
		double balance =1000000.0;
		int choice;
		Scanner scc = new Scanner(System.in);
		System.out.println("Enter your account number");
		 int s=scc .nextInt();
		 if(s==2006){
			 System.out.println("Enter your password");
			 int p=scc.nextInt();
			 if(p==1000){
		do{
            System.out.println("ATM MENUS");
			System.out.println("1. check your balance");
			System.out.println("2. withdraw money");
			System.out.println("3. deposit money");
			System.out.println("4. exit");
			System.out.println("What is your need");
		choice=scc.nextInt();
		
		switch (choice){
			case 1:
				System.out.println("This is your balance:"+balance);
				break;
			case 2:
				 System.out.println("Enter your withdraw money: ");
				 double withdraw = scc.nextDouble();
				 if(withdraw<balance){
					balance-=withdraw;
					System.out.println("please get your cash");
				 }else{
					System.out.println("your balance is lessthan withdraw money ");
					}
				 break;	
			case 3:
				System.out.println("Enter your deposit money");
				double deposit = scc.nextDouble();
				balance += deposit;
				System.out.println("your deposit is successfully");
				break;
			case 4:
				System.out.println("Thank you for your using");
				break;
			default:
				System.out.println("in valid number please try agin");
				
		}
	 } while (choice != 4);
	  scc.close();
			 }else{
				 System.out.println("invalid password");
			 }
	}else{
			 System.out.println("Your account number is invalid");
		 }
	}
	
}