package lambda;

public class Inter_Prime {

	public static void main(String[] args) {
		
		InterfaceDemo id = (int x , int y) -> {return x+y; };
		int pro = id.add(10, 20);
		System.out.println(pro);
		id.test();
		InterfaceDemo.test2();
		

	}

}
