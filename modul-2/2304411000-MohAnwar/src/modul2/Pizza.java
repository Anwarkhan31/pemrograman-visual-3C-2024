/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modul2;
import javax.swing.JOptionPane;
        
/**
 *
 * @author LENOVO
 */
public class Pizza extends javax.swing.JFrame {
    
    double hargaPizza,hargaTopping;
    int jumlahPesanan;

    /**
     * Creates new form Pizza
     */
    public Pizza() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Topping4 = new javax.swing.JRadioButton();
        Topping3 = new javax.swing.JRadioButton();
        Topping1 = new javax.swing.JRadioButton();
        Topping2 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        Pizza1 = new javax.swing.JRadioButton();
        Pizza2 = new javax.swing.JRadioButton();
        Pizza7 = new javax.swing.JRadioButton();
        Pizza8 = new javax.swing.JRadioButton();
        Pizza3 = new javax.swing.JRadioButton();
        Pizza9 = new javax.swing.JRadioButton();
        Pizza4 = new javax.swing.JRadioButton();
        Pizza5 = new javax.swing.JRadioButton();
        Pizza6 = new javax.swing.JRadioButton();
        Reset = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        total = new javax.swing.JTextField();
        jumlahpesanan = new javax.swing.JTextField();
        cash = new javax.swing.JTextField();
        kembali = new javax.swing.JTextField();
        hitung = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Keluar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jPanel6.setBackground(new java.awt.Color(102, 255, 204));
        jPanel6.setForeground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 4, 4));
        jPanel1.setForeground(new java.awt.Color(255, 255, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("--Delicius--");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 160, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hot Pizza");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 320, 40));

        jPanel2.setBackground(new java.awt.Color(249, 120, 23));

        buttonGroup1.add(Topping4);
        Topping4.setText("Mold - Rp. 5.000");
        Topping4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Topping4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Topping3);
        Topping3.setText("Chicken - Rp. 7.000");
        Topping3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Topping3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Topping1);
        Topping1.setText("No Topping - Rp. 0");

        buttonGroup1.add(Topping2);
        Topping2.setText("Cheese - Rp. 5.000");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(Topping1)
                .addGap(18, 18, 18)
                .addComponent(Topping2)
                .addGap(18, 18, 18)
                .addComponent(Topping3)
                .addGap(18, 18, 18)
                .addComponent(Topping4)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Topping2)
                    .addComponent(Topping1)
                    .addComponent(Topping3)
                    .addComponent(Topping4))
                .addGap(52, 52, 52))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 630, 60));

        jPanel3.setBackground(new java.awt.Color(249, 120, 23));

        buttonGroup2.add(Pizza1);
        Pizza1.setText("Chili Chicken - 19.000");

        buttonGroup2.add(Pizza2);
        Pizza2.setText("Chicken Mayo - 25.000");
        Pizza2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pizza2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(Pizza7);
        Pizza7.setText("Smoked beef - Rp.20.000");

        buttonGroup2.add(Pizza8);
        Pizza8.setText("Deluxe Chicken - Rp.33.000");
        Pizza8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pizza8ActionPerformed(evt);
            }
        });

        buttonGroup2.add(Pizza3);
        Pizza3.setText("Spicy beef - 22.000");

        buttonGroup2.add(Pizza9);
        Pizza9.setText("Cheesy Cheese - Rp. 27.000");

        buttonGroup2.add(Pizza4);
        Pizza4.setText("Duo Meet BBQ - 27.000");
        Pizza4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pizza4ActionPerformed(evt);
            }
        });

        buttonGroup2.add(Pizza5);
        Pizza5.setText("Fire Beef - Rp.25.000");
        Pizza5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pizza5ActionPerformed(evt);
            }
        });

        buttonGroup2.add(Pizza6);
        Pizza6.setText("BBQ cheese beef - 35.000");
        Pizza6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pizza6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Pizza1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Pizza2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addComponent(Pizza3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Pizza5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Pizza4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pizza6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Pizza7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(108, 108, 108))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pizza9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pizza8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pizza1)
                    .addComponent(Pizza7)
                    .addComponent(Pizza4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pizza2)
                    .addComponent(Pizza8)
                    .addComponent(Pizza5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pizza3)
                    .addComponent(Pizza9)
                    .addComponent(Pizza6))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 630, 120));

        Reset.setBackground(new java.awt.Color(51, 255, 255));
        Reset.setText("RESET");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel1.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, -1, -1));

        tambah.setText("+");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        jPanel1.add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        kurang.setText("-");
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });
        jPanel1.add(kurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 160, -1));

        jumlahpesanan.setActionCommand("<Not Set>");
        jumlahpesanan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jumlahpesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahpesananActionPerformed(evt);
            }
        });
        jPanel1.add(jumlahpesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 60, -1));
        jPanel1.add(cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 120, -1));

        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        jPanel1.add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 120, -1));

        hitung.setBackground(new java.awt.Color(51, 255, 255));
        hitung.setText("HITUNG");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        jPanel1.add(hitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul2/Pizza-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 110, -1));

        jLabel8.setFont(new java.awt.Font("Yeseva One", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 255));
        jLabel8.setText("Chash :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yeseva One", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 255, 255));
        jLabel9.setText(">> Menu Pizza");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yeseva One", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 255, 255));
        jLabel10.setText(">> Menu Topping");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        Keluar.setBackground(new java.awt.Color(51, 255, 255));
        Keluar.setText("KELUAR");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        jPanel1.add(Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yeseva One", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 255, 255));
        jLabel11.setText("Total :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, -1, -1));

        jLabel12.setFont(new java.awt.Font("Yeseva One", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 255, 255));
        jLabel12.setText("Jumlah :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        jLabel13.setFont(new java.awt.Font("Yeseva One", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 255, 255));
        jLabel13.setText("Kembalian :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        jumlahPesanan=0;
        jumlahpesanan.setText(String.valueOf(jumlahPesanan));
        cash.setText("");
        kembali.setText("");
        total.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        // TODO add your handling code here:
        if (!Pizza1.isSelected() && !Pizza2.isSelected() && !Pizza3.isSelected() && !Pizza4.isSelected() && !Pizza5.isSelected() && !Pizza6.isSelected() &&
        !Pizza7.isSelected() && !Pizza8.isSelected() && !Pizza9.isSelected()) {
        JOptionPane.showMessageDialog(this, "Silakan pilih jenis roti terlebih dahulu!");
        return;
        }
        
        if (!Topping1.isSelected() && !Topping2.isSelected() && !Topping3.isSelected() && !Topping4.isSelected()) {
        JOptionPane.showMessageDialog(this, "Silakan pilih topping terlebih dahulu!");
        return;
        }
        
        if(jumlahPesanan<=0){
            JOptionPane.showMessageDialog(this, "Silakan masukkan jumlah terlebih dahulu!");
            return;
        }
        
        if(Pizza1.isSelected()){
            hargaPizza = 19000;
        }else if(Pizza2.isSelected()){
            hargaPizza = 25000;
        }else if(Pizza3.isSelected()){
            hargaPizza = 22000;
        }else if(Pizza4.isSelected()){
            hargaPizza = 27000;
        }else if(Pizza5.isSelected()){
            hargaPizza = 25000;
        }else if(Pizza6.isSelected()){
            hargaPizza = 35000;
        }else if(Pizza7.isSelected()){
            hargaPizza = 20000;
        }else if(Pizza8.isSelected()){
            hargaPizza = 33000;
        }else if(Pizza9.isSelected()){
            hargaPizza = 20700;
        }
        
        if(Topping1.isSelected()){
            hargaTopping = 0;
        }else if(Topping2.isSelected()){
            hargaTopping = 5000;
        }else if(Topping3.isSelected()){
            hargaTopping = 7000;
        }else if(Topping4.isSelected()){
            hargaTopping = 5000;
        }
        
        double totalHarga = (hargaPizza + hargaTopping)*jumlahPesanan;
        
        if(totalHarga > 100000){
            totalHarga*=0.95;
        }
        
        total.setText(String.format("Rp %.2f", totalHarga));
        total.setEditable(false);
        
        // Validasi input uang
        if (cash.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan uang terlebih dahulu!");
            return;
        }

        // Menghitung kembalian
        try {
            double uangPembeli = Double.parseDouble(cash.getText());
            double kembalian = uangPembeli - totalHarga;

            // Menampilkan kembalian dengan 2 angka di belakang koma
            kembali.setText(String.format("Rp %.2f", kembalian));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan jumlah uang yang valid!");
        }
        
    }//GEN-LAST:event_hitungActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here
        jumlahPesanan++;
        jumlahpesanan.setText(String.valueOf(jumlahPesanan));
   
    }//GEN-LAST:event_tambahActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
        // TODO add your handling code here:
        if (jumlahPesanan > 0){
            jumlahPesanan--;
            jumlahpesanan.setText(String.valueOf(jumlahPesanan));
        }
    }//GEN-LAST:event_kurangActionPerformed

    private void Pizza8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pizza8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pizza8ActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kembaliActionPerformed

    private void jumlahpesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahpesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahpesananActionPerformed

    private void Pizza2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pizza2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pizza2ActionPerformed

    private void Pizza4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pizza4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pizza4ActionPerformed

    private void Pizza5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pizza5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pizza5ActionPerformed

    private void Pizza6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pizza6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pizza6ActionPerformed

    private void Topping3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Topping3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Topping3ActionPerformed

    private void Topping4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Topping4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Topping4ActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
                if (JOptionPane.showConfirmDialog(null, "Yakin keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        System.exit(0);
        }
    }//GEN-LAST:event_KeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Keluar;
    private javax.swing.JRadioButton Pizza1;
    private javax.swing.JRadioButton Pizza2;
    private javax.swing.JRadioButton Pizza3;
    private javax.swing.JRadioButton Pizza4;
    private javax.swing.JRadioButton Pizza5;
    private javax.swing.JRadioButton Pizza6;
    private javax.swing.JRadioButton Pizza7;
    private javax.swing.JRadioButton Pizza8;
    private javax.swing.JRadioButton Pizza9;
    private javax.swing.JButton Reset;
    private javax.swing.JRadioButton Topping1;
    private javax.swing.JRadioButton Topping2;
    private javax.swing.JRadioButton Topping3;
    private javax.swing.JRadioButton Topping4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField cash;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jumlahpesanan;
    private javax.swing.JTextField kembali;
    private javax.swing.JButton kurang;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
