package HW7;
import java.io.*;

public class Q3CopyFile {
	//請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。
	//呼叫此方法時，第一個參數所代表的檔案會複製到第二個參數代表的檔案
//	public static void main(String args[]) {
//		File f1 = new File("a.txt");
//		File f2 = new File("b.txt");
//		 copyFiles(f1,f2);
//	}
	public static void copyFiles(File source,File dest) {
	    InputStream f1 = null;   
	    OutputStream f2 = null;  	    
		try {
		f1 = new FileInputStream(source);
		f2 = new FileOutputStream(dest);
			byte[] b = new byte[1024];        
	           int bytesRead;        
	           while ((bytesRead = f1.read(b)) > 0) {
	        	   f2.write(b, 0, bytesRead);
	           }
	   		System.out.println("File successfully copied in Java");
		} catch (IOException e) {
		e.printStackTrace();
		}
	}
}
