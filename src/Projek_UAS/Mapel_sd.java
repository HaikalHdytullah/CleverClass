/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projek_UAS;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Mapel_sd extends javax.swing.JFrame {

    /**
     * Creates new form Mapel_sd
     */
    public Mapel_sd() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        SdPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        SmpPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        SmaPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        KeluarPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        MtkBT = new javax.swing.JButton();
        IndoBT = new javax.swing.JButton();
        IpaBT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(160, 217, 246));
        jPanel2.setPreferredSize(new java.awt.Dimension(155, 480));

        homePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePanelMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projek_UAS/home2.png"))); // NOI18N
        jLabel4.setText("  HOME");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SdPanel.setBackground(new java.awt.Color(102, 153, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projek_UAS/sd1.png"))); // NOI18N
        jLabel5.setText("  SD");

        javax.swing.GroupLayout SdPanelLayout = new javax.swing.GroupLayout(SdPanel);
        SdPanel.setLayout(SdPanelLayout);
        SdPanelLayout.setHorizontalGroup(
            SdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SdPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SdPanelLayout.setVerticalGroup(
            SdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SdPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SmpPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SmpPanelMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projek_UAS/smp.png"))); // NOI18N
        jLabel6.setText("  SMP");

        javax.swing.GroupLayout SmpPanelLayout = new javax.swing.GroupLayout(SmpPanel);
        SmpPanel.setLayout(SmpPanelLayout);
        SmpPanelLayout.setHorizontalGroup(
            SmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SmpPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SmpPanelLayout.setVerticalGroup(
            SmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SmpPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(13, 13, 13))
        );

        SmaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SmaPanelMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projek_UAS/sma.png"))); // NOI18N
        jLabel7.setText("  SMA");

        javax.swing.GroupLayout SmaPanelLayout = new javax.swing.GroupLayout(SmaPanel);
        SmaPanel.setLayout(SmaPanelLayout);
        SmaPanelLayout.setHorizontalGroup(
            SmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SmaPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SmaPanelLayout.setVerticalGroup(
            SmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SmaPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        KeluarPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KeluarPanelMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projek_UAS/logout.png"))); // NOI18N
        jLabel8.setText("  KELUAR");

        javax.swing.GroupLayout KeluarPanelLayout = new javax.swing.GroupLayout(KeluarPanel);
        KeluarPanel.setLayout(KeluarPanelLayout);
        KeluarPanelLayout.setHorizontalGroup(
            KeluarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KeluarPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        KeluarPanelLayout.setVerticalGroup(
            KeluarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KeluarPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projek_UAS/apli5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SmpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SmaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(KeluarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SmpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SmaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(KeluarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Mata Pelajaran SD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addContainerGap(417, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 570, 50));

        MtkBT.setBackground(new java.awt.Color(255, 255, 255));
        MtkBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projek_UAS/matematika3.png"))); // NOI18N
        MtkBT.setText("MATEMATIKA");
        MtkBT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MtkBT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MtkBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MtkBTActionPerformed(evt);
            }
        });
        jPanel1.add(MtkBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        IndoBT.setBackground(new java.awt.Color(255, 255, 255));
        IndoBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projek_UAS/indo3.png"))); // NOI18N
        IndoBT.setText("B INDONESIA");
        IndoBT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IndoBT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        IndoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndoBTActionPerformed(evt);
            }
        });
        jPanel1.add(IndoBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        IpaBT.setBackground(new java.awt.Color(255, 255, 255));
        IpaBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projek_UAS/ipa3.png"))); // NOI18N
        IpaBT.setText("IPA");
        IpaBT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IpaBT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        IpaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IpaBTActionPerformed(evt);
            }
        });
        jPanel1.add(IpaBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projek_UAS/back_isi.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseClicked
        dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_homePanelMouseClicked

    private void SmpPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SmpPanelMouseClicked
        dispose();
        new Mapel_smp().setVisible(true);
    }//GEN-LAST:event_SmpPanelMouseClicked

    private void SmaPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SmaPanelMouseClicked
        dispose();
        new Mapel_sma().setVisible(true);
    }//GEN-LAST:event_SmaPanelMouseClicked

    private void KeluarPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KeluarPanelMouseClicked
        int pilih = JOptionPane.showConfirmDialog (null, "Anda yakin ingin keluar?","Keluar",JOptionPane.YES_NO_OPTION);
        if(pilih == JOptionPane.YES_OPTION){
            Koneksi Koneksi = new Koneksi();
            Koneksi.setId(0);
            dispose();
            new Login().setVisible(true);
        }else{
            
        }
    }//GEN-LAST:event_KeluarPanelMouseClicked

    private void MtkBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MtkBTActionPerformed
        // TODO add your handling code here:
        dispose();
        new ListSdMtk().setVisible(true);
    }//GEN-LAST:event_MtkBTActionPerformed

    private void IpaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IpaBTActionPerformed
        // TODO add your handling code here:
        dispose();
        new ListSdIpa().setVisible(true);
    }//GEN-LAST:event_IpaBTActionPerformed

    private void IndoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndoBTActionPerformed
        // TODO add your handling code here:
        dispose();
        new ListSdIndo().setVisible(true);
    }//GEN-LAST:event_IndoBTActionPerformed

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
            java.util.logging.Logger.getLogger(Mapel_sd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mapel_sd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mapel_sd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mapel_sd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mapel_sd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IndoBT;
    private javax.swing.JButton IpaBT;
    private javax.swing.JPanel KeluarPanel;
    private javax.swing.JButton MtkBT;
    private javax.swing.JPanel SdPanel;
    private javax.swing.JPanel SmaPanel;
    private javax.swing.JPanel SmpPanel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
