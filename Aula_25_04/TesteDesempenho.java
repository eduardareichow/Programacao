package Aula_25_04;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class TesteDesempenho {
	
	public static void main (String []args){
		
		final int MAX = 20000;
		Long tInicio = System.currentTimeMillis();
		List <Integer> lista = new ArrayList<Integer>();
		for (int i=0; i<MAX; i++) {
			lista.add(i);
		}
		for (int i=0; i<MAX; i++){
			lista.contains(i);
		}
		long tFim = System.currentTimeMillis();
		System.out.println("Com ArrayList: Tempo total: " + (tFim - tInicio));
		
		final int max = 20000;
		Long tempoInicio = System.currentTimeMillis();
		List <Integer> listi = new LinkedList<Integer>();
		for (int i=0; i<max; i++) {
			listi.add(i);
		}
		for (int i=0; i<max; i++){
			listi.contains(i);
		}
		long tempoFim = System.currentTimeMillis();
		System.out.println("Com LinkedList: Tempo total: " + (tempoFim - tempoInicio));
		
	}
}