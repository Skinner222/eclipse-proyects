package Hilos;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos la tuberia.
		List<ProcessBuilder>tuberia=List.of(
				new ProcessBuilder("cat","/home/lubuntu/Desktop/ficheros/usuarios"),
				new ProcessBuilder("cut","-d",":","-f","4-5"),
				new ProcessBuilder("tr","-s", ":"," ").redirectOutput(new File("/home/lubuntu/Desktop/ficheros/"
						+ "salidaEjercicio_7.txt")));
			
		try {
			List<Process> proceso= ProcessBuilder.startPipeline(tuberia);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
