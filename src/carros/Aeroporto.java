/**
 * Atividade Avião
 */
package carros;

/**
 * @author Gustavo Rene
 *
 */
public class Aeroporto extends Avião {

	/**
	 * 
	 */
	public static void main(String[] args) {
		// Avião
		Aeroporto aviaol = new Aeroporto();
		aviaol.ano = 1999;
		aviaol.cor = "Azul";
		aviaol.envergadura = 60.9;
		System.out.println("Cor Do Avião: " + aviaol.cor);
		System.out.println("Ano Do Avião: " + aviaol.ano);
		System.out.println("Envergadura Do Avião: " + aviaol.envergadura +"m");
		aviaol.ligar();
		aviaol.acelerar();
		aviaol.pousar();
	}
}