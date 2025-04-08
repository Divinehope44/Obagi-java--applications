import java.util.Scanner;
	
public class First15Multiple{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);    
		
		System.out.printf("Enter num: ");
		int num = input.nextInt();
		
		System.out.println("The first 15 multiple of " + num );
		
		int i = 1;
		while(i <= 15){
			System.out.println(num * i);
			i++;
		}
	}
}