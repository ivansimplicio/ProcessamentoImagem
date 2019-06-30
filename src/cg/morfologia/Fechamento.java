package cg.morfologia;

import cg.processamento.Normalizacao;
import java.awt.image.BufferedImage;

/**
 * Implementa a operação morfológica fechamento.
 *
 * @author Ivanildo Simplício
 */
public class Fechamento {
    
    private int[][] imagem;
    private final int[][] elementoEstruturante;
    private int width;
    private int height;
    
    /**
     * Construtor padrão.
     */
    public Fechamento(int [][] imagem, int[][] elementoEstruturante, int width, int height){
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
     * Aplica a operação morfológica fechamento em cada pixel da imagem.
     */
    public BufferedImage run(){
        return Normalizacao.normalizaImage(processaFechamento());
    }
    
    /**
     * Executa a fechamento na imagem.
     */
    public int[][] processaFechamento(){
        int[][] imagemDilatada  = new Dilatacao(imagem.clone(), elementoEstruturante.clone(), width, height).aplicaDilatacao();
        //int[][] imagemResult = new Erosao(imagemDilatada, elementoEstruturante.clone(), width, height).aplicaErosao();
        int[][] imagemResult = new Erosao(Normalizacao.normalizaMatrizImage(imagemDilatada), elementoEstruturante.clone(), width, height).aplicaErosao();
        
        return imagemResult;
    }
}
