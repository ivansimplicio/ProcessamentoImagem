package cg.filtros;

import cg.panels.PanelFiltros;
import cg.processamento.Normalizacao;
import java.awt.image.BufferedImage;

/**
 * Classe que implementa o filtro passa alta básico.
 * 
 * @author Ivanildo Simplício
 */
public class FiltroPassaAlta {

    PanelFiltros panelFiltros;
    private int[][] imagemMatriz;
    private int imagem[][];
    private int width;
    private int height;

    /**
     * Construtor padrão. 
     */
    public FiltroPassaAlta(int imagem[][], int width, int height) {
        this.imagem = imagem;
        this.width = width;
        this.height = height;
    }

    /**
     * Construtor default.
     */
    public FiltroPassaAlta() {
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
     * Aplica o filtro passa alta básico em cada pixel da imagem.
     */
    public BufferedImage run() {
        int matrizImagem[][] = new int[getWidth()][getHeight()];

        for (int i = 1; i < getWidth() - 1; i++) {
            for (int j = 1; j < getHeight() - 1; j++) {
                int mask1 = imagem[i - 1][j - 1] * -1;
                int mask2 = imagem[i - 1][j] * -1;
                int mask3 = imagem[i - 1][j + 1] * -1;
                int mask4 = imagem[i][j - 1] * -1;
                int mask5 = imagem[i][j] * 8;
                int mask6 = imagem[i][j + 1] * -1;
                int mask7 = imagem[i + 1][j - 1] * -1;
                int mask8 = imagem[i + 1][j] * -1;
                int mask9 = imagem[i + 1][j + 1] * -1;

                int passaAlta = mask1 + mask2 + mask3 + mask4 + mask5 + mask6 + mask7 + mask8 + mask9;

                matrizImagem[i][j] = Normalizacao.normalizaPixel(passaAlta);
            }
        }
        return Normalizacao.matrizToBufferedImage(matrizImagem);
    }
}