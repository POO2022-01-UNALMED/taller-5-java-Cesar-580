package zooAnimales;
import java.util.ArrayList;


public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	
	public Mamifero(){
		super();
		Mamifero.listado.add(this);
	}
	
	public Mamifero (String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		
		// Atributos que son heredados
		super(nombre,edad,habitat,genero);
		
		// Atributos nuevos en la clase Mamifero
		this.pelaje = pelaje;
		this.patas = patas;
		
		// Cuando se crea el Mamifero se espera que se anada al listado
		Mamifero.listado.add(this);
	}
	
	// Metodos get y set para los atributos normales de Mamifero
	public boolean getPelaje() {
		return this.pelaje;
	}
	public void setPelaje(boolean pelajeNuevo) {
		this.pelaje = pelajeNuevo;
	}
	
	public int getPatas() {
		return this.patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	// Metodos get para la lista de Mamiferos
	public static int cantidadMamiferos(){
		return listado.size();
	}
	
	
}
