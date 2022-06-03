package in.synxt.ios;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class App {
	public static void main(String[] args) throws IOException, InterruptedException {
		File file = new File("/home/skillyheads/Documents/index.html");
		File fileD = new File("/home/skillyheads/Documents");
		if(file.exists()) {
			System.out.println(file.getName());
			System.out.println(file.length());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.canExecute());
			System.out.println(file.isDirectory());
			System.out.println(file.isFile());
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getCanonicalPath());
			if(file.isDirectory()) {
				File[] files = file.listFiles();
				for(File subFile:files) {
					if(subFile.canWrite()) {
						System.out.println(subFile.getName());
					}
				}
			}
		}else {
			file.createNewFile();		
		}
		FileInputStream in = new FileInputStream(file);
		/*
		 * byte[] content = in.readAllBytes(); String contentText = new String(content);
		 */
		//System.out.println(contentText);
		int ch;
		while((ch = in.read())>0) {			
			System.out.print((char)ch);
		}
	}
}
