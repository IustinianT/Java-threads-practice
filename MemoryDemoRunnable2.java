public class MemoryDemoRunnable2 implements Runnable {
	private int counter = 0;
	public void run() {
		for (int i = 0; i < 100_000; i++) {
			counter++;
		}
		System.out.println(Thread.currentThread().getName() +  " " +  counter);
	}
	public static void main(String[] args) {
		MemoryDemoRunnable2 runnable1 = new MemoryDemoRunnable2();	
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable1);
		thread1.start();
		thread2.start();
	}	
}
