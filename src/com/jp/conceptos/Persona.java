package com.jp.conceptos;

public class Persona {
	
	//constructor inicializador
	
	//por defecto agrega un constructor vacio
	
	//constructor vacio
	public Persona() {
		
	}
	
	//constructor utilizando las propiedades
	public Persona(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	//propiedades
	private Integer id;
	private String nombre;
	
	//encapsulamiento
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//metodos
	public void saludo() {
		System.out.println("Hola  " + getNombre());
	}
	
	
}
