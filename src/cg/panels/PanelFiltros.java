package cg.panels;

import cg.filtros.FiltroAltoReforco;
import cg.filtros.FiltroMedia;
import cg.filtros.FiltroMediana;
import cg.filtros.FiltroPassaAlta;
import cg.filtros.FiltroPrewitt;
import cg.filtros.FiltroRoberts;
import cg.filtros.FiltroRobertsCruzado;
import cg.filtros.FiltroSobel;
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
 * Painel de exibição da aplicação dos filtros.
 * 
 * @author Ivanildo Simplício
 */
public class PanelFiltros extends javax.swing.JPanel {

    private static PanelFiltros instance;
    private static BufferedReader imagem;
    private BufferedImage imgT;
    private int[][] imagemMatriz;
    private int imgWidth;
    private int imgHeight;
    private int imgValorMaximo;

    public static synchronized PanelFiltros getInstance() {
        if (instance == null) {
            instance = new PanelFiltros();
        }
        return instance;
    }

    /**
     * Construtor: inicia o painel.
     */
    private PanelFiltros() {
        initComponents();
        aplicarFiltro.setEnabled(false);
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
        aplicarFiltro = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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
            .addGap(0, 254, Short.MAX_VALUE)
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

        aplicarFiltro.setText("Aplicar Filtro");
        aplicarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarFiltroActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Filtro selecionado: Média");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Entrada");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Saída");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btSelctImage, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelImgInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(aplicarFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelImgOutput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelImgInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelImgOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSelctImage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aplicarFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(564, 564, 564))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 296, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Abre a imagem usando o file explorer.
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
                aplicarFiltro.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível carregar a imagem!", "AVISO!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_selectImage

    /**
     * Chama o método responsável por aplicar o filtro selecionado pelo usuário.
     */
    private void aplicarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicarFiltroActionPerformed
        PanelMenuFiltros menuFiltros = PanelMenuFiltros.getInstance();

        switch (menuFiltros.getTipoAlgoritimo()) {
            case MEDIA:
                panelImgOutput.getGraphics().drawImage(new FiltroMedia(imagemMatriz, getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            case MEDIANA:
                panelImgOutput.getGraphics().drawImage(new FiltroMediana(imagemMatriz, getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            case PASSA_ALTA_BASICO:
                panelImgOutput.getGraphics().drawImage(new FiltroPassaAlta(imagemMatriz, getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            case OPERADOR_ROBERTS:
                panelImgOutput.getGraphics().drawImage(new FiltroRoberts(imagemMatriz, getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            case OPERADOR_ROBERTS_CRUZADO:
                panelImgOutput.getGraphics().drawImage(new FiltroRobertsCruzado(imagemMatriz, getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            case OPERADOR_PEWITT:
                panelImgOutput.getGraphics().drawImage(new FiltroPrewitt(imagemMatriz, getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            case OPERADOR_SOBEL:
                panelImgOutput.getGraphics().drawImage(new FiltroSobel(imagemMatriz, getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            case ALTO_REFORCO:
                panelImgOutput.getGraphics().drawImage(new FiltroAltoReforco(imagemMatriz, menuFiltros.getA(), getImgWidth(), getImgHeight()).run(), 0, 0, null);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_aplicarFiltroActionPerformed

    /**
     * Ler o arquivo PGM aberto e monta a popula a matriz imagem.
     */
    public int[][] criaImagem(File file) {
        FileInputStream fileInputStream = null;
        Scanner scan = null;
        try {
            fileInputStream = new FileInputStream(file);
            scan = new Scanner(fileInputStream);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PanelFiltros.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(PanelFiltros.class.getName()).log(Level.SEVERE, null, ex);
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

        /**
         * Exibe a imagem no jpanel
         */
        imgPanel.getGraphics().drawImage(imagemInput, 0, 0, null);
    }

    /**
     * Retorna o valor em RGB de acordo com o valor do pixel.
     */
    private int getCorPixel(int corRGB) {
        return new Color(corRGB, corRGB, corRGB).getRGB();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aplicarFiltro;
    private javax.swing.JButton btSelctImage;
    private javax.swing.ButtonGroup buttonGroupAlgoritmos;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelImgInput;
    private javax.swing.JPanel panelImgOutput;
    // End of variables declaration//GEN-END:variables
}