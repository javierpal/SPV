/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author Javier
 */
public class Venta extends javax.swing.JPanel {

    /**
     * Creates new form MainPanel
     */
    public Venta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel8 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox();
        Cliente = new javax.swing.JLabel();
        Buscar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel4.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel4.setMinimumSize(new java.awt.Dimension(766, 100));
        jPanel4.setPreferredSize(new java.awt.Dimension(500, 100));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel10.setMaximumSize(new java.awt.Dimension(32767, 25));
        jPanel10.setMinimumSize(new java.awt.Dimension(56, 25));
        jPanel10.setPreferredSize(new java.awt.Dimension(812, 25));
        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Captura por Cliente", "Captura Continuada" }));
        jPanel10.add(jComboBox1);

        jPanel4.add(jPanel10);

        jPanel8.setMaximumSize(new java.awt.Dimension(32767, 30));
        jPanel8.setMinimumSize(new java.awt.Dimension(373, 30));
        jPanel8.setPreferredSize(new java.awt.Dimension(820, 30));
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cliente Recurrente", "Cliente Ocacional" }));
        jPanel8.add(jComboBox2);

        Cliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cliente.setText("Cliente");
        jPanel8.add(Cliente);

        Buscar.setMaximumSize(new java.awt.Dimension(2147483647, 25));
        Buscar.setMinimumSize(new java.awt.Dimension(6, 25));
        Buscar.setPreferredSize(new java.awt.Dimension(300, 25));
        jPanel8.add(Buscar);

        jButton2.setText("Buscar");
        jPanel8.add(jButton2);

        jPanel4.add(jPanel8);

        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel1.setMinimumSize(new java.awt.Dimension(766, 40));
        jPanel1.setPreferredSize(new java.awt.Dimension(766, 40));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(350, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(250, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 20));
        jPanel1.add(jLabel1);

        jLabel2.setText("jLabel1");
        jLabel2.setMaximumSize(new java.awt.Dimension(350, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel1.add(jLabel2);

        jPanel4.add(jPanel1);

        add(jPanel4);

        jPanel5.setMaximumSize(new java.awt.Dimension(32767, 1000));
        jPanel5.setMinimumSize(new java.awt.Dimension(0, 90));
        jPanel5.setPreferredSize(new java.awt.Dimension(812, 300));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

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

        jPanel2.add(jScrollPane1);

        jPanel5.add(jPanel2);

        add(jPanel5);

        jPanel6.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel6.setMinimumSize(new java.awt.Dimension(0, 100));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setText("Producto");
        jPanel3.add(jLabel3);

        jButton3.setText("...");
        jPanel3.add(jButton3);
        jPanel3.add(jTextField1);

        jButton1.setText("Agregar");
        jPanel3.add(jButton1);

        jPanel6.add(jPanel3);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel9);

        add(jPanel6);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscar;
    private javax.swing.JLabel Cliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
