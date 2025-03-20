public class TypeCasting{
	public static void main(String[] args){
		double balance = 58585;
		System.out.printf("Your account balance is %c%f%n",'$',balance);
		
		//Narrowing Type Casting(ASCII code ? = 63)
		char alpha = '?';
		
		int asciiCode =(char)alpha;
		System.out.printf("The ASCII code for ? is %d",asciiCode);
	}

}