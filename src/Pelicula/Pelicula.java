package Pelicula;

public class Pelicula {
	
	String nombre;
	
	int fechaDeLanzamiento;
	
	int duracionEnMinutos;
	
	boolean incluidoEnElPlan;
	
	double sumaDeLasEvaluaciones;
	
	void nuestraFichaTecnica() {
		 System.out.println("El nombre de la pelicula es: " + nombre);
		 System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
		 System.out.println("Duración en minutos: " + duracionEnMinutos);
	}
		 
	void evalua(double nota) {
		sumaDeLasEvaluaciones += nota;

	}

}
