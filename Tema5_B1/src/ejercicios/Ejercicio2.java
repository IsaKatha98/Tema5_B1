package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Creamos el array de longitud 10.
		int numAleatorios []= new int [10];
		
		//Declaramos una variable suma.
		int suma=0;
				
		//Ahora creamos un bucle for que imprimirá la longitud del array relleno de números aleatorios.
		for (int i=0; i<numAleatorios.length; i++) {
					
			//Hacemos la cuenta de los números aleatorios entre 1 y 100.
			numAleatorios[i]=(int)(Math.random()*100+1);
			
			//Imprimimos el array.
			System.out.print(numAleatorios[i]+" ");	
		}
		
		//Luego hacemos otro bucle para la suma.
		for (int valor:numAleatorios) {
			
			suma+=valor;
		}
		
		//Imprimimos la variable suma.
		System.out.println("");
		System.out.println("La suma de los números presentados es: "+suma);
	}
	
}
