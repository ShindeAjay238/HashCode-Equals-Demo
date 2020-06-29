package immutbale;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class AppDemo {

	public static void main(String[] args) throws IOException {
		
		Properties p=new Properties();
		
		FileInputStream fis=new FileInputStream("Details.properties");
		
		//load the property file
		p.load(fis);
		
		//retrive property file
		System.out.println(p.getProperty("user"));
		
		System.out.println(p.getProperty("password"));
		
		Enumeration e = p.propertyNames();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		p.setProperty("user", "Ajay Shinde");
		
		p.setProperty("password", "121212");
		
		FileOutputStream out=new FileOutputStream("Details.properties");
		p.store(out, "updated user and ajay");
		System.out.println(p);
		
		
	}

}
