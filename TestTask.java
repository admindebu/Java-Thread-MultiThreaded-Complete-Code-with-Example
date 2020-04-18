package Com.techtalk.threadexample;

public class TestTask implements Runnable {
	 private String taskName;
	 
	 public TestTask(String taskName) {
	  this.taskName = taskName;
	 }
	 
	 public void run() {
	  try {
	   System.out.println(this.taskName + " is sleeping...");
	   Thread.sleep(3000);
	   System.out.println(this.taskName + " is running...");
	  } catch (InterruptedException e) {
	   e.printStackTrace();
	  }
	 }
	 
	 public String getTaskName() {
	  return taskName;
	 }
	 
	 public void setTaskName(String taskName) {
	  this.taskName = taskName;
	 }
	 
	}
