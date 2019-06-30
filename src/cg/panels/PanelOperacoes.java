package cg.panels;

import cg.operacoes.*;
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
 * Painel de exibição da aplicação da operação selecionada pelo usuário.
 * 
 * @author Ivanildo Simplício
 */
public class PanelOperacoes extends javax.swing.JPanel {

    private static PanelOperacoes instance;
    private static BufferedReader imagem;
    private BufferedImage imgT;
    private int[][] imagemMatriz;
    private int[][] imagemMatriz1;
    private int[][] imagemMatriz2;
    private int imgWidth;
    private int imgHeight;
    private int imgValorMaximo;

    public static synchronized PanelOperacoes getInstance() {
        if (instance == null) {
            instance = new PanelOperacoes();
        }
        return instance;
    }

    /**
     * Construtor: inicia o jpanel.
     */
    private PanelOperacoes() {
        initComponents();
        aplicarOperacao.setEnabled(false);
    }

    public void setTitle(String text) {
        lbTitle.setText(text);
    }

    public int[][] getImagemMatriz() {
        return imagemMatriz1;
    }

    public void setImagemMatriz(int[][] imagemMatriz) {
        this.imagemMatriz1 = imagemMatriz;
    }

    public int[][] getImagemMatriz2() {
        return imagemMatriz2;
    }

    public void setImagemMatriz2(int[][] imagemMatriz2) {
        this.imagemMatriz2 = imagemMatriz2;
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
        panelImgInput1 = new javax.swing.JPanel();
        panelImgInput2 = new javax.swing.JPanel();
        btSelctImage1 = new javax.swing.JButton();
        btSelctImage2 = new javax.swing.JButton();
        panelImgOutput = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        aplicarOperacao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(240, 32767));
        setMinimumSize(new java.awt.Dimension(240, 0));
        setPreferredSize(new java.awt.Dimension(240, 779));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelImgInput1.setBackground(new java.awt.Color(255, 255, 255));
        panelImgInput1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelImgInput1.setPreferredSize(new java.awt.Dimension(256, 256));

        javax.swing.GroupLayout panelImgInput1Layout = new javax.swing.GroupLayout(panelImgInput1);
        panelImgInput1.setLayout(panelImgInput1Layout);
        panelImgInput1Layout.setHorizontalGroup(
            panelImgInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelImgInput1Layout.setVerticalGroup(
            panelImgInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );

        panelImgInput2.setBackground(new java.awt.Color(255, 255, 255));
        panelImgInput2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelImgInput2.setPreferredSize(new java.awt.Dimension(300, 390));

        javax.swing.GroupLayout panelImgInput2Layout = new javax.swing.GroupLayout(panelImgInput2);
        panelImgInput2.setLayout(panelImgInput2Layout);
        panelImgInput2Layout.setHorizontalGroup(
            panelImgInput2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );
        panelImgInput2Layout.setVerticalGroup(
            panelImgInput2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );

        btSelctImage1.setText("Selecionar Imagem");
        btSelctImage1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSelctImage1.setPreferredSize(new java.awt.Dimension(121, 30));
        btSelctImage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectImage1(evt);
            }
        });

        btSelctImage2.setText("Selecionar Imagem");
        btSelctImage2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSelctImage2.setPreferredSize(new java.awt.Dimension(121, 30));
        btSelctImage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectImage2(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Resultado");

        lbTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Operação selecionada: Adição");

        aplicarOperacao.setText("Aplicar Operação");
        aplicarOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarOperacaoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Imagem 1");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Imagem 2");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btSelctImage1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(panelImgInput1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(panelImgInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btSelctImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(aplicarOperacao, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(panelImgOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbTitle)
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelImgInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelImgInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelImgOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btSelctImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(aplicarOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btSelctImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 331, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Abre a imagem 1 utilizando o file explorer.
     */
    private void selectImage1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectImage1
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("src/cg/imagens/"));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("PGM Images", "pgm");
            fileChooser.setFileFilter(filter);

            int returnVal = fileChooser.showOpenDialog(btSelctImage1);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                imagemMatriz1 = criaImagem(fileChooser.getSelectedFile());
                populaImgInPanel(imagemMatriz1, panelImgInput1);
                panelImgOutput.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível abrir a imagem.", "AVISO!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_selectImage1
    /**
     * Abre a imagem 2 utilizando o file explorer.
     */
    private void selectImage2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectImage2
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("src/cg/imagens/"));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("PGM Images", "pgm");
            fileChooser.setFileFilter(filter);

            int returnVal = fileChooser.showOpenDialog(btSelctImage2);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                imagemMatriz2 = criaImagem(fileChooser.getSelectedFile());
                populaImgInPanel(imagemMatriz2, panelImgInput2);
                aplicarOperacao.setEnabled(true);
                panelImgOutput.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível abrir a imagem.", "AVISO!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_selectImage2

    /**
     * Aplica a operação selecionada pelo usuário.
     */
    private void aplicarOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicarOperacaoActionPerformed
        PanelMenuOperacoes menuOperacoes = PanelMenuOperacoes.getInstance();

        switch (menuOperacoes.getTipoAlgoritimo()) {
            case ADICAO:
                panelImgOutput.getGraphics().drawImage(new OperacaoAdicao(imagemMatriz1, imagemMatriz2, getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            case SUBSTRACAO:
                panelImgOutput.getGraphics().drawImage(new OperacaoSubtracao(imagemMatriz1, imagemMatriz2, getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            case MULTIPLICACAO:
                panelImgOutput.getGraphics().drawImage(new OperacaoMultiplicacao(imagemMatriz1, imagemMatriz2, getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            case DIVISAO:
                panelImgOutput.getGraphics().drawImage(new OperacaoDivisao(imagemMatriz1, imagemMatriz2, getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            case OR:
                panelImgOutput.getGraphics().drawImage(new OperacaoOR(imagemMatriz1, imagemMatriz2, getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            case AND:
                panelImgOutput.getGraphics().drawImage(new OperacaoAND(imagemMatriz1, imagemMatriz2, getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            case XOR:
                panelImgOutput.getGraphics().drawImage(new OperacaoXOR(imagemMatriz1, imagemMatriz2, getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_aplicarOperacaoActionPerformed

    /**
     * Ler o arquivo PGM e monta da matriz imagem.
     */
    public int[][] criaImagem(File file) {
        FileInputStream fileInputStream = null;
        Scanner scan = null;
        try {
            fileInputStream = new FileInputStream(file);
            scan = new Scanner(fileInputStream);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PanelOperacoes.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(PanelOperacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return imagemMatriz;
    }

    /**
     * Exibe a imagem no jPanel.
     */
    public void populaImgInPanel(int[][] img, JPanel imgPanel) {
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
    private javax.swing.JButton aplicarOperacao;
    private javax.swing.JButton btSelctImage1;
    private javax.swing.JButton btSelctImage2;
    private javax.swing.ButtonGroup buttonGroupAlgoritmos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JLabel lbTitle;
    private javax.swing.JPanel panelImgInput1;
    private javax.swing.JPanel panelImgInput2;
    public static javax.swing.JPanel panelImgOutput;
    // End of variables declaration//GEN-END:variables
}