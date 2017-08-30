package less02;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 3;
		int b = 5;
		int res = a + b;
		System.out.println(res);
		res = a - b;
		System.out.println(res);
		res = b % a;
		System.out.println(res);
		res += a;
		System.out.println(res);

		System.out.println(a >= b);
		System.out.println(a != b);
		System.out.println();
		System.out.println(a == b && a != b);
		System.out.println(a == b || a != b);

		if (a == b) {
			System.out.println("ok");

		} else if (a > b) {
			System.out.println("ok1IF");
		} else {
			System.out.println("ok1");

		}

		int i = 2;

		if (i == 2) {
			System.out.println("zero");
		} else if (i == 1) {
			System.out.println("one");
		} else if (i == 2) {
			System.out.println("two");
		} else {
			System.out.println("other");
		}
System.out.println("------------------------");
		switch (i) {
		case 0:
			System.out.println("zero");

			break;
		case 1:
			System.out.println("one");

			break;
		case 2:
			System.out.println("two");
			break;
		default:
			System.out.println("other");
		}
		
		for(int j = 0; j<10; j++){
		
			System.out.println(j);
			
		}
		
		
		
		
		
		
		
		
		

	}

}
