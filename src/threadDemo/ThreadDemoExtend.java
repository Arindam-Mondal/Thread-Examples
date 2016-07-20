package threadDemo;

class ExtendThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemoExtend {
	
	public static void main(String args[]){
		ExtendThread ext1 = new ExtendThread();
		ExtendThread ext2 = new ExtendThread();
		ext1.start();
		ext2.start();
	}
	
}
