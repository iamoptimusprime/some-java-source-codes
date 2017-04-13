import java.util.Scanner;

class Delete {
	public static void main(String[] args) {
		long x = 0;
		long a;
		long b = 1;
		long c = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long num = sc.nextInt();
		System.out.println("The Fibonacci sequence is as follows: \n");
		System.out.print("1 1 ");
		for(long i = 0; i <= num; i++) {
			a = b + c;
			b = a; 
			c = a - c;
			System.out.print(a + " ");
			x++;
			
			if (x == 5) {
		System.out.println("\n");
		x = 0;
	   }
	  }
	}
}