package framework;
import java.util.*;

/*
 * 使用LinkedList模拟堆栈和队列特性
 * 
 * */

class stack_1{
	//首先模拟栈的各项操作，设置头为栈顶
	private LinkedList link;
	stack_1(){
		link = new LinkedList();
	}
	//进栈
	public void push(Object obj){
		link.addFirst(obj);
	}
	//出栈
	public void pop(){
		System.out.println(link.removeFirst());
	}
	public boolean isnull(){
		return link.isEmpty();
	}
	
}

class LinkedListTest {

	
	
	public static void main(String[] args) {
	
		stack_1 s = new stack_1();
		sop(s.isnull());
		s.push("java01");
		s.push("java02");
		s.push("java03");
		s.push("java04");
		s.pop();
		s.pop();
		s.pop();
		sop(s.isnull());
		s.pop();
		
		
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
	
}
