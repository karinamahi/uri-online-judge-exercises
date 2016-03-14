package br.com.estudo.java.iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class NotasEMoedas {

	public static void main(String[] args) throws IOException {

		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		double entrada = Double.parseDouble(in.readLine());
		String valor = String.valueOf(entrada);

		String notas[], moedas[];
		notas = new String[6];
		moedas = new String[6];
		notas[0] = "100";
		notas[1] = "50";
		notas[2] = "20";
		notas[3] = "10";
		notas[4] = "5";
		notas[5] = "2";
		moedas[0] = "1";
		moedas[1] = "0.50";
		moedas[2] = "0.25";
		moedas[3] = "0.10";
		moedas[4] = "0.05";
		moedas[5] = "0.01";

		System.out.printf("NOTAS:\n");
		for (int i = 0; i < notas.length; i++) {
			if (Double.parseDouble(valor) >= Double.parseDouble(notas[i])) {
				System.out.printf("%.0f nota(s) de R$ %.2f\n", (new BigDecimal(
						valor).divideToIntegralValue(new BigDecimal(notas[i]))
						.doubleValue()), Double.parseDouble(notas[i]));
				valor = (new BigDecimal(valor).remainder(new BigDecimal(
						notas[i])).toString());
			} else {
				System.out.printf("0 nota(s) de R$ %.2f\n",
						Double.parseDouble(notas[i]));
			}
		}
		System.out.printf("MOEDAS:\n");
		for (int i = 0; i < moedas.length; i++) {
			if (Double.parseDouble(valor) >= Double.parseDouble(moedas[i])) {
				System.out
						.printf("%.0f moeda(s) de R$ %.2f\n", (new BigDecimal(
								valor).divideToIntegralValue(new BigDecimal(
								moedas[i])).doubleValue()), Double
								.parseDouble(moedas[i]));
				valor = (new BigDecimal(valor).remainder(new BigDecimal(
						moedas[i])).toString());
			} else {
				System.out.printf("0 moeda(s) de R$ %.2f\n",
						Double.parseDouble(moedas[i]));
			}
		}
	}

}
