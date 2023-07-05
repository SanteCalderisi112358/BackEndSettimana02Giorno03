package Esercizio02;

import java.util.Arrays;
import java.util.Random;

public class Esercizio02 {
	public static void main(String[] args) {

		int[] arrayRandom = new int[3000];
		arrayRandom = random(arrayRandom);
		// stampaArray(arrayRandom);

		SimpleThread thread01 = new SimpleThread(0, 1000, arrayRandom);
		SimpleThread thread02 = new SimpleThread(1001, 2000, arrayRandom);
		SimpleThread thread03 = new SimpleThread(2001, 3000, arrayRandom);

		int somma = 0;

		for (int i = 0; i < arrayRandom.length; i++) {
			somma += arrayRandom[i];
		}

		System.out.println(somma);
		thread01.setName("Thread 01");
		thread02.setName("Thread 02");
		thread03.setName("Thread 03");


		thread01.start();
		thread02.start();
		thread03.start();

		try {
			thread01.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		try {
			thread02.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		try {
			thread03.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		int sommaThread01 = thread01.getSomma();
		int sommaThread02 = thread02.getSomma();
		int sommaThread03 = thread03.getSomma();

		int sommaTotale = sommaThread01 + sommaThread02 + sommaThread03;
		System.out.println("La somma totale è:\n" + sommaTotale);
	}

	public static int[] random(int[] array) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(201) - 100;
		}
		return array;
	}

	public static void stampaArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}
}
