package JavaProgramsDemo;

public class MyThreadDemo extends Thread{

	public void run()
	{
		System.out.println("Thread is Running.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThreadDemo th = new MyThreadDemo();
		th.start();
	}

}
