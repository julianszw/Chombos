package algoritmos.precio;

public class AlgoritmoPrecioA {
    private static final double PONDERADOR_DESCUENTO = 0.9;

    public static float calcularPrecioFinal(float total) {
        return (float) (total * PONDERADOR_DESCUENTO);
    }


}
