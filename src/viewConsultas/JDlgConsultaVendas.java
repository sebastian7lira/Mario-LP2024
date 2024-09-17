/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewConsultas;

import bean.ClienteMsl;
import bean.VendasMsl;
import dao.ClienteDAO;
import dao.VendasDAO;
import java.util.List;
import tools.UtilMsl;
import viewControle.VendasControle;

/**
 *
 * @author Sebas
 */
public class JDlgConsultaVendas extends javax.swing.JDialog {
    private VendasControle vendasControle;
    VendasMsl vendasMsl;    
    VendasDAO vendasDAO;
    /**
     * Creates new form JDlgConsultaVenda
     */
    public JDlgConsultaVendas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Consultar Vendas");
        vendasControle = new VendasControle();
        vendasDAO = new VendasDAO();
        List lista = vendasDAO.listAll();
        vendasControle.setList(lista);
        jTable1.setModel(vendasControle);
        
        ClienteDAO clienteDAO = new ClienteDAO();
        List listaClientes = clienteDAO.listAll();
        for (int i = 0; i < listaClientes.size(); i++) {
            jCboClienteMsl.addItem((ClienteMsl) listaClientes.get(i));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBtnConsultarMsl = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTxtValorMsl = new javax.swing.JTextField();
        jCboClienteMsl = new javax.swing.JComboBox<ClienteMsl>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Nome do Cliente");

        jBtnConsultarMsl.setText("Consultar");
        jBtnConsultarMsl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsultarMslActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor");

        jTxtValorMsl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtValorMslActionPerformed(evt);
            }
        });

        jCboClienteMsl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboClienteMslActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jCboClienteMsl, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTxtValorMsl, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnConsultarMsl)
                        .addGap(42, 42, 42))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtValorMsl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnConsultarMsl)
                    .addComponent(jCboClienteMsl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnConsultarMslActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsultarMslActionPerformed
    if (jCboClienteMsl.getSelectedItem() == null && jTxtValorMsl.getText().isEmpty()) {
            List lista = vendasDAO.listAll();
            vendasControle.setList(lista);
        } else {
            if (jCboClienteMsl.getSelectedItem() != null && !jTxtValorMsl.getText().isEmpty()) {
                ClienteMsl clienteMsl = (ClienteMsl) jCboClienteMsl.getSelectedItem();
                double valor = UtilMsl.strDouble(jTxtValorMsl.getText());
                jTxtValorMsl.setText(String.valueOf(valor));
                List lista = vendasDAO.listNomeValor(clienteMsl.getNomeMsl(), valor);
                vendasControle.setList(lista);
            } else {
                if (jCboClienteMsl.getSelectedItem() != null) {
                    ClienteMsl clienteMsl = (ClienteMsl) jCboClienteMsl.getSelectedItem();
                    List lista = vendasDAO.listNome(clienteMsl.getNomeMsl());
                    vendasControle.setList(lista);
                }
                if (!jTxtValorMsl.getText().isEmpty()) {
                    double valor = Double.parseDouble(jTxtValorMsl.getText());  
                    List lista = vendasDAO.listValor(valor);
                    vendasControle.setList(lista);
                    }
                }
            }
    }//GEN-LAST:event_jBtnConsultarMslActionPerformed

    private void jTxtValorMslActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtValorMslActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtValorMslActionPerformed

    private void jCboClienteMslActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboClienteMslActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboClienteMslActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDlgConsultaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgConsultaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgConsultaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgConsultaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgConsultaVendas dialog = new JDlgConsultaVendas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnConsultarMsl;
    private javax.swing.JComboBox<ClienteMsl> jCboClienteMsl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtValorMsl;
    // End of variables declaration//GEN-END:variables
}