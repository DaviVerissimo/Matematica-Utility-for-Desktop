package model;

import java.util.Scanner;

import control.Sistema;

public class Principal {
	public static void main(String[] args) {
		Sistema sistema = new Sistema();
		Scanner leitor = new Scanner(System.in);
		
		int opcao = -1;
		while (opcao != 0) {
			System.out.println("Escolher operação!");
			System.out.println("1 Calcular raiz...");
			System.out.println("2 Calcular potencia... ");
			System.out.println("0 Sair!... ");
			opcao = leitor.nextInt();
			
			if (opcao == 1) {
				System.out.println("Digite o numero: ");
				float numero = leitor.nextFloat();
				System.out.println("Digite o base da raiz: ");
				float baseRaiz = leitor.nextFloat();
				System.out.println("A raiz de " + numero + 
						" na base " + baseRaiz + " é: " + sistema.calcularRaiz(numero, baseRaiz));
			}
			if (opcao == 2) {
				System.out.println("Digite o numero: ");
				float numero = leitor.nextFloat();
				System.out.println("Digite o potencia: ");
				float basePotencia = leitor.nextFloat();
				System.out.println("A potencia de " + numero + 
						" na base " + basePotencia + " é: " + sistema.calcularPotencia(numero, basePotencia));
			}
		}
			
	}

}
