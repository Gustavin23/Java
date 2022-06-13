/**
 * Atividade Carros
 */
package carros;

/**
 * @author Gustavo Rene
 *
 */
public class Veículos {

	/**
	 * Método Principal
	 * @param args
	 */
	public static void main(String[] args) {
		// Carro 1
		Carros carroAzul = new Carros();
		carroAzul.ano = 2002;
		carroAzul.cor = "Azul";
		carroAzul.modelo = "Fusca";
		System.out.println("Cor Do Carro: " + carroAzul.cor);
		System.out.println("Ano Do Carro: " + carroAzul.ano);
		System.out.println("Modelo Do Carro: " + carroAzul.modelo);
		carroAzul.ligar();
		carroAzul.acelerar();
		carroAzul.frear();
		carroAzul.desligar();
		// Carro 2
		Carros carroVermelho = new Carros();
		carroVermelho.ano = 2022;
		carroVermelho.cor = "Vermelho";
		carroVermelho.modelo = "Ferrari";
		System.out.println("Cor Do Carro: " + carroVermelho.cor);
		System.out.println("Ano Do Carro: " + carroVermelho.ano);
		System.out.println("Modelo Do Carro: " + carroVermelho.modelo);
		carroVermelho.ligar();
		carroVermelho.acelerar();
		carroVermelho.frear();
		carroVermelho.desligar();

	}

}
