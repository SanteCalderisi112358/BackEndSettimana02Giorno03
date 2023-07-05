package Esercizio01;

public class Esercizio01 {


	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		SimpleThread thread01 = new SimpleThread("*");
		SimpleThread thread02 = new SimpleThread("#");

		thread01.setName("Thread 01");
		thread02.setName("Thread 02");
		thread01.start();
		try {
			thread01.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		thread02.start();

	}

}
