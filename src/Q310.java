//import java.util.Scanner;
public class Q37 {

	public static void main(String[] args) {

	//ȭ���� ������ ��ȯ�ϰ� �Ҽ��� �ݿø��ϱ�
		
	int fahrenheit = 100;
	float celcius = (int) ((5/9f * (fahrenheit -32)) * 100 + 0.5) / 100f;
			
	
	System.out.println("Fahrenheit:"+fahrenheit);
	System.out.println(String.format("Celcius:" + "%.2f", + celcius));

	}

}
