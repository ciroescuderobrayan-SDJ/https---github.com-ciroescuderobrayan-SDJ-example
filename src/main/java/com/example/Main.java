package com.example;

import com.example.Inventory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // init Inventory
        Inventory inventory = new Inventory();
        // Exercise #1: count total items to inventory
        inventory.countItems();
        // Exercise #2: add item to inventory
        inventory.addItems();
        // Exercise #3: update item in inventory
        inventory.updateItem();
        // Exercise #4: calculate total inventory
        inventory.totalItems();
        // Exercise #5: show inventory items
        inventory.showItems();
    }
}