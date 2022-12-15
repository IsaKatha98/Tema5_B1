package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//Creamos un array de tamaño 10.
		int numEnt []= new int [10];
				
		//Creamos un escáner.
		Scanner sc =new Scanner (System.in);
						
		//Creamos el bucle donde se piden y se guardan los datos.
		for (int i=0; i<numEnt.length; i++) {
							
			System.out.println("Introduzca un número: ");
							
			//Creamos la tabla.
			numEnt [i]=sc.nextInt();
							
		}
				
		//Ahora hacemos un bucle que recorra la tabla y la imprima a la inversa.
		for (int i=numEnt.length-1; i>0; i--) {
			
			System.out.println(i);
	
		}
	
	//Cerramos el escáner.
	sc.close();
	}

}
