package in.synxt.ios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("/home/skillyheads/Desktop/emps1.data")));
		Employee emp = (Employee)in.readObject();
		System.out.println(emp);
	}
}
