public class objectpractice {
	public static void main(String[] args) {

		Tv t;
		t = new Tv();
		t.channel = 5;
		t.channelup();
		
		System.out.println(t.power);
	}
}	
		
class Tv {
			
		String color;
		boolean power;
		int channel;

		void power()	{ power = !power; }
		void channelup()	{ ++channel; }
		void channeldn()	{ --channel; }
	
		
		
		}

