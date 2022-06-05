package in.synxt.ios;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataOutputStreamsDemo {
	public static void main(String[] args) throws IOException {
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(1,"Keerthi",15000000));
		emps.add(new Employee(2,"Vamsi",45000000));
		emps.add(new Employee(3,"Kumar",25000000));
		DataOutputStream out = new DataOutputStream(new FileOutputStream(new File("/home/skillyheads/Desktop/emps.txt")));
		out.writeInt(emps.size());
		for(Employee emp:emps){
			out.writeInt(emp.getId());
			out.writeUTF(emp.getName());
			out.writeDouble(emp.getSalary());
		}
		out.close();
	}
}
