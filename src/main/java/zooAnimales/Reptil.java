package test;
import java.util.ArrayList;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		super();
		Reptil.listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero,String colorEscamas, int largoCola) {
		
		// Para atributos heredados
		super(nombre,edad,habitat,genero);
		
		// Para atributos de la clase
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		
		// Para agregar a la lista de Reptiles cuando este se cree
		Reptil.listado.add(this);
	}
	
	//Métodos get y set
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	public void setColorEscamas(String colorEscamasNuevo) {
		this.colorEscamas = colorEscamasNuevo;
	}
	
	public int getLargoCola() {
		return this.largoCola;
	}
	public void setLargoCola(int largoColaNuevo) {
		this.largoCola = largoColaNuevo;
	}
	
	
	// Método get para la lista de Reptiles
	public static ArrayList<Reptil> cantidadReptiles(){
		return this.listado.size();
	}
	
}
