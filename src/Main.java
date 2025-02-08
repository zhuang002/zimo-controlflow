import java.util.Scanner;

public class Main {

	/* spec 1
	 * Input numbers and sum them up until the number is negative.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int a = 0;
		
		/*
		 * while (condition) {
		 * 		statements;
		 * }
		 * 
		 * condition: is a boolean expression or value. 
		 * if it is true then enter the loop, otherwise break out.
		 */
		
		//spec 1
		while (a>=0) {
			sum += a;
			a = sc.nextInt();
		}
		
		System.out.println(sum);
	}

}
