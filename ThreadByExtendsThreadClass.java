package Com.techtalk.threadexample;

public class ThreadByExtendsThreadClass extends Thread{
	
	//@Override
	public void run(){
		// Define job of the thread
		for(int i=0;i<5;i++){
			System.out.println("ThreadByExtendsThreadClass :: Child Thred : " + i);
			//System.out.println("Child Thread Name : " +  Thread.currentThread().getName());
		}
	}

}

