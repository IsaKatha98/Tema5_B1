package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
	
		//Creamos un array de tamaño 12.
				int tempMeses []= new int [12];
						
				//Creamos un escáner.
				Scanner sc =new Scanner (System.in);
								
				//Creamos el bucle donde se piden y se guardan los datos.
				for (int i=0; i<tempMeses.length; i++) {
									
					System.out.println("Introduzca la temperatura media del mes correspondiente: ");
									
					//Creamos la tabla.
					tempMeses [i]=sc.nextInt();
									
				}
				//Creamos un bucle que recorra la tabla e imprima tantos asteriscos por número que haya.
				for (int valor: tempMeses) {
					
					for (int i=0; i<valor; i++) {
						System.out.print("*");
					}
					
					System.out.println(" ");
				}

	}

}
