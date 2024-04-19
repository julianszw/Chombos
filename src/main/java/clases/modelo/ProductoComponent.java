package model.classes;

import java.util.List;

//aka Component
public abstract class ProductoComponent {
    private List<ProductoComponent> items;
    abstract float calcularPrecio();
}
