package jichuzuoye;

class Ticket1 implements Runnable {
	private int tickets = 10;
	public void run() {
		while(true) {
			saleTicket();
			if(tickets<=0) {
				break;
			}
		}
	}
	private synchronized void saleTicket() {
		if (tickets>0) {
			try {
				Thread.sleep(10);
			}catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			System.out.println(Thread.currentThread().getName()+"---卖出的票"+tickets--);
		}
	}
}
public class Example13 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Ticket1 ticket = new Ticket1();
		new Thread(ticket,"线程一").start();
		new Thread(ticket,"线程二").start();
		new Thread(ticket,"线程三").start();
		new Thread(ticket,"线程四").start();
	}
}