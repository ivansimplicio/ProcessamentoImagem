package cg.enums;

/**
 * Mapeia os tipos de filtros para aplicar nas imagens.
 * 
 * @author Ivanildo Simplício
 */
public enum EnumFiltros {
    MEDIA("Média"), MEDIANA("Mediana"), PASSA_ALTA_BASICO("Passa alta básico"), 
    OPERADOR_ROBERTS("Operador de Robert’s"), OPERADOR_ROBERTS_CRUZADO("Operador de Robert’s Cruzado"),
    OPERADOR_PEWITT("Operador de Prewitt"), ALTO_REFORCO("Alto Reforço (Hight-Boost)"),
    OPERADOR_SOBEL("Operador de Sobel");

    private final String titulo;

    EnumFiltros(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}