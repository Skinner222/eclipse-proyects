package Hilos;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ProcessBuilder> tuberia=null;
		
	for(int i=0;i<5;i++) {	
			tuberia=List.of(new ProcessBuilder("cat","/home/lubuntu/Desktop/ficheros/datos_ip_paises"),
			new ProcessBuilder("cut","-d",",","-f","2"),
			new ProcessBuilder("grep",args[i],"-c").redirectOutput(new File("/home/lubuntu/Desktop/"
					+ "salidaEjercicio_10.txt")));
	}
		try {
			List<Process> proceso=ProcessBuilder.startPipeline(tuberia);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
