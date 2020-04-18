package Com.techtalk.threadexample;

public class ThreadMethods {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(){
			public void run() {
				System.out.println("Child Thread");
			}
		};
		
		// Method :: run() need to Check Later
	/*t1.run();
		System.out.println("Child Thread name : " + t1.getName());		
		System.out.println("Main Thread name : " + Thread.currentThread().getName());*/
		
		// Method :: start()
		/*t1.start();;
		System.out.println("Child Thread name : " + t1.getName());		
		System.out.println("Main Thread name : " + Thread.currentThread().getName());*/
		
		// Method :: getPriority()
		/*System.out.println("Child Thread priority : " +  t1.getPriority());
		System.out.println("Main Thread priority : " +  Thread.currentThread().getPriority());
	    */
		// Method :: setPriority()
		/* Total Three COnstant Priority
		 * public static int MIN_PRIORITY :  1
         *  public static int NORM_PRIORITY : 5
         * public static int MAX_PRIORITY : 10 
         * Default priority of a thread is 5 (NORM_PRIORITY).
		 */
	/*	t1.setPriority(2);
	    // t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Child Thread priority : " +  t1.getPriority());
		System.out.println("Main Thread priority : " +  Thread.currentThread().getPriority());
*/
		// Method :: getName()
		/*t1.start();
		System.out.println("Child Thread name : " + t1.getName());		
		System.out.println("Main Thread name : " + Thread.currentThread().getName());*/
		
		// Method :: setName()
		/*t1.setName("My-Thread");
		t1.start();
		System.out.println("Child Thread name : " + t1.getName());		
		System.out.println("Main Thread name : " + Thread.currentThread().getName());
*/
		// Method :: currentThread()
		/*System.out.println("Main Thread priority : " +  Thread.currentThread().getPriority());
	*/
		// Method :: getId()
	/*	t1.start();
		System.out.println("Child Thread Id : " + t1.getId());		
		System.out.println("Main Thread Id : " + Thread.currentThread().getId());*/
		
		// Method :: getState()
	/*	t1.start();
		System.out.println("Child Thread State : " + t1.getState());
	
		System.out.println("Child Thread State : " + t1.getState());
		System.out.println("Main Thread State : " + Thread.currentThread().getState());
		*/
		
		// Method :: isAlive()
	/*	t1.start();
		System.out.println("Child Thread Alive status : " + t1.isAlive());		
		System.out.println("Main Thread Alive status : " + Thread.currentThread().isAlive());
		*/
		
		// Method :: isDaemon()
		/*t1.start();
		System.out.println("Child Thread Daemon status : " + t1.isDaemon());		
		System.out.println("Main Thread Daemon status : " + Thread.currentThread().isDaemon());
		*/
		
		// Method :: isDaemon()
	/*	t1.setDaemon(true);
		t1.start();
		//If you want to make a user thread as Daemon, it must not be started otherwise it will throw IllegalThreadStateException.
		// After running if you set , wll get :: java.lang.IllegalThreadStateException
		//t1.setDaemon(true);
		System.out.println("Child Thread Daemon status : " + t1.isDaemon());		
		System.out.println("Main Thread Daemon status : " + Thread.currentThread().isDaemon());
		System.out.println("Main Thread Daemon status : " + Thread.currentThread().activeCount());
		*/
	    
		// Method :: isInterrupted()
		/*t1.start();
		System.out.println("Child Thread Interrupted status : " + t1.isInterrupted());		
		System.out.println("Main Thread Interrupted status : " + Thread.currentThread().isInterrupted());
		*/	
				
	}

}
