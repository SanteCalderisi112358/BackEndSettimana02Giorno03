package Esercizio02;

public class SimpleThread extends Thread {

	int inizio;
	int fine;
	int[] array;
	int somma;

	public SimpleThread(int _inizio, int _fine, int[] _array) {
		this.inizio = _inizio;
		this.fine = _fine;
		this.array = _array;
	}

	@Override
	public void run() {
		int sommaParziale = 0;
		for (int i = this.inizio; i < this.fine; i++) {
			sommaParziale += array[i];
		}
		System.out.println("La somma degli elementi dalla posizione " + this.inizio + " alla posizione " + this.fine
				+ " di "
				+ Thread.currentThread().getName() + " è:\n " + sommaParziale);
		this.somma = sommaParziale;
	}

	public int getSomma() {
		return somma;
	}

}
