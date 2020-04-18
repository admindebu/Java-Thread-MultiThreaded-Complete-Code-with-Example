package Com.techtalk.threadexample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunClass {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		// Using extends Thread Class
		/*ThreadByExtendsThreadClass tex = new ThreadByExtendsThreadClass();
		tex.start();*/
		// Below code will run under main Thread
	/*	for(int i=0;i<5;i++)
		{
			System.out.println("main thread : " + i);
		}*/

		
		//System.out.println("In Main Thread : " +  Thread.currentThread().getName());
		
		// Using implements Runnable interface
		
		/*ImplementsRunnable ir = new ImplementsRunnable();
		Thread t1 = new Thread(ir);
		t1.start();*/
		
		// or we can write above code like below 
		/*Thread t1 = new Thread(new ImplementsRunnable());
		t1.start();
		*/
		// Using implements Callable interface
		 // create a pool of 2 threads
        ExecutorService executor = Executors
                .newFixedThreadPool(2);
 
        Future thread1 = executor.submit(new ImplementsCallable());
        Future thread2 = executor.submit(new ImplementsCallable());
 
        System.out.println(Thread.currentThread().getName() + " executing ...");
 
        //asynchronously get from the worker threads
        System.out.println(thread1.get());
        System.out.println(thread2.get());
		
		// One 
		
		
		
	}

}
