package class03_method;



class Fac{
	int factorial(int n) {
		int result =0;
		if(n==1) {
			result=1;
			
		}else {
			//result = n * factorial(n-1);
			result = n * factorial(n-1);
			System.out.println(result);
		}
		return result;
	}
}
public class Recur02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fac fac = new Fac();
		int result = fac.factorial(5);
		//System.out.println(result);

	}

}
