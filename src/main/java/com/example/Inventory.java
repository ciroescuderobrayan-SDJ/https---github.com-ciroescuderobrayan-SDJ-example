package com.example; // Ruta de la clase

import java.util.Scanner; // Importa la clase Scanner para entrada de datos

//Public es que la clase sea accesible desde otras clases.
public class Inventory {

    private Scanner sc = new Scanner(System.in);

    private int[] items;
    
    // Exercise #1: count total items to inventory
    public void countItems() {
        System.out.print("Ingrese el numero de productos: ");
        int countProducts = sc.nextInt();
        this.items = new int[countProducts];
    }

    // Exercise #2: add item to inventory
    public void addItems() {
        System.out.print("Por favor ingrese los cantidades de los productos:\n ");
        for (int i = 0; i < items.length; i++) {
            System.out.print("Ingrese el cantidad del producto " + (i + 1) + ": ");
            items[i] = sc.nextInt();
        }
    }

    // Exercise #3: update item in inventory
    public void updateItem() {
        System.out.print("Ingrese el indice del producto a actualizar (1-" + items.length + "): ");
        int index = sc.nextInt() - 1;
        System.out.print("Ingrese la nueva cantidad del producto: ");
        int newQuantity = sc.nextInt();
        if (index >= 0 && index < items.length) {
            items[index] = newQuantity;
        } else {
            System.out.println("Indice invalido.");
        }
    }

    // Exercise #4: calculate total inventory
    public void totalItems() {   
        int total = 0;
        for (int i = 0; i < items.length; i++) {
            total += items[i];
        }
        System.out.println("Cantidad total de productos en inventario: " + total);
    }

    // Exercise #5: show inventory items
    public void showItems() {  
        System.out.println("Inventario de productos:");
        for (int i = 0; i < items.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + items[i]);
        }
    }
}
