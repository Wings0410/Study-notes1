package framework;
import java.util.*;
/*
 * 枚举是Vector特有的取出方式
 * 枚举和迭代器是一样的
 * 
 * 枚举的名称和方法名称均过长，所以都被迭代取代了
 * 
 * */
public class VectorDemo {
	public static void main(String[]args)
	{
		Vector v = new Vector();
		
		v.add("java01");
		v.add("java02");
		v.add("java03");
		v.add("java04");
		
		Enumeration en = v.elements();
		
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
		
	}
}
