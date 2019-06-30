package cg.processamento;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 * Classe que implementa as funções de normalização de uma imagem.
 * 
 * @author Ivanildo Simplício
 */
public class Normalizacao {

    /**
     * Construtor default.
     */
    private Normalizacao() {
    }

    /**
     * Normaliza a imagem passada por parâmetro.
     */
    public static BufferedImage normalizaImage(int[][] matriz) {
        int[][] matrizImg = normalizaMatrizImage(matriz);
        BufferedImage imagem = new BufferedImage(matriz[0].length, matriz.length, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < matrizImg.length; i++) {
            for (int j = 0; j < matrizImg[0].length; j++) {
                imagem.setRGB(j, i, getCorPixel(matrizImg[i][j]));
            }
        }

        return imagem;
    }

    /**
     * Normaliza um pixel utilizando truncamento.
     */
    public static int normalizaPixel(int pixel) {
        if (pixel > 255) {
            return 255;
        } else if (pixel < 0) {
            return 0;
        }
        return pixel;
    }

    /**
     * Normaliza os pixels contindos na matriz que representa uma imagem.
     */
    public static int[][] normalizaMatrizImage(int[][] matriz) {
        int matrizNomalizada[][] = new int[matriz[0].length][matriz.length];

        int fMax = getMax(matriz);
        int fMin = getMin(matriz);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                // Equação para normalizar pixels
                matrizNomalizada[i][j] = Math.round(255 * (matriz[i][j] - fMin) / ((fMax - fMin) != 0 ? (fMax - fMin) : 1));
            }
        }

        return matrizNomalizada;
    }

    /**
     * Retorna o valor inteiro que representa a cor do pixel.
     */
    public static int getCorPixel(int corRGB) {
        return new Color(corRGB, corRGB, corRGB).getRGB();
    }

    /**
     * Retorna um objeto BufferedImagem que representa a matriz da imagem.
     */
    public static BufferedImage matrizToBufferedImage(int[][] matrizImg) {
        BufferedImage imagem = new BufferedImage(matrizImg[0].length, matrizImg.length, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < matrizImg.length; i++) {
            for (int j = 0; j < matrizImg[0].length; j++) {
                // Equação para normalizar pixels
                imagem.setRGB(j, i, getCorPixel(matrizImg[i][j]));
            }
        }

        return imagem;
    }

    /**
     * Retorna o maior inteiro da matriz.
     */
    public static int getMax(int[][] matriz) {
        return getValue(matriz, false);
    }

    /**
     * Retorna o menor inteiro da matriz.
     */
    public static int getMin(int[][] matriz) {
        return getValue(matriz, true);
    }

    /**
     * Retorna o maior ou menor inteiro da matriz.
     */
    private static int getValue(int[][] matriz, boolean isMin) {
        int value = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (isMin) {
                    if (matriz[i][j] < value) {
                        value = matriz[i][j];
                    }
                } else if (matriz[i][j] > value) {
                    value = matriz[i][j];
                }
            }
        }

        return value;
    }
}