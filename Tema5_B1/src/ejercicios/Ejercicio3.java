package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	
		//Declaramos el array con tamaño 5.
		double numeros []= new double [5];
		
		//Creamos un escáner.
		Scanner sc =new Scanner (System.in);
		
		//Creamos el bucle donde se piden y se guardan los datos.
		for (int i=0; i<numeros.length; i++) {
			
			System.out.println("Introduzca un número: ");
			
			//Creamos la tabla.
			numeros [i]=sc.nextDouble();
			
		}
		
		//Creamos un bucle donde imprimimos los valores de la tabla.
		for (double valor : numeros ) {
			
			System.out.println(valor);
		}
		
	//Cerramos el escáner.
	sc.close();

	}

}
