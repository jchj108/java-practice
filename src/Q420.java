// import java.util.Scanner;

public class Q420 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0 && i % 3 != 0) { // i가 2또는 3의 배수가 아닐 때만 sum에 i를 더한다
				System.out.println(sum+=i);
			}
		}
				
		
	}

}
