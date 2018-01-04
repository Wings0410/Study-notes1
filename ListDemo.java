package framework;

/*
 * collection
 * 		1--List
 * 			|--ArrayList  �ײ�ʹ���������ݽṹ
 * 			|--LinkedList	�ײ�ʹ���������ݽṹ
 * 			|--Vector	�ײ����������ݽṹ���߳�ͬ������ArrayList�����
 * 			Ԫ��������ģ������ظ�����Ϊ�ü�����ϵ��������
 * 			
 * 		2--Set
 * 			HashSet
 * 			TreeSet
 * 
 * 			Ԫ��������ģ��������ظ�����Ϊ�ü�����ϵ��û������
 * 
 * Ϊʲô�������ô������
 * 	A:��Ϊÿ�����������ݵĴ洢��ʽ��ͬ�������ݽṹ��
 * 
 * List:
 * 		���з��������Ǵ��нǱ�Ķ���List���еķ���
 * ��
 * 		add(index,element)
 * 		addAll(index,Collection);
 * ɾ
 * 		remove(index);
 * ��
 * 		set(index,element);
 * ��
 * 		get(index);
 * 		subList(from,to);
 * 		ListIterator();
 * 
 * 
 * 
 * ListIterator��Iterator�����࣬��List���еĵ�����
 * 
 * �ڵ���ʱ��������ͨ�����϶���ķ������������е�Ԫ�أ���Ϊ�ᷢ�������޸��쳣
 * 
 * �����ڵ���ʱֻ���õ������ķ�������Ԫ�أ�����Iterator�ķ������ޣ�����Ҫʹ��������ListIterator
 * 
 * 
 * 
 * 
 * */
import java.util.*;
class ListDemo{
	
	public static void method_1(){
		//�������ϣ����Ԫ��
				ArrayList al = new ArrayList();
				al.add("java01");
				al.add("java02");
				al.add("java03");
				al.add("java04");
			
				sop("ԭ�����ǣ�" + al);
				
				
				
				
//				//��ָ��λ�����Ԫ��
//				//al.add(1,"java09");
//				//sop("���֮��Ϊ��"+al);
//				
//				//��ָ��λ��ɾ��Ԫ��
//				//al.remove(2);
//				//sop("ɾ��֮��Ϊ��"+al);
//				
//				//�޸�Ԫ��
//				al.set(2, "java06");
//				
//				//��ȡԪ��
//				sop("al��һ��Ԫ����:"+al.get(1));
//				
//				//��ȡ����Ԫ��
//				for(int i = 0;i<al.size();i++)
//					sop("al["+i+"]="+al.get(i));
//				
//				for(Iterator it = al.iterator();it.hasNext();)
//					sop(it.next());
//				
//				//��ȡ��Ԫ���ڼ����е�һ�γ��ֵ�λ��
//				sop(al.indexOf("java02")); 
//				
//				List sub = al.subList(1,3);
//				sop(sub);
//				
//				//sop(al);
				
	}
	
	
	
	
	public static void main(String[] args)
	{
		//��ʾ�б������
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
//		//�ڵ���������׼����ӻ���ɾ��Ԫ��
//		Iterator it = al.iterator();
//		while(it.hasNext())
//		{
//			Object obj = it.next();
//			if(obj.equals("java02"))
//				//al.add("java08");
//				it.remove();//��Ȼɾ��������Ȼ��ӡ�����ˣ�����ԭ�������Ѿ���ɾ��
//			sop(obj);
//		}
//		sop(al);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void sop(Object obj){
		System.out.println(obj);		
	}
	
}


