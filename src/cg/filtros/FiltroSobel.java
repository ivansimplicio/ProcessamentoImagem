package cg.filtros;

import cg.panels.PanelFiltros;
import cg.processamento.Normalizacao;
import java.awt.image.BufferedImage;

/**
 * Classe que implementa o filtro usando o operador de Sobel.
 * 
 * @author Ivanildo Simplício
 */
public class FiltroSobel {

    PanelFiltros panelFiltros;
    private int[][] imagemMatriz;
    private int imagem[][];
    private int width;
    private int height;

    /**
     * Construtor padrão.
     */
    public FiltroSobel(int imagem[][], int width, int height) {
        this.imagem = imagem;
        this.width = width;
        this.height = height;
    }

    /**
     * Construtor default.
     */
    public FiltroSobel() {
    }

    public int[][] getImagemMatriz() {
        return imagemMatriz;
    }

    public void setImagemMatriz(int[][] imagemMatriz) {
        this.imagemMatriz = imagemMatriz;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Aplica o filtro de sobel em cada pixel da imagem.
     */
    public BufferedImage run() {
        int matrizImagem[][] = new int[getWidth()][getHeight()];

        for (int i = 1; i < getWidth() - 1; i++) {
            for (int j = 1; j < getHeight() - 1; j++) {
                int mask1 = imagem[i - 1][j - 1];
                int mask2 = imagem[i - 1][j];
                int mask3 = imagem[i - 1][j + 1];
                int mask4 = imagem[i][j - 1];
                int mask6 = imagem[i][j + 1];
                int mask7 = imagem[i + 1][j - 1];
                int mask8 = imagem[i + 1][j];
                int mask9 = imagem[i + 1][j + 1];
                int sobel = Math.abs((mask7 + (2 * mask8) + mask9) - (mask1 + (2 * mask2) + mask3))
                        + Math.abs((mask3 + (2 * mask6) + mask9) - (mask1 + (2 * mask4) + mask7));

                matrizImagem[i][j] = Normalizacao.normalizaPixel(sobel);
            }
        }
        return Normalizacao.matrizToBufferedImage(matrizImagem);
    }
}