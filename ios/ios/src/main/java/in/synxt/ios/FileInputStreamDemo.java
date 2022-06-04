package in.synxt.ios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException{
		File file = new File("/home/skillyheads/Vamsi/Temp/sample.txt");
		FileInputStream fileInputStream = null;
		
		try {
			fileInputStream  = new FileInputStream(file);
			int readCh = 0;
			
			while((readCh = fileInputStream.read())!=-1) {
				System.out.print((char)readCh);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}finally {
			fileInputStream.close();
		}
	}
}
