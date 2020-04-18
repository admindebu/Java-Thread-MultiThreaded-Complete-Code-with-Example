package Com.techtalk.threadexample;

public class ShutDownHookThread extends Thread {
	@Override
	public void run() {
		System.out.println("shut down hook task completed..");
	}
}
