/**
 * Atividade Avi�o
 */
package carros;

/**
 * @author Gustavo Rene
 *
 */
public class Aeroporto extends Avi�o {

	/**
	 * 
	 */
	public static void main(String[] args) {
		// Avi�o
		Aeroporto aviaol = new Aeroporto();
		aviaol.ano = 1999;
		aviaol.cor = "Azul";
		aviaol.envergadura = 60.9;
		System.out.println("Cor Do Avi�o: " + aviaol.cor);
		System.out.println("Ano Do Avi�o: " + aviaol.ano);
		System.out.println("Envergadura Do Avi�o: " + aviaol.envergadura +"m");
		aviaol.ligar();
		aviaol.acelerar();
		aviaol.pousar();
	}
}