import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int loops = sc.nextInt();
		for (int i=0;i<loops;i++) {
			int n = sc.nextInt();
			int sum = 0;
			for (int j=1;j<=n;j++) {
				sum+=j;
			}
			System.out.println(sum);
		}
	}

}
