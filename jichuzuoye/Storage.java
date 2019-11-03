package jichuzuoye;

class Storage {
	private int[] cells = new int[10];
	private int inPos,outPos;
	private int count;
	private synchronized void put(int num) {
		try {
			while(count == cells.length) {
				this.wait();
			}
			cells[inPos] = num;
			System.out.print("��cells["+inPos+"]�з�������---"+cells[inPos]);
			inPos++;
			if(inPos==cells.length)
				inPos=0;
			count++;
			this.notify();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public synchronized void get() {
		try {
			while(count==0) {
				this.wait();
			}
			int data = cells[outPos];
			System.out.print("��cells["+outPos+"]��ȡ������"+data);
			cells[outPos]=0;
			outPos++;
			if(outPos==cells.length)
				outPos=0;
			count--;
			this.notify();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}