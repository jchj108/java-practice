// import java.util.Scanner;

public class Q410 {

	public static void main(String[] args) {

		int num = 12345;
		int sum = 0;

		for (int i = 0; i<=10; i++) {
			sum = sum + num %10;
			num = num / 10;
			System.out.println(sum);
			System.out.println(num);
		}
		
			System.out.println("sum="+sum);
	}				
}

