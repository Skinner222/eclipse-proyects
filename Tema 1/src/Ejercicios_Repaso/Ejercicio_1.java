package Ejercicios_Repaso;

import java.util.Scanner;

public class Ejercicio_1 {

	public static Scanner leer=new Scanner(System.in);
	
	public static void main(String[] args) {
		// Factorial de un numero.
		
		
		int result=1;
		
		System.out.print("Introduce un numero: ");
		int numero=leer.nextInt();
		
		for(int i=numero;i>0;i--){
			
			result=result*i;
			
		}
		
		System.out.print(result);
		
	}

}
