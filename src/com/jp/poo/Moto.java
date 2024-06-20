package com.jp.poo;

public class Moto extends Vehiculos {

	//constructor 
	public Moto(String marca, String modelo) {
		super(marca, modelo);
	}

	@Override
	public void conducir() {
		System.out.println("Estoy conduciendo una motocicleta " + getMarca() + "  modelo " + getModelo());
	}

}
