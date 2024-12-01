package Pelicula;

public class Principal {
	 public static void main(String[] args) {
		 Pelicula miPelicula = new Pelicula(); /*Pelicula es como el propio tipo de dato que acabamos de crear y le damos
		 el nombre miPelicula, como lo hacemos en cualquier tipo de variable. New significa que está creando una nueva instancia.
		 La memoria guarda un espacio para ese objeto */
		 miPelicula.nombre = "Encanto";
		 miPelicula.fechaDeLanzamiento = 2021;
		 miPelicula.duracionEnMinutos = 120;
		 
		 System.out.println("Mi pelicula es: " + miPelicula.nombre);
		 System.out.println("Su fecha de lanzamiento es: " + miPelicula.fechaDeLanzamiento);
		 
		 Pelicula otraPelicula = new Pelicula();
		 otraPelicula.nombre = "Matrix";
		 otraPelicula.fechaDeLanzamiento = 1998;
		 otraPelicula.duracionEnMinutos = 180;
		 
		 System.out.println("Mi pelicula es: " + otraPelicula.nombre);
		 System.out.println("Su fecha de lanzamiento es: " + otraPelicula.fechaDeLanzamiento);

	 }
}
