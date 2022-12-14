package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
	
		//Creamos un array de tamaño 0.
		int numEnt []= new int [8];
		
		//Creamos un escáner.
		Scanner sc =new Scanner (System.in);
				
		//Creamos el bucle donde se piden y se guardan los datos.
		for (int i=0; i<numEnt.length; i++) {
					
			System.out.println("Introduzca un número: ");
					
			//Creamos la tabla.
			numEnt [i]=sc.nextInt();
					
		}
		
		//Ahora hacemos un bucle que declara cada número como par o impar.
		for (int valor : numEnt) {
			
			if (valor%2!=0) {
				System.out.println(valor+" impar");
			}
			
			if (valor%2==0) {
				System.out.println(valor+ " par");
			}
			
		}
		
	//Cerrramos el escáner.
	sc.close();

	}

}
