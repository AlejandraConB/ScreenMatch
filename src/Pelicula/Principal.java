package Pelicula;

public class Principal {
	 public static void main(String[] args) {
		 Pelicula miPelicula = new Pelicula(); /*Pelicula es como el propio tipo de dato que acabamos de crear y le damos
		 el nombre miPelicula, como lo hacemos en cualquier tipo de variable. New significa que está creando una nueva instancia.
		 La memoria guarda un espacio para ese objeto */
		 miPelicula.nombre = "Encanto";
		 miPelicula.fechaDeLanzamiento = 2021;
		 miPelicula.duracionEnMinutos = 120;
		 
		 miPelicula.nuestraFichaTecnica();
	
		 miPelicula.evalua(7.8);
		 miPelicula.evalua(10);
		 
		 System.out.println(miPelicula.sumaDeLasEvaluaciones);
		 
		 Pelicula otraPelicula = new Pelicula();
		 otraPelicula.nombre = "Matrix";
		 otraPelicula.fechaDeLanzamiento = 1998;
		 otraPelicula.duracionEnMinutos = 180;
		 
		 otraPelicula.nuestraFichaTecnica();

	 }
}
