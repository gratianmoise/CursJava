package curs6File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws IOException {

		try {
			OutputStream output = new FileOutputStream("karim.properties");
			
			//setam valorile din properties
			Properties prop = new Properties();
			prop.setProperty("user", "Karim");
			prop.setProperty("email", "karim.benzema@realmadrid.es");
			prop.setProperty("password", "LaLiga");
			
			//salam props de mai sus
			prop.store(output, "Am salvat karim.properties");
			
			System.out.println(prop);
			
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
	}

}
