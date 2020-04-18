package Com.techtalk.threadexample;

public class SampleJConsoleConnectProgram extends Thread {
	
	@Override
	public void run(){
		while(true)
		{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Child Thread");
		}
	}
	public static void main(String[] args) {
		SampleJConsoleConnectProgram t1 = new SampleJConsoleConnectProgram();
		t1.start();
	}

}
