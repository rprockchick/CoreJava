
public class CastConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		byte b;
		int i = 257;
		double d = 323.142;
		System.out.println("Convert int to byte");
		b = (byte)i;
		
		System.out.println("i and b are " + i + " "+b );
		
		System.out.println("Convert double to int");
		i = (int)d;
		
		System.out.println("d and i are " + d + " "+i );
		
		System.out.println("Convert double to byte");
		b = (byte)d;
		
		System.out.println("b and d are " + b + " "+d );
		
		
	}

}
