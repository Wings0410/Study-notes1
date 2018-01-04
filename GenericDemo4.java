package framework;

//为了让不同的方法操作不同类型的数据，可以将泛型定义在方法中

//特殊之处：
//		静态方法不可以访问类上定义的泛型
//		如果静态方法操作的引用数据类型不确定可以将泛型定义在方法上
// 泛型<>放在函数返回值的前面，进行修饰

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
		//d.show(1); //编译失败
		d.show("haha");
		d.print(new Integer(6));
		d.print("haha");

	}

}
