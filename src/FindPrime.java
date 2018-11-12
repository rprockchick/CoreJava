public class FindPrime{
	public static void main(String args[]) throws java.io.IOException{
		boolean choice = false;
		
		do{		
		boolean isPrime;
		int num;
		System.out.println("Please enter a number");
		System.in.mark(3);
		num = (int)System.in.read();
		System.out.println("Available "+System.in.available());
		
		
		if(num<2) 
			isPrime = false;
		else 
			isPrime = true;
		
		for(int i=2; i<num/i;i++){
			
			if((num%i)==0){
				isPrime=false;
				break;
			}
			
		}
		
		if(isPrime)
			System.out.println("num is prime");
		else {
		System.out.println("num is not prime");}
			
		System.out.println("Would you like to enter another number? Type 0 for false or 1 for true");
		
		
	    int ans = (int)System.in.read();
	    
	    if(ans == 1)
	    	choice = true; 
		
	}while(choice);

		
			
	}
}