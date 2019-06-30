package cg.enums;

/**
 * Mapeia os tipos de operadores morfológicos para se aplicar nas imagens.
 * 
 * @author Ivanildo Simplício
 */
public enum EnumOpMorfologicos {
    DILATACAO("Dilatação"), EROSAO("Erosão"), GRADIENTE("Gradiente Morfológico"), ABERTURA("Abertura"), FECHAMENTO("Fechamento"),
    TOP_HAT("Top-Hat"), BOTTOM_HAT("Bottom-Hat");
    
    private final String tipo;

    private EnumOpMorfologicos(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
}
