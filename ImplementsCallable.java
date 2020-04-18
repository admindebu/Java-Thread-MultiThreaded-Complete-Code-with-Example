package Com.techtalk.threadexample;

import java.util.concurrent.Callable;

public class ImplementsCallable implements Callable<String>{
	
	@Override
	public String call() {
        return Thread.currentThread().getName() + " executing ...";
    }

}
