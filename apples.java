import java.util.*;
import java.util.Random;
class apples{
	public static void main(String[] args) {
		Random r = new Random();
		int[] num = new int[2]; 
		boolean gameResult = true;
		for(int i = 0; i<num.length; i++) {
			num[i] = r.nextInt(100) + 1;
			if(num[i] % 2 == 0) {
				System.out.println("TRUE - " + num[i] + "is divisible by 2");
			} else {
				System.out.println("FALSE - " + num[i] + "is not divisible by 2");
				gameResult = false;
			}
		}
		if(gameResult){
			System.out.println("Congrats! you've won!");
		} else {
			System.out.println("Sorry! You've lost!");
		}
	}
}