package cg.filtros;

import cg.processamento.Normalizacao;
import java.awt.image.BufferedImage;

/**
 * Classe que implementa o filtro do alto-reforço.
 * 
 * @author Ivanildo Simplício
 */
public class FiltroAltoReforco {

    private int[][] imagem;

    private int width;
    private int height;
    private double coeficienteW;
    private double coeficienteA;

    /**
     * Construtor padrão.
     */
    public FiltroAltoReforco(int[][] imagem, double coeficienteA, int width, int height) {
        this.imagem = imagem;
        this.width = width;
        this.height = height;
        this.coeficienteA = coeficienteA;
        this.coeficienteW = (9 * coeficienteA) - 1;
    }

    /**
     * Construtor default.
     */
    public FiltroAltoReforco() {
    }

    public double getCoeficienteW() {
        return coeficienteW;
    }

    public void setCoeficienteW(double coeficienteW) {
        this.coeficienteW = coeficienteW;
    }

    public double getCoeficienteA() {
        return coeficienteA;
    }

    public void setCoeficienteA(double coeficienteA) {
        this.coeficienteA = coeficienteA;
    }

    public int[][] getImagemMatriz() {
        return imagem;
    }

    public void setImagemMatriz(int[][] imagemMatriz) {
        this.imagem = imagemMatriz;
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
     * Aplica o filtro do alto-reforço em cada pixel da imagem.
     */
    public BufferedImage run() {
        int matrizImagem[][] = new int[getWidth()][getHeight()];

        for (int i = 1; i < getWidth() - 1; i++) {
            for (int j = 1; j < getHeight() - 1; j++) {
                int mask1 = imagem[i - 1][j - 1] * -1;
                int mask2 = imagem[i - 1][j] * -1;
                int mask3 = imagem[i - 1][j + 1] * -1;
                int mask4 = imagem[i][j - 1] * -1;
                int mask5 = (int) (imagem[i][j] * (9 * this.coeficienteA - 1));
                int mask6 = imagem[i][j + 1] * -1;
                int mask7 = imagem[i + 1][j - 1] * -1;
                int mask8 = imagem[i + 1][j] * -1;
                int mask9 = imagem[i + 1][j + 1] * -1;

                int altoReforco = mask1 + mask2 + mask3 + mask4 + mask5 + mask6 + mask7 + mask8 + mask9;
                
                matrizImagem[i][j] = Normalizacao.normalizaPixel(altoReforco);
            }
        }
        return Normalizacao.matrizToBufferedImage(matrizImagem);
    }
}