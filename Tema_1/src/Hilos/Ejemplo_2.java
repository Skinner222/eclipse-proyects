package Hilos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



public class Ejemplo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtime rutina=Runtime.getRuntime();
		
		System.out.println("Numero de procesadores del sistema: "+rutina.availableProcessors());
		System.out.println("Memoria total: "+rutina.totalMemory());
		System.out.println("Memoria total: "+rutina.freeMemory());
		System.out.println("Memoria ocupada: "+(rutina.totalMemory()-rutina.freeMemory()));
		
		String comando="ls_realise -a";
		
		Process proceso;
		
		try {
			proceso=rutina.exec(comando);
			InputStream is=proceso.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			
			//Lo mandamos a un fichero.
			BufferedWriter bw=new BufferedWriter(new FileWriter(new File("/home/lubuntu/Desktop/salida.txt")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
