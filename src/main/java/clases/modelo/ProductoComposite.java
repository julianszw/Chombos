package clases.modelo;

import algoritmos.precio.AlgoritmoPrecio;
import algoritmos.precio.AlgoritmoPrecioA;
import algoritmos.precio.AlgoritmoPrecioC;

import java.util.ArrayList;

public class ProductoComposite extends ProductoComponent {
    private ArrayList<ProductoComponent> productoComponents;

    public ProductoComposite(String nombre) {
        super(nombre);
        productoComponents = new ArrayList<ProductoComponent>();
    }

    public void addComponent(ProductoComponent component) {
        this.productoComponents.add(component);
    }

    public ArrayList<ProductoComponent> getLista() {
        return productoComponents;
    }

    public void mostrar() {
        for (ProductoComponent p : productoComponents) {
            System.out.println(p);
        }
    }

    @Override
    public float calcularPrecio(AlgoritmoPrecio algoritmoPrecio) {
        float precioTotal = 0;
        for (ProductoComponent producto : productoComponents) {
            precioTotal += producto.calcularPrecio();
        }
        return algoritmoPrecio.calcularPrecioFinal(precioTotal);
    }

    @Override
    public String toString() {
        return super.getNombre() + " | " + this.getLista();
    }

}
