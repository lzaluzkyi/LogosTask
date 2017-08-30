package dz;

public class Less0102 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			int a;

			System.out.println("zada4a1");
			a = 3;
			if (a % 2 == 0) {
				System.out.println("Парне");

			} else {
				System.out.println("Непране");
			}
		}
		System.out.println("zada4a2");

		{
			double n = 9;
			double m = 16;
			int a = 10;
			double b = Math.abs(a - n);
			double c = Math.abs(a - m);
			if (b == c) {
				System.out.println("Числа " + n + " и " + m
						+ " рівновіддаленні від " + a);
			}
			if (b > c) {
				System.out.println("Число " + m + " ближче до " + a);
			}
			if (b < c) {
				System.out.println("Число " + n + " ближче до " + a);
			}
		}
		System.out.println("zada4a3");
		{
			System.out.println("Незрозумів :(");
		}
		System.out.println("zada4a4");
		{
			for (int j = 1000; j < 9999; j += 3)
				System.out.println(j);
		}
		System.out.println("zada4a5");
		{
			int i;
			int j;
			i = 0;
			j = 1;
			while (i < 55) {
				System.out.println(j);
				j += 2;
				i++;
			}
		}
		System.out.println("zada4a6");

		{
			int j;
			j = 90;
			do {
				System.out.println(j);
				j = j - 5;
			} while (j >= 0);
		}
		System.out.println("zada4a7");
		{
			int i;
			int j;
			i = 0;
			j = 1;
			while (i < 20) {
				System.out.println(j);
				j = j * 2;
				i++;
			}
		}

		System.out.println("zada4a8");
		{
			for (int a = 2; a < 10000; a = 2 * a - 1) {
				System.out.println(a);
			}
		}
		System.out.println("zada4a9");
		{
			for (int a = -166; a < 100; a = 2 * a + 200) {
				if (a > -100 && a < 100)
					System.out.println(a);
			}
		}
		System.out.println("zada4a10");
		System.out.println("na znayu");
		System.out.println("zada4a11");
		int a;
		int i;
		double c;
		
		a = 6;
		i = 1 ;
		
		while (i<a){
			 c=a/i;
			i++;
		   
		    System.out.println(c);
		}
			
		
		
		
	}
}
