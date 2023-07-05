package Esercizio01;

public class SimpleThread extends Thread {
	String carattereSpeciale;

	public SimpleThread(String _carattereSpeciale) {
		this.carattereSpeciale = _carattereSpeciale;
	}

	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i + " - " + this.carattereSpeciale);
			try {
				Thread.sleep(2000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
