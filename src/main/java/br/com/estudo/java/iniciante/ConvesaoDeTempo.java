package br.com.estudo.java.iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvesaoDeTempo {

	public static void main(String[] args) throws IOException {

		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		int total, hr, min, seg;

		total = Integer.parseInt(in.readLine());
		hr = 0;
		min = 0;
		seg = 0;

		if (total >= 60 * 60) {
			hr = total / (60 * 60);
			total = total % (60 * 60);
		}
		if (total >= 60) {
			min = total / 60;
			seg = total % 60;
		} else {
			seg = total;
		}
		System.out.printf("%d:%d:%d\n", hr, min, seg);
	}
}