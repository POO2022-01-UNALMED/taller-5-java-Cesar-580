package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		super();
		Anfibio.listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		
		// Para los atributos heredados de Animal
		super(nombre,edad,habitat,genero);
		
		// Para los atributos de la clase Anfibio
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		
		// Para anadirlo al listado general
		Anfibio.listado.add(this);
	}
	
	//Metodo get y set
	public String getColorPiel() {
		return this.colorPiel;
	}
	public void setColorPiel(String ColorPielNuevo) {
		this.colorPiel = ColorPielNuevo;
	}
		
	public boolean getVenenoso() {
		return this.venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	
	// Metodo get para la lista de Anfibio
	public static int cantidadAnfibios(){
		return listado.size();
	}
}

