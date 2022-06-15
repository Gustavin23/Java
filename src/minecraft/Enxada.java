/**
 * POO - Fundamentos
 */
package minecraft;

/**
 * @author Gustavo Rene
 * Classe Modelo com Herança (extends)
 *
 */
public class Enxada extends Bloco {

	/**
	 * Construtor
	 */
	public Enxada() {
		System.out.println("_____CAMPO_____");
	}
	// Atributos
	boolean conquista;
	
	// Método
	/**
	 * Método usado para arar a terra
	 */
	void arar() {
		System.out.println("Terra preparada para o plantio");
		// Atenção!
		conquista = true;
	}
}
