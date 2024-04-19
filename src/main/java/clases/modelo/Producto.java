package clases.modelo;

public class Producto extends ProductoComponent {
    private float precioUnitario;

    public Producto(String nombre, float precioUnitario) {
        super(nombre);
        this.precioUnitario = precioUnitario;
    }



    @Override
    float calcularPrecio() {
        return precioUnitario;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
}
