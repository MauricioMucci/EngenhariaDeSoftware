package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class ListaDeTriangulosTest {
    
    @Test
    public void casoListaVazia() {
        ArrayList<Triangulo> lt =  new ArrayList<>();
        ListaDeTriangulos lista = new ListaDeTriangulos(lt);
        Assertions.assertFalse(lista.containsApenasTriangulo());
    }
    
    @Test
    public void casoContemApenasTriangulos() {
        ArrayList<Triangulo> lt =  new ArrayList<>();
        lt.add(new Triangulo(1, 1, 1));
        lt.add(new Triangulo(5, 5, 6));
        lt.add(new Triangulo(3, 4, 5));
        ListaDeTriangulos lista = new ListaDeTriangulos(lt);
        Assertions.assertTrue(lista.containsApenasTriangulo());
    }
    
    @Test
    public void casoContemNotTriangulo() {
        ArrayList<Triangulo> lt =  new ArrayList<>();
        lt.add(new Triangulo(1, 1, 1));
        lt.add(new Triangulo(5, 5, 6));
        lt.add(new Triangulo(3, 4, 5));
        lt.add(new Triangulo(3, 4, 8));
        ListaDeTriangulos lista = new ListaDeTriangulos(lt);
        Assertions.assertFalse(lista.containsApenasTriangulo());
    }
    
}
