package cg.morfologia;

import static cg.morfologia.GradienteMorfologico.subtracaoDeMatrizes;
import cg.processamento.Normalizacao;
import java.awt.image.BufferedImage;

/**
 * Implementa a operação morfológica Bottom-Hat.
 *
 * @author Ivanildo Simplício
 */
public class BottomHat {
    private int[][] imagem;
    private final int[][] elementoEstruturante;
    private int width;
    private int height;
    
    /**
     * Construtor padrão.
     */
    public BottomHat(int [][] imagem, int[][] elementoEstruturante, int width, int height){
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
     * Aplica a operação morfológica Bottom-Hat em cada pixel da imagem.
     */
    public BufferedImage run(){
        return Normalizacao.normalizaImage(processaTopHat());
    }
    
    /**
     * Executa o BottomHat na imagem.
     */
    public int[][] processaTopHat(){
        int[][] imagemFechada = new Fechamento(imagem.clone(), elementoEstruturante.clone(), width, height).processaFechamento();
        
        //return subtracaoDeMatrizes(imagemFechada, imagem, width, height);
        return subtracaoDeMatrizes(Normalizacao.normalizaMatrizImage(imagemFechada), imagem, width, height);
    }
}
