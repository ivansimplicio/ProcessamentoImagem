package cg.processamento;

import java.awt.image.BufferedImage;

/**
 * Aplica a transformação negativa na imagem.
 * 
 * @author Ivanildo Simplício
 */
public class Negativo {

    private int[][] imagem;
    private int width;
    private int height;

    /**
     * Construtor padrão.
     */
    public Negativo(int[][] imagem, int width, int height) {
        this.imagem = imagem;
        this.width = width;
        this.height = height;
    }

    public int[][] getImagem() {
        return imagem;
    }

    public void setImagem(int[][] imagem) {
        this.imagem = imagem;
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
     * Aplica a transformação negativa na imagem.
     */
    public BufferedImage run() {
        int matrizImagem[][] = new int[width][height];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrizImagem[i][j] = 255 - imagem[i][j];
            }
        }
        return Normalizacao.normalizaImage(matrizImagem);
    }
}
