public class xiti2{
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.start();
		for(int i=100;i>0;i--) {
			System.out.println("main");
		}
	}
}
class MyThread implements Runnable {
	public void run() {
		for(int i=50;i>0;i--) {
			System.out.println("new");
		}
	}
}