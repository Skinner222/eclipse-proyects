package Ejercicios_Repaso_Clases;

public class Alumno {

	private Asignatura asig1;
	private Asignatura asig2;
	private Asignatura asig3;
	
	public Alumno(Asignatura a1, Asignatura a2, Asignatura a3) {
		 this.asig1=a1;
		 this.asig2=a2;
		 this.asig3=a3;
	}
	
	public Alumno(int asig1, int asig2, int asig3) {
		this.asig1=new Asignatura(1);
		this.asig2=new Asignatura(2);
		this.asig3=new Asignatura(3);
	}
	
	
	public Asignatura getAsig1() {
		return asig1;
	}
	public void setAsig1(Asignatura asig1) {
		this.asig1 = asig1;
	}
	public Asignatura getAsig2() {
		return asig2;
	}
	public void setAsig2(Asignatura asig2) {
		this.asig2 = asig2;
	}
	public Asignatura getAsig3() {
		return asig3;
	}
	public void setAsig3(Asignatura asig3) {
		this.asig3 = asig3;
	}

		
}
