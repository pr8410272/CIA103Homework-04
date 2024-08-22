package HW2;

public class HW2 {
	public static void main(String[] args) {
		System.out.println("======");
		System.out.println(" 作業二 ");
		System.out.println("======");
		System.out.println("作業第一題");
		System.out.println("使用for迴圈 + while迴圈輸出九九乘法表:");
		System.out.println("=======================================================");
		int i, j;
		for (i = 1; i <= 9; i++) {
			j=0;
			while (j < 9)
			{
				j++;
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("作業第二題");
		System.out.println("使用for迴圈 + do while迴圈輸出九九乘法表:");
		int i2, j2;
		for (i2 = 1; i2 <= 9; i2++) {
			j2=0;
			do
			{
				j2++;
				System.out.print(i2 + "*" + j2 + "=" + i2 * j2 + "\t");
			} while (j2 < 9);
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("作業第三題");
		System.out.println("使用while迴圈 + do while迴圈輸出九九乘法表:");
		int i3 = 1;
		while (i3 < 9) {
			 i3++;
			 int j3=0;
			do
			{
				j3++;
				System.out.print(i3 + "*" + j3 + "=" + i3 * j3 + "\t");
			} while (j3 < 9);
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("作業第四題");
		System.out.println("請設計一支Java程式，計算1~1000的偶數和(2+4+6+8...+1000):");
		int sum4=0;
		for (int i4 = 1; i4 <= 1000; i4++)
			{
				if (i4%2 ==0){
					sum4 += i4;
				}
			}
		System.out.println(sum4);
		System.out.println("---------------------------------");
		System.out.println("作業第五題");	
		System.out.println("請設計一支Java程式，計算1~10的連乘積(1*2*3*4...*10)用for迴圈:");
		int j5=1;
		for (int i5 = 1; i5 <= 10; i5++) {
			j5 = j5*i5;
		}
		System.out.println(j5);	
		System.out.println("---------------------------------");
		System.out.println("作業第六題");	
		System.out.println("請設計一支Java程式，計算1~10的連乘積(1*2*3*4...*10)用while迴圈:");		
			int i6=1,j6=1;
			while(i6<=10)
			{
				j6=j6*i6;
				i6++;
			}
		System.out.println(j6);	
		System.out.println("---------------------------------");
		System.out.println("作業第七題");	
		System.out.println("請設計一支Java程式，輸出結果:[1 4 9 16 25 36 49 64 81 100]:");
		int i7=1,j7=1;
		while(i7<=10)
		{
			j7=i7*i7;
			i7++;
			System.out.print(j7+" ");	
		}
		System.out.println();		
		System.out.println("---------------------------------------------------");
		System.out.println("作業第八題");
		System.out.println("阿文很熱衷大樂透，但他不喜歡有4的數字，不論是個位數或十位數。\r\n"
				+ "請設計一支Java程式，輸出結果為阿文可選擇的數字有哪些? ");
		System.out.println("可選擇數字");
		int i8, j8;
			for (i8 = 0; i8 <= 4; i8++) {
				if (i8 != 4) {
					j8=-1;
					 while (j8 < 9){
						j8++;
						if (j8 == 4){
								System.out.print("xx"+"\t");
						}
						else if (i8==0 && j8==0){
							    System.out.print("xx"+"\t");
						}
						else {
							System.out.print(i8 +""+ j8 +"\t");
							}
						}
						System.out.println();
					}
				else {
					j8=-1;
					while (j8 < 9)
						{
							j8++;
							System.out.print("xx"+"\t");
						}
					System.out.println();
				}
			}
			System.out.println("------------------------------------------------------");
			System.out.println("作業第九題");
			System.out.println("阿文很熱衷大樂透，但他不喜歡有4的數字，不論是個位數或十位數。\r\n"
					+ "請設計一支Java程式，輸出結果為阿文可選擇的數字有幾個? ");
			int sum9=0,i9 = 1;
			while (i9 < 50)
				{
					if (i9%10 ==4 || (Math.floor(i9/10))==4){
						sum9=sum9;
						i9++;
					}
					else
					{
						sum9++;
						i9++;
					}
					}
			System.out.println(sum9+"個");
			System.out.println("--------------------------------");
			System.out.println("作業第十題");
			System.out.println("請用迴圈設計一支Java程式，輸出結果如下:");
		    int iA = 0,LineA=10;
			while (iA<LineA)
		     {
				 iA++;
		    	 int jA = 0;
		    	 while (jA<LineA+1-iA)
		    	 {
		    		 jA++;
		    		 System.out.print(jA+" "); 
		    	 }
		 		System.out.println();
		     }
			System.out.println("--------------------------------");
			System.out.println("作業第十一題");
			System.out.println("請用迴圈設計一支Java程式，輸出結果如下:");
		    int iB = 0,LineB=6;
			while (iB<LineB)
		     {
				 iB++;
		    	 int jB = 0;
		    	 while (jB<iB)
		    	 {
		    		 jB++;
		    		 switch(iB) {
						case 1:				
					System.out.print("A");
					break;
						case 2:
					System.out.print("B");
					break;
						case 3:
					System.out.print("C");
					break;
						case 4:
					System.out.print("D");
					break;
						case 5:
					System.out.print("E");
					break;
						case 6:
					System.out.print("F");
					break;
		    		 }
		    	 }
		 		System.out.println();
		     }

	}
}

