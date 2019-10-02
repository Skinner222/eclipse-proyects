package Hilos;

import java.util.Scanner;

public class Ejercicio_6 {

	static Scanner leer=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//System.out.println("Introduce un numero: ");
		int numero=Integer.parseInt(args[0]);
		
		//System.out.println("Introduce otro numero: ");
		int numero2=Integer.parseInt(args[1]);
		
		int resta=numero-numero2;
		
		System.out.println("La diferencia ha sido: "+resta);
		
	}

}
