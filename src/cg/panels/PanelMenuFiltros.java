package cg.panels;

import cg.enums.EnumFiltros;
import javax.swing.JRadioButton;

/**
 * Painel de exibição do menu filtros a serem selecionados pelo usuário.
 * 
 * @author Ivanildo Simplício
 */
public class PanelMenuFiltros extends javax.swing.JPanel {

    private static PanelMenuFiltros instance;
    private EnumFiltros tipoAlgoritimo;

    public static synchronized PanelMenuFiltros getInstance() {
        if (instance == null) {
            instance = new PanelMenuFiltros();
        }
        return instance;
    }

    /**
     * Construtor: inicia o jpanel.
     */
    private PanelMenuFiltros() {
        initComponents();
        panelDados.setVisible(false);
    }

    /**
     * Retorna o tipo de algoritmo selecionado.
     */
    public EnumFiltros getTipoAlgoritimo() {
        if (rbMedia.isSelected()) {
            PanelMenuFiltros.this.setTipoAlgoritimo(EnumFiltros.MEDIA);
        } else if (rbMediana.isSelected()) {
            PanelMenuFiltros.this.setTipoAlgoritimo(EnumFiltros.MEDIANA);
        } else if (rbAltoReforco.isSelected()) {
            PanelMenuFiltros.this.setTipoAlgoritimo(EnumFiltros.ALTO_REFORCO);
        } else if (rbPassaAlta.isSelected()) {
            PanelMenuFiltros.this.setTipoAlgoritimo(EnumFiltros.PASSA_ALTA_BASICO);
        } else if (rbPrewitt.isSelected()) {
            PanelMenuFiltros.this.setTipoAlgoritimo(EnumFiltros.OPERADOR_PEWITT);
        } else if (rbRoberts.isSelected()) {
            PanelMenuFiltros.this.setTipoAlgoritimo(EnumFiltros.OPERADOR_ROBERTS);
        } else if (rbSobel.isSelected()) {
            PanelMenuFiltros.this.setTipoAlgoritimo(EnumFiltros.OPERADOR_SOBEL);
        } else if (rbRobertsCruzado.isSelected()) {
            PanelMenuFiltros.this.setTipoAlgoritimo(EnumFiltros.OPERADOR_ROBERTS_CRUZADO);
        }
        return tipoAlgoritimo;
    }

    public void setTipoAlgoritimo(EnumFiltros tipoAlgoritimo) {
        this.tipoAlgoritimo = tipoAlgoritimo;
    }
    
    public double getA() {
        return (double) valorA.getValue();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupFiltros = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        rbMedia = new javax.swing.JRadioButton();
        rbMediana = new javax.swing.JRadioButton();
        rbPassaAlta = new javax.swing.JRadioButton();
        rbRoberts = new javax.swing.JRadioButton();
        rbPrewitt = new javax.swing.JRadioButton();
        rbAltoReforco = new javax.swing.JRadioButton();
        rbSobel = new javax.swing.JRadioButton();
        rbRobertsCruzado = new javax.swing.JRadioButton();
        panelDados = new javax.swing.JPanel();
        valorA = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(240, 32767));
        setMinimumSize(new java.awt.Dimension(240, 0));
        setPreferredSize(new java.awt.Dimension(240, 779));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroupFiltros.add(rbMedia);
        rbMedia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbMedia.setSelected(true);
        rbMedia.setText("Média");
        rbMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbMediana);
        rbMediana.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbMediana.setText("Mediana");
        rbMediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbPassaAlta);
        rbPassaAlta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbPassaAlta.setText("Passa alta básico");
        rbPassaAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbRoberts);
        rbRoberts.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbRoberts.setText("Operador de Robert’s");
        rbRoberts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbPrewitt);
        rbPrewitt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbPrewitt.setText("Operador de Prewitt");
        rbPrewitt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbAltoReforco);
        rbAltoReforco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbAltoReforco.setText("Alto Reforço (Hight-Boost)");
        rbAltoReforco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbSobel);
        rbSobel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbSobel.setText("Operador de Sobel");
        rbSobel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbRobertsCruzado);
        rbRobertsCruzado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbRobertsCruzado.setText("Operador de Robert’s Cruzado");
        rbRobertsCruzado.addActionListener(new java.awt.event.ActionListener() {
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
                    .addComponent(rbMedia)
                    .addComponent(rbMediana)
                    .addComponent(rbPassaAlta)
                    .addComponent(rbRoberts)
                    .addComponent(rbPrewitt)
                    .addComponent(rbAltoReforco)
                    .addComponent(rbSobel)
                    .addComponent(rbRobertsCruzado))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbMedia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbMediana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbPassaAlta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbRoberts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbRobertsCruzado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbPrewitt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAltoReforco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbSobel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelDados.setMaximumSize(new java.awt.Dimension(220, 80));
        panelDados.setMinimumSize(new java.awt.Dimension(220, 80));

        valorA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        valorA.setModel(new javax.swing.SpinnerNumberModel(1.1d, null, null, 0.1d));
        valorA.setMaximumSize(new java.awt.Dimension(30, 25));
        valorA.setMinimumSize(new java.awt.Dimension(30, 25));
        valorA.setPreferredSize(new java.awt.Dimension(30, 25));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Valor de A:");

        javax.swing.GroupLayout panelDadosLayout = new javax.swing.GroupLayout(panelDados);
        panelDados.setLayout(panelDadosLayout);
        panelDadosLayout.setHorizontalGroup(
            panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorA, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDadosLayout.setVerticalGroup(
            panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(valorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Selecione o filtro desejado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(491, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Configura o jpanel de acordo com a seleção do usuário.
     */
    private void filtrosSelect(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrosSelect
        JRadioButton radio = (JRadioButton) evt.getSource();
        PanelFiltros.getInstance().setTitle("Filtro selecionado: " + radio.getText());

        if (rbAltoReforco.isSelected()) {
            panelDados.setVisible(true);
        } else {
            panelDados.setVisible(false);
        }
    }//GEN-LAST:event_filtrosSelect


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupFiltros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel panelDados;
    private javax.swing.JRadioButton rbAltoReforco;
    private javax.swing.JRadioButton rbMedia;
    private javax.swing.JRadioButton rbMediana;
    private javax.swing.JRadioButton rbPassaAlta;
    private javax.swing.JRadioButton rbPrewitt;
    private javax.swing.JRadioButton rbRoberts;
    private javax.swing.JRadioButton rbRobertsCruzado;
    private javax.swing.JRadioButton rbSobel;
    private javax.swing.JSpinner valorA;
    // End of variables declaration//GEN-END:variables
}