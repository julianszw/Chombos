package clases.modelo;

import algoritmos.precio.AlgoritmoPrecioA;

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
    public float calcularPrecio() {
        float precioTotal = 0;
        for (ProductoComponent producto : productoComponents) {
            precioTotal += producto.calcularPrecio();
        }
        return AlgoritmoPrecioA.calcularPrecioFinal(precioTotal);
    }

    @Override
    public String toString() {
        return super.getNombre() + " | " + this.getLista();
    }

}
