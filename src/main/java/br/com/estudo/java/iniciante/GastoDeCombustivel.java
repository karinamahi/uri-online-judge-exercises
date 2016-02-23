package br.com.estudo.java.iniciante;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class GastoDeCombustivel {

	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		 int horas, vmedia;
		 double distancia;
		
		 horas = Integer.parseInt(in.readLine());
		 vmedia = Integer.parseInt(in.readLine()); 
		 distancia = horas*vmedia;
		 
		 System.out.printf("%.3f\n", distancia/12);
	}
}
