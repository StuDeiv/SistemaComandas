
import java.awt.Button;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author proye
 */
public class VentanaMesa1 extends javax.swing.JDialog {

    private VentanaPrincipal ventanaPrincipal;
    private VentanaItems ventanaItems;
    private LogicaMesa logicaMesa;
    private LogicaItems logicaItems;
    private ItemsTableModel itm;
    private Mesa mesa;
    private ImageIcon entrantes;
    private ImageIcon bebidas;
    private ImageIcon primeros;
    private ImageIcon segundos;
    private ImageIcon postres;

    /**
     * Creates new form VentanaMesa1
     */
    public VentanaMesa1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ventanaPrincipal = (VentanaPrincipal) parent;
        logicaItems = new LogicaItems(ventanaPrincipal);
        mesa = new Mesa();
        this.jTableItems.setModel(new ItemsTableModel(this.mesa.getItems()));
        inicializarVentanas();
        fijarIconosBotones();
    }

    public void inicializarMesa() {
    }

    public Item obtenerInfoItemsPorNombre(String nombreItem) {
        return this.logicaItems.obtenerDatosItem(nombreItem);
    }

    public void inicializarVentanas() {
        ventanaItems = new VentanaItems(ventanaPrincipal, true);
    }

    public void introducirBotones(String tipo) {
        this.ventanaItems.getjPanel1().setLayout(new GridLayout(9, 9));
        this.ventanaItems.getjPanel1().setMaximumSize(new Dimension(250, 500));
        for (Item item : this.logicaItems.getListaItems()) {
            if (item.getTipo().contains(tipo)) {
                JButton boton = new JButton();
                boton.setActionCommand(item.getNombre());
                establecerIconoBoton(boton, item);
                boton.addActionListener(new MiActionListener(ventanaItems, this, boton.getActionCommand().toString()));
                boton.setPreferredSize(new Dimension(150, 150));
                boton.setLabel(item.getNombre());
                this.ventanaItems.getjPanel1().add(boton);
            }
        }
    }

    private void establecerIconoBoton(JButton boton, Item item) {
        System.out.println(item.getTipo());
        switch (item.getTipo()) {
            case "Entrantes":
                boton.setIcon(adaptarImageIcon(entrantes));
                break;
            case "Primeros":
                boton.setIcon(adaptarImageIcon(primeros));
                break;
            case "Segundos":
                boton.setIcon(adaptarImageIcon(segundos));
                break;
            case "Postres":
                boton.setIcon(adaptarImageIcon(postres));
                break;
            case "Bebida":
                boton.setIcon(adaptarImageIcon(bebidas));
                break;
        }
    }

    private void fijarIconosBotones() {
        entrantes = new ImageIcon(getClass().getResource("entrantes.png"));
        bebidas = new ImageIcon(getClass().getResource("bebidas.png"));
        primeros = new ImageIcon(getClass().getResource("primeros.jpg"));
        segundos = new ImageIcon(getClass().getResource("segundos.png"));
        postres = new ImageIcon(getClass().getResource("postres.jpg"));
    }

    private ImageIcon adaptarImageIcon(ImageIcon image) {
        Image img = image.getImage();
        Image newimg = img.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(newimg);
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public JTable getjTableItems() {
        return jTableItems;
    }

    public void setjTableItems(JTable jTableItems) {
        this.jTableItems = jTableItems;
    }

    public LogicaItems getLogicaItems() {
        return logicaItems;
    }

    public void setLogicaItems(LogicaItems logicaItems) {
        this.logicaItems = logicaItems;
    }

    public LogicaMesa getLogicaMesa() {
        return logicaMesa;
    }

    public void setLogicaMesa(LogicaMesa logicaMesa) {
        this.logicaMesa = logicaMesa;
    }

    public JLabel getjLabelMesasId() {
        return jLabelMesasId;
    }

    public ItemsTableModel getItm() {
        return itm;
    }

    public void setItm(ItemsTableModel itm) {
        this.itm = itm;
    }

    public int corregirGetSelectRow() {
        return this.jTableItems.convertRowIndexToModel(jTableItems.getSelectedRow());
    }

    public void establecerTableModelItem() {
        this.jTableItems.setModel(new ItemsTableModel(mesa.getItems()));
        this.jTableItems.updateUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMesasId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableItems = new javax.swing.JTable();
        jButtonEntrantes = new javax.swing.JButton();
        jButtonBebidas = new javax.swing.JButton();
        jButtonPrimeros = new javax.swing.JButton();
        jButtonSegundos = new javax.swing.JButton();
        jButtonPostres = new javax.swing.JButton();
        jButtonEliminarItem = new javax.swing.JButton();
        jButtonVolverMesas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelMesasId.setText("Mesa Nº");

        jTableItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableItems.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTableItems);
        jTableItems.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jButtonEntrantes.setText("Entrantes");
        jButtonEntrantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrantesActionPerformed(evt);
            }
        });

        jButtonBebidas.setText("Bebidas");
        jButtonBebidas.setActionCommand("Bebida");
        jButtonBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBebidasActionPerformed(evt);
            }
        });

        jButtonPrimeros.setText("Primeros");
        jButtonPrimeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimerosActionPerformed(evt);
            }
        });

        jButtonSegundos.setText("Segundos");
        jButtonSegundos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSegundosActionPerformed(evt);
            }
        });

        jButtonPostres.setText("Postres");
        jButtonPostres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPostresActionPerformed(evt);
            }
        });

        jButtonEliminarItem.setText("Eliminar Item");
        jButtonEliminarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarItemActionPerformed(evt);
            }
        });

        jButtonVolverMesas.setText("Volver a Mesas");
        jButtonVolverMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverMesasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEliminarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonEntrantes, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jButtonPrimeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPostres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabelMesasId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSegundos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBebidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jButtonVolverMesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMesasId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEntrantes, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSegundos, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(jButtonPrimeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPostres, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVolverMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBebidasActionPerformed
        // TODO add your handling code here:
        this.dispose();
        introducirBotones(this.jButtonBebidas.getActionCommand());
        this.ventanaItems.setVentanaMesa1(this);
        this.ventanaItems.setVisible(true);
    }//GEN-LAST:event_jButtonBebidasActionPerformed

    private void jButtonVolverMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverMesasActionPerformed
        // TODO add your handling code here
        this.ventanaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVolverMesasActionPerformed

    private void reiniciarLogicaItems() {
        this.logicaItems.getListaItems().clear();
        this.logicaItems.setListaItems(new ArrayList<>());
    }

    private void jButtonEntrantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrantesActionPerformed
        // TODO add your handling code here:
        this.dispose();
        introducirBotones(this.jButtonEntrantes.getActionCommand());
        this.ventanaItems.setVentanaMesa1(this);
        this.ventanaItems.setVisible(true);
    }//GEN-LAST:event_jButtonEntrantesActionPerformed

    private void jButtonPrimerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimerosActionPerformed
        // TODO add your handling code here:
        this.dispose();
        introducirBotones(this.jButtonPrimeros.getActionCommand());
        this.ventanaItems.setVentanaMesa1(this);
        this.ventanaItems.setVisible(true);
    }//GEN-LAST:event_jButtonPrimerosActionPerformed

    private void jButtonSegundosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSegundosActionPerformed
        // TODO add your handling code here:
        this.dispose();
        introducirBotones(this.jButtonSegundos.getActionCommand());
        //this.ventanasSegundos.setVisible(true);
        this.ventanaItems.setVentanaMesa1(this);
        this.ventanaItems.setVisible(true);
    }//GEN-LAST:event_jButtonSegundosActionPerformed

    private void jButtonPostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPostresActionPerformed
        // TODO add your handling code here:
        this.dispose();
        introducirBotones(this.jButtonPostres.getActionCommand());
        this.ventanaItems.setVentanaMesa1(this);
        this.ventanaItems.setVisible(true);
    }//GEN-LAST:event_jButtonPostresActionPerformed

    private void jButtonEliminarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarItemActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = corregirGetSelectRow();
        ItemsTableModel itm = (ItemsTableModel) this.jTableItems.getModel();
        if (filaSeleccionada >= 0) {
            itm.removeRow(filaSeleccionada);
            this.mesa.getItems().remove(filaSeleccionada);
            establecerTableModelItem();
        }
    }//GEN-LAST:event_jButtonEliminarItemActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaMesa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMesa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMesa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMesa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaMesa1 dialog = new VentanaMesa1(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonBebidas;
    private javax.swing.JButton jButtonEliminarItem;
    private javax.swing.JButton jButtonEntrantes;
    private javax.swing.JButton jButtonPostres;
    private javax.swing.JButton jButtonPrimeros;
    private javax.swing.JButton jButtonSegundos;
    private javax.swing.JButton jButtonVolverMesas;
    private javax.swing.JLabel jLabelMesasId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableItems;
    // End of variables declaration//GEN-END:variables
}
