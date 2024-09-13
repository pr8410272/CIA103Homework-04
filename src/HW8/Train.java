package HW8;

import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;

class Train implements Comparable<Train> {
//	請設計一個Train類別，並包含以下屬性：
//	- 班次 number，型別為int - 車種 type，型別為String - 出發地 start，型別為String
//	- 目的地 dest，型別為String - 票價 price，型別為double
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public int compareTo(Train other) {
		if (this.number > other.number)
			return 1;
		if (this.number < other.number)
			return -1;
		return 0;
	}

	public Train() {

	}

	public Train(int numberX, String typeX, String startX, String destX, double priceX) {
		this.number = numberX;
		this.type = typeX;
		this.start = startX;
		this.dest = destX;
		this.price = priceX;
	}

	public String toString() {
		return number + "," + type + "," + start + "," + dest + "," + price;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj != null && this.getClass() == obj.getClass()) {
			Train e = (Train) obj;
			if (this.number == e.number && this.type.equals(e.type))
				return true;
		}
		return false;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + number;
		result = result * prime + (type != null ? type.hashCode() : 0);
		return result;
	}

	public static void main(String args[]) {
//		設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題
//		需使用的集合裡
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);

		System.out.println("====================================");

		System.out.println("1.請寫一隻程式，能印出不重複的Train物件:");
		HashSet sites = new HashSet();
		sites.add(t1);
		sites.add(t2);
		sites.add(t3);
		sites.add(t4);
		sites.add(t5);
		sites.add(t6);
		sites.add(t7);
		System.out.println("----------------------");
		System.out.println("①使用Iterator");
		System.out.println("----------------------");
		Iterator it = sites.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		System.out.println("----------------------");
		System.out.println("②使用for迴圈");
		System.out.println("----------------------");
		List list = new ArrayList(sites);
		for (int i2 = 0; i2 < list.size(); i2++)
			System.out.println(list.get(i2));
		System.out.println("----------------------");
		System.out.println("③使用foreach");
		System.out.println("----------------------");
		for (Object i3 : sites) {
			System.out.println(i3);
		}

		System.out.println("================================================");

		System.out.println("2.請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出:");
		List list2 = new ArrayList();
		list2.add(t1);
		list2.add(t2);
		list2.add(t3);
		list2.add(t4);
		list2.add(t5);
		list2.add(t6);
		list2.add(t7);
		Collections.sort(list2);
		System.out.println("----------------------");
		System.out.println("①使用Iterator");
		System.out.println("----------------------");
		Iterator it4 = list2.iterator();
		while (it4.hasNext())
			System.out.println(it4.next());
		System.out.println("----------------------");
		System.out.println("②使用for迴圈");
		System.out.println("----------------------");
		for (int i5 = 0; i5 < list2.size(); i5++)
			System.out.println(list2.get(i5));
		System.out.println("----------------------");
		System.out.println("③使用foreach");
		System.out.println("----------------------");
		for (Object i6 : list2) {
			System.out.println(i6);
		}
		System.out.println("===================================================");

		System.out.println("3.承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件:");
		List list3 = new ArrayList(sites);
		Collections.sort(list3);
		System.out.println("----------------------");
		System.out.println("①使用Iterator");
		System.out.println("----------------------");
		Iterator it7 = list3.iterator();
		while (it7.hasNext())
			System.out.println(it7.next());
		System.out.println("----------------------");
		System.out.println("②使用for迴圈");
		System.out.println("----------------------");
		for (int i8 = 0; i8 < list3.size(); i8++)
			System.out.println(list3.get(i8));
		System.out.println("----------------------");
		System.out.println("③使用foreach");
		System.out.println("----------------------");
		for (Object i9 : list3) {
			System.out.println(i9);
		}
		System.out.println("==============================");
	}

}
