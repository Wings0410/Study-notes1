package framework;
import java.util.*;

/*
 * ���ͣ�JDK1.5�汾֮����ֵ������ԣ����ڽ����ȫ���⣬��һ�����Ͱ�ȫ����
 * 		1��������ʱ�ڳ��ֵ�����ClassCastExceptionת�Ƶ��˱���ʱ�ڣ��������Ա������⡣������ʱ�ڰ�ȫ������١�
 * 		2��������ǿ��ת�����鷳��
 * ���͸�ʽ��ͨ��<>������Ҫ������������������
 * ��ʹ��java�ṩ�Ķ���ʱ��ʲôʱ��ʹ�÷�����
 * 		ͨ���ڼ��Ͽ����ֻҪ����<>��Ҫ���巺��
 * 		
 * 		��ʵ<>��������������������
 * 	
 * 		��ʹ�ü���ʱ����������Ҫʹ�õ�����������Ϊ�������ݵ�<>�м���
 * 		
 * 				
 * 
 * */
public class GenericDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();//ʹ���˷���
		al.add("java0134");
		al.add("java022");
		al.add("java036456");
		al.add("java04");
		
		Iterator<String> it = al.iterator();
		
		while (it.hasNext())
		{
			String s = it.next();
			System.out.println(s+":"+s.length());
		}
		
		
		
		
	}

}
