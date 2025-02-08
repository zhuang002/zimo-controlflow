import java.util.Scanner;

/*
 * spec 1:
 * Input an integer n. calculate 1+2+3+...+n
 */

/*
 * spec 2:
 * Input an integer n.
 * then input n integers.
 * calculate the sum of the input integers.
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		
		/*
		 * for (initialization; condition; updating ) {
		 * 	statements.
		 * }
		 * 
		 * initialization: a statement the execute before enter the loop.
		 * condition: a boolean expression. if true, then loop. if false then break.
		 * updating: a statement which is executed at the end of each loop.
		 * 
		 * process:
		 * 
		 * initialization;
		 * if (condition) {
		 * 	  statements;
		 * } else {
		 * 	  exit loop.
		 * }
		 * updating;
		 * if (condition) {
		 *    statements;
		 * } else {
		 *    exit loop
		 * }
		 * updating;
		 * .....
		 */
		
		/*
		 * ++:  i++ <=> i=i+1;
		 * +=:  i+=x  <=> i=i+x;
		 * 
		 * ++ <=> +=1
		 */
		/*sepc 1
		 * 
		 * for (int i=1;i<=n;i++) {
			sum += i;
		}
		System.out.println(sum);*/
		
		/*
		 * for clause is often used to loop for n times, and is usually written as:
		 * 
		 * for (int i=0;i<n;i++) {
		 * 	statements;
		 * }
		 */
		
		/*
		 * spec2
		 */
		
		for (int i=0;i<n;i++) {
			int a = sc.nextInt();
			sum += a;
		}
		
		System.out.println(sum);
	}

}
