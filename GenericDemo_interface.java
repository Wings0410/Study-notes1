package framework;
//泛型定义在接口上
interface inter<T>{
	void show(T t);
}
// class interImple implements inter<String>{
//	 public void show (String t){
//		 System.out.println("show:"+t);
//		 
//	 }
// } 
 class interImple<T> implements inter<T>{
	 public void show (T t){
		 System.out.println("show:"+t);
		 
	 }
 }



public class GenericDemo_interface {

	public static void main(String[] args) {
		interImple<Integer> ii = new interImple<Integer>();
		ii.show(3234);

	}

}
