package interfaceexp;

public interface Promotionable {

	default boolean increasePay() {
		
		System.out.println("Method of interface Promotionable");
		return true;
		
	}
	
	default int testmethod() { return 1;}
}
