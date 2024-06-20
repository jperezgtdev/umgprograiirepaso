package com.jp.conceptos;

public class Matematica {

	public Integer dividir(Integer a, Integer b) {
		//control de excepciones
		try {
			return a / b;
		} catch (ArithmeticException e) {// Excepcion personalizada
			System.out.println("Error al momento de dividir, no es posible dividir entre cero.");
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
