package ejercicios;

public class Ejercicio4 {
	
	public static void main (String [] args) {
	
	//Creamos el array de tamaño 12.
	int tabla [] = new int[12]; 
	
	//Asignamos valores a las posiciones indicadas.
	tabla [0] = 39;
	tabla [1] = -2;
	tabla [4] = 0;
	tabla [6] = 14;
	tabla [8] = 5;
	tabla [9] = 120;
	
	//Imprimimos la tabla.
	for ( int valor : tabla) {
		
		System.out.print(valor+" ");
	}

 }

}
