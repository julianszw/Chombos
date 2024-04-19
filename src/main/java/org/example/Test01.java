package org.example;

import clases.modelo.Producto;
import clases.modelo.ProductoComponent;
import clases.modelo.ProductoComposite;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<ProductoComponent> menuFinal = crearMenu();
        mostrarMenu(menuFinal);



    }

    private static void mostrarMenu(ArrayList<ProductoComponent> menuFinal) {
        for (ProductoComponent p : menuFinal) {
            System.out.println(p);
        }
    }

    private static ArrayList<ProductoComponent> crearMenu() {
        ArrayList<ProductoComponent> menu = new ArrayList<>();
        //Productos
        Producto hamburguesa = new Producto("Hamburguesa", 3500);
        Producto papas = new Producto("Papas", 1400);
        Producto gaseosa = new Producto("Gaseosa", 1200);
        Producto hamburguesaConQueso = new Producto("Hamburguesa con queso", 3900);
        Producto papasConChedar = new Producto("Papas con chedar", 1800);
        Producto agua = new Producto("Agua", 800);
        Producto hamburguesaDePollo = new Producto("Hamburguesa de pollo", 300);
        Producto ensalada = new Producto("Ensalada", 1500);
        Producto teDeTilo = new Producto("Té de tilo", 600);
        menu.add(hamburguesa);
        menu.add(papas);
        menu.add(gaseosa);
        menu.add(hamburguesaConQueso);
        menu.add(papasConChedar);
        menu.add(agua);
        menu.add(hamburguesaDePollo);
        menu.add(ensalada);
        menu.add(teDeTilo);
        //McChombos
        ProductoComposite mcChombo1 = new ProductoComposite("McChombo 1");
        ProductoComposite mcChombo2 = new ProductoComposite("McChombo 2");
        ProductoComposite mcChombo3 = new ProductoComposite("McChombo 3");
        mcChombo1.addComponent(hamburguesa);
        mcChombo1.addComponent(papas);
        mcChombo1.addComponent(gaseosa);
        mcChombo2.addComponent(hamburguesaConQueso);
        mcChombo2.addComponent(papasConChedar);
        mcChombo2.addComponent(agua);
        mcChombo3.addComponent(hamburguesaDePollo);
        mcChombo3.addComponent(ensalada);
        mcChombo3.addComponent(teDeTilo);
        menu.add(mcChombo1);
        menu.add(mcChombo2);
        menu.add(mcChombo3);
        //SuperMcChombos
        ProductoComposite superMcChombo1 = new ProductoComposite("SuperMcChombo 1");
        superMcChombo1.addComponent(mcChombo1);
        superMcChombo1.addComponent(mcChombo1);
        menu.add(superMcChombo1);
        //SuperRequeteMcChombos
        ProductoComposite superRequeteMcChombo1 = new ProductoComposite("SuperRequeteMcChombo1");
        superRequeteMcChombo1.addComponent(mcChombo1);
        superRequeteMcChombo1.addComponent(superMcChombo1);
        menu.add(superRequeteMcChombo1);
        //ítems promocionales
        Producto remeraAfa = new Producto("Remera AFA", 10000);
        ProductoComposite superMcChomboGol = new ProductoComposite("SuperMcChombo Gol");
        superMcChomboGol.addComponent(mcChombo1);
        superMcChomboGol.addComponent(mcChombo2);
        superMcChomboGol.addComponent(remeraAfa);
        return menu;
    }
}