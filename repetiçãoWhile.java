/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
 */
package PacoteJava;

import java.util.Scanner;

public class repetiçãoWhile {

	public static void main(String[] args) {
		int idade,totalMenos=0,totalMais=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		while (idade!=-99)
		{
			if (idade<21)
			{
				totalMenos++;
				
			}
			else if (idade>50)
			{
				totalMais++;
			}
			System.out.println("\nDigite a sua idade: ");
			idade = leia.nextInt();
		}
		
		System.out.println("\nTotal de pessoas com menos de 21 anos: "+totalMenos);
		System.out.println("\nTotal de pessoas com mais de 50 anos: "+totalMais);
		
				
	}

}
