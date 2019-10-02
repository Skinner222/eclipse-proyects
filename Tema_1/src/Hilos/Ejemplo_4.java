package Hilos;

import java.io.File;
import java.io.IOException;

public class Ejemplo_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProcessBuilder pb=new ProcessBuilder("/bin/bash");
		
		pb.redirectOutput(new File("/home/lubuntu/Desktop/ficheros/salidaConsulta.txt"));
		pb.redirectInput(new File("/home/lubuntu/Desktop/ficheros/consulta.sh"));
		pb.redirectError(new File("/home/lubuntu/Desktop/ficheros/errorConsulta.sh"));
		
		try {
			Process p = pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
