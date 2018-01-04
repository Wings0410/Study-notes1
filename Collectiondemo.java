package framework;

import java.util.*;

//add方法的参数类型是Object，以便于接收任意类型对象

//集合中存储的都是对象的引用，或者说地址

/*
 * 什么是迭代器
 * 		 其实就是元素取出的方式
 * 
 * 迭代器设定方式
 * 		把取出方式定义在集合内部，这样取出方式就可以直接访问内部的元素
 * 		这样取出方式就被定义为了内部类
 * 		而每个容器的数据结构都不同
 * 		所以取出的动作细节不一样，但是都有共性内容：判断和取出，那么就可以共性抽取
 * 		那么这些内部类都有一个规则，该规则就是Iterator，通过Iterator()取出对象
 * 
 * 
 * 
 * */


class Collectiondemo {
	public static void main(String[] args){
		method_get();
		
	}
	
	public static void method_get(){
		ArrayList al = new ArrayList();
		al.add("java01");//add(Object obj);
		al.add("java02");
		al.add("java03");
		al.add("java04");
		
//		Iterator it = al.iterator();//获取迭代器，用于取出集合中的元素
//		while(it.hasNext()){
//			sop(it.next());
//		}
		
		for(Iterator it = al.iterator();it.hasNext();)
		{
			sop(it.next());
		}
		//for循环写法中it对象在完成之后会由于是局部变量而自动释放内存，而while中不会，只会继续存在占用空间
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void method(){
		//创建一个容器，使用collection接口的子类 ArrayList
		
				ArrayList al1 = new ArrayList();
				al1.add("java01");//add(Object obj);
				al1.add("java02");
				al1.add("java03");
				al1.add("java04");
				
				ArrayList al2 = new ArrayList();
				al2.add("java05");//add(Object obj);
				al2.add("java06");
				al2.add("java01");
				al2.add("java02");
				
				
				al1.retainAll(al2);//取交集，al1中只会保留和al2中相同的元素 ，al2不变
				sop("al1"+al1);
				sop("al2"+al2);
				
				
				
//				
//				//2、获取集合长度
//				sop("size:" + al.size());
//				
//				//3、打印集合
//				sop(al);
//				
//				//4、删除元素并打印删除后的集合
//				al.remove("java02");
//				sop(al);
//				
//				//5、删除全集,清空
//				//al.clear();
//				//sop(al);
//				
//				//6、元素是否存在
//				sop("java03是否存在："+ al.contains("java03"));
//				sop("集合是否为空：" + al.isEmpty());
//				
	}
	
	
	public static void sop(Object obj){
		System.out.println(obj);
	}
	
	
}
