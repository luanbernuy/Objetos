/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arq;

/**
 *
 * @author ASUS ROG
 */
public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-0307474728");
        Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry", "978-0156013925");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        System.out.println(libro1.prestar());
        System.out.println(libro1.prestar());
        System.out.println(libro1.devolver());

        Libro libroEncontrado = biblioteca.buscarLibro("978-0156013925");
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado: " + libroEncontrado.getTitulo());
        } else {
            System.out.println("Libro no encontrado en la biblioteca.");
        }
    }
}
