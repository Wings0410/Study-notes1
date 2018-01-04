package framework;
import java.util.*;


public class GenericDemo2 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(new StrlenComparator_1());
		
		ts.add("sda");
		ts.add("vd");
		ts.add("h");
		ts.add("td");
		ts.add("fghj");

		Iterator<String> it = ts.iterator();
		while (it.hasNext())
		{
			String s = it.next();
			System.out.println(s);
		}
		
		
	}

}

//按照长度排序重写compare
class StrlenComparator_1 implements Comparator<String>{
	public int compare(String o1,String o2)
	{
		int number = new Integer (o1.length()).compareTo(new Integer(o2.length()));
		if(number == 0)
			return o1.compareTo(o2);
		return number;
	}
}





