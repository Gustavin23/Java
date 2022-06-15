/**
 * Fundamentos do Java
 * Variáveis, Operadores e Estruturas de Controle
 * Exercício 1 - APP Eleitor
 * Desenvolver um aplicativo no modo console que em função da idade do eleitor
 * avise se o voto é obrigatório ou não
 * 
 * Abaixo de 16 anos (Voto é proibido)
 * Entre 18 e 70 (Incluido 18 e 70) - Voto Obrigatório
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
	 * Método Principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Variáveis
		int idade;
		// Objetos
		Scanner teclado = new Scanner(System.in);
		System.out.println("============ APP Eleitor ============");
		System.out.print("Digite sua idade: ");
		// Entrada de Dados
		idade = teclado.nextInt();
		// Apoio ao teste do fluxo (verificar se a variável(idade) foi capturada)
		// System.out.println(idade);
		
		// Processamento de Saída
		if (idade < 16) {
			System.out.println("Você está proibido a votar");
		} else if (idade > 17 && idade < 71){
			System.out.println("Voto obrigatório");
		} else {
			System.out.println("Voto facultativo");
		}
		// Encerrar a Captura de Dados
		teclado.close();
	}

}
