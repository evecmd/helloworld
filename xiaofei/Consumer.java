package xiaofei;

class Consumer implements Runnable {
	private Resource r;
    public Consumer(Resource r){
        this.r=r;
    }
    public void run() {
      while(true) {
              r.out();        
        }
   }
}
