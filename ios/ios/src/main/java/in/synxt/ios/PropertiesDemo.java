package in.synxt.ios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties props = new Properties();
		props.load(new FileInputStream(new File("/home/skillyheads/Desktop/emp.properties")));
		System.out.println(props.get("name"));
		System.out.println(props.get("id"));
	}
}
