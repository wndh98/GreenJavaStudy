package exception_basic;

public class Except04 {

	public static void main(String[] args) {
		Class cls=null;
		try {
			cls = findClass();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(cls);
	}

	private static Class findClass() throws ClassNotFoundException {
		Class cls = Class.forName("java.lang.String");
		return cls;
	}


}




