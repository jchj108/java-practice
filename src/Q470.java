// import java.util.Scanner;

public class Q470 {

	public static void main(String[] args) {

		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			sum += str.charAt(i) - '0'; //���ڿ����� i��° ���� ��ȯ, 0�� ���� �����ڵ忡�� 48�� ���ҵǾ� �ش� ���� ���
		}

			System.out.println("sum="+sum);
	}				
}

