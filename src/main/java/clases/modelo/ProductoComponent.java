package clases.modelo;

//aka Component
public abstract class ProductoComponent {
    private String nombre;

    public ProductoComponent(String nombre) {
        this.nombre = nombre;
    }

    abstract float calcularPrecio();
    public String getNombre() {
        return nombre;
    }



}
