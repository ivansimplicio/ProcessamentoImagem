package cg.enums;

/**
 * Mapeia os tipos de operadores aritméticos e lógicos para aplicar nas imagens.
 * 
 * @author Ivanildo Simplício
 */
public enum EnumOperacoes {
    ADICAO("Adição"), SUBSTRACAO("Substração"), MULTIPLICACAO("Multiplicação"), 
    DIVISAO("Divisão"), OR("OR"), XOR("XOR"), AND("AND");
    
    private final String titulo;
    
    EnumOperacoes(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }  
}