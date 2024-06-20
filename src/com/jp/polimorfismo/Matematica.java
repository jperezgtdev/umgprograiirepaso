package com.jp.polimorfismo;

public class Matematica {

	//area cuadrado
	public static double area(Integer base) {
		return base * base;
	}
	
	//area de rectangulo
	public static double area(Integer base, Integer altura) {
		return base * altura;
	}
	
	//area de triangulo
	public static double area(Integer base, Double altura) {
		return (base * altura) / 2;
	}
}
