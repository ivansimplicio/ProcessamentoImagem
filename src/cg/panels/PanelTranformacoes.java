package cg.panels;

import cg.processamento.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Painel de exibição da aplicação da transformação selecionada pelo usuário.
 * 
 * @author Ivanildo Simplício
 */
public class PanelTranformacoes extends javax.swing.JPanel {

    private static PanelTranformacoes instance;
    private static BufferedReader imagem;
    private BufferedImage imgT;
    private int[][] imagemMatriz;
    private int imgWidth;
    private int imgHeight;
    private int imgValorMaximo;

    public static synchronized PanelTranformacoes getInstance() {
        if (instance == null) {
            instance = new PanelTranformacoes();
        }
        return instance;
    }

    /**
     * Construtor: inicia os componentes do painel.
     */
    private PanelTranformacoes() {
        initComponents();
        aplicarTransformacao.setEnabled(false);
    }

    public void setTitle(String text) {
        lbTitle.setText(text);
    }

    public int[][] getImagemMatriz() {
        return imagemMatriz;
    }

    public void setImagemMatriz(int[][] imagemMatriz) {
        this.imagemMatriz = imagemMatriz;
    }

    public int getImgWidth() {
        return imgWidth;
    }

    public void setImgWidth(int imgWidth) {
        this.imgWidth = imgWidth;
    }

    public int getImgHeight() {
        return imgHeight;
    }

    public void setImgHeight(int imgHeight) {
        this.imgHeight = imgHeight;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupAlgoritmos = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        panelImgInput = new javax.swing.JPanel();
        panelImgOutput = new javax.swing.JPanel();
        btSelctImage = new javax.swing.JButton();
        aplicarTransformacao = new javax.swing.JButton();
        lbTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(240, 32767));
        setMinimumSize(new java.awt.Dimension(240, 0));
        setPreferredSize(new java.awt.Dimension(240, 779));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelImgInput.setBackground(new java.awt.Color(255, 255, 255));
        panelImgInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelImgInput.setPreferredSize(new java.awt.Dimension(256, 256));

        javax.swing.GroupLayout panelImgInputLayout = new javax.swing.GroupLayout(panelImgInput);
        panelImgInput.setLayout(panelImgInputLayout);
        panelImgInputLayout.setHorizontalGroup(
            panelImgInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );
        panelImgInputLayout.setVerticalGroup(
            panelImgInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );

        panelImgOutput.setBackground(new java.awt.Color(255, 255, 255));
        panelImgOutput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelImgOutput.setPreferredSize(new java.awt.Dimension(300, 390));

        javax.swing.GroupLayout panelImgOutputLayout = new javax.swing.GroupLayout(panelImgOutput);
        panelImgOutput.setLayout(panelImgOutputLayout);
        panelImgOutputLayout.setHorizontalGroup(
            panelImgOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelImgOutputLayout.setVerticalGroup(
            panelImgOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );

        btSelctImage.setText("Selecionar Imagem");
        btSelctImage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSelctImage.setPreferredSize(new java.awt.Dimension(121, 30));
        btSelctImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectImage(evt);
            }
        });

        aplicarTransformacao.setText("Aplicar Transformação");
        aplicarTransformacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarTransformacaoActionPerformed(evt);
            }
        });

        lbTitle.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Transformação Negativo");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Entrada");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Saída");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btSelctImage, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelImgInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(aplicarTransformacao, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(panelImgOutput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle)
                .addGap(61, 61, 61)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelImgOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelImgInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(aplicarTransformacao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btSelctImage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 256, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 303, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Abre a imagem utilizando o file explorer.
     */
    private void selectImage(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectImage
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("src/cg/imagens/"));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("PGM Images", "pgm");
            fileChooser.setFileFilter(filter);

            int returnVal = fileChooser.showOpenDialog(btSelctImage);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                populaImgInPanel(criaImagem(fileChooser.getSelectedFile()), panelImgInput);
                aplicarTransformacao.setEnabled(true);
                panelImgOutput.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível abrir a imagem!", "AVISO!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_selectImage

    /**
     * Aplica a transformação selecionada pelo usuário.
     */
    private void aplicarTransformacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicarTransformacaoActionPerformed
        PanelMenuTransformacoes menuTransformacoes = PanelMenuTransformacoes.getInstance();

        switch (menuTransformacoes.getTipoAlgoritimo()) {
            case NEGATIVO:
                panelImgOutput.getGraphics().drawImage(new Negativo(imagemMatriz, getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            case GAMMA:
                panelImgOutput.getGraphics().drawImage(new Gamma(imagemMatriz, getImgWidth(), getImgHeight(), menuTransformacoes.getDados()).run(), 0, 0, null);
                break;
            case LOG:
                panelImgOutput.getGraphics().drawImage(new Logaritmo(imagemMatriz, getImgWidth(), getImgHeight(), menuTransformacoes.getDados()).run(), 0, 0, null);
                break;
            case INTENSIDADE_GERAL:
                panelImgOutput.getGraphics().drawImage(new IntensidadeGeral(imagemMatriz, getImgWidth(), getImgHeight(), menuTransformacoes.getSpinnerW(), menuTransformacoes.getSpinnerSize()).run(), 0, 0, null);
                break;
            case FAIXA_DINAMICA:
                panelImgOutput.getGraphics().drawImage(new FaixaDinamica(imagemMatriz, getImgWidth(), getImgHeight(), (int)menuTransformacoes.getDados()).run(), 0, 0, null);
                break;
            case TRANSFERENCIA_LINEAR:
                JOptionPane.showMessageDialog(null, "Em construção...", "AVISO!", JOptionPane.ERROR_MESSAGE);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_aplicarTransformacaoActionPerformed

    /**
     * Ler o arquivo pgm e monta a popula a matriz imagem.
     */
    public int[][] criaImagem(File file) {
        FileInputStream fileInputStream = null;
        Scanner scan = null;
        try {
            fileInputStream = new FileInputStream(file);
            scan = new Scanner(fileInputStream);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PanelTranformacoes.class.getName()).log(Level.SEVERE, null, ex);
        }

 
        scan.nextLine();
        imgWidth = scan.nextInt();
        imgHeight = scan.nextInt();
        imgValorMaximo = scan.nextInt();

        /**
         * Monta a matriz imagem com os pixels da imagem selecionada
         */
        imagemMatriz = new int[imgHeight][imgWidth];
        for (int row = 0; row < imgHeight; row++) {
            for (int col = 0; col < imgWidth; col++) {
                // Popula a matriz com os pixels da imagem
                imagemMatriz[row][col] = scan.nextInt();
            }
        }

        try {
            fileInputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(PanelTranformacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return imagemMatriz;
    }

    /**
     * Exibe a imagem no jPanel.
     */
    public void populaImgInPanel(int[][] img, JPanel imgPanel) {
        /**
         * Monta a matriz imagem com os pixels da imagem selecionada
         */
        BufferedImage imagemInput = new BufferedImage(imgWidth, imgHeight, BufferedImage.TYPE_INT_RGB);
        for (int row = 0; row < img.length; row++) {
            for (int col = 0; col < img[0].length; col++) {
                // Prepara a imagem para ser desenhada no jpanel
                imagemInput.setRGB(col, row, getCorPixel(imagemMatriz[row][col]));
            }
        }
        imgT = imagemInput;

        imgPanel.getGraphics().drawImage(imagemInput, 0, 0, null);
    }

    /**
     * Retorna o valor em RGB de acordo com o valor do pixel.
     */
    private int getCorPixel(int corRGB) {
        return new Color(corRGB, corRGB, corRGB).getRGB();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aplicarTransformacao;
    private javax.swing.JButton btSelctImage;
    private javax.swing.ButtonGroup buttonGroupAlgoritmos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JLabel lbTitle;
    private javax.swing.JPanel panelImgInput;
    public static javax.swing.JPanel panelImgOutput;
    // End of variables declaration//GEN-END:variables
}