package framework;
import java.util.*;
/*
 * 往HashSet里面存储自定义对象
 * 姓名年龄相同为同一组元素
 * 
 * 
 * 一般使用HashSet都会重写hashCode()和equals()
 * */


class Person{
	private String name;
	private int age;
	Person(String name , int age){
		this.name = name;
		this.age = age;
	}
	public String get_name(){
		return name;
	}
	public int get_age(){
		return age;
	}
	
	public int hashCode()
	{
		return name.hashCode()+age*12;
	}
	
	public boolean equals(Object obj){
		
		if(!(obj instanceof Person))
			return false;
		
		Person p = (Person)obj;
		//System.out.println(p.get_name()+"::"+p.get_age());
		
		return this.name.equals(p.name) && this.age==p.age; 
		
	}
	
}


public class HashSetTest {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add(new Person("a1",14));
		hs.add(new Person("a2",54));
		hs.add(new Person("a3",34));
		hs.add(new Person("a4",24));
		hs.add(new Person("a2",54));
		
		//System.out.println(hs.contains(new Person("a1",14)));
		
		hs.remove(new Person("a3",34));
		
		System.out.println(hs);
		
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			Person p = (Person)it.next();
			System.out.println(p.get_name()+"::"+p.get_age());
		}

	}

}
