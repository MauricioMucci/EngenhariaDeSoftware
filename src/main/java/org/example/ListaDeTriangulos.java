package org.example;

import java.util.ArrayList;

public class ListaDeTriangulos {
    private final ArrayList<Triangulo> listaDeTriangulos;
    
    public ListaDeTriangulos(ArrayList<Triangulo> listaDeTriangulos) {
        this.listaDeTriangulos = listaDeTriangulos;
    }
    
    public void addTriangulo(Triangulo t){
        this.listaDeTriangulos.add(t);
    }
    
    public void rmTriangulo(Triangulo t){
        this.listaDeTriangulos.remove(t);
    }
    
    public boolean containsApenasTriangulo(){
        int counter = 0;
        boolean isOnlyTriangulo = !(this.listaDeTriangulos.isEmpty());
        while (counter < this.listaDeTriangulos.size()) {
            if (this.listaDeTriangulos.get(counter).getForma() == Tipo.NOT_TRIANGULO) {
                isOnlyTriangulo = false;
            }
            counter++;
        }
        return isOnlyTriangulo;
    }
}
