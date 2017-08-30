package exception1;

public class Methods {
	

	private static int a = 1;

	private static int b = -1;
	
	
	
	
	public static void IAE(){
		if(a<0||b<0){
			throw new  IllegalArgumentException("fu");
		}
	}
	public static void AE(){
		if(a==0||b!=0){
			throw new ArithmeticException("AE");
			
		}if(a!=0||b==0){
			throw new ArithmeticException("AE");
		}
	}
	
	public static void IAE00(){
		if(a==0||b==0){
			throw new ArithmeticException("IAE00");
		}
	}
	
	public static void ME(){
		if(a>0||b>0){
			throw new MyException();
			
		}
	}
	
	public void plus(int a, int b) {
		IAE();
		AE();
		IAE00();
		ME();

		System.out.println(a + b); 
	}

	public void minus(int a, int b) {
		IAE();
		AE();
		IAE00();
		ME();
		System.out.println(a - b); 
	}

	public void mnojenya() {
		IAE();
		AE();
		IAE00();
		ME();
		System.out.println( a * b);
	}

	public static void dilenya(int a, int b) {
		IAE();
		AE();
		IAE00();
		ME();
		System.out.println(a / b); 
	}

}
