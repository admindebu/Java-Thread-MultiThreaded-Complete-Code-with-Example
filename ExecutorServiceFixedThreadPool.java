package Com.techtalk.threadexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceFixedThreadPool {
	public static void main(String[] args) {
		ExecutorService execService = Executors.newCachedThreadPool();
		execService.execute(new TestTask("FirstTestTask"));
		execService.execute(new TestTask("SecondTestTask"));
		execService.execute(new TestTask("ThirdTestTask"));

		execService.shutdown();
	}

}
