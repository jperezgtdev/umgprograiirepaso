package com.jp.poo;

public class Main {

	public static void main(String[] args) {
		Vehiculos miCarro = new Carro("Honda", "CRV", "Cafe Oscuro");
		Vehiculos miMoto = new Moto("Honda", "Shine");
		
		miCarro.conducir();
		miMoto.conducir();
	}

}
