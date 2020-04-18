package Com.techtalk.threadexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
	
	public static void main(String[] args) {
		// Using newFixedThreadPool()
       // ExecutorService executor = Executors.newSingleThreadExecutor();
		// Using newFixedThreadPool()
       //ExecutorService executor = Executors.newFixedThreadPool(5);
		// Using newFixedThreadPool() 
		ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
          }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }

}