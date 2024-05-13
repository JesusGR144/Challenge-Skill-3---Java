public class Pelicula {
    private static int contador = 1;
    private int id;
    private String nombre;
    private boolean disponible;

    // Constructor sin parametros
    public Pelicula() {
    }

    // Constructor con parametros - id incrementable
    public Pelicula(String nombre, boolean disponible) {
        this.id = contador++;
        this.nombre = nombre;
        this.disponible = disponible;
    }

    // Metodos getters y set
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}