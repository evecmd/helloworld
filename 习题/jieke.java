public class jieke {
	public static void main(String[] args) {
		TicketWindow tw = new TicketWindow();
		new Thread(tw, "出租车 1").start();
		new Thread(tw, "出租车 2").start();
		new Thread(tw, "出租车 3").start();
		new Thread(tw, "出租车 4").start();
		new Thread(tw, "出租车 5").start();
	}
}
class TicketWindow implements Runnable {
	private int i = 100;
	public void run() {
		while(true) {
			if(i>0) {
				Thread th = Thread.currentThread();
				String th_name = th.getName();
				System.out.println(th_name+" 正在接第"+i--+" 位客户 ");
			}
		}
	}
}