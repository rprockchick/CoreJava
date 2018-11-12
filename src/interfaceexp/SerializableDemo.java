package interfaceexp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Save obj = new Save();
		obj.i = 56;
		obj.text = "William Shakespeare (26 April 1564 (baptised) – 23 April 1616)[a] was an English poet, playwright and actor, widely regarded as both the greatest writer in the English language and the world's pre-eminent dramatist.[2][3][4] He is often called England's national poet and the \"Bard of Avon\".[5][b] His extant works, including collaborations, consist of approximately 39 plays,[c] 154 sonnets, two long narrative poems, and a few other verses, some of uncertain authorship. His plays have been translated into every major living language and are performed more often than those of any other playwright.";
		
		//Save object to file
		
		File file = new File("obj1.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(obj);
		
		//Re read object from saved file
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream dis = new ObjectInputStream(fis);
		Save obj1 = (Save) dis.readObject();
		
		System.out.println(obj1.i);
		System.out.println(obj1.text);
		
		

	}

}

class Save implements Serializable{
	
	int i;
	String text;
	
}
