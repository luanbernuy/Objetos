/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arq;
public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public String prestar() {
        if (disponible) {
            disponible = false;
            return "El libro ha sido prestado.";
        } else {
            return "El libro no está disponible para préstamo.";
        }
    }

    public String devolver() {
        disponible = true;
        return "El libro ha sido devuelto.";
    }
}

