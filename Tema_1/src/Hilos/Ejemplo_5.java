package Hilos;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Ejemplo_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<ProcessBuilder> tuberia=List.of(new ProcessBuilder("cat","/home/lubuntu/Desktop/ficheros/iris.data.txt"),
				new ProcessBuilder("cut","-d",",","-f","5"),
				new ProcessBuilder("uniq","-c").redirectOutput(new File("/home/lubuntu/Desktop/ficheros/resumen.txt")));
		
	try {
		List<Process> proceso=ProcessBuilder.startPipeline(tuberia);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
