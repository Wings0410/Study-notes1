package framework;
import java.util.*;

/*
 * |--Set:元素是无序的（元素存入和取出的顺序不一定一致），元素不可以重复
 * 		|--HashSet：底层结构是哈希数据结构
 * 				保证元素的唯一性通过两个方法：hashCode()和equals()，如果元素的hashCode值相同就判断equals，不然就不用判断equals
 * 				注意：对于判断元素是否存在，以及是否删除，依赖的方法是hashCode()和equals()
 * 
 * 		|--TreeSet：可以对Set中的元素进行排序
 * Set集合的功能和Collection是一致的
 * 
 * */


public class HashSetDemo {

	public static void sop(Object obj){
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		sop(hs.add("java01"));
		sop(hs.add("java01"));
		hs.add("java02");
		hs.add("java03");
		hs.add("java04");
		hs.add("java02");
		
		Iterator it = hs.iterator();
		while(it.hasNext())
			sop(it.next());
	}

}
