package cg.panels;

import cg.processamento.EqualizarImagem;
import cg.processamento.HistogramaGrafico;
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
 * Painel de exibição das imagens de seus histogramas.
 * 
 * @author Ivanildo Simplício
 */
public class PanelHistograma extends javax.swing.JPanel {

    private static PanelHistograma instance;
    private static BufferedReader imagem;
    private BufferedImage imgT;
    private int[][] imagemMatriz;
    private int imgWidth;
    private int imgHeight;
    private int imgValorMaximo;

    public static synchronized PanelHistograma getInstance() {
        if (instance == null) {
            instance = new PanelHistograma();
        }
        return instance;
    }

    /**
     * Construtor padrão.
     */
    private PanelHistograma() {
        initComponents();
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
        panelHistogramaOri = new javax.swing.JPanel();
        btSelctImage = new javax.swing.JButton();
        panelImgEqualizada = new javax.swing.JPanel();
        panelHistogramaEqua = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

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

        panelHistogramaOri.setBackground(new java.awt.Color(255, 255, 255));
        panelHistogramaOri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelHistogramaOri.setPreferredSize(new java.awt.Dimension(300, 390));

        javax.swing.GroupLayout panelHistogramaOriLayout = new javax.swing.GroupLayout(panelHistogramaOri);
        panelHistogramaOri.setLayout(panelHistogramaOriLayout);
        panelHistogramaOriLayout.setHorizontalGroup(
            panelHistogramaOriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelHistogramaOriLayout.setVerticalGroup(
            panelHistogramaOriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        panelImgEqualizada.setBackground(new java.awt.Color(255, 255, 255));
        panelImgEqualizada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelImgEqualizada.setPreferredSize(new java.awt.Dimension(256, 256));

        javax.swing.GroupLayout panelImgEqualizadaLayout = new javax.swing.GroupLayout(panelImgEqualizada);
        panelImgEqualizada.setLayout(panelImgEqualizadaLayout);
        panelImgEqualizadaLayout.setHorizontalGroup(
            panelImgEqualizadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelImgEqualizadaLayout.setVerticalGroup(
            panelImgEqualizadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );

        panelHistogramaEqua.setBackground(new java.awt.Color(255, 255, 255));
        panelHistogramaEqua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelHistogramaEqua.setPreferredSize(new java.awt.Dimension(256, 256));

        javax.swing.GroupLayout panelHistogramaEquaLayout = new javax.swing.GroupLayout(panelHistogramaEqua);
        panelHistogramaEqua.setLayout(panelHistogramaEquaLayout);
        panelHistogramaEquaLayout.setHorizontalGroup(
            panelHistogramaEquaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelHistogramaEquaLayout.setVerticalGroup(
            panelHistogramaEquaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );

        lbTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Equalização da imagem");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Imagem original");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Histograma da original");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Imagem equalizada");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Histograma da equalizada");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelImgInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btSelctImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(panelHistogramaOri, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(panelImgEqualizada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelHistogramaEqua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))))
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTitle)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelImgEqualizada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelHistogramaEqua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelImgInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelHistogramaOri, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btSelctImage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 332, Short.MAX_VALUE))
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
                /**
                 * Coloca a imagem no panel e gera o histograma
                 */
                populaImgInPanel(criaImagem(fileChooser.getSelectedFile()), panelImgInput);
                
                HistogramaGrafico histogramaGrafico = new HistogramaGrafico(imagemMatriz, getImgWidth(), getImgHeight());

                int heigth = getImgHeight();
                if (heigth != 256) {
                    heigth = 256 - heigth;
                } else {
                    heigth = 0;
                }
                
                panelHistogramaOri.getGraphics().drawImage(histogramaGrafico.run(), 0, heigth, null);
                
                /**
                 * Equaliza a imagem, coloca no panel e gera o histograma
                 */
                int[][] imagemEqualizadaMatriz = new EqualizarImagem(imagemMatriz, getImgWidth(), getImgHeight()).run();
                populaImgInPanel(imagemEqualizadaMatriz, panelImgEqualizada);
                
                histogramaGrafico = new HistogramaGrafico(imagemEqualizadaMatriz, getImgWidth(), getImgHeight());
                panelHistogramaEqua.getGraphics().drawImage(histogramaGrafico.run(), 0, heigth, null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível carregar a imagem!", "ALERTA!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_selectImage

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
            Logger.getLogger(PanelHistograma.class.getName()).log(Level.SEVERE, null, ex);
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
                imagemMatriz[row][col] = scan.nextInt();
            }
        }
        try {
            fileInputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(PanelHistograma.class.getName()).log(Level.SEVERE, null, ex);
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
                imagemInput.setRGB(col, row, getCorPixel(img[row][col]));
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
    private javax.swing.JButton btSelctImage;
    private javax.swing.ButtonGroup buttonGroupAlgoritmos;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JLabel lbTitle;
    private javax.swing.JPanel panelHistogramaEqua;
    private javax.swing.JPanel panelHistogramaOri;
    private javax.swing.JPanel panelImgEqualizada;
    private javax.swing.JPanel panelImgInput;
    // End of variables declaration//GEN-END:variables
}