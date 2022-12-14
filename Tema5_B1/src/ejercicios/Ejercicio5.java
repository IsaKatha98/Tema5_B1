package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	
		//Creamos un array de longitud 10.
		double numReales []= new double [10];
	
		//Creamos un escáner.
		Scanner sc =new Scanner (System.in);
				
		//Creamos el bucle donde se piden y se guardan los datos.
		for (int i=0; i<numReales.length; i++) {
					
			System.out.println("Introduzca un número: ");
					
			//Creamos la tabla.
			numReales [i]=sc.nextDouble();
					
		}
		
		//Creamos las varaiables máximo y mínimo.
		double max = numReales[0];
		double min= numReales [0];
				
		//Creamos un bucle donde imprimimos los valores de la tabla.
		for (double valor : numReales ) {
			
			if (valor>max) {
				max=valor;
			}
			
		}
		
		//Imprimimos los valores máximo y mínimo.
		System.out.println("El valor máximo introducido es: " +max);
		System.out.println("El valor mínimo introducido es: "+min);
		
		
				
		//Cerramos el escáner.
		sc.close();
		
	}

}
