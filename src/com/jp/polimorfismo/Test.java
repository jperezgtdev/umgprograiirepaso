package com.jp.polimorfismo;

public class Test {

	public static void main(String[] args) {
		/*
		BaseMatematica areaCuadrado = new BaseMatematica(5);
		BaseMatematica areaRectangulo = new BaseMatematica(2, 3);
		
		System.out.println("Area de cuadrado: " + areaCuadrado.getResult());
		System.out.println("Area de rectangulo: " + areaRectangulo.getResult());*/
		
		System.out.println("Cuadrado: "+ Matematica.area(5));
		System.out.println("Rectangulo: " + Matematica.area(2, 3));
		System.out.println("Triangulo: " + Matematica.area(2, 3.0));

	}

}
