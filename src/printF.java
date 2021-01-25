
public class printF {

	public static void main(String[] args) {

		System.out.println();
	  
			System.out.printf("%d%n", 15);
			System.out.printf("%#o%n", 15);
			System.out.printf("%#x%n", 15);
			System.out.printf("%s", Integer.toBinaryString(15));
			
			System.out.printf("[%d]%n", 1234567);
			System.out.printf("[%-5d]%n", 10);
			System.out.printf("[%05d]%n", 10);
			
			float f = 123.456789f;
			double d = 123.456789d;
			System.out.printf("%f%n", f);
			System.out.printf("%e%n", d);
			System.out.printf("%g%n", d);
			
			System.out.printf("[%d]%n", 1234567);
			System.out.printf("[%-5d]%n", 10);
			System.out.printf("[%05d]%n", 10);
			
			double d1 = 1.23456789;
			System.out.printf("%.6f%n", d1);
			
			System.out.printf("[%s]", "www.codechobo.com");
			System.out.printf("[%20s]%n", "www.codechobo.com");
			System.out.printf("[%-20s]%n", "www.codechobo.com");
			System.out.printf("[%.10s]%n", "www.codechobo.com");
	}
 
}
