package framework;

//ʲôʱ���巺����
//		�����е�Ҫ�����������������Ͳ�ȷ����ʱ��������Object������չ�����ڶ��巺������չ


class Worker{
	
}


//����ǰ������
class Tool{
	private Object obj;
	public void setObject(Object obj){
		this.obj = obj;
	}
	public Object getObject(){
		return obj;
	}
	
}

//���ͺ�
//������
class Utils<QQ>
{
	private QQ q;
	public void setObject(QQ q)
	{
		this.q = q;
	}
	public QQ getObject()
	{
		return q;
	}
}

public class GenericDemo3 {

	public static void main(String[] args) {

		Utils<Worker> u = new Utils();
		
		u.setObject(new Worker());
		Worker w = u.getObject();
		
		
		
		
		//		Tool t = new Tool();
//		t.setObject(new Worker());
//		Worker w = (Worker)t.getObject();

	}

}
