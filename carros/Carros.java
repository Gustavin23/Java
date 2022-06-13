/**
 * Atividade Carros
 */
package carros;

/**
 * @author Gustavo Rene
 * Classe responsável pela criação dos objetos
 */
public class Carros {

	public Carros() {
		super();
		System.out.println("-----------------------");
	}
		//variáveis
		int ano;
		String cor;
		String modelo;

		// Voids
		void ligar() {
			System.out.println("Veículo Ligando");
		}

		void desligar() {
			System.out.println("Veículo Desligando");
		}

		void acelerar() {
			System.out.println("Veículo acelerando");
		}
		void frear() {
			System.out.println("Veículo Freando");
		}
	}

