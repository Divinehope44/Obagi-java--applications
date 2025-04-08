import java.util.Scanner;
	
	public class NumberCounter{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);    
		
		int positiveCount = 0;
		int negativeCount = 0;
		int zeroCount = 0;
		
		for(int i = 1;i <= 10;i++){
			System.out.printf("Enter num%d; ",1);
			int num = input.nextInt();

		if (num < 0){
			negativeCount++;
		}
		if(num > 0){
			positiveCount++;
		}
		if(num < 1 && num > -1){
			zeroCount++;
		}	
	}	
	System.out.printf("The number of posite integer is %d%n", positiveCount);
	System.out.printf("The number of negaive integer is %d%n", negativeCount);
	System.out.printf("The number of zero integer %d%n ", zeroCount);
	
	}
}
		
		