package framework;
import java.util.*;

//���͵ĸ߼�Ӧ��
//�����ṩ��չ�ԣ����ǲ���ʹ���������з���
//�����޶�<? extends Person>
/*
 * ?Ϊͨ�����Ҳ��ռλ��
 * �޶���? extend E  ���Խ���E�����Լ�E������
 * 		? super E  ���Խ���E�����Լ�E�ĸ���
 * 
 * */

public class GenericDemo5 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		
		al1.add("abc01");
		al1.add("abc02");
		al1.add("abc03");
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		al2.add(1);
		al2.add(2);
		al2.add(3);
		
		Myiterator(al1);
		Myiterator(al2);
		
		
		
	}
	public static void Myiterator(ArrayList<?> al)
	{
		Iterator<?> it = al.iterator();
		while(it.hasNext( ))
			System.out.println(it.next());
	}

}
