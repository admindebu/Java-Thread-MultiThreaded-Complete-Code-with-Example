package Com.techtalk.threadexample;

public class ShutDownHookExample {

	/*
	 * Java Shutdown Hook The shutdown hook can be used to perform cleanup
	 * resource or save the state when JVM shuts down normally or abruptly.
	 * Performing clean resource means closing log file, sending some alerts or
	 * something else. So if you want to execute some code before JVM shuts
	 * down, use shutdown hook.
	 * 
	 * When does the JVM shut down? The JVM shuts down when: user presses ctrl+c
	 * on the command prompt System.exit(int) method is invoked user logoff user
	 * shutdown etc.
	 * 
	 * The addShutdownHook(Thread hook) method The addShutdownHook() method of
	 * Runtime class is used to register the thread with the Virtual Machine.
	 * Syntax:
	 * public void addShutdownHook(Thread hook){}
	 */

	public static void main(String[] args) throws Exception {

		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new ShutDownHookThread());

		System.out.println("Now main sleeping... press ctrl+c to exit");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
	}

}
