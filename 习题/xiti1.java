public class xiti1 {
	public static void main(String[] args) {
		Thread mt1 = new MyThread("线程1");
		Thread mt2 = new MyThread("线程2");
		mt1.start();
		mt2.start();
		}
}
class MyThread extends Thread {
	public MyThread(String name) {
         super(name);       
	}
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
}