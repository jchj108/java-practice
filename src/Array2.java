
public class Array2 {

	public static void main(String[] args) {
			// index���� : 0~9
			int[] arr = new int[9]; // ���̰� 5�� �迭 ����
			System.out.println("arr length="+arr.length);
			
//			for(int i=0; i<10; i++) { // index������ ����� ���� (-1�� ���� ����)
//			System.out.println("arr["+i+"]="+ arr[i]);
		
			for(int i=0; i<arr.length; i++) { // ��������, length�̱� ����
			System.out.println("arr["+i+"]="+ arr[i]);
			}
			
	}

}
