package filereadwrite;
import java.io.*;
public class PDFReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\NeetuApps\\Eclipse Oxygen\\TestFile.pdf");
		
				try {
					
					InputStream inputStream = new FileInputStream(file); 
					byte[] bytes = new byte[(int) file.length()];
					inputStream.read(bytes);
					inputStream.close();
					
					
					OutputStream out = new FileOutputStream("C:\\NeetuApps\\Eclipse Oxygen\\CoreJava\\TestFile.pdf");
					out.write(bytes, 0, bytes.length);
					out.close();
					
					
				   Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\NeetuApps\\Eclipse Oxygen\\CoreJava\\TestFile.ind"), "utf-8"));
				   writer.write("something:pxCreateDateTime");
				   writer.write('\n');
				   writer.write("something:pxCreateDateTime");
				   writer.close();
					
				}catch(Exception ex) {
					
				}

	}

}
