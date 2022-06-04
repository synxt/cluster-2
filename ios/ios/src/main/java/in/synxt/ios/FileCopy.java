package in.synxt.ios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		FileInputStream inputStream = new FileInputStream(new File("/home/skillyheads/Videos/enquiries-2022-05-22_07.32.15.mp4"));
		FileOutputStream outputStream = new FileOutputStream(new File("/home/skillyheads/Videos/enquiries.mp4"));
		
		BufferedInputStream biStream = new BufferedInputStream(inputStream);
		BufferedOutputStream boStream = new BufferedOutputStream(outputStream);
		
		long before,after;
		try {
			int cByte;			
			 before = System.currentTimeMillis();
			while((cByte=biStream.read())!=-1) {
				boStream.write(cByte);
			}
			after = System.currentTimeMillis();
		}finally{
			biStream.close();
			boStream.close();
			inputStream.close();
			outputStream.close();
		}
		System.out.println("Copy Completed In"+(after-before)+"msecs");
	}
}
