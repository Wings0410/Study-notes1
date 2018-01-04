package framework;
import java.util.*;
/*
 * ĞèÇó£º½«×Ö·û´®°´ÕÕ×Ö·û³¤¶ÌÅÅĞò
 * */


public class TreeSetTest2 {

	
	
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new StrlenComparator());
		
		ts.add("sda");
		ts.add("vd");
		ts.add("h");
		ts.add("td");
		ts.add("fghj");
		
		Iterator it = ts.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}

class StrlenComparator implements Comparator{
	public int compare(Object o1,Object o2){
		
		String s1 = (String) o1;
		String s2 = (String) o2;
		
//		if(s1.length()>s2.length())
//			return 1;
//		if(s1.length()==s2.length())
//			return 0;
		
		int number = new Integer(s1.length()).compareTo(new Integer(s2.length()));
		
		if(number == 0)
			return s1.compareTo(s2);
		return number;
	}
}
