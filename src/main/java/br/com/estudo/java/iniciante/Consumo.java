package br.com.estudo.java.iniciante;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Consumo {

	public static void main(String[] args) throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		int x = Integer.parseInt(in.readLine());
		double y , m;
		
		y= Double.parseDouble(in.readLine());
		m = x/y;
		
		System.out.printf("%.3f km/l\n", m);
		
	}
}
