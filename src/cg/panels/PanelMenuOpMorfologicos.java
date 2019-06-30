package cg.panels;

import cg.enums.EnumOpMorfologicos;
import javax.swing.JRadioButton;

/**
 * Painel com menu de opções para seleção do operador morfológico a ser aplicado na imagem.
 * 
 * @author Ivanildo Simplício
 */
public class PanelMenuOpMorfologicos extends javax.swing.JPanel {

    private static PanelMenuOpMorfologicos instance;
    private EnumOpMorfologicos tipoOperacao;

    public static synchronized PanelMenuOpMorfologicos getInstance() {
        if (instance == null) {
            instance = new PanelMenuOpMorfologicos();
        }
        return instance;
    }

    /**
     * Construtor: inicia os componentes do jpanel.
     */
    private PanelMenuOpMorfologicos() {
        initComponents();
    }

    public EnumOpMorfologicos getTipoAlgoritimo() {
        if (rbDilatacao.isSelected()) {
            setTipoAlgoritimo(EnumOpMorfologicos.DILATACAO);
        } else if (rbErosao.isSelected()) {
            setTipoAlgoritimo(EnumOpMorfologicos.EROSAO);
        } else if (rbGradienteMorfologico.isSelected()) {
            setTipoAlgoritimo(EnumOpMorfologicos.GRADIENTE);
        } else if (rbAbertura.isSelected()) {
            setTipoAlgoritimo(EnumOpMorfologicos.ABERTURA);
        } else if (rbFechamento.isSelected()) {
            setTipoAlgoritimo(EnumOpMorfologicos.FECHAMENTO);
        } else if (rbTopHat.isSelected()) {
            setTipoAlgoritimo(EnumOpMorfologicos.TOP_HAT);
        } else if (rbBottomHat.isSelected()) {
            setTipoAlgoritimo(EnumOpMorfologicos.BOTTOM_HAT);
        }
        return tipoOperacao;
    }

    public void setTipoAlgoritimo(EnumOpMorfologicos tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupFiltros = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        rbDilatacao = new javax.swing.JRadioButton();
        rbErosao = new javax.swing.JRadioButton();
        rbAbertura = new javax.swing.JRadioButton();
        rbFechamento = new javax.swing.JRadioButton();
        rbTopHat = new javax.swing.JRadioButton();
        rbBottomHat = new javax.swing.JRadioButton();
        rbGradienteMorfologico = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(240, 32767));
        setMinimumSize(new java.awt.Dimension(240, 0));
        setPreferredSize(new java.awt.Dimension(240, 779));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroupFiltros.add(rbDilatacao);
        rbDilatacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbDilatacao.setSelected(true);
        rbDilatacao.setText("Dilatação");
        rbDilatacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbErosao);
        rbErosao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbErosao.setText("Erosão");
        rbErosao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbAbertura);
        rbAbertura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbAbertura.setText("Abertura");
        rbAbertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbFechamento);
        rbFechamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbFechamento.setText("Fechamento");
        rbFechamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbTopHat);
        rbTopHat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbTopHat.setText("Top-Hat");
        rbTopHat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbBottomHat);
        rbBottomHat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbBottomHat.setText("Bottom-Hat");
        rbBottomHat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbGradienteMorfologico);
        rbGradienteMorfologico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbGradienteMorfologico.setText("Gradiente Morfológico");
        rbGradienteMorfologico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbDilatacao)
                    .addComponent(rbErosao)
                    .addComponent(rbAbertura)
                    .addComponent(rbFechamento)
                    .addComponent(rbTopHat)
                    .addComponent(rbBottomHat)
                    .addComponent(rbGradienteMorfologico))
                .addGap(0, 67, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbDilatacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbErosao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbGradienteMorfologico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAbertura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbFechamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbTopHat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbBottomHat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Selecione uma operação:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(567, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void filtrosSelect(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrosSelect
        JRadioButton radio = (JRadioButton) evt.getSource();
        PanelOpMorfologicos.getInstance().setTitle("Operação Morfológica: " + radio.getText());
    }//GEN-LAST:event_filtrosSelect


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupFiltros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton rbAbertura;
    private javax.swing.JRadioButton rbBottomHat;
    private javax.swing.JRadioButton rbDilatacao;
    private javax.swing.JRadioButton rbErosao;
    private javax.swing.JRadioButton rbFechamento;
    private javax.swing.JRadioButton rbGradienteMorfologico;
    private javax.swing.JRadioButton rbTopHat;
    // End of variables declaration//GEN-END:variables
}