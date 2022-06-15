/**
 * POO - Fundamentos
 */
package minecraft;

/**
 * @author Gustavo Rene Classe Modelo
 */
public class Bloco {
	/***
	 * Construtor
	 */
	public Bloco() {
		super();
		System.out.println("-----------------------");
	}

	// Textura
	int resistencia;
	String textura;

	// M�todos
	// Void -> M�todo simples sem retorno
	void construir() {
		System.out.println("Bloco colocado");
	}

	void minerar() {
		System.out.println("Recursos obtidos");
	}

	void craftar() {
		System.out.println("Item criado");
	}
}
