
public class JavaBasic {

	/**
	 * 1. for loop
	 * 2. while loop
	 * 3. do while loop - assignment
	 * 4. extended for loop - collections
	 * 5. forEach loop - java 8 features.
	 * */
	public static void main(String args[]) {
		
		String[] names = new String[5];
		names[0] = "Raj";
		names[1] = "Shaleen";
		names[2] = "Vaibhav";
		names[3] = "Divya";
		names[4] = "Rahul";
		
		
		
		
		int[] age = new int[] {10,11,13,14,15};
		
		for (int i = 0; i< 5;i++) {
			System.out.println(names[i] + " ---- " + age[i]);
		}
		
		for (int i = 1; i<=100; i = i+1) {
			System.out.println(i + " Shaleen Agarwal");
		}
		
		int a = 0;
		while (a < 10) {
			System.out.println("print my name");
			a++;
		}
	}
}
