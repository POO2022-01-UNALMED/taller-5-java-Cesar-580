package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;


public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona = new ArrayList<Zona>();
	
	
	//Construnctor vacio para que las herencias puedan trabajar sobre el
	public Animal() {
		
	}
	
	public Animal (String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitad;
		this.genero = genero;
		
		// Se aumenta en uno cuando se crea un animal
		Animal.totalAnimales += 1;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public String getHabitat() {
		return this.habitat;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public int getTotalAnimales() {
		return Animal.totalAnimales;
	}
	
	public String totalPorTipo() {
		return "Mamiferos: "+ Mamifero.cantidadMamiferos() +
				"\nAves: " + Ave.cantidadAves() + 
				"\nReptiles: " + Reptil.cantidadReptiles() +
				"\nPeces: " + Pez.cantidadPeces() +
				"\nAnfibios: " + Anfibio.cantidadAnfibios();
	}
	
	public String toString() {
		if(this.zona == null) {
			return "Mi nombre es " + this.getNombre() + ", tengo una edad de " + this.getEdad() + ", habito en " + this.getHabitat() + "y mi genero es" + this.getGenero() ;
		}else {
			return "Mi nombre es " + this.getNombre() + ", tengo una edad de " + this.getEdad() + ", habito en " + this.getHabitat() + "y mi genero es" + this.getGenero() + ", la zona en la que me ubico es " + this.zona.getZoo();
		}
	}
	
	
}
