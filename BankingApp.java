import java.until.Scanner

	public class BankingApp{
	String accountName = "James Williams";
	String accountNumber = "504059995";
	double int depositBalance = 595575.48;
	
	
	public int deposit(int amount){
		accountBalance += amount;
		return accountBalance;
	}
		
	public double withdrawal(int amount){
		accountBalance += amount;
		
	if (amount > accountBalance){
		System.out.println(Insufficient funds");
	}
	
		return accountBalance;
	}

	public double checkBalance(){
		return accountBalance;
	}
	
	int withdrawal(int amount){
		accountBalance -= amount;
		if (amount > accountBalance}{
			System.out.printf("Insufficient funds");
		}
		return accountBalance;
		
	
	}
	
	public static void main(String[] args){
		BankingApp bankApp = new BankingApp();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to UBA");
		System.out.println("Enter 1 to Deposit");
		System.out.println("Enter 2 to Withdraw");
		System.out.println("Enter 3 to checkBalance");
		System.out.println();
		
		switch(choice){
		case 1:
			{
				System.out.print("Enter amount: ");
				int depositAmount = input.nextInt();
				
				System.out.println("-------------------------------------------------");
				
				System.out.println("Account Name: " + bankApp.accountName);
				System.out.printf("Account Number: " + bankApp.accountNumber);
				System.out.println(Intital Balance: " + bankApp.accountBalance);
				
				bankApp.deposit(depositAmount);
				System.out.printf("Your balance is %d%n",bankApp.checkBalance());
			System.out.println("-------------------------------");
		}
		break;
			
		case 2:
		{
			System.out.print("Enter amount: ");
			int withdrawalAmount = input.nextInt();
			
			bankApp.withdrawal(withdrawalAmount);
		}
			break;
		
			case 3:
		{
		}
			break;
		
			default:
			System.out.println("Invalid choice");
		}
	}
}
				