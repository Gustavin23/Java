/**
 * Atividade
 */
package carros;

/**
 * @author gustavo.rdboamorte
 *
 */
public class Avião {

	public Avião() {
		super();
		System.out.println("-----------------------");
	}
	// Variaveis
	int ano;
	String cor;
	Double envergadura;
	
	void ligar() {
		System.out.println("Veículo Ligando");
	}

	void desligar() {
		System.out.println("Veículo Desligando");
	}

	void acelerar() {
		System.out.println("Veículo acelerando");
	}
	void pousar() {
		System.out.println("Avião Pousando");
	}

}
