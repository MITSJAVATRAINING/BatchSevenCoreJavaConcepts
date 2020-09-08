public class HelloWorld {
	

	public static void main(String args[]) {
		
		String name = "Shaleen";
		int age = 18;
		int b = 18;
		boolean isEmployee = true;
		
		name = new String("Rahul");
		
		String name1 = new String("Shaleen");
		String name2 = new String("Shaleen"); 
		
		if (name1.equals(name2)) {
			System.out.println("Name1 and Name2 are equal");
		} else {
			System.out.println("Not equal");
		}
		
		int sum = 10 + 10;
		System.out.println("Hello World");
		
		age = 26;
		if (age < 18) {
			System.out.println("Not allowed to cast vote");
		} else if (age == 18) {
			System.out.println(age);
		} else {
			System.out.println("Allwoed to vote");
		}
		
	}
}
