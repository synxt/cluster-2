package in.synxt.ios;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataInputStreamDemo {
	public static void main(String[] args) throws IOException {
		List<Employee> emps = new ArrayList<Employee>();
		DataInputStream in = new DataInputStream(new FileInputStream(new File("/home/skillyheads/Desktop/emps.txt")));
		Employee emp = null;
		int size = in.readInt();
		for(int i=0;i<size;i++) {
			emp = new Employee();
			emp.setId(in.readInt());
			emp.setName(in.readUTF());
			emp.setSalary(in.readDouble());
			emps.add(emp);
		}
		System.out.println(emps);
	}
}
