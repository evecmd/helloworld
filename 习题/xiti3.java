public class xiti3 {
	public static void main(String[] args) {
		TeacherWindow tw = new TeacherWindow();
		new Thread(tw,"��ʦ1").start();
		new Thread(tw,"��ʦ2").start();
		new Thread(tw,"��ʦ3").start();
	}
}
class TeacherWindow implements Runnable {
	private int i=80;
	public void run() {
		while(true) {
			if(i>0) {
				Thread th = Thread.currentThread();
				String th_name = th.getName();
				System.out.println(th_name+"���ڷ��� "+i--+"��");
			}
		}
	}
}