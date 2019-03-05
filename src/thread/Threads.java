package thread;

import ui.CircleController;

public class Threads extends Thread{
	
	private CircleController cc;
	private boolean c;
	
	public Threads(CircleController cc) {
		this.cc = cc;
		c = true;
	}
	
	public void run() {
		boolean r = true;
		while(c) {
			
			r = cc.rigth(r);
			r = cc.left(r);
			try {
				sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void s() {
		c = !c;
	}
	
	public boolean getC() {
		return c;
	}
}
