package cg.operacoes;

import cg.processamento.Normalizacao;
import java.awt.image.BufferedImage;

/**
 * Aplica a operação lógica AND entre duas imagens.
 * 
 * @author Ivanildo Simplício
 */
public class OperacaoAND {

    private final int[][] imagem1;
    private final int[][] imagem2;
    private final int width;
    private final int height;

    /**
     * Construtor padrão.
     */
    public OperacaoAND(int[][] imagem1, int[][] imagem2, int width, int height) {
        this.imagem1 = imagem1;
        this.imagem2 = imagem2;
        this.width = width;
        this.height = height;
    }

    /**
     * Aplica a operação lógica AND entre duas imagens.
     */
    public BufferedImage run() {
        int matrizImagem[][] = new int[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                matrizImagem[i][j] = imagem1[i][j] & imagem2[i][j];
            }
        }
        return Normalizacao.normalizaImage(matrizImagem);
    }
}