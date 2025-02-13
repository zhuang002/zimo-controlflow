import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int loops = sc.nextInt();
		for (int i=0;i<loops;i++) {
			System.out.println(accumulate(sc.nextInt()));
		}
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
