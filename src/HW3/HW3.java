package HW3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class HW3 {
	public static void main(String[] args) {
		System.out.println("======");
		System.out.println("作業三");
		System.out.println("======");
		System.out.println("作業第一題");
        Scanner sc=new Scanner(System.in);
		System.out.printf("輸入三角形的三個邊長:");
		int date1 = sc.nextInt();
		int date2 = sc.nextInt();
		int date3 = sc.nextInt();
		int[] intArray = {date1, date2, date3};
		Arrays.sort(intArray);
		if (intArray[0]==0||intArray[0]+intArray[1]<=intArray[2]){
				System.out.println("這不是三角形");
			}
		else if ((intArray[0]*intArray[0])+(intArray[1]*intArray[1])==(intArray[2]*intArray[2])){
			System.out.println("這是直角三角形");
		}
		else{
				if (intArray[2]==intArray[1]&&intArray[1]==intArray[0]){
				System.out.println("這是正三角形");
				}
				else if (intArray[2]==intArray[1]||intArray[1]==intArray[0]){
				System.out.println("這是等腰三角形");
				}
				else {
				System.out.println("這是其他三角形");
				}
		}
		System.out.println("=============");
		System.out.println("作業第二題");
        Scanner s=new Scanner(System.in);
        int R = (int)(Math.random()*2);
	    for(int i = s.nextInt();;)
		{ 
	    	if (i!=R)
	    		{
	    		if(i<R)
	    		{
		    	    System.out.println("猜錯了,答案更大");
	    		}
	    		else
	    		{
		    	    System.out.println("猜錯了,答案更小");
	    		}
	    		int j = s.nextInt();
	    		i=j;
	    	   continue;
	    		}
	    	else {
	    	    System.out.println("你猜對了,答案是"+R);
	    	    break;
	    	}
		}
		System.out.println("=============");
		System.out.println("作業第三題");
		System.out.println("請輸入不要的數字:");
        Scanner sx=new Scanner(System.in);
        int hate = sx.nextInt();
		System.out.println("可選擇數字如下:");
		int i8, j8;
			for (i8 = 0; i8 <= 4; i8++) {
				if (i8 != hate) {
					j8=-1;
					 while (j8 < 9){
						j8++;
						if (j8 == hate){
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
			int sum9=0,i9 = 1;
			while (i9 < 50)
				{
					if (i9%10 ==hate || (Math.floor(i9/10))==hate){
						sum9=sum9;
						i9++;
					}
					else
					{
						sum9++;
						i9++;
					}
					}
			System.out.println("可選擇的數字一共有"+sum9+"個");
			System.out.println("隨機抽出六個號碼");
			Random r = new Random();
			int[] PickNum = new int[6];
			for (int ia = 0;ia<6;ia++)
			{		        
					PickNum[ia] = r.nextInt(49)+1;		// 將隨機數(1-49)放入 PickNum[ia]
					for (int ja=0; ja<ia;){			// 與前數列比較，若有相同則再取亂數
						if (PickNum[ja]==PickNum[ia]){	
							PickNum[ia] = r.nextInt(6)+1;
							ja=0;			// 避面重新亂數後又產生相同數字，若出現重覆，迴圈從頭開始重新比較所有數
						}
						else if (Math.floor(PickNum[ja])/10 ==hate) {
							PickNum[ia] = r.nextInt(6)+1;
							ja=0;							
						}
						else if (PickNum[ia]%10 == hate) {
							PickNum[ia] = r.nextInt(6)+1;
							ja=0;
						}
						else {
							ja++;
							}// 若都不重複則下一個數
						}
				System.out.print(String.format("%02d",PickNum[ia])+" ");
				}
	}
}
