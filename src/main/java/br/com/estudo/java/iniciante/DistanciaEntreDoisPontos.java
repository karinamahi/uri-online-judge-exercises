package br.com.estudo.java.iniciante;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;

public class DistanciaEntreDoisPontos {
	
	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		double x1, y1, x2, y2;
		
		String p1 = in.readLine();
		String[] arrayP1 = new String[2];
		arrayP1 = p1.split(" ");
		x1 = Double.parseDouble(arrayP1[0]);
		y1 = Double.parseDouble(arrayP1[1]);
		
		String p2 = in.readLine();
		String[] arrayP2 = new String[2]; 
		arrayP2 = p2.split(" ");
		x2 = Double.parseDouble(arrayP2[0]);
		y2 = Double.parseDouble(arrayP2[1]);
		
		BigDecimal d = new BigDecimal(Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))));
		
		System.out.printf("%.4f\n", d);
	}
}
