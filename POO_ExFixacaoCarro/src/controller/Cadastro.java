package controller;

import model.Carro;

public class Cadastro {

	public static void main(String[] args) {
		
		Carro c1 = new Carro(); //método construtor simples
		c1.setFabricante("Fiat");
		c1.setModelo("Uno Mille");
		c1.setAno(2010);
		c1.setMotorLigado(false);
		c1.setVelocidade(0);
		
		Carro c2 = new Carro("Chevrolet", "Corsa", 2013, true, 50);
		
		Carro c3 = new Carro("Ford", "Ka Sedan", 2017);
		
		c1.detalhes();
		String texto = c1.situacaoMotor();
		System.out.println(texto);
		System.out.println(c1.ligarMotor());
		System.out.println(c1.situacaoMotor());
		System.out.println(c1.desligarMotor());
		System.out.println(c1.acelerar(30));
		
		c2.detalhes();
		System.out.println(c2.situacaoMotor());
		System.out.println(c2.ligarMotor());
		System.out.println(c2.desligarMotor());
		System.out.println(c2.acelerar(30));
		
		c3.detalhes();
		System.out.println(c3.situacaoMotor());
		//System.out.println(c3.ligarMotor());
		System.out.println(c3.desligarMotor());
		System.out.println(c3.situacaoMotor());
		System.out.println(c3.acelerar(30));

//		System.out.println("--- Carro 1 ---");
//		System.out.println("Fabricante: " + c1.getFabricante());
//		System.out.println("Modelo: " + c1.getModelo());
//		System.out.println("Ano: " + c1.getAno());
//		System.out.println("Motor Ligado? " + c1.isMotorLigado());
//		System.out.println("Velocidade: " + c1.getVelocidade());
		
		
//		System.out.println("\n--- Carro 2 ---");
//		System.out.println("Fabricante: " + c2.getFabricante());
//		System.out.println("Modelo: " + c2.getModelo());
//		System.out.println("Ano: " + c2.getAno());
//		System.out.println("Motor Ligado? " + c2.isMotorLigado());
//		System.out.println("Velocidade: " + c2.getVelocidade());
		
		
//		System.out.println("\n--- Carro 3 ---");
//		System.out.println("Fabricante: " + c3.getFabricante());
//		System.out.println("Modelo: " + c3.getModelo());
//		System.out.println("Ano: " + c3.getAno());
//		System.out.println("Motor Ligado? " + c3.isMotorLigado());
//		System.out.println("Velocidade: " + c3.getVelocidade());
		
		//System.out.println();
		//System.out.println(c1);
		//System.out.println(c2);
		//System.out.println(c3);

	}

}
