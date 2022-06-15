/**
 * Atividade Carros
 */
package carros;

import java.util.Random;

/**
 * @author Gustavo Rene
 *
 */
public class Veículos extends Carros {

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
		System.out.println("Chassi Do Carro: " + chassi.nextInt(99));
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
		System.out.println("Chassi Do Carro: " + chassi.nextInt(99));
		System.out.println("Cor Do Carro: " + carroVermelho.cor);
		System.out.println("Ano Do Carro: " + carroVermelho.ano);
		System.out.println("Modelo Do Carro: " + carroVermelho.modelo);
		carroVermelho.ligar();
		carroVermelho.acelerar();
		carroVermelho.frear();
		carroVermelho.desligar();
		// Carro 3
		Carros carroAmarelo = new Carros();
		carroAmarelo.ano = 2022;
		carroAmarelo.cor = "Vermelho";
		carroAmarelo.modelo = "Ferrari";
		System.out.println("Chassi Do Carro: " + chassi.nextInt(99));
		System.out.println("Cor Do Carro: " + carroAmarelo.cor);
		System.out.println("Ano Do Carro: " + carroAmarelo.ano);
		System.out.println("Modelo Do Carro: " + carroAmarelo.modelo);
		carroAmarelo.ligar();
		carroAmarelo.acelerar();
		carroAmarelo.frear();
		carroAmarelo.desligar();
		// Carro 4
		Carros carroBranco = new Carros();
		carroBranco.ano = 2022;
		carroBranco.cor = "Vermelho";
		carroBranco.modelo = "Ferrari";
		System.out.println("Chassi Do Carro: " + chassi.nextInt(99));
		System.out.println("Cor Do Carro: " + carroBranco.cor);
		System.out.println("Ano Do Carro: " + carroBranco.ano);
		System.out.println("Modelo Do Carro: " + carroBranco.modelo);
		carroBranco.ligar();
		carroBranco.acelerar();
		carroBranco.frear();
		carroBranco.desligar();

	}

}
