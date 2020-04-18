package Com.techtalk.threadexample;

public class ImplementsRunnable implements Runnable {

	@Override
	public void run() {
		// Define job of the thread
		for(int i=0;i<5;i++){
			System.out.println("ImplementsRunnable :: Child Thred : " + i);
			//System.out.println("Child Thread Name : " +  Thread.currentThread().getName());
		}
		
	}

}
