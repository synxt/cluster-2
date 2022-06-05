package in.synxt.ios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MultibyteChars {
	public static void main(String[] args) throws IOException {
		FileReader reader = null;
		FileWriter writer = null;

		try {
			reader = new FileReader(new File("/home/skillyheads/Desktop/telugu.txt"));
			writer = new FileWriter(new File("/home/skillyheads/Desktop/telugu1.txt"));
			
			PrintWriter pwrite = new PrintWriter(new File("/home/skillyheads/Desktop/telugu1.txt"));
			
			int ch = 0;
			/*
			 * while ((ch = reader.read()) >= 0) { writer.write(ch); }
			 */

		} finally {
			reader.close();
			writer.close();
		}

		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream(new File("/home/skillyheads/Desktop/1.mp4"));
			out = new FileOutputStream(new File("/home/skillyheads/Desktop/12.mp4"));
			
			int ch = 0;
			while ((ch = in.read()) >= 0) {
				out.write(ch);
			}

		} finally {
			reader.close();
			writer.close();
		}

	}
}
