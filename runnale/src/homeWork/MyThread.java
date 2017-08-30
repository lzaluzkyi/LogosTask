package homeWork;
import java.security.PublicKey;
import java.util.Scanner;


public class MyThread extends Thread{

	Scanner sc = new Scanner(System.in);

	public void run(){
		System.out.println("  ");
		int c = sc.nextInt();
		if(c>0){
		int a = 1;
		int b = 1;
		int suma; 
		System.out.print("thread  - " + a + "   " + b+ "   ");
		for (int i = 0; i < c-2; i++) {
			
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			} 
			
				suma=a+b;
				a=b;
				b=suma;
				System.out.print(suma+"   ");
				
	
	}
		}
	

	}
}

	
	
	