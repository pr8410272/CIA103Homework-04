package HW8;

import java.util.*;
import java.io.Console;
import java.math.*;

public class Q1Collection {
	public static void main(String args[]) {
		
//		請建立一個Collection物件並將以下資料加入：
//		Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//		Object物件、“Snoopy”、BigInteger(“1000”)
		
		//建立Collection物件List
		
		List list = new ArrayList();
		Integer L0 = new Integer(100);
		list.add(L0);
		double L1 = 3.14;
		list.add(L1);
		long L2 = 21L;
		list.add(L2);
		short L3 = 100;
		list.add(L3);
		double L4 = 5.1;
		list.add(L4);
		String L5 = "Kitty";
		list.add(L5);
		Integer L6 = new Integer(100);
		list.add(L6);
		Object L7 = new Object();
		list.add(L7);
		String L8 = "Snoopy";
		list.add(L8);
		BigInteger L9 =new BigInteger("1000");
		list.add(L9);
		
		System.out.println("==============================");		
		System.out.println("1.印出這個物件裡的所有元素");
		System.out.println("----------------------");
		System.out.println("①使用Iterator");
		System.out.println("----------------------");
		Iterator objs = list.iterator();
		while (objs.hasNext())
			System.out.println(objs.next());
		System.out.println("----------------------");
		System.out.println("②使用for迴圈");
		System.out.println("----------------------");
		Object obj2;
		for (int i = 0; i < list.size(); i++) {
			obj2 = list.get(i);
			System.out.println(obj2);
		}
		System.out.println("----------------------");
		System.out.println("③使用foreach");
		System.out.println("----------------------");
	    for(Object element : list) {
	        System.out.println(element);
	    }
		System.out.println("==============================");
		System.out.println("2.移除不是java.lang.Number相關的物件");
		System.out.println("==============================");
		for(int ir= 0,len = list.size();ir<len;ir++) {
			if(list.get(ir) instanceof Number) {
			}else {
				list.remove(ir);
				len--;
				ir--;
			}
		}
		System.out.println("3.再次印出這個物件裡的所有元素");
		System.out.println("----------------------");
	    for(Object element : list) {
	        System.out.println(element);
	    }
		System.out.println("==============================");
	}
	}
