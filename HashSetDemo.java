package framework;
import java.util.*;

/*
 * |--Set:Ԫ��������ģ�Ԫ�ش����ȡ����˳��һ��һ�£���Ԫ�ز������ظ�
 * 		|--HashSet���ײ�ṹ�ǹ�ϣ���ݽṹ
 * 				��֤Ԫ�ص�Ψһ��ͨ������������hashCode()��equals()�����Ԫ�ص�hashCodeֵ��ͬ���ж�equals����Ȼ�Ͳ����ж�equals
 * 				ע�⣺�����ж�Ԫ���Ƿ���ڣ��Լ��Ƿ�ɾ���������ķ�����hashCode()��equals()
 * 
 * 		|--TreeSet�����Զ�Set�е�Ԫ�ؽ�������
 * Set���ϵĹ��ܺ�Collection��һ�µ�
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
