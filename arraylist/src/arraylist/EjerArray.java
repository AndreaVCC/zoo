package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
	 
	public class EjerArray {
	    public static void main(String[] args) {
	        
	    	Scanner sc = new Scanner (System.in);
	    	
	    	ArrayList<Integer> numeros = new ArrayList<Integer>();
	    	
	    	int numTeclado;
	    	
			do {
	    		System.out.println("Introduce números enteros, usa 0 para acabar: ");
	            System.out.println("Numero: ");
	            numTeclado = sc.nextInt();
	            if (numTeclado != 0) {
					numeros.add(numTeclado);
				}
	            
			} while (numTeclado != 0);
			
			System.out.println(numeros);
			
		     //recorrido usando un iterador para mostrar un elemento por línea
	        Iterator it = numeros.iterator();
	        
	        while(it.hasNext())
	              System.out.println(it.next());
	        
	        //recorrido usando foreach para sumar los elementos
	        double suma = 0;
	        for(Integer i: numeros){
	            suma = suma + i;
	        }
	        System.out.println("Suma: " + suma);
	    	
	        
	    }
	}

