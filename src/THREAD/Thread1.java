package THREAD;
public class Thread1 extends Thread {
 public static void main(String[] args){
	 Thread1 Thread= new Thread1();
			 Thread.start();
			 System.out.println("This code is inside of the thread");
}
 public void run() {
	    System.out.println("This code is running outside thread");
}
}

