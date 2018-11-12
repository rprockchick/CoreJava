
public class TypePromotion {

	public static void main(String[] args) {
		
		byte a = 40;
		byte b = 50;
		byte c = 100;
		int d = a * b/c;
		
		System.out.println(d);

		byte e = 50;
		// byte f = 50*2; error as trying to store a promoted value of int into byte
		
		byte f = (byte)50*2;
		
		System.out.println(f);
	}

}
