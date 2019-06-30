package cg.processamento;

import java.awt.image.BufferedImage;

/**
 * Aplica a transferência de faixa dinâmica.
 * 
 * @author Ivanildo Simplício
 */
public class FaixaDinamica {
    
    private int[][] imagem;
    private int width;
    private int height;
    private int w_target;
    
    public FaixaDinamica(int[][] imagem, int width, int height, int w_target){
        this.imagem = imagem;
        this.width = width;
        this.height = height;
        this.w_target= w_target;
    }
    
    public int[][] getImagem(){
        return imagem;
    }
    
    public void setImagem(int[][] imagem){
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

    public int getw_target() {
        return w_target;
    }

    public void setw_target(int w_target) {
        this.w_target = w_target;
    }
    
    /**
     * Aplica a transferência de faixa dinâmica.
     */
    public BufferedImage run(){
        int matrizImagem[][] = new int[width][height];
        
        int pMin = getMin(imagem);
        int pMax = getMax(imagem);
        System.out.println("min "+pMin);
        System.out.println("max "+pMax);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrizImagem[i][j] = (int)(imagem[i][j] - pMin)/(pMax-pMin) * w_target;
            }
        }
        return Normalizacao.normalizaImage(matrizImagem);   
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