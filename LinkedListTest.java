package framework;
import java.util.*;

/*
 * ʹ��LinkedListģ���ջ�Ͷ�������
 * 
 * */

class stack_1{
	//����ģ��ջ�ĸ������������ͷΪջ��
	private LinkedList link;
	stack_1(){
		link = new LinkedList();
	}
	//��ջ
	public void push(Object obj){
		link.addFirst(obj);
	}
	//��ջ
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
