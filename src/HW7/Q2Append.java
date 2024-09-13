package HW7;
import java.io.*;
import java.util.*;

public class Q2Append {
		public static void main(String args[]) {
			//請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡
			//(請使用append功能讓每次執行結果都能被保存起來)
			try {
			Random r = new Random();
			FileWriter fw = new FileWriter("c:\\CIA103_Workspace\\HomeWork-04\\Data.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			int[] p = new int[10];
			for(int i=0;i<10;i++) {
				p[i]=(r.nextInt(1000)+1);
				pw.print(p[i]+" ");
			}
			pw.print("\n");
			pw.close();
			bw.close();
			fw.close();
			} catch (IOException e) {
				System.err.println(e);
		}
		
		
		
		
		
	}
}
