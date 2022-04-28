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
		listado.add(this);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero,String colorEscamas, int cantidadAletas) {
		// Para los atributos heredados desde Animal
		super(nombre,edad,habitat,genero);
		// Para los atributos de la clase Pez
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		// Para anadir el Pez a la coleccion
		Pez.listado.add(this);
	}
	
	//Metodos get y set
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
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez nuevoSalmon = new Pez(nombre,edad,"oceano",genero,"rojo",6);
		salmones += 1;
		return nuevoSalmon;
	}
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez nuevoBacalao = new Pez(nombre,edad,"oceano",genero,"gris",6);
		bacalaos += 1;
		return nuevoBacalao;
	}
	// Metodos get para la lista de Pez
	public static int cantidadPeces(){
		return listado.size();
	}
	// Moverse
	public String movimiento() {
		return "nadar";
	}
	
}
