public class jieke {
	public static void main(String[] args) {
		TicketWindow tw = new TicketWindow();
		new Thread(tw, "���⳵ 1").start();
		new Thread(tw, "���⳵ 2").start();
		new Thread(tw, "���⳵ 3").start();
		new Thread(tw, "���⳵ 4").start();
		new Thread(tw, "���⳵ 5").start();
	}
}
class TicketWindow implements Runnable {
	private int i = 100;
	public void run() {
		while(true) {
			if(i>0) {
				Thread th = Thread.currentThread();
				String th_name = th.getName();
				System.out.println(th_name+" ���ڽӵ�"+i--+" λ�ͻ� ");
			}
		}
	}
}