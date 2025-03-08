/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author estudiante103
 */
public class Main {
    public static void main(String[] args) {
        // Crear un libro con: autor, título, ejemplares disponibles, ejemplares prestados
        Libro libro = new Libro("Miguel de Cervantes", "El Quijote", 10, 0);

        System.out.println("Información del libro:");
        libro.imprimirLibro();

        System.out.println("\nRealizando préstamo:");
        if (libro.prestamo()) {
            System.out.println("Préstamo realizado con éxito");
        } else {
            System.out.println("No se pudo realizar el préstamo");
        }

        System.out.println("\nEstado actualizado:");
        libro.imprimirLibro();

        System.out.println("\nRealizando devolución:");
        if (libro.devolucion()) {
            System.out.println("Devolución realizada con éxito");
        } else {
            System.out.println("No se pudo realizar la devolución");
        }

        System.out.println("\nEstado final:");
        libro.imprimirLibro();
    }
}
