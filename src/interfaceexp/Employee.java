package interfaceexp;

public class Employee extends Person implements Payble, Promotionable {

	public static void main(String[] args) {
		
		Employee test = new Employee();
		test.increasePay();

	}

}
