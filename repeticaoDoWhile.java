/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.
 */
package PacoteJava;

import java.util.Scanner;

public class repeticaoDoWhile {

	public static void main(String[] args) {
		int numero,soma=0;
		
		Scanner ler= new Scanner(System.in);
		
		do
		{
			System.out.println("\nDigite um n�mero do teclado: ");
			numero = ler.nextInt();
			soma+=numero;
		}while (numero!=0);
		System.out.println("\nSoma dos n�meros digitados: "+soma);
			
	
	}

}
