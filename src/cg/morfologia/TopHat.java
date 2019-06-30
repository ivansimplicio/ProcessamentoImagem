package cg.morfologia;

import cg.processamento.Normalizacao;
import java.awt.image.BufferedImage;
import static cg.morfologia.GradienteMorfologico.*;

/**
 * Implementa a operação morfológica Top-Hat.
 *
 * @author Ivanildo Simplício
 */
public class TopHat {
    private int[][] imagem;
    private final int[][] elementoEstruturante;
    private int width;
    private int height;
    
    /**
     * Construtor padrão.
     */
    public TopHat(int [][] imagem, int[][] elementoEstruturante, int width, int height){
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
     * Aplica a operação morfológica Top-Hat em cada pixel da imagem.
     */
    public BufferedImage run(){
        return Normalizacao.normalizaImage(processaTopHat());
    }
    
    /**
     * Executa o TopHat na imagem.
     */
    public int[][] processaTopHat(){
        int[][] imagemAberta = new Abertura(imagem.clone(), elementoEstruturante.clone(), width, height).processaAbertura();
        
        //return subtracaoDeMatrizes(imagem, imagemAberta, width, height);
        return subtracaoDeMatrizes(imagem, Normalizacao.normalizaMatrizImage(imagemAberta), width, height);
    }
}
