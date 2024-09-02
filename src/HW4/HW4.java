package HW4;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Timestamp;
import java.util.List;

public class HW4 {
	public static void main(String[] args) throws ParseException {
//	有個一維陣列如下：
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示：陣列，length屬性)
	System.out.println("========");
	System.out.println("【作業四】");
	System.out.println("========");
	System.out.println("作業第一題");
		int A[]= {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
	        int sum = 0;
	        for (int i = 0; i < A.length; i++) {
	            sum += A[i];
	        }
	        System.out.println("①平均值: "+sum * 1.0 / A.length);
	        ArrayList<Integer> B = new ArrayList<>();
	        System.out.print("②大於平均值: ");
	        for (int i = 0; i < A.length;){
	           if(A[i]>sum * 1.0 / A.length){
	        	   B.add(A[i]);
	        	   i++;}
	           else {
	        	   i++;}
	        }
	        for (int j = 0; j < B.size();j++){ 
	        System.out.print(B.get(j)+" ");
	        }
	        System.out.println();
//	• 請建立一個字串，經過程式執行後，輸入結果是反過來的
//	例如String s = “Hello World”，執行結果即為dlroW olleH
//	(提示：String方法，陣列)
	        Scanner re=new Scanner(System.in);
	    	System.out.println("-------------------------");
	    	System.out.println("作業第二題");  
	    	System.out.println("請輸入字串(請勿輸入空白鍵):");  
	    		String s1 = re.next();
	    		String s2 = "";
	    		for(int i = s1.length()-1; i>=0; i--)
	    		    {
	    		      s2 = s2 + s1.charAt(i);
	    		    }
	    		    System.out.print("相反的字串為: " );
	    		    System.out.println(s2);
//	• 有個字串陣列如下 (八大行星)：
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示：字元比對，String方法)
	System.out.println("-------------------------");
	System.out.println("作業第三題");  
        String[] p = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int acount=0,ecount=0,icount=0,ocount = 0,ucount = 0;
        for (int ic = 0; ic <p.length; ic++) {
        	for(int jc = 0; jc <p[ic].length(); jc++) {
				char t = p[ic].charAt(jc);
						switch (t) {
						case 'a': 
							acount++;
							break;
						case 'e': 
							ecount++;
							break;
						case 'i': 
							icount++;
							break;
						case 'o': 
							ocount++;
							break;
						case 'u': 
							ucount++;
							break;
            			}
        		}
            }
            System.out.println("母音a有"+acount+"個");
            System.out.println("母音e有"+ecount+"個");
            System.out.println("母音i有"+icount+"個");
            System.out.println("母音o有"+ocount+"個");
            System.out.println("母音u有"+ucount+"個");
//        	阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//        	表如下：
//        	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//        	有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//        	員工編號: 25 19 27 共 3 人!」
//        	(提示：Scanner，二維陣列)
            	System.out.println("-------------------------");
            	System.out.println("作業第四題"); 
    	        Scanner borrow=new Scanner(System.in);
            	System.out.println("請輸入要借的金額"); 
	    		int b1 = borrow.nextInt(); 
	    		int emp[][] = {{25,32,8,19,27},{2500,800,500,1000,1200}};
            	System.out.println("可以借錢的對象為"); 
	    		for(int ib = 0;ib<5;ib++) {
	    			if(b1<=emp[1][ib]) {
	                	System.out.println(emp[0][ib]); 
	    			}
	    		}
//	請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//	例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//	(提示1：Scanner，陣列)
//	(提示2：需將閏年條件加入)
//	(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
            	System.out.println("-------------------------");
            	System.out.println("作業第五題");  
    	        Scanner Inputnum=new Scanner(System.in);
    		    int year = Inputnum.nextInt();
    		    int month = Inputnum.nextInt();
    		    int day = Inputnum.nextInt();
    		    int[] DaysofMonth= {31,28,31,30,31,30,31,31,30,31,30,31};
    		    	int remainder = year%4;
					int Days = 0;
    		    	switch(remainder) {
    		    	case 0 : DaysofMonth[1]=29;
    		    	case 1 :;
    		    	case 2 :;
    		    	case 3 : if(day>DaysofMonth[(month-1)]) {
    	            				System.out.println("日期超過當月最大天數,請重新輸入~");  
    		    					}
    		    					else {
    		    						if((month-1)>0) {
    		    		    		    for(int id =0;id<(month-1);id++){
    		    		    		    	Days = Days+DaysofMonth[(id)];
    		    		    		    	}
    		    						}
    		    						else {
    		    							Days = 0;
    		    						}
        	            				System.out.println("輸入的日期為該年第"+(Days+day)+"天");  
    		    					}
    		    	}

//	班上有8位同學，他們進行了6次考試結果如下：
//	請算出每位同學考最高分的次數
//	(提示：二維陣列)
            	System.out.println("-------------------------");
            	System.out.println("作業第六題");  
            	int[][] Grade = {
            	{0,0,0,0,0,0,0,0},
            	{10  ,35  ,40  ,100,90  ,85  ,75  ,70  },
            	{37  ,75  ,77  ,89  ,64  ,75  ,70  ,95  },
            	{100,70  ,79  ,90  ,75  ,70  ,79  ,90  },
            	{77  ,95  ,70  ,89  ,60  ,75  ,85  ,89  },
            	{98  ,70  ,89  ,90  ,75  ,90  ,89  ,90  },
            	{90  ,80  ,100,75  ,50  ,20  ,99  ,75  }
            	};
            	for(int ig=1;ig<7;ig++){
        			int max = Grade[ig][1];
            		for (int jg = 0;jg<8;jg++) {
            				if(Grade[ig][jg]>max) {
            					max=Grade[ig][jg];
            				}
            				else;
                    }
            		for(int g = 0;g<8;g++) {
    					if (Grade[ig][g]==max) {
    						Grade[0][g]=Grade[0][g]+1;
    					}
    					else;
            		}
            }
				System.out.println("1號同學考最高分的次數:"+Grade[0][0]);
				System.out.println("2號同學考最高分的次數:"+Grade[0][1]);
				System.out.println("3號同學考最高分的次數:"+Grade[0][2]);
				System.out.println("4號同學考最高分的次數:"+Grade[0][3]);
				System.out.println("5號同學考最高分的次數:"+Grade[0][4]);
				System.out.println("6號同學考最高分的次數:"+Grade[0][5]);
				System.out.println("7號同學考最高分的次數:"+Grade[0][6]);
				System.out.println("8號同學考最高分的次數:"+Grade[0][7]);
     }
}
		
