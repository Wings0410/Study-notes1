package framework;

/*
 * collection
 * 		1--List
 * 			|--ArrayList  底层使用数组数据结构
 * 			|--LinkedList	底层使用链表数据结构
 * 			|--Vector	底层是数组数据结构，线程同步，被ArrayList替代了
 * 			元素是有序的，可以重复，因为该集合体系中有索引
 * 			
 * 		2--Set
 * 			HashSet
 * 			TreeSet
 * 
 * 			元素是无序的，不可以重复，因为该集合体系中没有索引
 * 
 * 为什么会出现这么多容器
 * 	A:因为每个容器对数据的存储方式不同（即数据结构）
 * 
 * List:
 * 		特有方法：凡是带有角标的都是List特有的方法
 * 增
 * 		add(index,element)
 * 		addAll(index,Collection);
 * 删
 * 		remove(index);
 * 改
 * 		set(index,element);
 * 查
 * 		get(index);
 * 		subList(from,to);
 * 		ListIterator();
 * 
 * 
 * 
 * ListIterator是Iterator的子类，是List特有的迭代器
 * 
 * 在迭代时，不可以通过集合对象的方法操作集合中的元素，因为会发生并发修改异常
 * 
 * 所以在迭代时只能用迭代器的方法操作元素，但是Iterator的方法有限，故需要使用其子类ListIterator
 * 
 * 
 * 
 * 
 * */
import java.util.*;
class ListDemo{
	
	public static void method_1(){
		//创建集合，添加元素
				ArrayList al = new ArrayList();
				al.add("java01");
				al.add("java02");
				al.add("java03");
				al.add("java04");
			
				sop("原集合是：" + al);
				
				
				
				
//				//在指定位置添加元素
//				//al.add(1,"java09");
//				//sop("添加之后为："+al);
//				
//				//在指定位置删除元素
//				//al.remove(2);
//				//sop("删除之后为："+al);
//				
//				//修改元素
//				al.set(2, "java06");
//				
//				//获取元素
//				sop("al的一号元素是:"+al.get(1));
//				
//				//获取所有元素
//				for(int i = 0;i<al.size();i++)
//					sop("al["+i+"]="+al.get(i));
//				
//				for(Iterator it = al.iterator();it.hasNext();)
//					sop(it.next());
//				
//				//获取该元素在集合中第一次出现的位置
//				sop(al.indexOf("java02")); 
//				
//				List sub = al.subList(1,3);
//				sop(sub);
//				
//				//sop(al);
				
	}
	
	
	
	
	public static void main(String[] args)
	{
		//演示列表迭代器
		ArrayList al = new ArrayList();
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");
		
		sop(al);
		
		ListIterator li = al.listIterator();
		while(li.hasNext())
		{
			sop(li.hasPrevious());
			Object obj = li.next();
			if(obj.equals("java02"))
				//li.add("java009");
				li.set("java006");
		}
		while(li.hasPrevious()){
			sop(li.previous());
		}
		sop(al);
		
		
		
		
		
		
		
//		
//		//在迭代过程中准备添加或者删除元素
//		Iterator it = al.iterator();
//		while(it.hasNext())
//		{
//			Object obj = it.next();
//			if(obj.equals("java02"))
//				//al.add("java08");
//				it.remove();//虽然删除但是任然打印出来了，但是原集合中已经被删除
//			sop(obj);
//		}
//		sop(al);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void sop(Object obj){
		System.out.println(obj);		
	}
	
}


