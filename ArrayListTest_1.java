package framework;
import java.util.*;

/*
 * 去除arraylist_1中重复的元素
 * */
public class ArrayListTest_1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("java01");
		al.add("java02");
		al.add("java01");
		al.add("java01");
		al.add("java03");
		al.add("java01");
		al.add("java02");
		
		System.out.println(al);
		System.out.println(singleElement(al));

	}
	public static ArrayList singleElement(ArrayList al){
		//定义一个临时空的容器
		ArrayList newal = new ArrayList();
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			if(!newal.contains(obj))
				newal.add(obj);
		}
		return newal;
	}
	

}
