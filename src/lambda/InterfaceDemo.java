package lambda;

public interface InterfaceDemo {
	
		public abstract int add ( int x, int y);
		
		default void test() {
			System.out.println("hi am defalut");
		}
		static void test2 () {
			System.out.println("hi am static");
			
		}
	}


