/**
 * POO - Fundamentos
 */
package minecraft;

/**
 * @author Gustavo Rene
 * Classe Modelo com Heran�a (extends)
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
	
	// M�todo
	/**
	 * M�todo usado para arar a terra
	 */
	void arar() {
		System.out.println("Terra preparada para o plantio");
		// Aten��o!
		conquista = true;
	}
}
