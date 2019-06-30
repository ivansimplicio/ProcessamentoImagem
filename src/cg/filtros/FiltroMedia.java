package cg.filtros;

import cg.processamento.Normalizacao;
import java.awt.image.BufferedImage;

/**
 * Classe que implementa o filtro da média. Suavização de Imagens no Domínio Espacial.
 *
 * @author Ivanildo Simplício
 */
public class FiltroMedia {

    private int[][] imagem;
    private int width;
    private int height;

    /**
     * Construtor padrão.
     */
    public FiltroMedia(int[][] imagem, int width, int height) {
        this.imagem = imagem;
        this.width = width;
        this.height = height;
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
     * Aplica o filtro da média em cada pixel da imagem.
     */
    public BufferedImage run() {
        int coeficiente = 9;
        int matrizImagem[][] = new int[width][height];
        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {

                //soma dos pixeis da vizinhança
                int soma = 0;

                soma += imagem[i][j];
                if ((i - 1) >= 0) {
                    soma += imagem[i - 1][j] / coeficiente;
                }
                if ((i + 1) < getWidth()) {
                    soma += imagem[i + 1][j] / coeficiente;
                }
                if ((j - 1) >= 0) {
                    soma += imagem[i][j - 1] / coeficiente;
                }
                if ((j + 1) < getHeight()) {
                    soma += imagem[i][j + 1] / coeficiente;
                }
                if (((i - 1) >= 0) && ((j - 1) >= 0)) {
                    soma += imagem[i - 1][j - 1] / coeficiente;
                }
                if (((i + 1) < getWidth()) && ((j - 1) >= 0)) {
                    soma += imagem[i + 1][j - 1] / coeficiente;
                }
                if (((i - 1) >= 0) && ((j + 1) < getHeight())) {
                    soma += imagem[i - 1][j + 1] / coeficiente;
                }
                if (((i + 1) < getWidth()) && ((j + 1) < getHeight())) {
                    soma += imagem[i + 1][j + 1] / coeficiente;
                }

                //adiciona a soma dos valores RGB da vizinhançaa na posiçao central
                matrizImagem[i][j] = Math.round(soma);
            }
        }
        return Normalizacao.normalizaImage(matrizImagem);
    }
}