package Ejercicios_Repaso;

import java.util.Scanner;

import org.apache.log4j.Logger;

import Ejercicios_Repaso_Clases.Ejercicio3_Main;

public class Ejercicio_1 {

	public static Scanner leer=new Scanner(System.in);
	static Logger log=Logger.getLogger(Ejercicio_1.class);
	
	public static void main(String[] args) {
		// Factorial de un numero.
		
		
		int result=1;
		
		System.out.print("Introduce un numero: ");
		int numero=leer.nextInt();
		log.info("Estoy aqui");
		for(int i=numero;i>0;i--){
			
			result=result*i;

		}
		
		System.out.print(result);
		
	}

}
