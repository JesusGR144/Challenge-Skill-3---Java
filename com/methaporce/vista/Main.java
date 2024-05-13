import com.methaporce.modelo.GestorPelicula;
import com.methaporce.modelo.Pelicula;

public class Main {
    public static void main(String[] args) {
        // Instancia de la clase GestorPelicula
        GestorPelicula gestor = new GestorPelicula();

        // Creacion peliculas
        Pelicula peli1 = new Pelicula("Spiderman", false);
        Pelicula peli2 = new Pelicula("Avatar", true);
        Pelicula peli3 = new Pelicula("Dragon Ball", false);

        //Agregando las peliculas anteriormente creadas
        gestor.AgregarPelicula(peli1);
        gestor.AgregarPelicula(peli2);
        gestor.AgregarPelicula(peli3);

        //Eliminar pelicula por id
        // gestor.EliminarPelicula(3);

        //Obtener todas las peliculas
        // gestor.ObtenerPeliculas();
        
        //Marcar como disponible una pelicula mediante id
        gestor.MarcarPeliculaComoDisponible(1);

        //Peliculas disponibles
        gestor.ObtenerPeliculasDisponibles();

        //peliculas no disponibles
        gestor.ObtenerPeliculasNoDisponibles();
        
    }
}
