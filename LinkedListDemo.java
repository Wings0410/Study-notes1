package framework;
import java.util.*;

/*
 * LinkedList:
 * 		特有方法：
 * 			addFirst();
 * 			addLast();
 * 			getFirst();
 * 			getLast();
 * 			removeFirst();
 * 			removeLast();
 * 			
 * 
 * 
 * */


public class LinkedListDemo {
	public static void main(String[]args)
	{
		LinkedList ll = new LinkedList();
		
		ll.addFirst("java01");
		ll.addFirst("java02");
		ll.addFirst("java03");
		ll.addFirst("java04");
				
		//sop(ll);
		//sop(ll.getFirst());
		//sop(ll.getLast());
		//sop(ll.removeFirst());
		//sop("size="+ll.size());
		while(!ll.isEmpty()){
			sop(ll.removeFirst());
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
