public class Operators{
	public static void main(String[] args){
		//Assignment Operator(=)

		int num1,num2;
		
		num1 = 10;
		num2 = 5;
		
		//Arithmetic Operators(+,*,=,/,%)
		int sum = num1 + num2;
		
		int product = num1 * num2;
		
		int difference = num1 - num2;
		
		double quotient = (double)num1/num2;
		
		int modulos = num1%num2;
		
		//Relational Operators(>,<,<=,>=,==,!=)
		boolean isLessThan = num1 < num2;
		boolean isGreaterThan = num1 > num2;
		boolean isGreaterOrEqualTo = num1 >= num2;
	
		System.out.printf("The sum of the numbers is: %d%n",sum);
		System.out.printf("The product of the numbers is: %d%n",product);
		System.out.printf("The difference between %d and %d is: %d%n",num1,num2,difference);
		System.out.printf("The quotient of num1 and num2 is: %f%n",quotient);
		System.out.printf("The reminder betwen num1 and num2 is: %d%n",modulos);
		System.out.println("===================================================");
		System.out.printf("Is %d? < %b%n",num1,num2,isLessThan);
		System.out.printf("Is %d? > %b%n",num1,num2,isGreaterThan);
		System.out.printf("Is %d? < %b%n",num1,num2,isGreaterOrEqualTo);
	}
}