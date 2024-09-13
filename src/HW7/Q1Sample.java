package HW7;
import java.io.*;

public class Q1Sample {
		static int countnum(FileInputStream fis) throws IOException{
		int counts = 0;
			while (( fis.read()) != -1) {
			counts +=1;
			}
		return counts;
		}
		public static void main(String args[]) {
			
			int i;
			try {
				File Sample = new File("c:\\CIA103_Workspace\\HomeWork-04\\Sample.txt");
				FileInputStream fr = new FileInputStream(Sample);
				FileReader fr2 = new FileReader(Sample);
				FileReader fr3 = new FileReader(Sample);
				BufferedReader br = new BufferedReader(fr3);
				int bytes=0,words=0,rows=0;
				String strg;
				bytes =countnum(fr);
				while ((fr2.read()) != -1) {
					words +=1;
				}
				while ((strg = br.readLine()) != null) {
					if(strg.length()>0){
						rows +=1;
					}
				}
				System.out.printf("Sample.txt檔案共有%d個位元組，%d個字元，%d列資料 %n",bytes,words,rows);
				fr.close();
				fr2.close();
				fr.close();
				br.close();

			} catch (IOException e) {
			}
		}
	}

