package cg.panels;

import cg.enums.EnumTransformacoes;
import javax.swing.JRadioButton;

/**
 * Painel de exibição do menu transformações a serem selecionados pelo usuário.
 * 
 * @author Ivanildo Simplício
 */
public class PanelMenuTransformacoes extends javax.swing.JPanel {

    private static PanelMenuTransformacoes instance;
    private EnumTransformacoes tipoAlgoritimo;
    private float dados;

    public static synchronized PanelMenuTransformacoes getInstance() {
        if (instance == null) {
            instance = new PanelMenuTransformacoes();
        }
        return instance;
    }
    
    /**
     * Construtor: inicia o jpanel.
     */
    private PanelMenuTransformacoes() {
        initComponents();
        panelConfigGamma.setVisible(false);
        panelOp2.setVisible(false);
    }

    /**
     * Retorna os dados inseridos no componente.
     */
    public float getDados() {
        return (float) tfGammaY.getValue();
    }
    
    /**
     * Retorna os dados inseridos no componente. 
     */
    public int getSpinnerW(){
        return (int)spinnerW.getValue();
    }
    
    /**
     * Retorna os dados inseridos no componente. 
     */
    public int getSpinnerSize(){
        return (int)spinnerSize.getValue();
    }

    /**
     * Retorna o tipo de algoritmo selecionado pelo usuário.
     */
    public EnumTransformacoes getTipoAlgoritimo() {
        if (rbNegativo.isSelected()) {
            setTipoAlgoritimo(EnumTransformacoes.NEGATIVO);
        } else if (rbGamma.isSelected()) {
            setTipoAlgoritimo(EnumTransformacoes.GAMMA);
        } else if (rbLog.isSelected()) {
            setTipoAlgoritimo(EnumTransformacoes.LOG);
        } else if(rbITF.isSelected()){
            setTipoAlgoritimo(EnumTransformacoes.INTENSIDADE_GERAL);
        } else if(rbFaixaDinamica.isSelected()){
            setTipoAlgoritimo(EnumTransformacoes.FAIXA_DINAMICA);
        } else if(rbTransferenciaLinear.isSelected()){
            setTipoAlgoritimo(EnumTransformacoes.TRANSFERENCIA_LINEAR);
        }
        return tipoAlgoritimo;
    }

    public void setTipoAlgoritimo(EnumTransformacoes tipoAlgoritimo) {
        this.tipoAlgoritimo = tipoAlgoritimo;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupFiltros = new javax.swing.ButtonGroup();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        rbNegativo = new javax.swing.JRadioButton();
        rbGamma = new javax.swing.JRadioButton();
        rbLog = new javax.swing.JRadioButton();
        rbITF = new javax.swing.JRadioButton();
        rbFaixaDinamica = new javax.swing.JRadioButton();
        rbTransferenciaLinear = new javax.swing.JRadioButton();
        panelConfigGamma = new javax.swing.JPanel();
        lbInfor = new javax.swing.JLabel();
        tfGammaY = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        panelOp2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spinnerW = new javax.swing.JSpinner();
        spinnerSize = new javax.swing.JSpinner();

        jRadioButton3.setText("jRadioButton3");

        setMaximumSize(new java.awt.Dimension(240, 32767));
        setMinimumSize(new java.awt.Dimension(240, 0));
        setPreferredSize(new java.awt.Dimension(240, 779));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroupFiltros.add(rbNegativo);
        rbNegativo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbNegativo.setSelected(true);
        rbNegativo.setText("Negativo");
        rbNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbGamma);
        rbGamma.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbGamma.setText("Gamma");
        rbGamma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbLog);
        rbLog.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbLog.setText("Logaritmo");
        rbLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbITF);
        rbITF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbITF.setText("F.T. de Intensidade Geral");
        rbITF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbFaixaDinamica);
        rbFaixaDinamica.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbFaixaDinamica.setText("F.T. Faixa Dinâmica");
        rbFaixaDinamica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbTransferenciaLinear);
        rbTransferenciaLinear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbTransferenciaLinear.setText("F.T. Linear");
        rbTransferenciaLinear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSelect(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbNegativo)
                    .addComponent(rbGamma)
                    .addComponent(rbLog)
                    .addComponent(rbITF)
                    .addComponent(rbFaixaDinamica)
                    .addComponent(rbTransferenciaLinear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbNegativo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbGamma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbLog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbITF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbFaixaDinamica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbTransferenciaLinear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelConfigGamma.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dados para operação"));

        lbInfor.setText("c = 1 e y = (0 <= y <= 1)");

        tfGammaY.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));
        tfGammaY.setMinimumSize(new java.awt.Dimension(29, 30));

        javax.swing.GroupLayout panelConfigGammaLayout = new javax.swing.GroupLayout(panelConfigGamma);
        panelConfigGamma.setLayout(panelConfigGammaLayout);
        panelConfigGammaLayout.setHorizontalGroup(
            panelConfigGammaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfigGammaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConfigGammaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConfigGammaLayout.createSequentialGroup()
                        .addComponent(lbInfor)
                        .addGap(0, 63, Short.MAX_VALUE))
                    .addComponent(tfGammaY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelConfigGammaLayout.setVerticalGroup(
            panelConfigGammaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfigGammaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbInfor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfGammaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Selecione o filtro desejado:");

        panelOp2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dados para operação"));

        jLabel2.setText("Centro dos valores (w):");

        jLabel3.setText("Tamanho da janela:");

        spinnerW.setModel(new javax.swing.SpinnerNumberModel(127, null, null, 1));

        spinnerSize.setModel(new javax.swing.SpinnerNumberModel(255, null, null, 1));

        javax.swing.GroupLayout panelOp2Layout = new javax.swing.GroupLayout(panelOp2);
        panelOp2.setLayout(panelOp2Layout);
        panelOp2Layout.setHorizontalGroup(
            panelOp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOp2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinnerW)
                    .addComponent(spinnerSize))
                .addContainerGap())
        );
        panelOp2Layout.setVerticalGroup(
            panelOp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOp2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spinnerW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spinnerSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelConfigGamma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelOp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelConfigGamma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(404, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Ajusta o jpanel de acordo com a opção selecionada pelo usuário.
     */
    private void rbSelect(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSelect
        JRadioButton radio = (JRadioButton) evt.getSource();
        PanelTranformacoes.getInstance().setTitle("Transformação: " + radio.getText());
        PanelTranformacoes.panelImgOutput.removeAll();
        PanelTranformacoes.panelImgOutput.repaint();
        
        if (rbNegativo.isSelected() || rbTransferenciaLinear.isSelected()) {
            panelConfigGamma.setVisible(false);
            panelOp2.setVisible(false);
        } else if(rbITF.isSelected()){
            panelOp2.setVisible(true);
            panelConfigGamma.setVisible(false);
        } else{
            panelOp2.setVisible(false);
            panelConfigGamma.setVisible(true);
            if (rbGamma.isSelected()) {
                lbInfor.setText("c = 1 e y = (0 <= y <= 1)");
            } else if(rbLog.isSelected()){
                lbInfor.setText("Constante \"a\"");
            } else if(rbFaixaDinamica.isSelected()){
                lbInfor.setText("w_target:");
            }
        }
    }//GEN-LAST:event_rbSelect


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupFiltros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JLabel lbInfor;
    private javax.swing.JPanel panelConfigGamma;
    private javax.swing.JPanel panelOp2;
    private javax.swing.JRadioButton rbFaixaDinamica;
    private javax.swing.JRadioButton rbGamma;
    private javax.swing.JRadioButton rbITF;
    private javax.swing.JRadioButton rbLog;
    private javax.swing.JRadioButton rbNegativo;
    private javax.swing.JRadioButton rbTransferenciaLinear;
    private javax.swing.JSpinner spinnerSize;
    private javax.swing.JSpinner spinnerW;
    private javax.swing.JSpinner tfGammaY;
    // End of variables declaration//GEN-END:variables
}