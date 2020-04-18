package Com.techtalk.threadexample;

public class WorkerThread implements Runnable {
	  
    private String command;
    
    public WorkerThread(String s){
        this.command=s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
        System.out.println(Thread.currentThread().getName()+" End.");
    }

    @Override
    public String toString(){
        return this.command;
    }
}