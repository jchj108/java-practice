
public class Array1 {

	public static void main(String[] args) {

//		int[] score; // 1. �迭�� score�� ����(��������)
//		score = new int[5]; // 2. �迭�� ����(int������� * 5)
	
		int [] score = new int[5]; // �迭�� ����� ������ ���ÿ�
		score[3] = 100; // 3��° �迭�� 100�� ����
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]); 
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		int value = score[3]; // ���� value�� score[3] (�迭�� �׹�°)�� ���� 100�� ����
		System.out.println("value="+value); // ��½� value = 100
		
		//�迭�� �ѹ� �����ϸ� (���� ����) �� ���̸� �ٲ� �� ���� 
	}

}
