package zooAnimales;

import gestion.Zona;


import java.util.ArrayList;
import java.util.List;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private List<Zona> zona = new ArrayList<>();

	public Animal(String nombre, int edad, String habitat, String genero) {
		totalAnimales ++;
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;
	}

	public Animal() {
		totalAnimales ++;
		this.nombre=null;
		this.edad=0;
		this.habitat=null;
		this.genero=null;
	}

	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public String getNombre() {
		return (this.nombre);
	}

	public void setEdad(int edad) {
		this.edad=edad;
	}

	public int getEdad() {
		return (this.edad);
	}

	public void setHabitat(String habitat) {
		this.habitat=habitat;
	}

	public String getHabitat() {
		return (this.habitat);
	}

	public void setGenero(String genero) {
		this.genero=genero;
	}

	public String getGenero() {
		return (this.genero);
	}

	public void agregarZona(Zona zona) {
		this.zona.add(zona);
	}

	public static String totalPorTipo() {
		return("Mamiferos: " + (Mamifero.cantidadMamiferos()) + "\n" + "Aves: " + (Ave.cantidadAves())) + "\n" + "Reptiles: " + (Reptil.cantidadReptiles())+"\n" +"Peces: " + (Pez.cantidadPeces())+"\n"+ "Anfibios: " + (Anfibio.cantidadAnfibios());
	}


	public String toString() {
		if (this.zona.size()<1) {
			System.out.println("Mi nombre es " + this.getNombre() + ", tengo una edad de " + this.getEdad() + ", habito en " + this.getHabitat() + "y mi genero es " + this.getGenero());
			return("Mi nombre es " + this.getNombre() + ", tengo una edad de " + this.getEdad() + ", habito en " + this.getHabitat() + " y mi genero es " + this.getGenero());
		}
		else {
			String nombreZona=null;
			String nombreZoo=null;
			for(Zona zona:this.zona) {
				nombreZona=zona.getNombre();
				Zoologico zoo=zona.getZoo();
				nombreZoo= zoo.getNombre();
			}
			System.out.println("Mi nombre es " + this.getNombre() + ", tengo una edad de " + this.getEdad() + ", habito en " + this.getHabitat() + " y mi genero es " + this.getGenero() + " la zona en la que me ubico es " + nombreZona + ", en el " + nombreZoo);
			return ("Mi nombre es " + this.getNombre() + ", tengo una edad de " + this.getEdad() + ", habito en " + this.getHabitat() + " y mi genero es " + this.getGenero() + " la zona en la que me ubico es " + nombreZona + ", en el " + nombreZoo);
		}
	}

	public String movimiento() {
		return ("desplazarse");
	}
}