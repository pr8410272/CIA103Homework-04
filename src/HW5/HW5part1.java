package HW5;
import java.util.*;
import java.text.*;

public class HW5part1 {
	public static void main(String[] args) {
		System.out.println("==========");
		System.out.println("【作業五之一】");
		System.out.println("==========");
		System.out.println("作業第一題");
		System.out.println("請輸入長方形的長與寬:");
		Scanner InputSquare = new Scanner(System.in);
		int width = InputSquare.nextInt();
		int height = InputSquare.nextInt();
		starSquare s1 = new starSquare();		
		s1.starSquare(width, height);
		System.out.println("==================");
		System.out.println("作業第二題");
		randAvg a2 = new randAvg();
		a2.randAvg();
		System.out.println("==================");
		System.out.println("作業第三題");
		int[][] intArray= {{1,6,3},{9,5,2}};
		double[][] doubleArray= {{1.2,3.5,2.2},{7.4,2.1,8.2}};
		Work03 w = new Work03();
		System.out.print(w.maxElement(intArray));
		System.out.println();
		System.out.print(w.maxElement(doubleArray));
	}
}
	//•請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形
	class starSquare {
	private int width;
	private int height;

	public void starSquare(int width, int height) {
		this.width = width;
		this.height = height;
		for(int h=0;h<height;h++) {
			for(int w=0;w<width;w++){
				System.out.print("*");
			}
			System.out.println();
			}
		}
	}
	//•請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
	class randAvg {
		public void randAvg() {
	   int sum2 = 0;
		for(int i2=0;i2<10;i2++) {
			int r2 = 0;
			r2 = (int)(Math.random()*101);
			System.out.print(r2+" ");
			sum2=sum2+r2;
		}
		System.out.println();
		System.out.print("以上10個數字平均為:"+sum2/10);
		System.out.println();
		}
	}
	//•利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
	//可以找出二維陣列的最大值並回傳
	class Work03 {
		public int maxElement(int x[][]) {
			int lengthmax = 0,rowmax = 0;
			for(int ix = 0;ix<x.length;ix++) {
				for(int jx = 0;jx<x[ix].length;jx++){
					if(x[ix][jx]>rowmax) {
						rowmax=x[ix][jx];
					}
				}
				if(rowmax>lengthmax) {
					lengthmax=rowmax;
				}
			}
			return lengthmax;
}
		public double maxElement(double x[][]) {
			double lengthmaxd = 0,rowmaxd = 0;
			for(int ix = 0;ix<x.length;ix++) {
				for(int jx = 0;jx<x[ix].length;jx++){
					if(x[ix][jx]>rowmaxd) {
						rowmaxd=x[ix][jx];
					}
				}
				if(rowmaxd>lengthmaxd) {
					lengthmaxd=rowmaxd;
				}
			}
			return lengthmaxd;
}
	}





