public class MethodOverLoading{
	public static void main(String[] args){
		MethodOverLoading.greeting();
		MethodOverLoading.greeting("Jack");
	}
	
	public static void greeting(){
		System.out.println("Good Afternoon, Everone");
	}
	
		public static void greeting(String name) {
		System.out.printf("Good Afternoon, %s%n", name);
	}
	
		public static void greeting(String name, int age) {
		System.out.printf("Good Afternoon %s, you are %d%n years old",name,age );
	}
	
		public static void greeting(String name, int age, String gender) {
		System.out.printf("Good Afternoon %s, your are %d years old");
	}
}