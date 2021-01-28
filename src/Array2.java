
public class Array2 {

	public static void main(String[] args) {
			// index범위 : 0~9
			int[] arr = new int[9]; // 길이가 5인 배열 생성
			System.out.println("arr length="+arr.length);
			
//			for(int i=0; i<10; i++) { // index범위를 벗어나서 에러 (-1을 하지 않음)
//			System.out.println("arr["+i+"]="+ arr[i]);
		
			for(int i=0; i<arr.length; i++) { // 에러방지, length이기 때문
			System.out.println("arr["+i+"]="+ arr[i]);
			}
			
	}

}
