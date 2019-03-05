package thread;

import ui.CircleController;

public class Threads extends Thread{
	
	private CircleController cc;
	
	public Threads(CircleController cc) {
		this.cc = cc;
	}
	
	public void run() {
		boolean r = true;
		while(true) {
			
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
}
