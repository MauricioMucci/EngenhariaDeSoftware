package org.example;

public class Triangulo {
    private Tipo forma = Tipo.NOT_TRIANGULO;
    private int lado1, lado2, lado3;
    
    public Triangulo(int lado1, int lado2, int lado3) {
        if (isTriangulo(lado1, lado2, lado3)) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
            this.forma = fillForma(lado1, lado2, lado3);
        }
    }
    
    public Tipo getForma() {
        return forma;
    }
    
    private Tipo fillForma(int lado1, int lado2, int lado3) {
        if (lado1 == lado2 && lado1 == lado3) return Tipo.EQUILATERO;
        if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) return Tipo.ESCALENO;
        else return Tipo.ISOSCELES;
    }
    
    private boolean isTriangulo(int lado1, int lado2, int lado3) {
        return lado1 < lado2 + lado3 && Math.abs(lado2 - lado3) < lado1
                && lado2 < lado1 + lado3 && Math.abs(lado1 - lado3) < lado2
                && lado3 < lado1 + lado2 && Math.abs(lado1 - lado2) < lado3;
    }
}
