package xiaofei;

public class Resource {
	private String name;
	private int count = 1;
	private boolean flag = false;
	public synchronized void set(String name) {
	   if(flag) {
		   try {
			   wait();
		   }catch (InterruptedException e) {}
	   }
	   this.name = name + count;
	   count++;
	   System.out.println(Thread.currentThread().getName()+"...生产者.."+this.name);
	   flag = true;
	   notify();
	}
	public synchronized void set() {
        if(flag) {
            try {
            	wait();} catch (InterruptedException e) {}
        }
        this.name = name+count;
        count++;
       System.out.println(Thread.currentThread().getName()+"...生产者.."+this.name);
        flag = true;
       notify();
    }
    public synchronized void out() {
	   if(!flag) {
		   try {
			   wait();
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println(Thread.currentThread().getName()+"...消费者.."+this.name);
		flag = false;
		notify();
	   }
     }
}