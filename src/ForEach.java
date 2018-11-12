public class ForEach{
	public static void main(String args[]){
		int nums[] = {10,20,30,40,50,60,70,80,90,100};
		int sum = 0;
		for(int x:nums){
			System.out.println(x);
			sum+=x;
		}
		
		System.out.println("sum is "+sum);
		
	}
	
	
}