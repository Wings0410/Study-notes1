package framework;

import java.util.*;

//add�����Ĳ���������Object���Ա��ڽ����������Ͷ���

//�����д洢�Ķ��Ƕ�������ã�����˵��ַ

/*
 * ʲô�ǵ�����
 * 		 ��ʵ����Ԫ��ȡ���ķ�ʽ
 * 
 * �������趨��ʽ
 * 		��ȡ����ʽ�����ڼ����ڲ�������ȡ����ʽ�Ϳ���ֱ�ӷ����ڲ���Ԫ��
 * 		����ȡ����ʽ�ͱ�����Ϊ���ڲ���
 * 		��ÿ�����������ݽṹ����ͬ
 * 		����ȡ���Ķ���ϸ�ڲ�һ�������Ƕ��й������ݣ��жϺ�ȡ������ô�Ϳ��Թ��Գ�ȡ
 * 		��ô��Щ�ڲ��඼��һ�����򣬸ù������Iterator��ͨ��Iterator()ȡ������
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
		
//		Iterator it = al.iterator();//��ȡ������������ȡ�������е�Ԫ��
//		while(it.hasNext()){
//			sop(it.next());
//		}
		
		for(Iterator it = al.iterator();it.hasNext();)
		{
			sop(it.next());
		}
		//forѭ��д����it���������֮��������Ǿֲ��������Զ��ͷ��ڴ棬��while�в��ᣬֻ���������ռ�ÿռ�
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void method(){
		//����һ��������ʹ��collection�ӿڵ����� ArrayList
		
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
				
				
				al1.retainAll(al2);//ȡ������al1��ֻ�ᱣ����al2����ͬ��Ԫ�� ��al2����
				sop("al1"+al1);
				sop("al2"+al2);
				
				
				
//				
//				//2����ȡ���ϳ���
//				sop("size:" + al.size());
//				
//				//3����ӡ����
//				sop(al);
//				
//				//4��ɾ��Ԫ�ز���ӡɾ����ļ���
//				al.remove("java02");
//				sop(al);
//				
//				//5��ɾ��ȫ��,���
//				//al.clear();
//				//sop(al);
//				
//				//6��Ԫ���Ƿ����
//				sop("java03�Ƿ���ڣ�"+ al.contains("java03"));
//				sop("�����Ƿ�Ϊ�գ�" + al.isEmpty());
//				
	}
	
	
	public static void sop(Object obj){
		System.out.println(obj);
	}
	
	
}
