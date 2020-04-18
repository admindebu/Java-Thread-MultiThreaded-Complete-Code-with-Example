package Com.techtalk.threadexample;

public class ThreadLambdaExpression {
	public static void main(String[] args) {
		 
		Thread t1 = new Thread(() -> {
			// Task/Job code here ...
			for (int i = 1; i <= 5; i++) {

				System.out.println("T1 : " + Thread.currentThread().getName()+ " : " + i);
			}
		});
		t1.start();
	}
}
