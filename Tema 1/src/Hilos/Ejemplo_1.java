package Hilos;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Ejemplo_1 {

	public static void main(String[] args) {
		
		Runtime r=Runtime.getRuntime();
		String comando="firefox";
		Process p;
		try {
			p=r.exec(comando);
			p.waitFor(5,TimeUnit.SECONDS);
			p.destroy();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
