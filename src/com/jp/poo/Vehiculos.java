package com.jp.poo;

public abstract class Vehiculos {
	private String marca;
	private String modelo;
	
	//constructor
	public Vehiculos(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	//encapsulación
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public abstract void conducir();
	
}
