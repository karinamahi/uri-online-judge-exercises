package br.com.estudo.java.iniciante;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Distancia {

	public static void main(String[] args)  throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		int distancia = Integer.parseInt(in.readLine());
		
		System.out.printf("%d minutos\n", distancia*2);
	}
}
