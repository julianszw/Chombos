package model.classes;

import java.util.ArrayList;

public class ProductoComposite extends ProductoComponent {
    private String nombre;
    private ArrayList<ProductoComponent> productoComponents;

    public ProductoComposite(String nombre) {
        this.nombre = nombre;
        productoComponents = new ArrayList<ProductoComponent>();
    }

    public void addComponent(ProductoComponent component) {
        this.productoComponents.add(component);
    }

    public ArrayList<ProductoComponent> getLista() {
        return productoComponents;
    }

    @Override
    public float calcularPrecio() {
        float precioTotal = 0;
        for (ProductoComponent producto : productoComponents) {
            precioTotal += producto.calcularPrecio();
        }
        return (float) (precioTotal * 0.9);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
