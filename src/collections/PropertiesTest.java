package collections;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String args[]) throws Exception {

        Properties properties = new Properties();
        FileInputStream in = null;

        try {

            in = new FileInputStream("C:\\NeetuApps\\Eclipse Oxygen\\CoreJava\\src\\collections\\mailman.properties");
            properties.load(in);
            System.setProperties(properties);

            //can also do properties.loadFromXML(in); when reading from an XML file

            //properties.storeToXML(); can be used to store to a XML file


        } catch (Exception ex) {

            System.out.println("Exception caught"+ex);
        }finally {
            in.close();
        }

        String from = properties.getProperty("from");
        String mailServer = properties.getProperty("SmtpServer");

        System.out.println("from: "+from+" "+"SmtpServer: "+mailServer);
    }
}
