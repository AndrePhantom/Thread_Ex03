package view;

import Controller.Vetor;

public class Main {

	public static void main(String[] args, int[] vetor) {

		for (int i : vetor) {
			vetor[i] = (int) Math.random() * (100 - 1) + 1;
		}

		Vetor tv1 = new Vetor(1, vetor);
		Vetor tv2 = new Vetor(2, vetor);
		tv1.start();
		tv2.start();
	}
}
