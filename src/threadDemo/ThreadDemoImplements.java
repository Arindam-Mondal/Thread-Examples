package threadDemo;

class ImplementsThread implements Runnable{

	@Override
	public void run() {
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

public class ThreadDemoImplements {

	public static void main(String[] args) {
		ImplementsThread imptThrd1 = new ImplementsThread();
		ImplementsThread imptThrd2 = new ImplementsThread();
		
		Thread t1 = new Thread(imptThrd1);
		Thread t2 = new Thread(imptThrd2);
		
		t1.start();
		t1.start();
	}

}
