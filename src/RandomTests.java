import java.util.ArrayList;

public class RandomTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		System.out.println(list);

		String test = "abc";
		String test1 = "abc";
		System.out.println(test);
		
		//test = "xyz";
		
		System.out.println(test==test1); //both addresses same
		System.out.println(test.equals(test1));
		
		String newString = new String("Mary");
		String newString1 = new String("Mary");
		
		System.out.println(newString == newString1); // comparing memory address
		System.out.println(newString1.equals(newString)); //comparing objects

	}

}
