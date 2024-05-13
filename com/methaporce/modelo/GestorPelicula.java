import java.util.ArrayList;
import java.util.List;

public class GestorPelicula {
    private List<Pelicula> listaPeliculas;

    GestorPelicula() {
        this.listaPeliculas = new ArrayList<>();
    }

    // Metodo para agregar pelicula
    void AgregarPelicula(Pelicula pelicula) {
        listaPeliculas.add(pelicula);
    }

    // Metodo para eliminar pelicula por id
    void EliminarPelicula(int id) {
        listaPeliculas.removeIf(p -> p.getId() == id);
    }

    // Metodo para obtener todas las peliculas
    public List<Pelicula> ObtenerPeliculas() {
        System.out.println("Todas las películas");
        for (Pelicula p : listaPeliculas) {
            System.out.println(p.getNombre());
        }
        return listaPeliculas;
    }

    // Metodo para obtener las peliculas disponibles
    public List<Pelicula> ObtenerPeliculasDisponibles() {
        List<Pelicula> disponibles = new ArrayList<>();
        System.out.println("Películas Disponibles");        
        for (Pelicula p : listaPeliculas) {
            if (p.getDisponible()) {
                disponibles.add(p);
                System.out.println("Id: "+p.getId()+"\nNombre: "+p.getNombre());                                
            }
        }
        return disponibles;
    }

    // Metodo para obtener las peliculas no disponibles
    public List<Pelicula> ObtenerPeliculasNoDisponibles() {
        List<Pelicula> noDisponibles = new ArrayList<>();
        System.out.println("Películas No Disponibles");        
        for (Pelicula p : listaPeliculas) {
            if (!p.getDisponible()) {
                noDisponibles.add(p);
                System.out.println("Id: "+p.getId()+"\nNombre: "+p.getNombre());
            }
        }
        return noDisponibles;
    }

    // Metodo para marcar disponibilidad de peliculas por id
    void MarcarPeliculaComoDisponible(int id) {
        for (Pelicula p : listaPeliculas) {
            if (p.getId() == id) {
                p.setDisponible(true);
                break;
            }
        }
    }
}
