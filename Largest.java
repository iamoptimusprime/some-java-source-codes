import java.util.*;

class Largest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey there...\n");
		System.out.println("Enter a series of numbers and type in 'done' when finished...");
		
		double largest = sc.nextDouble();
		
		while(sc.hasNextDouble()) {
			double input = sc.nextDouble();
			while(input > largest) {
				largest = input;
			} 
		}
		System.out.println("Largest number from the proveded series is : " + largest);
	}
}