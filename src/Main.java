import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int loops = sc.nextInt();
		for (int i=0;i<loops;i++) {
			System.out.println(accumulate(sc.nextInt()));
		}
		
		System.out.println("Please input 3 integers indicating the edge length of a triangle");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a+b<=c || b+c<=a || c+a<=b) {
			System.out.println("Error edges.");
			return;
		}
		
		System.out.println("The area of the triangle is "+area(a,b,c));
	}

	private static double area(double a, double b, double c) {
		// TODO Auto-generated method stub
		// S = sqrt(p*(p-a)*(p-b)*(p-c)), p=(a+b+c)/2;
		
		double p=(a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
	}

	private static int accumulate(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}

}
