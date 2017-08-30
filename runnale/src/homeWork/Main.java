package homeWork;

import java.security.Provider.Service;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Enter max int");
		ExecutorService thread1 = Executors.newFixedThreadPool(3);
		thread1.execute(new MyThread());
		
		
		thread1.execute(new RunnableThread());
		
		
		thread1.shutdown();
		
		
		
	}

}
