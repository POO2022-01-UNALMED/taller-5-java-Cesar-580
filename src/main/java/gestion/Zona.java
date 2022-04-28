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
	
	// Metodos get y set para nombre
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Metodos get y set para ubicacion
	public Zoologico getZoo() {
        return zoo;
    }
	
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	
	//Metodos agregar animal
	public void agregarAnimales(Animal newAnimal){
		this.animales.add(newAnimal);		
	}
	
	// Cantidad de animales
	
	public int cantidadAnimales() {
		return this.animales.size();
	}
	
}
