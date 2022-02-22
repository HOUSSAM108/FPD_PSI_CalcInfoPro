import java.awt.Toolkit;
import java.io.FileWriter;
import java.io.IOException;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Calcinfo extends javax.swing.JFrame {
   
  //hacemos una instancia del motor de java script
   ScriptEngineManager sem = new ScriptEngineManager();
   ScriptEngine se = sem.getEngineByName("JavaScript");
   //variables convertir numero a bin,hex,oct
    String resultado;
    String oct;
    String hex;
    String bin;
   boolean isProHidden = true;
   
    public Calcinfo() {
        initComponents();
        //centrar el programa en el centro de la pantalla
        setLocationRelativeTo(null);
        //Cambiar el tamaño de la ventana
        setSize(333, 555);
        //esconder el texto (bin,dec,hex,oct)
        jLabel_info_bin_resultado.hide();
        jLabel_info_bin_texto.hide();
        jLabel_info_dec_resultado.hide();
        jLabel_info_dec_texto.hide();
        jLabel_info_hex_resultado.hide();
        jLabel_info_hex_texto.hide();
        jLabel_info_oct_resultado.hide();
        jLabel_info_oct_texto.hide();
        JTextArea1.hide();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_pantalla_segundaria = new javax.swing.JLabel();
        jLabel_pantalla_resultado = new javax.swing.JLabel();
        jLabel_info_bin_texto = new javax.swing.JLabel();
        jLabel_info_oct_texto = new javax.swing.JLabel();
        jLabel_info_dec_texto = new javax.swing.JLabel();
        jLabel_info_hex_texto = new javax.swing.JLabel();
        jLabel_info_hex_resultado = new javax.swing.JLabel();
        jLabel_info_dec_resultado = new javax.swing.JLabel();
        jLabel_info_oct_resultado = new javax.swing.JLabel();
        jLabel_info_bin_resultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton_opracion_igual = new javax.swing.JButton();
        jButtonCalcIInfoPro_Ver = new javax.swing.JButton();
        jButton_opracion_quitar = new javax.swing.JButton();
        jButton_opracion_porciento = new javax.swing.JButton();
        jButton_borrar = new javax.swing.JButton();
        jButton_borrar1 = new javax.swing.JButton();
        jButton_borrar2 = new javax.swing.JButton();
        jButton_borrar3 = new javax.swing.JButton();
        jButton_borrar4 = new javax.swing.JButton();
        jButton_borrar5 = new javax.swing.JButton();
        jButton_borrar6 = new javax.swing.JButton();
        jButton_borrar7 = new javax.swing.JButton();
        jButton_borrar8 = new javax.swing.JButton();
        jButton_borrar9 = new javax.swing.JButton();
        jButton_borrar10 = new javax.swing.JButton();
        jButton_borrar11 = new javax.swing.JButton();
        jButton_borrar12 = new javax.swing.JButton();
        jButton_borrar13 = new javax.swing.JButton();
        jButton_borrar14 = new javax.swing.JButton();
        jButton_borrar15 = new javax.swing.JButton();
        jButton_ExportarArchivo = new javax.swing.JButton();
        jButton_opracion_porciento1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULADORA_INFO PRO");
        setMinimumSize(new java.awt.Dimension(333, 535));
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(241, 251, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_pantalla_segundaria.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel_pantalla_segundaria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel_pantalla_segundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 150, 30));

        jLabel_pantalla_resultado.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel_pantalla_resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel_pantalla_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 170, 60));

        jLabel_info_bin_texto.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel_info_bin_texto.setText("BIN");
        jPanel1.add(jLabel_info_bin_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel_info_oct_texto.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel_info_oct_texto.setText("OCT");
        jPanel1.add(jLabel_info_oct_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel_info_dec_texto.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel_info_dec_texto.setText("DEC");
        jPanel1.add(jLabel_info_dec_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel_info_hex_texto.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel_info_hex_texto.setText("HEX");
        jPanel1.add(jLabel_info_hex_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel_info_hex_resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel_info_hex_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 90, 20));

        jLabel_info_dec_resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel_info_dec_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 90, 20));

        jLabel_info_oct_resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel_info_oct_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 70, 90, 20));

        jLabel_info_bin_resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel_info_bin_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 90, 20));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 340, 140);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_opracion_igual.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jButton_opracion_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2Grande.png"))); // NOI18N
        jButton_opracion_igual.setText("=");
        jButton_opracion_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_opracion_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2Grande.png"))); // NOI18N
        jButton_opracion_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2Grande_pulsado.png"))); // NOI18N
        jButton_opracion_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_opracion_igualActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_opracion_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 130, 50));

        jButtonCalcIInfoPro_Ver.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jButtonCalcIInfoPro_Ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2Grande.png"))); // NOI18N
        jButtonCalcIInfoPro_Ver.setText("CalcInfo PRO");
        jButtonCalcIInfoPro_Ver.setFocusPainted(false);
        jButtonCalcIInfoPro_Ver.setFocusable(false);
        jButtonCalcIInfoPro_Ver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCalcIInfoPro_Ver.setMaximumSize(new java.awt.Dimension(100, 25));
        jButtonCalcIInfoPro_Ver.setMinimumSize(new java.awt.Dimension(100, 25));
        jButtonCalcIInfoPro_Ver.setPreferredSize(new java.awt.Dimension(100, 25));
        jButtonCalcIInfoPro_Ver.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2Grande.png"))); // NOI18N
        jButtonCalcIInfoPro_Ver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2Grande_pulsado.png"))); // NOI18N
        jButtonCalcIInfoPro_Ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcIInfoPro_VerActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCalcIInfoPro_Ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 50));

        jButton_opracion_quitar.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        jButton_opracion_quitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnBorrar1.png"))); // NOI18N
        jButton_opracion_quitar.setContentAreaFilled(false);
        jButton_opracion_quitar.setFocusable(false);
        jButton_opracion_quitar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_opracion_quitar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnBorrar1.png"))); // NOI18N
        jButton_opracion_quitar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_pulsadoBorrar1.png"))); // NOI18N
        jButton_opracion_quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_opracion_quitarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_opracion_quitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 50, 50));

        jButton_opracion_porciento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton_opracion_porciento.setText("%");
        jButton_opracion_porciento.setContentAreaFilled(false);
        jButton_opracion_porciento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_opracion_porciento.setFocusable(false);
        jButton_opracion_porciento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_opracion_porciento.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton_opracion_porciento.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pulsado.png"))); // NOI18N
        jButton_opracion_porciento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_opracion_porcientoActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_opracion_porciento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 50, 50));

        jButton_borrar.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jButton_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_Borratodo1.png"))); // NOI18N
        jButton_borrar.setContentAreaFilled(false);
        jButton_borrar.setFocusPainted(false);
        jButton_borrar.setFocusable(false);
        jButton_borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_borrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_Borratodo1.png"))); // NOI18N
        jButton_borrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_PulsadoBorratodo1.png"))); // NOI18N
        jButton_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 50, 50));

        jButton_borrar1.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jButton_borrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        jButton_borrar1.setText("3");
        jButton_borrar1.setContentAreaFilled(false);
        jButton_borrar1.setFocusPainted(false);
        jButton_borrar1.setFocusable(false);
        jButton_borrar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_borrar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton_borrar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pulsado.png"))); // NOI18N
        jButton_borrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_borrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 50, 50));

        jButton_borrar2.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jButton_borrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        jButton_borrar2.setText("7");
        jButton_borrar2.setContentAreaFilled(false);
        jButton_borrar2.setFocusPainted(false);
        jButton_borrar2.setFocusable(false);
        jButton_borrar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_borrar2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton_borrar2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pulsado.png"))); // NOI18N
        jButton_borrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_borrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 50, 50));

        jButton_borrar3.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jButton_borrar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        jButton_borrar3.setText("4");
        jButton_borrar3.setContentAreaFilled(false);
        jButton_borrar3.setFocusPainted(false);
        jButton_borrar3.setFocusable(false);
        jButton_borrar3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_borrar3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton_borrar3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pulsado.png"))); // NOI18N
        jButton_borrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_borrar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 50, 50));

        jButton_borrar4.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jButton_borrar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        jButton_borrar4.setText("1");
        jButton_borrar4.setContentAreaFilled(false);
        jButton_borrar4.setFocusPainted(false);
        jButton_borrar4.setFocusable(false);
        jButton_borrar4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_borrar4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton_borrar4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pulsado.png"))); // NOI18N
        jButton_borrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_borrar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 50, 50));

        jButton_borrar5.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jButton_borrar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        jButton_borrar5.setText("0");
        jButton_borrar5.setContentAreaFilled(false);
        jButton_borrar5.setFocusPainted(false);
        jButton_borrar5.setFocusable(false);
        jButton_borrar5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_borrar5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton_borrar5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pulsado.png"))); // NOI18N
        jButton_borrar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_borrar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 50, 50));

        jButton_borrar6.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jButton_borrar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        jButton_borrar6.setText(".");
        jButton_borrar6.setContentAreaFilled(false);
        jButton_borrar6.setFocusPainted(false);
        jButton_borrar6.setFocusable(false);
        jButton_borrar6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_borrar6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton_borrar6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pulsado.png"))); // NOI18N
        jButton_borrar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_borrar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 50, 50));

        jButton_borrar7.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jButton_borrar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        jButton_borrar7.setText("2");
        jButton_borrar7.setContentAreaFilled(false);
        jButton_borrar7.setFocusPainted(false);
        jButton_borrar7.setFocusable(false);
        jButton_borrar7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_borrar7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton_borrar7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pulsado.png"))); // NOI18N
        jButton_borrar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_borrar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 50, 50));

        jButton_borrar8.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jButton_borrar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        jButton_borrar8.setText("5");
        jButton_borrar8.setContentAreaFilled(false);
        jButton_borrar8.setFocusPainted(false);
        jButton_borrar8.setFocusable(false);
        jButton_borrar8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_borrar8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton_borrar8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pulsado.png"))); // NOI18N
        jButton_borrar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_borrar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 50, 50));

        jButton_borrar9.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jButton_borrar9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        jButton_borrar9.setText("8");
        jButton_borrar9.setContentAreaFilled(false);
        jButton_borrar9.setFocusPainted(false);
        jButton_borrar9.setFocusable(false);
        jButton_borrar9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_borrar9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton_borrar9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pulsado.png"))); // NOI18N
        jButton_borrar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_borrar9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 50, 50));

        jButton_borrar10.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jButton_borrar10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton_borrar10.setText("+");
        jButton_borrar10.setContentAreaFilled(false);
        jButton_borrar10.setFocusPainted(false);
        jButton_borrar10.setFocusable(false);
        jButton_borrar10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_borrar10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton_borrar10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pulsado.png"))); // NOI18N
        jButton_borrar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_borrar10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 50, 50));

        jButton_borrar11.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jButton_borrar11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        jButton_borrar11.setText("6");
        jButton_borrar11.setContentAreaFilled(false);
        jButton_borrar11.setFocusPainted(false);
        jButton_borrar11.setFocusable(false);
        jButton_borrar11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_borrar11.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton_borrar11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pulsado.png"))); // NOI18N
        jButton_borrar11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_borrar11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 50, 50));

        jButton_borrar12.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jButton_borrar12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        jButton_borrar12.setText("9");
        jButton_borrar12.setContentAreaFilled(false);
        jButton_borrar12.setFocusPainted(false);
        jButton_borrar12.setFocusable(false);
        jButton_borrar12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_borrar12.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton_borrar12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pulsado.png"))); // NOI18N
        jButton_borrar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_borrar12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 50, 50));

        jButton_borrar13.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jButton_borrar13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton_borrar13.setText("/");
        jButton_borrar13.setContentAreaFilled(false);
        jButton_borrar13.setFocusPainted(false);
        jButton_borrar13.setFocusable(false);
        jButton_borrar13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_borrar13.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton_borrar13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pulsado.png"))); // NOI18N
        jButton_borrar13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_borrar13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 50, 50));

        jButton_borrar14.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jButton_borrar14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton_borrar14.setText("X");
        jButton_borrar14.setContentAreaFilled(false);
        jButton_borrar14.setFocusPainted(false);
        jButton_borrar14.setFocusable(false);
        jButton_borrar14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_borrar14.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton_borrar14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pulsado.png"))); // NOI18N
        jButton_borrar14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_borrar14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 50, 50));

        jButton_borrar15.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jButton_borrar15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton_borrar15.setText("-");
        jButton_borrar15.setContentAreaFilled(false);
        jButton_borrar15.setFocusPainted(false);
        jButton_borrar15.setFocusable(false);
        jButton_borrar15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_borrar15.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton_borrar15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pulsado.png"))); // NOI18N
        jButton_borrar15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_borrar15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 50, 50));

        jButton_ExportarArchivo.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        jButton_ExportarArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGuardarArchivo1.png"))); // NOI18N
        jButton_ExportarArchivo.setContentAreaFilled(false);
        jButton_ExportarArchivo.setFocusable(false);
        jButton_ExportarArchivo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_ExportarArchivo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGuardarArchivo1.png"))); // NOI18N
        jButton_ExportarArchivo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_PulsadoGuardarArchivo1.png"))); // NOI18N
        jButton_ExportarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExportarArchivoActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_ExportarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 50, 50));

        jButton_opracion_porciento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnSalir1.png"))); // NOI18N
        jButton_opracion_porciento1.setContentAreaFilled(false);
        jButton_opracion_porciento1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_opracion_porciento1.setFocusable(false);
        jButton_opracion_porciento1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_opracion_porciento1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnSalir1.png"))); // NOI18N
        jButton_opracion_porciento1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_pulsadoSalir1.png"))); // NOI18N
        jButton_opracion_porciento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_opracion_porciento1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_opracion_porciento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 50, 50));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 140, 340, 420);

        JTextArea1.setColumns(20);
        JTextArea1.setRows(5);
        jScrollPane1.setViewportView(JTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 330, 140);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_opracion_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_opracion_igualActionPerformed
//el motor de javascript va ha evaular nuestra operacion que saldra en la parte arriba 
       try{
            resultado = se.eval(jLabel_pantalla_segundaria.getText()).toString();    
            jLabel_pantalla_resultado.setText(resultado);
            actualizarNumeros();
       }catch(Exception e){
           //jButton_borrar.doClick();
       }
        
    }//GEN-LAST:event_jButton_opracion_igualActionPerformed

    private void jButtonCalcIInfoPro_VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcIInfoPro_VerActionPerformed
        try{
        if(isProHidden){
        isProHidden=false;  
        //Mostrar eltexto (bin,dec,hex,oct)
        jLabel_info_bin_resultado.setVisible(true);
        jLabel_info_bin_texto.setVisible(true);
        jLabel_info_dec_resultado.setVisible(true);
        jLabel_info_dec_texto.setVisible(true);
        jLabel_info_hex_resultado.setVisible(true);
        jLabel_info_hex_texto.setVisible(true);
        jLabel_info_oct_resultado.setVisible(true);
        jLabel_info_oct_texto.setVisible(true);
        actualizarNumeros();
        }else{
        isProHidden=true;
            jLabel_info_bin_resultado.hide();
            jLabel_info_bin_texto.hide();
            jLabel_info_dec_resultado.hide();
            jLabel_info_dec_texto.hide();
            jLabel_info_hex_resultado.hide();
            jLabel_info_hex_texto.hide();
            jLabel_info_oct_resultado.hide();
            jLabel_info_oct_texto.hide();
            
        }
        }catch(Exception q){
        }
    }//GEN-LAST:event_jButtonCalcIInfoPro_VerActionPerformed

    public void actualizarNumeros(){
        //convertir el resultado de la operacion a binario 
        //coje la variable resultado y la convierte en integer
        int resbin = Integer.parseInt(resultado);
        //convierte el resultado(resbin) a binario y luego se guarda en un string(bin)
         bin = Integer.toBinaryString(resbin);
        //muestra el resulta en la labe(jLabel_info_bin_resultado)
        jLabel_info_bin_resultado.setText(bin);
        //mostrar el resultado  
        jLabel_info_dec_resultado.setText(resultado);
        //convertir el resultado de la operacion a hexadecimal 
        int reshex = Integer.parseInt(resultado);
         hex = Integer.toHexString(reshex);
        jLabel_info_hex_resultado.setText(hex);
        //convertir el resultado de la operacion a octal 
        int resoct = Integer.parseInt(resultado);
         oct = Integer.toOctalString(resoct);
        jLabel_info_oct_resultado.setText(oct);
         //JTextArea1.setText("Octal = " + oct);
    }
    public void addnumero(String numero){ 
        //muestra el numero en la parte superior.
        jLabel_pantalla_segundaria.setText(jLabel_pantalla_segundaria.getText()+numero);      
    }
   public void Mostrartexto(){
       JTextArea1.setText("Decimal = " + resultado + "\n" + "Hexadecimal = " + hex + "\n"+ "Octal = " + oct + "\n" + "Binario = " + bin);
   }
   private void Exportar() {
        try {
                JFileChooser archivo = new JFileChooser(System.getProperty("user.dir"));
                archivo.showSaveDialog(this);
                if (archivo.getSelectedFile() != null) {
                try (FileWriter guardado = new FileWriter(archivo.getSelectedFile())) {
                guardado.write(JTextArea1.getText());
                JOptionPane.showMessageDialog(rootPane, "El archivo fue guardado con éxito en la ruta establecida");
            }
        }
        } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
   public void run(){

    JFrame frame = new JFrame("CalcInfo Pro");
    frame.setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes/IconWinCalcInfo 32x32.ong"));

}
    private void jButton_opracion_quitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_opracion_quitarActionPerformed
        try{
        //borrar un digito solo
        String texto = jLabel_pantalla_segundaria.getText().substring(0,jLabel_pantalla_segundaria.getText().length()-1);
        jLabel_pantalla_segundaria.setText(texto);
        jButton_opracion_igual.doClick();
        }catch(Exception w){
        }
    }//GEN-LAST:event_jButton_opracion_quitarActionPerformed

   
    private void jButton_opracion_porcientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_opracion_porcientoActionPerformed
        addnumero("%");
        
    }//GEN-LAST:event_jButton_opracion_porcientoActionPerformed

    private void jButton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrarActionPerformed
      //borrar texto
        jLabel_pantalla_resultado.setText("");
        jLabel_pantalla_segundaria.setText("");
        jLabel_info_bin_resultado.setText("");
        jLabel_info_dec_resultado.setText("");
        jLabel_info_hex_resultado.setText("");
        jLabel_info_oct_resultado.setText("");
       
    }//GEN-LAST:event_jButton_borrarActionPerformed

    private void jButton_borrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrar1ActionPerformed
        addnumero("3");
        jButton_opracion_igual.doClick();
    }//GEN-LAST:event_jButton_borrar1ActionPerformed

    private void jButton_borrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrar2ActionPerformed
        addnumero("7");
        jButton_opracion_igual.doClick();
    }//GEN-LAST:event_jButton_borrar2ActionPerformed

    private void jButton_borrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrar3ActionPerformed
        addnumero("4");  
        jButton_opracion_igual.doClick();
    }//GEN-LAST:event_jButton_borrar3ActionPerformed

    private void jButton_borrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrar4ActionPerformed
       addnumero("1");
       jButton_opracion_igual.doClick();
    }//GEN-LAST:event_jButton_borrar4ActionPerformed

    private void jButton_borrar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrar5ActionPerformed
        addnumero("0");
        jButton_opracion_igual.doClick();
    }//GEN-LAST:event_jButton_borrar5ActionPerformed

    private void jButton_borrar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrar6ActionPerformed
        addnumero(".");
        jButton_opracion_igual.doClick();
    }//GEN-LAST:event_jButton_borrar6ActionPerformed

    private void jButton_borrar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrar7ActionPerformed
        addnumero("2");
        jButton_opracion_igual.doClick();
    }//GEN-LAST:event_jButton_borrar7ActionPerformed

    private void jButton_borrar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrar8ActionPerformed
        addnumero("5");
        jButton_opracion_igual.doClick();
    }//GEN-LAST:event_jButton_borrar8ActionPerformed

    private void jButton_borrar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrar9ActionPerformed
        addnumero("8");
        jButton_opracion_igual.doClick();
    }//GEN-LAST:event_jButton_borrar9ActionPerformed

    private void jButton_borrar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrar10ActionPerformed
        addnumero("+");
    }//GEN-LAST:event_jButton_borrar10ActionPerformed

    private void jButton_borrar11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrar11ActionPerformed
       addnumero("6");
       jButton_opracion_igual.doClick();
    }//GEN-LAST:event_jButton_borrar11ActionPerformed

    private void jButton_borrar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrar12ActionPerformed
        addnumero("9");
        jButton_opracion_igual.doClick();
    }//GEN-LAST:event_jButton_borrar12ActionPerformed

    private void jButton_borrar13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrar13ActionPerformed
        addnumero("/"); 
    }//GEN-LAST:event_jButton_borrar13ActionPerformed

    private void jButton_borrar14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrar14ActionPerformed
        addnumero("*");
    }//GEN-LAST:event_jButton_borrar14ActionPerformed

    private void jButton_borrar15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrar15ActionPerformed
        addnumero("-");
    }//GEN-LAST:event_jButton_borrar15ActionPerformed

    private void jButton_ExportarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExportarArchivoActionPerformed
       Mostrartexto();
       Exportar();
    }//GEN-LAST:event_jButton_ExportarArchivoActionPerformed

    private void jButton_opracion_porciento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_opracion_porciento1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_opracion_porciento1ActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(Calcinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calcinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calcinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calcinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calcinfo().setVisible(true);
            }
        });
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JTextArea1;
    private javax.swing.JButton jButtonCalcIInfoPro_Ver;
    private javax.swing.JButton jButton_ExportarArchivo;
    private javax.swing.JButton jButton_borrar;
    private javax.swing.JButton jButton_borrar1;
    private javax.swing.JButton jButton_borrar10;
    private javax.swing.JButton jButton_borrar11;
    private javax.swing.JButton jButton_borrar12;
    private javax.swing.JButton jButton_borrar13;
    private javax.swing.JButton jButton_borrar14;
    private javax.swing.JButton jButton_borrar15;
    private javax.swing.JButton jButton_borrar2;
    private javax.swing.JButton jButton_borrar3;
    private javax.swing.JButton jButton_borrar4;
    private javax.swing.JButton jButton_borrar5;
    private javax.swing.JButton jButton_borrar6;
    private javax.swing.JButton jButton_borrar7;
    private javax.swing.JButton jButton_borrar8;
    private javax.swing.JButton jButton_borrar9;
    private javax.swing.JButton jButton_opracion_igual;
    private javax.swing.JButton jButton_opracion_porciento;
    private javax.swing.JButton jButton_opracion_porciento1;
    private javax.swing.JButton jButton_opracion_quitar;
    private javax.swing.JLabel jLabel_info_bin_resultado;
    private javax.swing.JLabel jLabel_info_bin_texto;
    private javax.swing.JLabel jLabel_info_dec_resultado;
    private javax.swing.JLabel jLabel_info_dec_texto;
    private javax.swing.JLabel jLabel_info_hex_resultado;
    private javax.swing.JLabel jLabel_info_hex_texto;
    private javax.swing.JLabel jLabel_info_oct_resultado;
    private javax.swing.JLabel jLabel_info_oct_texto;
    private javax.swing.JLabel jLabel_pantalla_resultado;
    private javax.swing.JLabel jLabel_pantalla_segundaria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
