package com.jp.conceptos;

public class Main {

	public static void main(String[] args) {
		//Instancia
		/*
		Persona persona = new Persona();
		persona.setId(1);
		persona.setNombre("Jenner Pérez");
		persona.saludo();
		
		//las propiedades se llenan por constructor
		Persona otraPersona = new Persona(2, "Ernesto");
		otraPersona.saludo();*/
		
		Matematica matematica = new Matematica();
		Integer respuesta = matematica.dividir(6, 0);
		System.out.println(respuesta);

	}

}
