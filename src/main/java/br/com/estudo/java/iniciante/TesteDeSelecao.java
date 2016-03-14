package br.com.estudo.java.iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteDeSelecao {
	
	public static void main(String args[]) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		String entrada = in.readLine();
		String[] array = entrada.split(" ");

		int a, b, c, d;
		a = Integer.parseInt(array[0]);
		b = Integer.parseInt(array[1]);
		c = Integer.parseInt(array[2]);
		d = Integer.parseInt(array[3]);

		if (b > c && d > a && c + d > a + b && c >= 0 && d >= 0 && a % 2 == 0) {
			System.out.print("Valores aceitos\n");
		} else {
			System.out.print("Valores nao aceitos\n");
		}
	}

}
