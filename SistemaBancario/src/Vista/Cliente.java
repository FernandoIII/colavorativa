/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Clientes;
import Controlador.Persona;
import Controlador.Usuarios;
import static Vista.Cuenta.txtnumero_cliente1;
import static java.awt.AWTEventMulticaster.remove;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.conexion;


/**
 *
 * @author MINEDUC
 */
public class Cliente extends javax.swing.JFrame {

    String datos[] = new String[13];

    DefaultTableModel m;
    Persona datos_persona2 = new Persona();
    Clientes dato_cliente=new Clientes();
    PreparedStatement objeto_persona2, objeto_cliente;
    TableRowSorter buscar;
    String filtro;

    public Cliente() {
        initComponents();
        Ncliente();
        llamado_bases("");
        
    }
    public  void llamado_bases(String valor){
        String Cabecera[] = {"N°CLIENTE", "CEDULA", "NOMBRE", "APELLIDO", "PROVINCIA",
            "CIUDAD", "DIRECCION", "EDAD", "ESTADO CIVIL", "TELEFONO", "CELULAR", "FECHA DE N.","FECHA DE R."};
        String datos[][] = {};
        m = new DefaultTableModel(datos, Cabecera);
        tbclientes.setModel(m);
         String sql = "";
        if (valor.equals("")) {
            sql = "Select Numero_cliente,Cedula,Nombre,Apellido,Provincia,Ciudad,Direccion,edad,Estado_civil,Telefono,Celular,fecha_nacimiento,fecha_registro from persona INNER JOIN cliente where Cedula=idCliente "; // variable para cdigo dml

        } else {
            JOptionPane.showMessageDialog(null, "NO HAY USUARIOS REGISTRADOS");
        }
        String[] datos_tabla = new String[13];
        try {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos_tabla[0] = rs.getString(1);
                datos_tabla[1] = rs.getString(2);
                datos_tabla[2] = rs.getString(3);
                datos_tabla[3] = rs.getString(4);
                datos_tabla[4] = rs.getString(5);
                datos_tabla[5] = rs.getString(6);
                datos_tabla[6] = rs.getString(7);
               datos_tabla[7]=rs.getString(8);
               datos_tabla[8]=rs.getString(9);
               datos_tabla[9]=rs.getString(10);
               datos_tabla[10]=rs.getString(11);
               datos_tabla[11]=rs.getString(12);
               datos_tabla[12]=rs.getString(13);

                m.addRow(datos_tabla);
            }
            tbclientes.setModel(m);
        } catch (Exception e) {

}
    }

    public static void Ncliente() {
        Random nc = new Random();
        int n = nc.nextInt(3816);
        txtncliente.setText(String.valueOf(n));
    }

    public static void habilitar() {
        btnguardar.setEnabled(true);
    }

    public static void inhabilitar() {
        btnguardar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu2 = new javax.swing.JPopupMenu();
        Editar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        jprovincia = new javax.swing.JComboBox();
        jciudad = new javax.swing.JComboBox();
        txtdireccion = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtestado_civil = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtbuscarcliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbclientes = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtncliente = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        Editar.setText("Editar");
        Editar.setComponentPopupMenu(jPopupMenu2);
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        jPopupMenu2.add(Editar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cedula");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Provincia");

        jLabel5.setText("Ciudad");

        jLabel6.setText("Direccion");

        jLabel7.setText("Fecha de nacimiento");

        jLabel8.setText("Edad");

        jLabel9.setText("Estado civil");

        jLabel10.setText("Telefono");

        jLabel11.setText("Celular");

        jLabel12.setText("Fecha de registro");

        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });

        jprovincia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LOJA", "CUENCA", "QUITO", "GUAYAS", "OTRA" }));

        jciudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CATAMAYO", "LOJA", "AMABATO", "GUAYAQUIL", "QUITO", "OTRA" }));

        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdireccionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });

        txtedad.setEditable(false);
        txtedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtedadMouseClicked(evt);
            }
        });

        txtestado_civil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtestado_civilKeyTyped(evt);
            }
        });

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        txtcelular.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtcelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcelularActionPerformed(evt);
            }
        });
        txtcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcelularKeyTyped(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtbuscarcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarclienteKeyTyped(evt);
            }
        });

        tbclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbclientes.setComponentPopupMenu(jPopupMenu2);
        jScrollPane1.setViewportView(tbclientes);

        jButton2.setText("REGISTRAR CUENTA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnguardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnguardar.setText("GUARDAR ");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnmodificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnmodificar.setText("MODIDFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        jButton5.setText("LIMPIAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("SALIR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Viner Hand ITC", 3, 36)); // NOI18N
        jLabel13.setText("REGISTRO DE CLIENTES");

        jLabel14.setText("N° CLIENTE");

        txtncliente.setEditable(false);

        jButton3.setText("volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1)
                        .addGap(43, 43, 43)
                        .addComponent(txtbuscarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(119, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(45, 45, 45))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addGap(51, 51, 51)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel1))
                                                .addGap(50, 50, 50)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jciudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtapellido)
                                            .addComponent(txtdireccion)
                                            .addComponent(txtnombre)
                                            .addComponent(txtcedula)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addGap(257, 257, 257)
                                        .addComponent(jLabel13)))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(36, 36, 36)
                                        .addComponent(txtncliente, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel11))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtedad, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(txtestado_civil)
                            .addComponent(txttelefono)
                            .addComponent(txtcelular))
                        .addGap(138, 138, 138))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtncliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtestado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addComponent(jciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtbuscarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        {
            int limite = 10;
            if (txtcedula.getText().length() == limite) {
                evt.consume();
            }
            Controlador.Persona.validadorDeCedula(txtcedula.getText());
        }

    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyPressed

    }//GEN-LAST:event_txtnombreKeyPressed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtdireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyReleased

    }//GEN-LAST:event_txtdireccionKeyReleased

    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtdireccionKeyTyped

    private void txtedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtedadMouseClicked
        Date fn=jdfecha_nacimiento.getDate();
        Date fr=jdfecha_registro.getDate();
        txtedad.setText(String.valueOf(Controlador.Clientes.obtener(fr, fn)));
        if (Integer.parseInt(txtedad.getText())==0){
            txtedad.setText("");
        }

    }//GEN-LAST:event_txtedadMouseClicked

    private void txtestado_civilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtestado_civilKeyTyped
        char c=evt.getKeyChar();
        if((c<'a'|| c>'z')&&(c<'A'||c>'Z'))evt.consume();
    }//GEN-LAST:event_txtestado_civilKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped

        int limite  = 8;
        if (txttelefono.getText().length()== limite)evt.consume();
        char c=evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtcelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcelularActionPerformed

    private void txtcelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcelularKeyTyped
        int limite  = 10;
        if (txtcelular.getText().length()== limite)evt.consume();
        char c=evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_txtcelularKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed
     public void filtro() {
        filtro = txtcedula.getText();
        buscar.setRowFilter(RowFilter.regexFilter(txtcedula.getText(), 0));

    }
    private void txtbuscarclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarclienteKeyTyped
        txtcedula.addKeyListener(new KeyAdapter() {
            public void keyTyped(final KeyEvent e) {
                String cadena = (txtcedula.getText());
                txtcedula.setText(cadena);
                //repaint();
                filtro();
            }
        });
        buscar=new TableRowSorter(tbclientes.getModel());
        tbclientes.setRowSorter(buscar);

    }//GEN-LAST:event_txtbuscarclienteKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Cuenta v1=new Cuenta();
        v1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if (!"".equals(txtapellido.getText()) &&  !"".equals(txtcedula.getText()) && !"".equals(txtcelular.getText())
            && !"".equals(txtdireccion.getText())  && !"".equals (txtedad.getText() ) && !"".equals(txtestado_civil.getText())  && txtnombre != null && txttelefono != null) {

            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
            String fecha_cadena,fecha_cadena1;
           
        try {

            // almacenado de valores en variables para flujo de datos
            String nombre = txtnombre.getText(),
                    apellido = txtapellido.getText(),
                    provincia = jprovincia.getSelectedItem().toString(),
                    ciuddad = jciudad.getSelectedItem().toString(),
                    direccion = txtdireccion.getText(),
                    estado = txtestado_civil.getText(); //DATOS DE PERSONA
            int n_cliente = Integer.parseInt(txtncliente.getText());//DATOS DE CLIENTE
            fecha_cadena = formatoFecha.format(jdfecha_nacimiento.getDate());fecha_cadena1= formatoFecha.format(jdfecha_registro.getDate());//DATOS DE CLIENTE
            int cedula = Integer.parseInt(txtcedula.getText()),
                    edad = Integer.parseInt(txtedad.getText()),
                    telefono = Integer.parseInt(txttelefono.getText()),
                    celular = Integer.parseInt(txtcelular.getText());//DATOS DE PERSONA
            //if (contrasena.equals(verificacion_contrasena)) {
            // GUARDADO DE INFORMACION PERSONA
            datos_persona2.setCedula(cedula);
            datos_persona2.setNombre(nombre);
            datos_persona2.setApellido(apellido);
            datos_persona2.setProvincia(provincia);
            datos_persona2.setCiudad(ciuddad);
            datos_persona2.setDireccion(direccion);
            datos_persona2.setEdad(edad);
            datos_persona2.setEstadoC(estado);
            datos_persona2.setTelefono(telefono);
            datos_persona2.setCelular(celular);
            // GUARDADO DE INFORMACION USUARIO
            dato_cliente.setNumCliente(n_cliente);
            dato_cliente.setNacimiento(fecha_cadena);
            dato_cliente.setRegistro(fecha_cadena1);
                //insercion de valores en la tabla persona
                objeto_persona2 = cn.prepareStatement("INSERT INTO persona (Cedula,Nombre,Apellido,Provincia,Ciudad,Direccion,edad,Estado_civil,Telefono,Celular) VALUES (?,?,?,?,?,?,?,?,?,?)"); // codigo sql DE ALMACENADO EN TABLA PERSONA
                
                objeto_persona2.setString(1, String.valueOf(datos_persona2.getCedula()));
                objeto_persona2.setString(2, datos_persona2.getNombre());
                objeto_persona2.setString(3, datos_persona2.getApellido());
                objeto_persona2.setString(4, datos_persona2.getProvincia());
                objeto_persona2.setString(5,datos_persona2.getCiudad());
                objeto_persona2.setString(6,datos_persona2.getDireccion());
                objeto_persona2.setInt(7,datos_persona2.getEdad());
                objeto_persona2.setString(8,datos_persona2.getEstadoC());
                objeto_persona2.setInt(9,datos_persona2.getTelefono());
                objeto_persona2.setInt(10, datos_persona2.getCelular());
                objeto_persona2.executeUpdate();
                //insercion de valores en la tabla cliente
                objeto_cliente = cn.prepareStatement("INSERT INTO cliente(idCliente,Numero_cliente,fecha_registro,fecha_nacimiento) VALUES (?,?,?,?)"); //codigo sql DE ALMACENADO EN USUARIO
                objeto_cliente.setString(1, String.valueOf(datos_persona2.getCedula()));
                objeto_cliente.setInt(2, dato_cliente.getNumCliente());
                objeto_cliente.setString(3,dato_cliente.getNacimiento());
                objeto_cliente.setString(4,dato_cliente.getRegistro());
                objeto_cliente.executeUpdate();
                llamado_bases("");  // AMAR AL NUEVO VALOR AGREGADO EN LA BASE DE DATOS
                
                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");

        } catch (NumberFormatException | SQLException | HeadlessException e) {
            System.out.println(e.getMessage());
        }

        }
        else{
            JOptionPane.showMessageDialog(null, " DEBE LLENAR TODOS LOS CAMPOS");
        }

    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        try {

            PreparedStatement pst = (PreparedStatement) cn.prepareStatement("UPDATE persona SET  Nombre='" + txtnombre.getText() + 
                    "',Apellido='" + txtapellido.getText() + "',Provincia='" + jprovincia.getSelectedItem().toString()
                    +"',Ciudad='"+jciudad.getSelectedItem().toString()+  "',Direccion='" + txtdireccion.getText()+ 
                    "',edad='"+Integer.parseInt(txtedad.getText())+"',Estado_civil='"+txtestado_civil.getText()+"',Telefono='" + Integer.parseInt(txttelefono.getText())
                    +"',Celular='"+Integer.parseInt(txtcelular.getText()) +"'Where Cedula="+Integer.parseInt(txtcedula.getText())+  "");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATOS MODIFICADOS CORRECTAMENTE");
            llamado_bases("");  // AMAR AL NUEVO VALOR AGREGADO EN LA BASE DE DATOS
           

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // limpiar cajas de texto
        txtapellido.setText(null);
        txtbuscarcliente.setText(null);
        txtcedula.setText(null);
        txtcelular.setText(null);
        txtdireccion.setText(null);
        txtedad.setText(null);
        txtestado_civil.setText(null);
        txtnombre.setText(null);
        txttelefono.setText(null);
        txtncliente.setText(null);
        jdfecha_nacimiento.setCalendar(null);
        jprovincia.setSelectedIndex(0);
        Ncliente();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed
    
    private void jdfecha_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdfecha_registroMouseClicked

    }//GEN-LAST:event_jdfecha_registroMouseClicked

    private void jdfecha_nacimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdfecha_nacimientoMouseClicked

    }//GEN-LAST:event_jdfecha_nacimientoMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        int fila = tbclientes.getSelectedRow();
        Date fecha_nacimiento;
        SimpleDateFormat variable_fecha = new SimpleDateFormat("dd-MM-yyyy");
        //  PASAR DATOS A LAS CELDAS
        if (fila >= 0) {
            txtncliente.setText(tbclientes.getValueAt(fila, 0).toString());
            txtcedula.setText(tbclientes.getValueAt(fila, 1).toString());
            txtnombre.setText(tbclientes.getValueAt(fila, 2).toString());
            txtapellido.setText(tbclientes.getValueAt(fila, 3).toString());
            jprovincia.setSelectedItem(tbclientes.getValueAt(fila, 4).toString());
            jciudad.setSelectedItem(tbclientes.getValueAt(fila, 5).toString());
            txtdireccion.setText(tbclientes.getValueAt(fila, 6).toString());
            txtedad.setText(tbclientes.getValueAt(fila, 7).toString());
            txtestado_civil.setText(tbclientes.getValueAt(fila, 8).toString());
            txttelefono.setText(tbclientes.getValueAt(fila, 9).toString());
            txtcelular.setText(tbclientes.getValueAt(fila, 10).toString());
            try {
                fecha_nacimiento = variable_fecha.parse(tbclientes.getValueAt(fila, 11).toString());
                jdfecha_nacimiento.setDate(fecha_nacimiento);

            } catch (ParseException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
           

            //          jdfecha_registro.setDate((Date) tbclientes.getValueAt(fila,11));
        } else {
            JOptionPane.showMessageDialog(null, "NINGUNA FILA SELECIONADA");
        }

    }//GEN-LAST:event_EditarActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Editar;
    public static javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jciudad;
    private javax.swing.JComboBox jprovincia;
    public static javax.swing.JTable tbclientes;
    public static javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtbuscarcliente;
    public static javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtestado_civil;
    public static javax.swing.JTextField txtncliente;
    public static javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
 conexion cc=new conexion();
    Connection cn=cc.conexion();
}
