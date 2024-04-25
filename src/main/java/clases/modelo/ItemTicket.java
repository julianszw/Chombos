package clases.modelo;

import algoritmos.precio.AlgoritmoPrecio;

public class ItemTicket  {
    private ProductoComponent producto;
    private int cantidad;
    //private AlgoritmoPrecio algoritmoPrecioStrategy;

   /* private void setStrategy(AlgoritmoPrecio algoritmoPrecio) {
        algoritmoPrecioStrategy = algoritmoPrecio;
    }*/

    public float calcularSubtotal() {
       return algoritmoPrecioStrategy.calcularPrecioFinal(producto.calcularPrecio(AlgoritmoPrecio algoritmoPrclea));
    }

}
