public class xiti3 {
	public static void main(String[] args) {
		TeacherWindow tw = new TeacherWindow();
		new Thread(tw,"老师1").start();
		new Thread(tw,"老师2").start();
		new Thread(tw,"老师3").start();
	}
}
class TeacherWindow implements Runnable {
	private int i=80;
	public void run() {
		while(true) {
			if(i>0) {
				Thread th = Thread.currentThread();
				String th_name = th.getName();
				System.out.println(th_name+"正在发第 "+i--+"本");
			}
		}
	}
}