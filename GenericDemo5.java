package framework;
import java.util.*;

//泛型的高级应用
//泛型提供扩展性，但是不能使用子类特有方法
//泛型限定<? extends Person>
/*
 * ?为通配符，也称占位符
 * 限定：? extend E  可以接受E类型以及E的子类
 * 		? super E  可以接受E类型以及E的父类
 * 
 * */

public class GenericDemo5 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		
		al1.add("abc01");
		al1.add("abc02");
		al1.add("abc03");
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		al2.add(1);
		al2.add(2);
		al2.add(3);
		
		Myiterator(al1);
		Myiterator(al2);
		
		
		
	}
	public static void Myiterator(ArrayList<?> al)
	{
		Iterator<?> it = al.iterator();
		while(it.hasNext( ))
			System.out.println(it.next());
	}

}
