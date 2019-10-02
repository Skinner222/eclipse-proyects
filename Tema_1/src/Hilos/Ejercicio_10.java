package Hilos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> comandos=new ArrayList<String>();
		String codigoPais="";
		Scanner leer=new Scanner(System.in);
		
		//for(int i=0;i<5;i++) {
			//Pedimos el codigo del pais.
			System.out.println("Introduce el codigo del pais: ");
			 codigoPais=leer.nextLine();

			 	comandos.add("java");
				comandos.add("Hilos.Ejercicio_9");
				comandos.add(codigoPais);
		//}
		
		

		ProcessBuilder pb=new ProcessBuilder(comandos);
		String directorio="/home/lubuntu/eclipse-proyects/Tema_1/bin";
		pb.directory(new File(directorio));
		pb.redirectOutput(new File("/home/lubuntu/Desktop/ficheros/salidaEjercicio_10.txt"));
		try {
			Process p=pb.start();
			/*Como la ejecucion anterior no muestra nada por pantalla lo que debemos hacer es
			 * capturar ese mensaje con la clase InputStream.*/
			InputStream is=p.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			
			String linea="";
			while((linea=br.readLine())!=null) {
				System.out.println(linea);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
