package org.example;

public enum Tipo {
    NOT_TRIANGULO("Não é um triângulo, pois a condição de existência não foi obedecida!"),
    EQUILATERO("Triângulo Equilátero"),
    ISOSCELES("Triângulo Isósceles"),
    ESCALENO("Triângulo Escaleno");
    
    private String descricao;
    
    Tipo(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    
}
