package framework;

//Ϊ���ò�ͬ�ķ���������ͬ���͵����ݣ����Խ����Ͷ����ڷ�����

//����֮����
//		��̬���������Է������϶���ķ���
//		�����̬���������������������Ͳ�ȷ�����Խ����Ͷ����ڷ�����
// ����<>���ں�������ֵ��ǰ�棬��������

class Demo<T>{
	public void show(T t){
		System.out.println("show:"+t);
	}
	public<Q> void print(Q q){
		System.out.println("print:"+q);
	}
	public static<W> void method(W t){
		System.out.println("defasd");
	}
	
}
public class GenericDemo4 {

	public static void main(String[] args) {
		Demo<String> d = new Demo<String>();
		//d.show(1); //����ʧ��
		d.show("haha");
		d.print(new Integer(6));
		d.print("haha");

	}

}
