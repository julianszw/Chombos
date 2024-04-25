package clases.modelo;

import algoritmos.precio.AlgoritmoPrecio;

//aka Component
public abstract class ProductoComponent {
    private String nombre;

    public ProductoComponent(String nombre) {
        this.nombre = nombre;
    }

    abstract float calcularPrecio(AlgoritmoPrecio algoritmoPrecio);
    public String getNombre() {
        return nombre;
    }



}
