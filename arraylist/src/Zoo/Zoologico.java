package Zoo;

import java.util.ArrayList;

public class Zoologico {
	
	
	//ACUATICOS
	private ArrayList<Acuaticos> listaAcuaticos = new ArrayList<Acuaticos>();
	
	public void agregarAcuaticos (Acuaticos ac) {
		listaAcuaticos.add(ac);
	}
	
	public void mostrarAcuaticos () {
		for (Acuaticos indice : listaAcuaticos) {
			System.out.println(indice.toString());
		}
	}
	
	
	
	

	//Se crea un arraylist de tipo Animales llamada lanimales
	private ArrayList<Animales> lanimales = new ArrayList<Animales>();
	
	//Metodo para agregar elementos ani de tipo Animales a la lista lanimales
	public void addAnimal(Animales ani) {
		lanimales.add(ani);
	}
	
	//metodo mostrar, se recorre con foreach los elementos de tipo Animales en la lista lanimales
	public void mostrarAnimales () {
		for (Animales ani:lanimales) {
			System.out.println(ani.toString());
		}
	}
	
}