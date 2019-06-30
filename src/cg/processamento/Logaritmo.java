package cg.processamento;

import java.awt.image.BufferedImage;

/**
 * Aplica a transformação logaritma.
 * 
 * @author Ivanildo Simplício
 */
public class Logaritmo {

    private int[][] imagem;
    private int width;
    private int height;
    private float constanteA;

    /**
     * Construtor padrão.
     */
    public Logaritmo(int[][] imagem, int width, int height, float constanteA) {
        this.imagem = imagem;
        this.width = width;
        this.height = height;
        this.constanteA = constanteA;
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

    public float getConstanteA() {
        return constanteA;
    }

    public void setConstanteA(float constanteA) {
        this.constanteA = constanteA;
    }

    /**
     * Aplica a transformação logaritma na imagem.
     */
    public BufferedImage run() {
        int matrizImagem[][] = new int[width][height];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrizImagem[i][j] = Normalizacao.normalizaPixel((int) (constanteA * (Math.log10(imagem[i][j]) + 1)));
            }
        }
        return Normalizacao.matrizToBufferedImage(matrizImagem);
    }
}