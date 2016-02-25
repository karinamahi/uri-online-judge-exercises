package br.com.estudo.java.iniciante;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Cedulas {

	public static void main(String[] args) throws IOException {

		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		int valor;
		int array[];
		array = new int[7];

		valor = Integer.parseInt(in.readLine());

		array[0] = 100;
		array[1] = 50;
		array[2] = 20;
		array[3] = 10;
		array[4] = 5;
		array[5] = 2;
		array[6] = 1;

		System.out.printf("%d\n", valor);

		for (int i = 0; i < array.length; i++) {
			if (valor >= array[i]) {
				System.out.printf("%d nota(s) de R$ %d,00\n", valor / array[i],
						array[i]);
				valor = valor % array[i];
			} else {
				System.out.printf("0 nota(s) de R$ %d,00\n", array[i]);
			}
		}
	}
}
