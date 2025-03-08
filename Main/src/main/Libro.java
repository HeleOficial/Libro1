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

public class Libro {

    private String autor;
    private String titulo;
    private int numEjemplares;
    private int numEjemplaresPrestados;

    public Libro(String autor, String titulo, int numEjemplares, int numEjemplaresPrestados) {
        this.autor = autor;
        this.titulo = titulo;
        this.numEjemplares = numEjemplares;
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    // Getters y setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    // Métodos de operación
    public boolean prestamo() {
        if (numEjemplaresPrestados < numEjemplares) {
            numEjemplaresPrestados++;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolucion() {
        if (numEjemplaresPrestados > 0) {
            numEjemplaresPrestados--;
            return true;
        } else {
            return false;
        }
    }


    public void imprimirLibro() {
        System.out.println("Autor: " + autor);
        System.out.println("Título: " + titulo);
        System.out.println("Número de ejemplares: " + numEjemplares);
        System.out.println("Número de ejemplares prestados: " + numEjemplaresPrestados);
    }
}
