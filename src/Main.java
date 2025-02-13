import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int i;
		for (i=1;i<=n;i++) {
			/*if (i%5 !=0) {
				sum+=i;
			}*/
			if (i%5==0) {
				continue;
			}
			sum+=i;
			if (sum>1000)
				break;
		}
		
		System.out.println(i+","+sum);
		
		sum=0;
		i=1;
		while(i<=n) {
			if (i%5!=0) {
				sum+=i;
			}
			if (sum>1000) {
				break;
			}
			i++;
		}
		System.out.println(i+","+sum);
		
	}

}
