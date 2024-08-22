package HW1;


public class HW1 {
	public static void main(String[] args)
	{
		//作業第一題
			int num1 = 12,num2 = 6;
			System.out.println("CIA_103_04 作業1");
			System.out.println("==============");
			System.out.println("【作業第一題】");
			System.out.println("12+6的和為"+(num1+num2));
			System.out.println("12+6的積為"+num1*num2);
			System.out.println("==============");
		//作業第二題
			int egg = 200,dozen = 12;
			System.out.println("【作業第二題】");
			System.out.println("200顆雞蛋是"+(egg/dozen)+"打又"+(egg%dozen)+"顆");
			System.out.println("==============");
		//作業第三題
			System.out.println("【作業第三題】");
			int Time = 256559;
			int Days=(Time/86400);
			int Left1=(Time%86400);
			int Hours=(Left1/3600);
			int Left2=(Left1%3600);
			int Minutes=(Left2/60);
			int Seconds=(Left2%60);
			System.out.println("256559秒等於"+Days+"天"+Hours+"小時"+Minutes+"分鐘"+Seconds+"秒");	
			
				System.out.println("==============");	
			//作業第四題
				System.out.println("【作業第四題】");
				double Pi = 3.1415;
				double Area,Circum;
				Area = 5*5*3.14;
				Circum = 5*2*3.14;
				System.out.printf("圓面積為"+"%.1f,%n",Area);
				System.out.printf("圓周長為"+"%.1f,%n",Circum);
				System.out.println("==============");
			//作業第五題
				System.out.println("【作業第五題】");
				double Deposit =1500000 ;
				double Interest =0.02;
				double Years = 1;
				while (Years <11)
				{ 
					Deposit=Deposit+(Deposit*Interest);
					Years++;
				}
				int FinalDeposit=(int)Deposit;
				System.out.println("本金加利息一共有"+FinalDeposit+"元");
				System.out.println("==============");
				
			//作業第六題
	           System.out.println("【作業第六題】");
					System.out.println(5 + 5);
					//第一個5與第二個5皆為數字，直接相加
					
					System.out.println(5+'5'); 
					//第一個5為數字，'5'為萬國碼(對應為十六進位的0035=十進位的53)，相加為58
					
					System.out.println(5 + "5");
					//第一個5為數字，"5"為文字，文字加數字為串接相加
					
					System.out.println("==============");
	}
}



