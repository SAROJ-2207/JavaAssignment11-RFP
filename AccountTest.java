import java.util.Scanner;

class Account {
	static final int account_Balance = 10000 ;
	int withdrawl_Amount;
	int current_Balance;
	
	public void debit(int withdrawl_Amount) {
		if( withdrawl_Amount <=  account_Balance ) 
			System.out.println(withdrawl_Amount+" This Amount Not Exceeding Account Balance");
		else 
			System.out.println(withdrawl_Amount+" This Amount Exceeding Account Balance");		
		}
	
	public void currentBalance(int withdrawl_Amount) {
		if( withdrawl_Amount <=  account_Balance ) {
			int currentBalance = account_Balance - withdrawl_Amount;			
		System.out.println("After Withdraw Current Balance :- "+ currentBalance);
    	}		
   }
}

class AccountTest {
	public static void main (String[] args) {
		Account obj =  new Account();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Withdrwal Amount :- ");
		int withdrawlAmount = input.nextInt();
		obj.debit(withdrawlAmount);		
		obj.currentBalance(withdrawlAmount);		
	}
}