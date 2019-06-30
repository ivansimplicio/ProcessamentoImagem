package cg.morfologia;

import cg.processamento.Normalizacao;
import java.awt.image.BufferedImage;

/**
 * Implementa a operação morfológica gradiente morfológico.
 * 
 * @author Ivanildo Simplício
 */
public class GradienteMorfologico {
    
    private int[][] imagem;
    private final int[][] elementoEstruturante;
    private int width;
    private int height;
    
    /**
     * Construtor padrão.
     */
    public GradienteMorfologico(int [][] imagem, int[][] elementoEstruturante, int width, int height){
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
     * Aplica a operação morfológica gradiente em cada pixel da imagem.
     */
    public BufferedImage run(){
        return Normalizacao.normalizaImage(processaGradiente());
    }
    
    /**
     * Executa o gradiente.
     */
    public int[][] processaGradiente(){
        int[][] imagemDilatada = new Dilatacao(imagem.clone(), elementoEstruturante.clone(), width, height).aplicaDilatacao();
        int[][] imagemErodida  = new Erosao(imagem.clone(), elementoEstruturante.clone(), width, height).aplicaErosao();
        //return subtracaoDeMatrizes(imagemDilatada, imagemErodida, width, height);
        return subtracaoDeMatrizes(Normalizacao.normalizaMatrizImage(imagemDilatada), Normalizacao.normalizaMatrizImage(imagemErodida), width, height);
    }
    
    /**
     * Aplica a subtração entre duas matrizes.
     */
    public static int[][] subtracaoDeMatrizes(int[][] imagem1, int[][] imagem2, int width, int height){
        int[][] matrizResult = new int[width][height];
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                matrizResult[i][j] = imagem1[i][j] - imagem2[i][j];
            }
        }
        return matrizResult;
    }
}
