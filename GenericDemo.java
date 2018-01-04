package framework;
import java.util.*;

/*
 * 泛型：JDK1.5版本之后出现的新特性，用于解决安全问题，是一个类型安全机制
 * 		1、将运行时期出现的问题ClassCastException转移到了编译时期，方便程序员解决问题。让运行时期安全问题减少。
 * 		2、避免了强制转换的麻烦。
 * 泛型格式：通过<>来定义要操作的引用数据类型
 * 在使用java提供的对象时，什么时候使用泛型呢
 * 		通常在集合框架中只要见到<>就要定义泛型
 * 		
 * 		其实<>就是用来接受数据类型
 * 	
 * 		当使用集合时，将集合中要使用的数据类型作为参数传递到<>中即可
 * 		
 * 				
 * 
 * */
public class GenericDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();//使用了泛型
		al.add("java0134");
		al.add("java022");
		al.add("java036456");
		al.add("java04");
		
		Iterator<String> it = al.iterator();
		
		while (it.hasNext())
		{
			String s = it.next();
			System.out.println(s+":"+s.length());
		}
		
		
		
		
	}

}
