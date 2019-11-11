package xiaofei;

class Producer implements Runnable {
    private Resource r;
    public Producer(Resource r){
        this.r=r;
    }
    public void run() {
        while(true) {
                r.set("Ãæ°ü");
        }
    }  

}
