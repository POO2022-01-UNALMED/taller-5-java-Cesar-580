package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez () {
		super();
		Pez.listado.add(this);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero,String colorEscamas, int cantidadAletas) {
		
		// Para los atributos heredados desde Animal
		super(nombre,edad,habitad,genero);
		
		// Para los atributos de la clase Pez
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		
		// Para añadir el Pez a la colección
		Pez.listado.add(this);
		
	}
	
	//Métodos get y set
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	public void setColorEscamas(String colorEscamasNuevo) {
		this.colorEscamas = colorEscamasNuevo;
	}
	
	public int getCantidadAletas() {
		return this.cantidadAletas;
	}
	public void setCantidadAletas(int CantidadAletasNuevo) {
		this.cantidadAletas = CantidadAletasNuevo;
	}
	
	
	// Método get para la lista de Pez
	public static int cantidadPeces(){
		return this.listado.size();
	}
}
