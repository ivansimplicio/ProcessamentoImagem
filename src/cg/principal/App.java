package cg.principal;

import cg.dialog.DialogSobre;
import cg.morfismo.MorphingCandS;
import cg.panels.PanelFiltros;
import cg.panels.PanelHistograma;
import cg.panels.PanelMenuFiltros;
import cg.panels.PanelMenuOpMorfologicos;
import cg.panels.PanelMenuOperacoes;
import cg.panels.PanelMenuTransformacoes;
import cg.panels.PanelOpMorfologicos;
import cg.panels.PanelOperacoes;
import cg.panels.PanelTranformacoes;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Frame principal da aplicação.
 * 
 * @author Ivanildo Simplício
 */
public class App extends javax.swing.JFrame {

    private final PanelMenuFiltros panelMenuFiltros;
    private final PanelMenuOperacoes panelMenuOperacoes;
    private final PanelMenuTransformacoes panelMenuTransformacoes;

    private final PanelFiltros panelFiltros;
    private final PanelOperacoes panelOperacoes;
    private final PanelTranformacoes panelTransformacoes;
    private final PanelHistograma panelHistograma;
    
    private final PanelMenuOpMorfologicos panelMenuOpMorfologicos;
    private final PanelOpMorfologicos panelOpMorfologicos;

    /**
     * Construtor para inicializar todos os paineis.
     */
    public App() {
        panelMenuFiltros = PanelMenuFiltros.getInstance();
        panelMenuOperacoes = PanelMenuOperacoes.getInstance();
        panelMenuTransformacoes = PanelMenuTransformacoes.getInstance();
        panelHistograma = PanelHistograma.getInstance();

        panelFiltros = PanelFiltros.getInstance();
        panelOperacoes = PanelOperacoes.getInstance();
        panelTransformacoes = PanelTranformacoes.getInstance();
        panelMenuOpMorfologicos = PanelMenuOpMorfologicos.getInstance();
        panelOpMorfologicos = PanelOpMorfologicos.getInstance();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        panelMenuLeft = new javax.swing.JPanel();
        panelBox = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        menuQ1 = new javax.swing.JMenu();
        itemMenuFiltros = new javax.swing.JMenuItem();
        itemMenuOperacoes = new javax.swing.JMenuItem();
        menuQ2 = new javax.swing.JMenu();
        menuQ3 = new javax.swing.JMenu();
        menuQ4 = new javax.swing.JMenu();
        menuQ5 = new javax.swing.JMenu();
        imgCinza = new javax.swing.JMenuItem();
        imgBinaria = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CG - Processamento de Imagem - 2019.1");
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setName("framePrincipal"); // NOI18N

        panelMenuLeft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelMenuLeft.setMinimumSize(new java.awt.Dimension(240, 0));
        panelMenuLeft.setPreferredSize(new java.awt.Dimension(240, 2));

        javax.swing.GroupLayout panelMenuLeftLayout = new javax.swing.GroupLayout(panelMenuLeft);
        panelMenuLeft.setLayout(panelMenuLeftLayout);
        panelMenuLeftLayout.setHorizontalGroup(
            panelMenuLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );
        panelMenuLeftLayout.setVerticalGroup(
            panelMenuLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBoxLayout = new javax.swing.GroupLayout(panelBox);
        panelBox.setLayout(panelBoxLayout);
        panelBoxLayout.setHorizontalGroup(
            panelBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 814, Short.MAX_VALUE)
        );
        panelBoxLayout.setVerticalGroup(
            panelBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
        );

        menuBar.setPreferredSize(new java.awt.Dimension(104, 25));

        menuQ1.setText("Q1. Filtros e Operações");

        itemMenuFiltros.setText("Filtros");
        itemMenuFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuFiltros(evt);
            }
        });
        menuQ1.add(itemMenuFiltros);

        itemMenuOperacoes.setText("Operações");
        itemMenuOperacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuOperacoes(evt);
            }
        });
        menuQ1.add(itemMenuOperacoes);

        menuBar.add(menuQ1);

        menuQ2.setText("Q2. Morfismo");
        menuQ2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuQ2MouseClicked(evt);
            }
        });
        menuBar.add(menuQ2);

        menuQ3.setText("Q3. Transformações");
        menuQ3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuQ3MouseClicked(evt);
            }
        });
        menuBar.add(menuQ3);

        menuQ4.setText("Q4. Equalização/Histograma");
        menuQ4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuQ4MouseClicked(evt);
            }
        });
        menuBar.add(menuQ4);

        menuQ5.setText("Q5. Operadores morfológicos");

        imgCinza.setText("Imagem em Nível de Cinza");
        imgCinza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgCinzaActionPerformed(evt);
            }
        });
        menuQ5.add(imgCinza);

        imgBinaria.setText("Imagem Binária");
        imgBinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgBinariaActionPerformed(evt);
            }
        });
        menuQ5.add(imgBinaria);

        menuBar.add(menuQ5);

        menuSobre.setText("Sobre");
        menuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openAbout(evt);
            }
        });
        menuBar.add(menuSobre);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMenuLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMenuLeft, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1096, 759));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Abre menu de filtros.
     */
    private void openMenuFiltros(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuFiltros
        panelMenuLeft.setVisible(true);
        panelBox.removeAll();
        changePanelCentral(panelFiltros);
        changeMenuLeft(panelMenuFiltros);
    }//GEN-LAST:event_openMenuFiltros

    /**
     * Abre menu de operações lógicas/aritméticas.
     */
    private void openMenuOperacoes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuOperacoes
        panelMenuLeft.setVisible(true);
        panelBox.removeAll();
        changePanelCentral(panelOperacoes);
        changeMenuLeft(panelMenuOperacoes);
    }//GEN-LAST:event_openMenuOperacoes

    /**
     * Abre o dialog "sobre".
     */
    private void openAbout(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openAbout
        new DialogSobre(this, true).setVisible(true);
    }//GEN-LAST:event_openAbout

    /**
     * Abre menu de equalização do histograma.
     */
    private void menuQ4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuQ4MouseClicked
        panelMenuLeft.setVisible(false);
        panelBox.removeAll();
        changePanelCentral(panelHistograma);
    }//GEN-LAST:event_menuQ4MouseClicked

    /**
     * Abre menu de transformações.
     */
    private void menuQ3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuQ3MouseClicked
        panelMenuLeft.setVisible(true);
        panelBox.removeAll();
        changePanelCentral(panelTransformacoes);
        changeMenuLeft(panelMenuTransformacoes);
    }//GEN-LAST:event_menuQ3MouseClicked

    /**
     * Abre a operação morfismo.
     */
    private void menuQ2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuQ2MouseClicked
        MorphingCandS m = new MorphingCandS();
        m.execute();
    }//GEN-LAST:event_menuQ2MouseClicked

    /**
     * documentar quando implementar...
     */
    private void imgBinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgBinariaActionPerformed
        JOptionPane.showMessageDialog(null, "Em construção...", "ALERTA", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_imgBinariaActionPerformed

    /**
     * Exibe o painel com as operações morfologicas em uma imagem.
     */
    private void imgCinzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgCinzaActionPerformed
        panelMenuLeft.setVisible(true);
        panelBox.removeAll();
        changePanelCentral(panelOpMorfologicos);
        changeMenuLeft(panelMenuOpMorfologicos);
    }//GEN-LAST:event_imgCinzaActionPerformed

    
    /**
     * Altera o jPanel do menu esquerdo de acordo com o jPanel passado como parâmetro.
     */
    private void changeMenuLeft(JPanel panel) {
        panelMenuLeft.removeAll();
        panelMenuLeft.repaint();
        panelMenuLeft.setLayout(new GridLayout());
        panelMenuLeft.add(panel);

        panelMenuLeft.validate();
    }

    /**
     * Altera o jPanel do central adicionando o novo componente passado como parâmetro.
     */
    private void changePanelCentral(Component component) {
        javax.swing.GroupLayout panelBoxLayout = new javax.swing.GroupLayout(panelBox);
        panelBox.setLayout(panelBoxLayout);
        panelBoxLayout.setHorizontalGroup(
                panelBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelBoxLayout.createSequentialGroup()
                                .addComponent(component, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
        );
        panelBoxLayout.setVerticalGroup(
                panelBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(component, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JMenuItem imgBinaria;
    private javax.swing.JMenuItem imgCinza;
    private javax.swing.JMenuItem itemMenuFiltros;
    private javax.swing.JMenuItem itemMenuOperacoes;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuQ1;
    private javax.swing.JMenu menuQ2;
    private javax.swing.JMenu menuQ3;
    private javax.swing.JMenu menuQ4;
    private javax.swing.JMenu menuQ5;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JPanel panelBox;
    private javax.swing.JPanel panelMenuLeft;
    // End of variables declaration//GEN-END:variables
}