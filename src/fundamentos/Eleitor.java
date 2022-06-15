/**
 * Fundamentos do Java
 * Vari�veis, Operadores e Estruturas de Controle
 * Exerc�cio 1 - APP Eleitor
 * Desenvolver um aplicativo no modo console que em fun��o da idade do eleitor
 * avise se o voto � obrigat�rio ou n�o
 * 
 * Abaixo de 16 anos (Voto � proibido)
 * Entre 18 e 70 (Incluido 18 e 70) - Voto Obrigat�rio
 * 16,17 ou acima de 70 - Voto Facultativo
 */
package fundamentos;

import java.util.Scanner;

/**
 * @author Gustavo Rene
 *
 */
public class Eleitor {

	/**
	 * M�todo Principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Vari�veis
		int idade;
		// Objetos
		Scanner teclado = new Scanner(System.in);
		System.out.println("============ APP Eleitor ============");
		System.out.print("Digite sua idade: ");
		// Entrada de Dados
		idade = teclado.nextInt();
		// Apoio ao teste do fluxo (verificar se a vari�vel(idade) foi capturada)
		// System.out.println(idade);
		
		// Processamento de Sa�da
		if (idade < 16) {
			System.out.println("Voc� est� proibido a votar");
		} else if (idade > 17 && idade < 71){
			System.out.println("Voto obrigat�rio");
		} else {
			System.out.println("Voto facultativo");
		}
		// Encerrar a Captura de Dados
		teclado.close();
	}

}
