package in.synxt.ios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Employee emp = new Employee(1,"Keerthi",2500000);
		emp.setSalary(2600000);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("/home/skillyheads/Desktop/emps1.data")));
		out.writeObject(emp);
		emp.setSalary(3000000);
		
	} 
}
