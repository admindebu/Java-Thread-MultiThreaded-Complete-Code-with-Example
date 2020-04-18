package Com.techtalk.threadexample;

public class RunnableAnnonemous {
	
	public static void main(String[] args) {
		
	/*	Thread t1 = new Thread(){
			public void run(){
				
				System.out.println("Child Thread" + getName());
			}
		};
		t1.start();*/

		
		// anonymous Thread Creation by Runnable interface
		new Thread(new Runnable() {
		    @Override
		    public void run() {
		    	// Define job of the thread
				for(int i=0;i<5;i++){
					System.out.println("RunnableAnnonemous :: Child Thred : " + i);
					//System.out.println("Child Thread Name : " +  Thread.currentThread().getName());
				}
				
		    }
		}).start();
		
		//System.out.println("In Main Thread : " +  Thread.currentThread().getName());
		
		// Lambda Expression for Runnable
		
		Runnable runnable =
		        () -> { System.out.println("Lambda Runnable running"); };
	}

}
