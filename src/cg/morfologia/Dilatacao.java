package cg.morfologia;

import cg.processamento.Normalizacao;
import java.awt.image.BufferedImage;
import java.util.Arrays;

/**
 * Implementa a operação morfológica dilatação.
 *
 * @author Ivanildo Simplício
 */
public class Dilatacao {

    private int[][] imagem;
    private final int[][] elementoEstruturante;
    private int width;
    private int height;

    /**
     * Construtor padrão.
     */
    public Dilatacao(int[][] imagem, int[][] elementoEstruturante, int width, int height) {
        this.imagem = imagem;
        this.elementoEstruturante = elementoEstruturante;
        this.width = width;
        this.height = height;
    }

    public void setImagem(int[][] imagem) {
        this.imagem = imagem;
    }

    public int[][] getImagem() {
        return this.imagem;
    }

    public void setElementoEstruturante(int[][] elementoEstruturante) {
        this.imagem = elementoEstruturante;
    }

    public int[][] elementoEstruturante() {
        return this.elementoEstruturante;
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
     * Aplica a operação morfológica dilatação em cada pixel da imagem.
     */
    public BufferedImage run() {
        return Normalizacao.normalizaImage(aplicaDilatacao());
    }

    /**
     * Executa a dilatacao.
     */
    public int[][] aplicaDilatacao() {
        int matrizImagem[][] = new int[width][height];
        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {

                int[] valores = new int[9];

                if (((i - 1) >= 0) && ((j - 1) >= 0) && elementoEstruturante[0][0] == 1) {
                    valores[0] = imagem[i - 1][j - 1] + elementoEstruturante[0][0];
                }
                if ((i - 1) >= 0 && elementoEstruturante[0][1] == 1) {
                    valores[1] = imagem[i - 1][j] + elementoEstruturante[0][1];
                }
                if (((i - 1) >= 0) && ((j + 1) < getHeight()) && elementoEstruturante[0][2] == 1) {
                    valores[2] = imagem[i - 1][j + 1] + elementoEstruturante[0][2];
                }
                if ((j - 1) >= 0 && elementoEstruturante[1][0] == 1) {
                    valores[3] = imagem[i][j - 1] + elementoEstruturante[1][0];
                }
                valores[4] = imagem[i][j] + elementoEstruturante[1][1];
                if ((j + 1) < getHeight() && elementoEstruturante[1][2] == 1) {
                    valores[5] = imagem[i][j + 1] + elementoEstruturante[1][2];
                }
                if (((i + 1) < getWidth()) && ((j - 1) >= 0) && elementoEstruturante[2][0] == 1) {
                    valores[6] = imagem[i + 1][j - 1] + elementoEstruturante[2][0];
                }
                if ((i + 1) < getWidth() && elementoEstruturante[2][1] == 1) {
                    valores[7] = imagem[i + 1][j] + elementoEstruturante[2][1];
                }
                if (((i + 1) < getWidth()) && ((j + 1) < getHeight()) && elementoEstruturante[2][2] == 1) {
                    valores[8] = imagem[i + 1][j + 1] + elementoEstruturante[2][2];
                }
                Arrays.sort(valores);
                matrizImagem[i][j] = valores[8];
            }
        }
        return matrizImagem;
    }
}