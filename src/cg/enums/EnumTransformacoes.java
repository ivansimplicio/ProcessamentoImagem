package cg.enums;

/**
 * Mapeia os tipos de transformações para processamento de imagens.
 * 
 * @author Ivanildo Simplício
 */
public enum EnumTransformacoes {
    NEGATIVO("Negativo"), GAMMA("Gamma"), LOG("Logaritmo"), INTENSIDADE_GERAL ("Intensidade Geral"),
    FAIXA_DINAMICA("Faixa Dinâmica"), TRANSFERENCIA_LINEAR("Transferência Linear");

    private final String titulo;

    EnumTransformacoes(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}