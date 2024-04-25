package clases.modelo;

import algoritmos.precio.AlgoritmoPrecio;

public class Producto extends ProductoComponent {
    private float precioUnitario;

    public Producto(String nombre, float precioUnitario) {
        super(nombre);
        this.precioUnitario = precioUnitario;
    }


    @Override
    float calcularPrecio(AlgoritmoPrecio algoritmoPrecio) {
        return precioUnitario;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }


}
