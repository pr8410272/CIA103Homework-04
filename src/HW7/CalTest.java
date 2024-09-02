package HW7;
import java.util.*;

public class CalTest {
	public static void main(String[] args) {
		Calculator re= new Calculator();
		int xx =0,yy=0;
		try {
		Scanner Input = new Scanner(System.in);
		System.out.println("請輸入x的值:");
		xx = Input.nextInt();
		System.out.println("請輸入y的值:");
		yy = Input.nextInt();
		} catch (InputMismatchException a) {
			System.out.println("輸入的格式不正確!");
			System.exit(0);
		}
		try {
				re.powerXY(xx,yy);
				} catch (CalException cal) {
					cal.getMessage();
				}
	}
}
