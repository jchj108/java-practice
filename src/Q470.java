// import java.util.Scanner;

public class Q470 {

	public static void main(String[] args) {

		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			sum += str.charAt(i) - '0'; //문자열에서 i번째 문자 반환, 0을 빼면 유니코드에서 48이 감소되어 해당 문자 출력
		}

			System.out.println("sum="+sum);
	}				
}

