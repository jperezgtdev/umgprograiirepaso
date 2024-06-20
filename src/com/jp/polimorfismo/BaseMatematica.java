package com.jp.polimorfismo;

public class BaseMatematica {

	private Integer numero1;
	private Integer numero2;
	private Integer result;

	// constructor
	public BaseMatematica() {

	}

	public BaseMatematica(Integer numero1) {// area de un cuadrado
		this.numero1 = numero1;
		this.result = numero1 * numero1;
	}
	
	public BaseMatematica(Integer numero1, Integer numero2) {//area de un rectangulo
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.result = numero1 * numero2;
	}

	public Integer getNumero1() {
		return numero1;
	}

	public void setNumero1(Integer numero1) {
		this.numero1 = numero1;
	}

	public Integer getNumero2() {
		return numero2;
	}

	public void setNumero2(Integer numero2) {
		this.numero2 = numero2;
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}

}
