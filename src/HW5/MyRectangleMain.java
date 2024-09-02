package HW5;
import java.util.*;

public class MyRectangleMain {
	public static void main(String[] args) {
		System.out.println("==========");
		System.out.println("【作業五之二】");
		System.out.println("==========");
		System.out.println("作業第四題➀");
		System.out.println("面積為:");
		MyRectangle square = new MyRectangle();
		square.setWidth(10);
		square.setDepth(20);
		square.getArea();
		System.out.println("==================");
		System.out.println("作業第四題➁");
		System.out.println("面積為:");
		MyRectangle square2 = new MyRectangle(10,20);
		square2.getArea();
		System.out.println("==================");
		System.out.println("作業第五題");
		System.out.println("驗證碼為:");
		genAuthCode u=new genAuthCode();
		u.genAuthCode();
}
}
	//•請設計一個類別MyRectangle：
	//(1) 有兩個double型態的屬性為width, depth
	//(2) 有三個方法：
//	void setWidth(double width): 將收到的引數指定給width屬性
//	void setDepth(double depth): 將收到的引數指定給depth屬性
//	double getArea(): 能計算該長方形的面積
//	(3) 有兩個建構子：
//	public MyRectangle(): 不帶參數也無內容的建構子
//	public MyRectangle(double width, double depth): 傳入的兩個引數會指定給對應的屬性
	class MyRectangle {
		double width;
		double depth;
		void setWidth(double width) {
			this.width = width;
		}
		void setDepth(double depth) {
			this.depth = depth;
		}
		double getArea() {
			double Area =width*depth;
			System.out.println(Area);
			return Area;
		}
		public MyRectangle() {
			
		}
		public MyRectangle(double width, double depth) {
			this.width = width;
			this.depth = depth;
		}
	}
//		• 請另外建立一個MyRectangleMain類別，此類別只有main方法
//		(1) 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
//		(2) 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果

		//		•身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//		genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//		與數字的亂數組合，如圖：
		class genAuthCode{
		public void genAuthCode() {
			int [] uu=new int[62];
			for(int num = 0;num<10;num++) {
				uu[num]=(num);
			}
			for(int type1 = 0;type1<26;type1++) {
				uu[(type1+10)]=(type1+65-48);
			}
			for(int type2 = 0;type2<26;type2++) {
				uu[(type2+36)]=(type2+97-48);
			}
			for(int send = 0;send<62;send++) {
			}
			Random r = new Random();
	        StringBuilder uuid = new StringBuilder();
	        for (int i = 0; i < 8; i++) {
	        char uuidch = (char) (uu[r.nextInt(62)]+'0');
	        uuid.append(uuidch);
			System.out.print(uuidch);
	        }
		}
		}

