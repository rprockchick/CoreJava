import java.net.*;
import java.io.*;
import java.util.*;
public class SocketDemo {

	public static void main(String[] args) throws Exception{
		
		int c;
		
		Socket s = new Socket();
		String host = "www.google.com";
		try {
			
			s.connect(new InetSocketAddress(host,80));
		
			
		}catch(UnknownHostException e) {

			
			 System.err.println("Don't know about host : " + host);
	            System.exit(1);
		
			}
		
		System.out.print(s.isConnected());
		s.close();
		System.out.print(s.isConnected());
}
}
