package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona (String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	// M�todos get y set para nombre
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// M�todos get y set para ubicaci�n
	public Zoologico getZoo() {
		return this.zoo;
	}
	
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	
	//M�todo agregar animal
	public void agregarAnimales(Animal newAnimal){
		this.animales.add(newAnimal);		
	}
	
	// Cantidad de animales
	
	public int cantidadAnimales() {
		return this.animales.size();
	}
	
}
