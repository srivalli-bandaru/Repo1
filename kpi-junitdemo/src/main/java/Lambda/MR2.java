package Lambda;

public class MR2 {

	public static void ThreadStatus() {
		System.out.println("Thread is running...");
	}

public static void main(String[] args) {
	
	Thread t2 = new Thread(MR2::ThreadStatus);
	t2.start();
}
}