package Ejercicios_Repaso;

import java.util.Scanner;

public class Ejercicio_2 {

	public static Scanner leer=new Scanner(System.in);
	
	public static void main(String[] args) {
		// Suma de todos los numeros del 1-100 inclusives

		int suma=0;
		
			
		for(int i=1;i<101;i++) {
			suma=suma+i;
			
		}
		System.out.println(suma);
		
	}

}
