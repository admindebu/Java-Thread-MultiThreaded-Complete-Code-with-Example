package Com.techtalk.threadexample;

public class ThreadMethods2 {
	
	public static void main(String[] args) throws InterruptedException {

		// Sleep() method Example 
		// If you use Thread.Sleep() you have to handle InterruptedException
		/*Thread t1 = new Thread() {
			public void run() {
				try {
					// first parameter : millis
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 1 ");

			}
		};

		Thread t2 = new Thread() {
			public void run() {
				try {
					// first parameter : millis , second parameter : nanos
					Thread.sleep(4000, 4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 2");

			}
		};
		System.out.println("Main Thread");
		
		t1.start();
		t2.start();*/
		
		// join() method Example throws InterruptedException
		
		/*Thread t1 = new Thread() {
			public void run() {
				for(int i=1;i<=5;i++){  
					   try{  
					    Thread.sleep(400);  
					   }catch(InterruptedException e){
						   System.out.println(e);
						   }  
					  System.out.println("T1 : " + i);  
					  }  
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i=1;i<=5;i++){  
					   try{  
					    Thread.sleep(400);  
					   }catch(InterruptedException e){
						   System.out.println(e);
						   }  
					  System.out.println("T2 : " + i);  
					  }  
			}
		};
		
		Thread t3 = new Thread() {
			public void run() {
				for(int i=1;i<=5;i++){  
					   try{  
					    Thread.sleep(400);  
					   }catch(InterruptedException e){
						   System.out.println(e);
						   }  
					  System.out.println("T3 : " + i);  
					  }  
			}
		};
		
		t1.start();  
		 try{  
		  t1.join();  
		 }catch(InterruptedException e){
			 System.out.println(e);
			 }  
		  
		 t2.start();  
		 t3.start(); */
		
		/*Thread t1 = new Thread() {
			public void run() {
				for(int i=1;i<=5;i++){  
					   try{  
					    Thread.sleep(400);  
					   }catch(InterruptedException e){
						   System.out.println(e);
						   }  
					  System.out.println("T1 : " + i);  
					  }  
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i=1;i<=5;i++){  
					   try{  
					    Thread.sleep(400);  
					   }catch(InterruptedException e){
						   System.out.println(e);
						   }  
					  System.out.println("T2 : " + i);  
					  }  
			}
		};
		
		Thread t3 = new Thread() {
			public void run() {
				for(int i=1;i<=5;i++){  
					   try{  
					    Thread.sleep(400);  
					   }catch(InterruptedException e){
						   System.out.println(e);
						   }  
					  System.out.println("T3 : " + i);  
					  }  
			}
		};
		
		t1.start();  
		t2.start();  
		t3.start();*/
		
		
		/*Thread t1 = new Thread() {
			
				public void run() 
			    { 
			        for (int i=0; i<5 ; i++) 
			            System.out.println(Thread.currentThread().getName() 
			                                + " in control"); 
			   
			}
		};
		t1.start();  
		 for (int i=0; i<5; i++) 
	        { 
	            // Control passes to child thread 
	            Thread.yield(); 
	  
	            // After execution of child Thread 
	            // main thread takes over 
	            System.out.println(Thread.currentThread().getName() 
	                                + " in control"); 
	        } */
		
		// Interrupted Scenario : 1 -> Interrupting a thread that doesn’t stop working 
		/*In the below program, we handle the InterruptedException using
		try and catch block, so whenever any thread interrupt currently executing
		thread it will comes out from the sleeping state but it will not 
		stop working.*/
	
		/*Thread t1 = new Thread() {
			public void run() {
					   try{  
						   for(int i=1;i<=5;i++){  
						    System.out.println("T1 : " + i);
					        Thread.sleep(400);  
						   }
					   }catch(InterruptedException e){
						   System.out.println("InterruptedException occur :: In Child Thread");
						   }  
					  }  
		};
		t1.start();
		t1.interrupt();
		System.out.println("Main thread execution completes");*/
		
		// Interrupted Scenario : 2 -> Interrupting a thread that stops working 
		 /*In the below program, after interrupting currently executing thread,
		 we are throwing a new exception in the catch block so it will stop working.*/
		/*Thread t1 = new Thread() {
			public void run() {
					   try{  
						   for(int i=1;i<=5;i++){  
						    System.out.println("T1 : " + i);
					        Thread.sleep(400);  
						   }
					   }catch(InterruptedException e){
						   throw new RuntimeException("Thread " +  
                                   "interrupted");
						   }  
					  }  
		};
		t1.start();
		 try { 
			 t1.interrupt(); 
	        } 
	        catch (Exception e) { 
	            System.out.println("Exception handled"); 
	        }*/
		// Interrupted Scenario : 3 -> Interrupting a thread that works normally 
		/* In the below program, there is no exception occurred during the execution
		 of thread. Here, interrupt only sets the interrupted flag to true,
		 which can be used by java programmer later.*/
		
		/*Thread t1 = new Thread() {
			public void run() {
				for(int i=1;i<=5;i++){  
					
					  System.out.println("T1 : " + i);  
					  }  
			}
		};
		t1.start(); 
        t1.interrupt();*/

	}

}
