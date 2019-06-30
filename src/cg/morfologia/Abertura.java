package cg.morfologia;

import cg.processamento.Normalizacao;
import java.awt.image.BufferedImage;

/**
 * Implementa a operação morfológica abertura.
 *
 * @author Ivanildo Simplício
 */
public class Abertura {
    
    private int[][] imagem;
    private final int[][] elementoEstruturante;
    private int width;
    private int height;
    
    /**
     * Construtor padrão.
     */
    public Abertura(int [][] imagem, int[][] elementoEstruturante, int width, int height){
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
     * Aplica a operação morfológica abertura em cada pixel da imagem.
     */
    public BufferedImage run(){
        return Normalizacao.normalizaImage(processaAbertura());
    }
    
    /**
     * Executa a abertura na imagem.
     */
    public int[][] processaAbertura(){
        int[][] imagemErodida  = new Erosao(imagem.clone(), elementoEstruturante.clone(), width, height).aplicaErosao();
        //int[][] imagemResult = new Dilatacao(imagemErodida, elementoEstruturante.clone(), width, height).aplicaDilatacao();
        int[][] imagemResult = new Dilatacao(Normalizacao.normalizaMatrizImage(imagemErodida), elementoEstruturante.clone(), width, height).aplicaDilatacao();
        
        return imagemResult;
    }
}
