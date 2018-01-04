package framework;

//什么时候定义泛型类
//		当类中的要操作的引用数据类型不确定的时候，早期用Object进行扩展，现在定义泛型来扩展


class Worker{
	
}


//泛型前的做法
class Tool{
	private Object obj;
	public void setObject(Object obj){
		this.obj = obj;
	}
	public Object getObject(){
		return obj;
	}
	
}

//泛型后
//泛型类
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
