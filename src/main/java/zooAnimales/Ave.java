package zooAnimales;
import java.util.ArrayList;


public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones; 
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(){
		super();
		Ave.listado.add(this);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, int halcones, int aguilas, String colorPlumas) {
		
		// Atributos que son heredados
		super(nombre,edad,habitat,genero);
		
		// Atributos nuevos en la clase Mamifero
		this.colorPlumas = colorPlumas;
		
		// Cuando se crea el Mamifero se espera que se a�ada al listado
		Ave.listado.add(this);
	}

	// M�todos get y set para los atributos normales de Ave
	public String getColorPlumas() {
		return this.pelaje;
	}
	public void setColorPlumas(String colorPlumasNuevo) {
		this.colorPlumas = colorPlumasNuevo;
	}

	
	// M�todo get para la lista de Aves
	public static int cantidadAves(){
		return this.listado.size();
	}
	
}
