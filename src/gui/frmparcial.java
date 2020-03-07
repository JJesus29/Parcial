package gui;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class frmparcial extends javax.swing.JFrame {

    public frmparcial() {
        initComponents();
        DefaultTableModel mdltabla = new DefaultTableModel();
        mdltabla.addColumn("Id_Registro");
        mdltabla.addColumn("DNI");
        mdltabla.addColumn("Multa");
        mdltabla.addColumn("Monto");
        mdltabla.addColumn("Correo");
        TablaRegistro.setModel(mdltabla);
        Statement st = null;
        String[] tabla = new String[5];
        try {
            st = conectar().createStatement();
            String query = "select * from Registros";
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                tabla[0] = res.getString(1);
                tabla[1] = res.getString(2);
                tabla[2] = res.getString(3);
                tabla[3] = res.getString(4);
                tabla[4] = res.getString(5);
                mdltabla.addRow(tabla);

            }
        } catch (Exception e) {
        }

    }

    public static Connection conectar() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/Caceres?user=root&&password=mysqladmin";
            con = (Connection) DriverManager.getConnection(url);
            if (con != null) {
                System.out.println("Conexion satisfactoria");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
   

   
       
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRegistro = new javax.swing.JTable();
        CboReporte = new javax.swing.JButton();
        cboRegistrar = new javax.swing.JButton();
        txtDNI = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        cboMulta = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaRegistro.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaRegistroMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaRegistro);

        CboReporte.setText("Reporte");
        CboReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboReporteActionPerformed(evt);
            }
        });

        cboRegistrar.setText("Registrar");
        cboRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboRegistrarActionPerformed(evt);
            }
        });

        cboMulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta Velocidad", "Pasar Luz Roja", "Estacionar en Zona Prohibida", "Pico y Placa " }));

        jLabel1.setText("DNI:");

        jLabel2.setText("Monto:");

        jLabel3.setText("Multa:");

        jLabel4.setText("Correo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cboMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CboReporte)
                                .addGap(140, 140, 140)
                                .addComponent(cboRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(259, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(cboMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CboReporte)
                    .addComponent(cboRegistrar))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CboReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboReporteActionPerformed
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(frmparcial.class.getResource("./newReport.jasper"));
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conectar());
            JasperViewer jv = new JasperViewer(jp);
            jv.show();
        } catch (Exception e) {
            System.err.print(e);
        }
    }//GEN-LAST:event_CboReporteActionPerformed

    private void TablaRegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaRegistroMousePressed
      
    }//GEN-LAST:event_TablaRegistroMousePressed
    
    private void cboRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboRegistrarActionPerformed
        try {
            String Query = "call usp_insertar(? , ?, ?, ?)";
            PreparedStatement ps = conectar().prepareStatement(Query);
            
            ps.setString(1, txtDNI.getText());
            ps.setString(2, cboMulta.getSelectedItem().toString());
            ps.setString(3, txtMonto.getText());
            ps.setString(4, txtCorreo.getText());
            ps.executeUpdate();
            conectar().close();
            JOptionPane.showMessageDialog(null, "Se agrego un registro");
            conectar().close();
           
        } catch (SQLException | NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_cboRegistrarActionPerformed
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmparcial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CboReporte;
    private javax.swing.JTable TablaRegistro;
    private javax.swing.JComboBox<String> cboMulta;
    private javax.swing.JButton cboRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
