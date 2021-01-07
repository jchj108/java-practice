
public class Array1 {

	public static void main(String[] args) {

//		int[] score; // 1. 배열의 score를 선언(참조변수)
//		score = new int[5]; // 2. 배열의 생성(int저장공간 * 5)
	
		int [] score = new int[5]; // 배열의 선언과 생성을 동시에
		score[3] = 100; // 3번째 배열에 100을 대입
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]); 
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		int value = score[3]; // 변수 value에 score[3] (배열의 네번째)의 값인 100을 저장
		System.out.println("value="+value); // 출력시 value = 100
		
		//배열은 한번 생성하면 (실행 동안) 그 길이를 바꿀 수 없다 
	}

}
