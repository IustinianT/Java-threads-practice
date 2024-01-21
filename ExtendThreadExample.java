public class ExtendThreadExample extends Thread {

	@Override
	public void run() {
		
		System.out.println("ExtendThreadExample run method has started.");
		System.out.println("ExtendThreadExample run method has ended.");
	}
	
	public static void main(String[] args) {

		ExtendThreadExample thread = new ExtendThreadExample();
		
		thread.start();
	}
}
