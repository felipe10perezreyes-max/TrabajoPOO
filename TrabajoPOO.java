package com.actividad.trabajopoo;

public class TrabajoPOO {
    public static void main(String[] args) {
        Fruta miFruta = new Fruta("Manzana", "Roja");

        System.out.println("--- DATOS DE LA FRUTA ---");
        System.out.println("Nombre: " + miFruta.getNombre());
        System.out.println("Color: " + miFruta.getColor());
    }
}
