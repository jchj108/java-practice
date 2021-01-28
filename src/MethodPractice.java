
public class MethodPractice {

	public static String a() {
		// ...
		return "a";
	}
	
	public static int one() {
		return 1; // 리턴 뒤에 어떤 데이터 타입이 올지 정해야함
		//리턴은 메소드를 종료시킴
	}
		
		
	public static void main(String[] args) { // 리턴 값이 없을 땐 void 메소드를 사용하는 것
		
		System.out.println(a());
		System.out.println(one());
		
		
		
		}
}
