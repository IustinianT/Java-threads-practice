public class MemoryDemoRunnable implements Runnable {
	private int counter = 0;
	public void run() {
		for (int i = 0; i < 100_000; i++) {
			counter++;
		}
		System.out.println(Thread.currentThread().getName() +  " " +  counter);
	}
	public static void main(String[] args) {
		MemoryDemoRunnable runnable1 = new MemoryDemoRunnable();	
		Thread thread1 = new Thread(runnable1);
		MemoryDemoRunnable runnable2 = new MemoryDemoRunnable();
		Thread thread2 = new Thread(runnable2);
		thread1.start();
		thread2.start();
	}	
}
