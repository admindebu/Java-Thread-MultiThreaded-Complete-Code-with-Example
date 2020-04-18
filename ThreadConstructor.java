package Com.techtalk.threadexample;

public class ThreadConstructor {

	public static void main(String[] args) {

		// Constructor 1 : Thread()
/*		Thread t1 = new Thread() {
			public void run() {
				System.out.println("Constructor :: run by: " + getName());
			}
		};

		t1.start();
		System.out.println(t1.getName());*/

		// Constructor 2 : Thread(String name)
		/*Thread t2 = new Thread("Constructor 2 Thread") {
			public void run() {
				System.out.println("Constructor 2 :: run by: " + getName());
			}
		};
		t2.start();
		System.out.println(t2.getName());*/
		
		// Constructor 3 Thread(Runnable r) : Although Already Shown Earlier
	/*	Thread t3 = new Thread(new Runnable() {		
			@Override
			public void run() {
				System.out.println("Constructor 3 ");
				
			}
		});
		t3.start();
		System.out.println(t3.getName());*/
		
		// Constructor 4 Thread(Runnable r, String name)
		
		Thread t4 = new Thread(new Runnable() {		
			@Override
			public void run() {
				System.out.println("Constructor 4 ");
				
			}
		},"Constructor 4");
		t4.start();
		System.out.println(t4.getName());
	}

}
