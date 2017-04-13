import java.util.*;

class Calculator {
	public static void main(String[] args) {
	double a;
	System.out.print("Enter any number : ");
	Scanner sc = new Scanner(System.in);
	double i = sc.nextDouble();
	System.out.println("Enter '+' for addition, '-' for subtraction, '*' for multiplication and '/' for divisiion respectively.");
	System.out.println("Kindly follow the instructions as mentioned above.");
	
	String addition = "+"; 
	String subtraction = "-";
	String multiplication = "*";
	String division = "/";
	
	Scanner sc1 = new Scanner(System.in);
	String o = sc1.nextLine();
	
	System.out.println();
	System.out.print( " Enter another number : ");
	double j = sc.nextDouble();
	
	if(addition.equals(o)) {
		a = i + j;
		System.out.println(i + " + " + j +" = "+ a);
	}else if(subtraction.equals(o)){
		a = i - j;
		System.out.println(i + " - " + j +" = "+ a);
	}else if(o.equals(multiplication)) {
		a = i * j;
		System.out.println(i + " * " + j +" = "+ a);
	}else if(o.equals(division)){
		a = i / j;
		System.out.println(i + " / " + j +" = "+ a);
	}
		
	}
	
}