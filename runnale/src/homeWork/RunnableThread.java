package homeWork;

import java.util.Scanner;

public class RunnableThread implements Runnable{

	
	Scanner sc = new Scanner(System.in);
	
	public void run() {
		int[] fib = new int[sc.nextInt()];
	
		fibonachi(fib);
		System.out.println(fib[fib.length] +  fib[fib.length-1]);
		for (int i = fib.length; i > 2 ; i--) {
			
		
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			} 
			System.out.println(fib[i]);
		}
		
	}
	
	
	 void fibonachi(int[] fib){
		int a = 1;
		int b = 1;
		int suma; 
		for (int i = 0; i < fib.length; i++) {
			suma=a+b;
			a=b;
			b=suma;
			fib[i] = suma;}
	}
	

}

