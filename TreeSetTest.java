package framework;
import java.util.*;
import java.lang.*;
/*
 * 需求：往TreeSet集合中存自定义对象，按年龄进行排序
 * */

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		
		ts.add(new Student("lisi01",22));
		ts.add(new Student("lisi02",27));
		ts.add(new Student("lisi03",26));
		ts.add(new Student("lisi04",22));
		
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			Student str = (Student)it.next();
			System.out.println(str.getname()+"::"+str.getage());
		}
		
	}

}

class Student implements Comparable{
	private String name;
	private int age;
	
	 Student(String name,int age)
	 {
		 this.name = name;
		 this.age = age;
	 }
	
	 public String getname(){
		 return name;
	 }
	 
	 public int getage()
	 {
		 return age;
	 }
	 
	 public int compareTo(Object obj){
		 if(!(obj instanceof Student))
			 throw new RuntimeException("不是学生对象");
		 
		 Student s = (Student)obj;
		 
		 System.out.println(this.name +"....campareTo...."+s.name);
		 
		 if(this.age>s.age)
			 return 1;
		 if(this.age==s.age)
			 return this.name.compareTo(s.name);
		 return -1;
	 }
	 
	 
	 
}