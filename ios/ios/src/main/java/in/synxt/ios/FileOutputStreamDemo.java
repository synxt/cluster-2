package in.synxt.ios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream  outputStream = null;
		try{
			outputStream  = new FileOutputStream(new File("/home/skillyheads/Vamsi/Temp/sample_output.txt"));
			outputStream.write("Vandhematharam Vandhematharam, Sujalam Suphalam Malayaza Seethalam".getBytes());
		}catch(IOException ex) {
			ex.printStackTrace();
		}finally{
			outputStream.close();
		}
		
	}
}
