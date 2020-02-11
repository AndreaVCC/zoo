package Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*d
		Acuaticos acuatico1 = new Acuaticos("Delfin", "Chile", "23-01-1994", "Mar", 3, 3);
		Terrestres terrestre1 = new Terrestres("Perro", "Italia", "04-11-2019", 4, "Pienso", 12);
		Voladores volador1 = new Voladores("Paloma", "Perú", "12-02-1980", "Blanca", "Pequeño", true);
		*/
		
		
		//CREANDO LISTA DE ACUATICOS
		
		String salir;
		
		do {
			Scanner sc = new Scanner (System.in);
			System.out.println("¿Quieres agregar un animal Acuatico? 	S   |  N");
			salir = sc.nextLine();
			
				
					
					Acuaticos animalActual = new Acuaticos();

					
					//Ingresar datos de animal acuatico
					System.out.println("Ingrese nombre: ");
					animalActual.setNombre(sc.nextLine());
					System.out.println("Ingrese Pais de origen: ");
					animalActual.setPaisOrigen(sc.nextLine());
					System.out.println("Ingrese Fecha de ingreso: ");
					animalActual.setFechaIngreso(sc.nextLine());
					System.out.println("Ingrese tipo de ambiente: D.(dulce) | S.(Salado) ");
					animalActual.setTipoAmbiente(sc.nextLine());
					System.out.println("Ingrese número de aletas: 1 | 2 | 3 | 4 | 5");
					animalActual.setNumeroAletas(sc.nextInt());
					System.out.println("Ingrese nivel de agresividad: 1.(bajo)	| 2.(medio) | 3.(Alto)");
					animalActual.setNivelAgresividad(sc.nextInt());
					

					//System.out.println(animalActual);

					Zoologico zooAcuatico = new Zoologico();
							
					zooAcuatico.agregarAcuaticos(animalActual);
					
					zooAcuatico.mostrarAcuaticos();
				
			
		} while (salir.equals("S"));
		
		
		
	

		
		
		/*
		Zoologico zoo = new Zoologico();
		
		
		
		zoo.addAnimal(acuatico1);
		zoo.addAnimal(terrestre1);
		zoo.addAnimal(volador1);
		zoo.mostrarAnimales();
		*/
	}

	
	
}
