/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arq;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    private Map<String, Libro> catalogo;

    public Biblioteca() {
        catalogo = new HashMap<>();
    }

    public void agregarLibro(Libro libro) {
        catalogo.put(libro.getIsbn(), libro);
    }

    public Libro buscarLibro(String isbn) {
        return catalogo.getOrDefault(isbn, null);
    }
}
