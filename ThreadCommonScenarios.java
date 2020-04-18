package Com.techtalk.threadexample;

public class ThreadCommonScenarios extends Thread{
	
	@Override
	public void run(){  
		for (int i = 0; i < 5; i++) {
			System.out.println("Chaild Thread running..." + i);  
		}
		 }
	
	public static void main(String[] args) {
		// 1. Can we start a thread twice ?
		/*
		 * No. After starting a thread, it can never be started again. If you
		 * does so, an "IllegalThreadStateException is thrown. In such case,
		 * thread will run once but for second time, it will throw exception
		 */	
		
	/*	ThreadCommonScenarios t1=new ThreadCommonScenarios();  
		t1.start();  
		t1.start();*/
		
		// 2. What if we call run() method directly instead start() method?
		/* we can run but we will not get any Multi-thread features
		 * As it will run inside main thread and will threat as
		 * normal object not thread object. You can see the output
		 * */
		/*ThreadCommonScenarios t1 = new ThreadCommonScenarios();
		ThreadCommonScenarios t2 = new ThreadCommonScenarios();
		t1.start();
		t2.start();*/
		
		/*ThreadCommonScenarios t1 = new ThreadCommonScenarios();
		ThreadCommonScenarios t2 = new ThreadCommonScenarios();
		t1.run();
		t2.run();*/
		
		
	}

}
