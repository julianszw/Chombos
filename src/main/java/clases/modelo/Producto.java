package model.classes;

public class Producto extends ProductoComponent {
    private float precio;
    private String nombre;

    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    float calcularPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
