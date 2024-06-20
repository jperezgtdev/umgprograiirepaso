package com.jp.poo;

public class Carro extends Vehiculos {
	
	private String color;
	
	//constructor
	public Carro(String marca, String modelo, String color) {
		super(marca, modelo);//constructor de la clase padre
		this.color = color;
	}

	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void conducir() {
		System.out.println("Estoy conduciendo un carro " + getMarca() + " modelo " + getModelo() + " color " + getColor());
	}
}
