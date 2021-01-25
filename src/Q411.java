// import java.util.Scanner;

public class Q411 {

	public static void main(String[] args) {
			//Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
		int num1 = 1; 
		int num2 = 1;
		int num3 = 0; //세번째 값
		System.out.print(num1+","+num2);
		
		for (int i = 0; i <8; i++) {
			num3 = num1 + num2;
			System.out.printf(","+num3); // 세 번째 수열 출력
			
			num1 = num2; // 두 번째 수열을 첫 번째 값으로 한다.
			num2 = num3; // 세 번째 수열을 두 번째 값으로 한다.
		}
		
	}				
}

