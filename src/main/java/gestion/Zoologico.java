package test;
import java.util.ArrayList;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico() {
		
	}
	
	public Zoologico (String nombre, String ubicacion){
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	// Métodos get y set para nombre
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Métodos get y set para ubicación
	public String getUbicacion() {
		return this.ubicacion;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	// Métodos get y set para zonas
	public ArrayList<Zona> getZonas() {
		return this.zonas;
	}
	
	public void agregarZonas(Zona newZona) {
		this.zonas.add(newZona);
	}
	
	public int cantidadTotalAnimales() {
		int numZonas = zonas.size();
		int cantTotAnimales = 0;
		
		for (int i = 0; i < numZonas;i++ ) {
			cantTotAnimales += zonas.get(i).cantidadAnimales();
		}
		return cantTotAnimales;
	}
	
}
