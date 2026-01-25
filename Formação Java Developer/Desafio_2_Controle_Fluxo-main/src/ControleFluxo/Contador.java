package ControleFluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);	
		
		int trocaParametro = 0;
		
		System.out.printf("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		
		System.out.printf("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();		
		
		try {			
			contar(parametroUm, parametroDois, trocaParametro);	
		} catch (Exception e) {
			System.out.println("erro: " + e);
		}
			
		terminal.close();
	}
		
	static void contar(int parametroUm, int parametroDois, int trocaParametro) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			trocaParametro = parametroUm;
			parametroUm = parametroDois;
			parametroDois = trocaParametro;
		}
		
		int contagem = parametroDois - parametroUm;
		
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}		
}
