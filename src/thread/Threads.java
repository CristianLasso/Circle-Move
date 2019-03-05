package thread;

import ui.CircleController;

public class Threads extends Thread{
	
	private CircleController cc;
	private boolean c;
	private boolean r;
	
	public Threads(CircleController cc, boolean r) {
		this.cc = cc;
		c = true;
		this.r = r;
	}
	
	public void run() {
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
	
	public boolean getR() {
		return r;
	}
}
