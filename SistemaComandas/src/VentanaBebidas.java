
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author proye
 */
public class VentanaBebidas extends javax.swing.JDialog {

    private VentanaPrincipal ventanaPrincipal;
    private VentanaMesa1 ventanaMesa1;
    private int cantidadCocaCola = 0;
    private Item item;

    /**
     * Creates new form VentanaBebidas
     */
    public VentanaBebidas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public int getCantidadCocaCola() {
        return cantidadCocaCola;
    }

    public void setCantidadCocaCola(int cantidadCocaCola) {
        this.cantidadCocaCola = cantidadCocaCola;
    }
    
    

    public VentanaPrincipal getVentanaPrincipal() {
        return ventanaPrincipal;
    }

    public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }

    public VentanaMesa1 getVentanaMesa1() {
        return ventanaMesa1;
    }

    public void setVentanaMesa1(VentanaMesa1 ventanaMesa1) {
        this.ventanaMesa1 = ventanaMesa1;
    }

    public void generarActionListeners() {
        this.jButtonFanta.addActionListener(new MiActionListener());
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBebidas = new javax.swing.JPanel();
        jButtonCocaCola = new javax.swing.JButton();
        jButtonFanta = new javax.swing.JButton();
        jButtonCania = new javax.swing.JButton();
        jButtonCancelarBebida = new javax.swing.JButton();

        jButtonCocaCola.setText("Cocacola");
        jButtonCocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCocaColaActionPerformed(evt);
            }
        });

        jButtonFanta.setText("Fanta");

        jButtonCania.setText("Caña");

        javax.swing.GroupLayout jPanelBebidasLayout = new javax.swing.GroupLayout(jPanelBebidas);
        jPanelBebidas.setLayout(jPanelBebidasLayout);
        jPanelBebidasLayout.setHorizontalGroup(
            jPanelBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBebidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCocaCola)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jButtonFanta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButtonCania, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBebidasLayout.setVerticalGroup(
            jPanelBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBebidasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonCocaCola, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(jButtonFanta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCania, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jButtonCancelarBebida.setText("Cancelar");
        jButtonCancelarBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarBebidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCancelarBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelarBebida, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarBebidaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.ventanaMesa1.setVisible(true);
    }//GEN-LAST:event_jButtonCancelarBebidaActionPerformed

    private void jButtonCocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCocaColaActionPerformed
        // TODO add your handling code here:
        item = new Item("Cocacola", "Bebida", this.ventanaMesa1.getMesa().cantidadItem("Cocacola")+1, "icono.jpeg", 1);
        if (item.getCantidad() > 1) {
            this.ventanaMesa1.getMesa().aniadirItem(item);
        } else {
            this.ventanaMesa1.getMesa().getItems().add(item);
        }
        this.ventanaMesa1.getjTableItems().setModel(new ItemsTableModel(this.ventanaMesa1.getMesa().getItems()));
        this.dispose();
        this.ventanaMesa1.setVisible(true);
    }//GEN-LAST:event_jButtonCocaColaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaBebidas dialog = new VentanaBebidas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonCancelarBebida;
    private javax.swing.JButton jButtonCania;
    private javax.swing.JButton jButtonCocaCola;
    private javax.swing.JButton jButtonFanta;
    private javax.swing.JPanel jPanelBebidas;
    // End of variables declaration//GEN-END:variables
}
