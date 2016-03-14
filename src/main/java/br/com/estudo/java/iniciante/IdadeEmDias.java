package br.com.estudo.java.iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IdadeEmDias {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		int valor, d , m, a;
		d = 0;
		m = 0;
		a = 0;
		
		valor = Integer.parseInt(in.readLine());
		
		if(valor >= 365) {
			a = valor/365;
			valor = valor%365;
		}
		if(valor >= 30) {
			m = valor/30;
			d = valor%30;
		}
		else {
			d = valor;
		}
		
		System.out.printf("%d ano(s)\n", a);
		System.out.printf("%d mes(es)\n", m);
		System.out.printf("%d dia(s)\n", d);
	}
	
}
