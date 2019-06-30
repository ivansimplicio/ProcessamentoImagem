package cg.panels;

import cg.morfologia.Abertura;
import cg.morfologia.BottomHat;
import cg.morfologia.Dilatacao;
import cg.morfologia.Erosao;
import cg.morfologia.Fechamento;
import cg.morfologia.GradienteMorfologico;
import cg.morfologia.TopHat;
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
 * Painel que exibe a transformação na imagem após a aplicação de uma operação morfológica.
 * 
 * @author Ivanildo Simplício
 */
public class PanelOpMorfologicos extends javax.swing.JPanel {

    private static PanelOpMorfologicos instance;
    private static BufferedReader imagem;
    private BufferedImage imgT;
    private int[][] imagemMatriz;
    private int imgWidth;
    private int imgHeight;
    private int imgValorMaximo;

    public static synchronized PanelOpMorfologicos getInstance() {
        if (instance == null) {
            instance = new PanelOpMorfologicos();
        }
        return instance;
    }

    /**
     * Construtor: inicia os componentes do painel.
     */
    private PanelOpMorfologicos() {
        initComponents();
        aplicarOperacao.setEnabled(false);
    }

    public void setTitle(String text) {
        labelTitulo.setText(text);
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
        labelTitulo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        aplicarOperacao = new javax.swing.JButton();
        panelEE = new javax.swing.JPanel();
        a00 = new javax.swing.JSpinner();
        a02 = new javax.swing.JSpinner();
        a01 = new javax.swing.JSpinner();
        a10 = new javax.swing.JSpinner();
        a11 = new javax.swing.JSpinner();
        a12 = new javax.swing.JSpinner();
        a20 = new javax.swing.JSpinner();
        a21 = new javax.swing.JSpinner();
        a22 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();

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
            .addGap(0, 0, Short.MAX_VALUE)
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

        labelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Operação Morfológica: Dilatação");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Entrada");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Saída");

        aplicarOperacao.setText("Aplicar Operação");
        aplicarOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarOperacaoActionPerformed(evt);
            }
        });

        panelEE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        a00.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1, 1));

        a02.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1, 1));

        a01.setModel(new javax.swing.SpinnerNumberModel(1, 0, 1, 1));

        a10.setModel(new javax.swing.SpinnerNumberModel(1, 0, 1, 1));

        a11.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1, 1));
        a11.setEnabled(false);

        a12.setModel(new javax.swing.SpinnerNumberModel(1, 0, 1, 1));

        a20.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1, 1));

        a21.setModel(new javax.swing.SpinnerNumberModel(1, 0, 1, 1));

        a22.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1, 1));

        javax.swing.GroupLayout panelEELayout = new javax.swing.GroupLayout(panelEE);
        panelEE.setLayout(panelEELayout);
        panelEELayout.setHorizontalGroup(
            panelEELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panelEELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelEELayout.createSequentialGroup()
                        .addComponent(a01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(a02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEELayout.createSequentialGroup()
                        .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEELayout.createSequentialGroup()
                        .addComponent(a21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelEELayout.setVerticalGroup(
            panelEELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Elemento Estruturante:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(panelImgInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panelEE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btSelctImage, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aplicarOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                .addComponent(panelImgOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelTitulo)
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelEE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelImgOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelImgInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSelctImage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aplicarOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 320, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Abre a imagem utilizando o file explorer.
     * @param evt 
     */
    private void selectImage(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectImage
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("src/cg/imagens/"));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("PGM Images", "pgm");
            fileChooser.setFileFilter(filter);

            int returnVal = fileChooser.showOpenDialog(btSelctImage);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                panelImgOutput.repaint();

                populaImgInPanel(criaImagem(fileChooser.getSelectedFile()), panelImgInput);
                aplicarOperacao.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível carregar a imagem!", "AVISO!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_selectImage

    /**
     * Aplica a operação selecionada pelo usuário.
     */
    private void aplicarOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicarOperacaoActionPerformed
        PanelMenuOpMorfologicos menuOPM = PanelMenuOpMorfologicos.getInstance();
        
        int[][] elementoEstruturante = new int[3][3];
        
        elementoEstruturante[0][0] = (int)a00.getValue();
        elementoEstruturante[0][1] = (int)a01.getValue();
        elementoEstruturante[0][2] = (int)a02.getValue();
        elementoEstruturante[1][0] = (int)a10.getValue();
        elementoEstruturante[1][1] = (int)a11.getValue();
        elementoEstruturante[1][2] = (int)a12.getValue();
        elementoEstruturante[2][0] = (int)a20.getValue();
        elementoEstruturante[2][1] = (int)a21.getValue();
        elementoEstruturante[2][2] = (int)a22.getValue();

        switch (menuOPM.getTipoAlgoritimo()) {
            case DILATACAO:
                panelImgOutput.getGraphics().drawImage(new Dilatacao(imagemMatriz.clone(), elementoEstruturante, getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            case EROSAO:
                panelImgOutput.getGraphics().drawImage(new Erosao(imagemMatriz.clone(), elementoEstruturante, getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            case GRADIENTE:
                panelImgOutput.getGraphics().drawImage(new GradienteMorfologico(imagemMatriz.clone(), elementoEstruturante, getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            case ABERTURA:
                panelImgOutput.getGraphics().drawImage(new Abertura(imagemMatriz.clone(), elementoEstruturante, getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            case FECHAMENTO:
                panelImgOutput.getGraphics().drawImage(new Fechamento(imagemMatriz.clone(), elementoEstruturante, getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            case TOP_HAT:
                panelImgOutput.getGraphics().drawImage(new TopHat(imagemMatriz.clone(), elementoEstruturante, getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            case BOTTOM_HAT:
                panelImgOutput.getGraphics().drawImage(new BottomHat(imagemMatriz.clone(), elementoEstruturante, getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_aplicarOperacaoActionPerformed

    /**
     * Ler o arquivo PGM e monta a popula a matriz imagem.
     */
    public int[][] criaImagem(File file) {
        FileInputStream fileInputStream = null;
        Scanner scan = null;
        try {
            fileInputStream = new FileInputStream(file);
            scan = new Scanner(fileInputStream);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PanelOpMorfologicos.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(PanelOpMorfologicos.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JSpinner a00;
    private javax.swing.JSpinner a01;
    private javax.swing.JSpinner a02;
    private javax.swing.JSpinner a10;
    private javax.swing.JSpinner a11;
    private javax.swing.JSpinner a12;
    private javax.swing.JSpinner a20;
    private javax.swing.JSpinner a21;
    private javax.swing.JSpinner a22;
    private javax.swing.JButton aplicarOperacao;
    private javax.swing.JButton btSelctImage;
    private javax.swing.ButtonGroup buttonGroupAlgoritmos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelEE;
    private javax.swing.JPanel panelImgInput;
    private javax.swing.JPanel panelImgOutput;
    // End of variables declaration//GEN-END:variables
}