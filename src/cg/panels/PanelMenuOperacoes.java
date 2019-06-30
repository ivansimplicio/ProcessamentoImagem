package cg.panels;

import cg.enums.EnumOperacoes;
import javax.swing.JRadioButton;

/**
 * Painel de exibição do menu operações a serem selecionados pelo usuário.
 * 
 * @author Ivanildo Simplício
 */
public class PanelMenuOperacoes extends javax.swing.JPanel {

    private static PanelMenuOperacoes instance;
    private EnumOperacoes tipoAlgoritimo;

    public static synchronized PanelMenuOperacoes getInstance() {
        if (instance == null) {
            instance = new PanelMenuOperacoes();
        }
        return instance;
    }

    /**
     * Construtor: inicia o jpanel.
     */
    private PanelMenuOperacoes() {
        initComponents();
    }

    /**
     * Retorna o tipo de algoritmo selecionado.
     */
    public EnumOperacoes getTipoAlgoritimo() {
        if (rbAdicao.isSelected()) {
            tipoAlgoritimo = EnumOperacoes.ADICAO;
        } else if (rbSubstracao.isSelected()) {
            tipoAlgoritimo = EnumOperacoes.SUBSTRACAO;
        } else if (rbMultiplicacao.isSelected()) {
            tipoAlgoritimo = EnumOperacoes.MULTIPLICACAO;
        } else if (rbDivisao.isSelected()) {
            tipoAlgoritimo = EnumOperacoes.DIVISAO;
        } else if (rbAND.isSelected()) {
            tipoAlgoritimo = EnumOperacoes.AND;
        } else if (rbOR.isSelected()) {
            tipoAlgoritimo = EnumOperacoes.OR;
        } else if (rbXOR.isSelected()) {
            tipoAlgoritimo = EnumOperacoes.XOR;
        }
        return tipoAlgoritimo;
    }

    public void setTipoAlgoritimo(EnumOperacoes tipoAlgoritimo) {
        this.tipoAlgoritimo = tipoAlgoritimo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupFiltros = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        rbAdicao = new javax.swing.JRadioButton();
        rbSubstracao = new javax.swing.JRadioButton();
        rbMultiplicacao = new javax.swing.JRadioButton();
        rbDivisao = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        rbOR = new javax.swing.JRadioButton();
        rbAND = new javax.swing.JRadioButton();
        rbXOR = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(240, 32767));
        setMinimumSize(new java.awt.Dimension(240, 0));
        setPreferredSize(new java.awt.Dimension(240, 779));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroupFiltros.add(rbAdicao);
        rbAdicao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbAdicao.setSelected(true);
        rbAdicao.setText("Adição");
        rbAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbSubstracao);
        rbSubstracao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbSubstracao.setText("Subtração");
        rbSubstracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbMultiplicacao);
        rbMultiplicacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbMultiplicacao.setText("Multiplicação");
        rbMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbDivisao);
        rbDivisao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbDivisao.setText("Divisão");
        rbDivisao.addActionListener(new java.awt.event.ActionListener() {
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
                    .addComponent(rbAdicao)
                    .addComponent(rbSubstracao)
                    .addComponent(rbMultiplicacao)
                    .addComponent(rbDivisao))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbAdicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbSubstracao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbMultiplicacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbDivisao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroupFiltros.add(rbOR);
        rbOR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbOR.setText("OR");
        rbOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbAND);
        rbAND.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbAND.setText("AND");
        rbAND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbXOR);
        rbXOR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbXOR.setText("XOR");
        rbXOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbOR)
                    .addComponent(rbAND)
                    .addComponent(rbXOR))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbOR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAND)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbXOR)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Escolha a operação aritmética desejada:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Escolha a opção lógica desejada:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(513, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Configura o panel de acordo com a opção selecionada.
     */
    private void filtrosSelect(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrosSelect
        JRadioButton radio = (JRadioButton) evt.getSource();
        PanelOperacoes.getInstance().setTitle("Operação selecionada: " + radio.getText());
        PanelOperacoes.panelImgOutput.repaint();
    }//GEN-LAST:event_filtrosSelect


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupFiltros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton rbAND;
    private javax.swing.JRadioButton rbAdicao;
    private javax.swing.JRadioButton rbDivisao;
    private javax.swing.JRadioButton rbMultiplicacao;
    private javax.swing.JRadioButton rbOR;
    private javax.swing.JRadioButton rbSubstracao;
    private javax.swing.JRadioButton rbXOR;
    // End of variables declaration//GEN-END:variables
}