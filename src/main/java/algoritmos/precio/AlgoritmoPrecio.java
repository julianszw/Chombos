package algoritmos.precio;

public abstract class AlgoritmoPrecio {
    private static final double PONDERADOR_DESCUENTO = 0.9;

    abstract float calcularPrecioFinal(float subtotal);

}
