/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.shoponline.view;

import com.mycompany.shoponline.DomainModels.ChiTietSP;
import com.mycompany.shoponline.ViewModel.SanPhamViewModel;
import com.mycompany.shoponline.service.Impl.ChiTietSPServiceImpl;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class SPhamView extends javax.swing.JFrame {

    private ChiTietSPServiceImpl chiTietSPServiceImpl = new ChiTietSPServiceImpl();

    public SPhamView() {
        initComponents();
        loadtable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbbsearch = new javax.swing.JComboBox<>();
        txtnambh = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtgianhap = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtsoluong = new javax.swing.JTextField();
        txtmota = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsanpham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        jLabel2.setText("Search");

        jLabel3.setText("Nam bh");

        jLabel4.setText("Gia nhap");

        jLabel5.setText("so luong ton");

        jLabel6.setText("Mota");

        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnsearch.setText("Search");

        tblsanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nam BH", "Mota", "So luong ton", "Gia nhap", "trang thai"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblsanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsanphamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblsanpham);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnadd)
                                        .addGap(76, 76, 76)
                                        .addComponent(btnupdate))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtgianhap, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtnambh, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(42, 42, 42)
                                                .addComponent(cbbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtmota, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addComponent(btnsearch)))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnambh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtgianhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtmota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btnupdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        ChiTietSP chiTietSP = getformdata();
        if (chiTietSPServiceImpl.add(chiTietSP)) {
            JOptionPane.showMessageDialog(this, "Them thanh cong");
            loadtable();
        } else {
            JOptionPane.showMessageDialog(this, "That bai");
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        ChiTietSP chiTietSP = getformdata();
        int row = tblsanpham.getSelectedRow();
        String id = tblsanpham.getValueAt(row, 0).toString();
        if (chiTietSPServiceImpl.update(id, chiTietSP)) {
            JOptionPane.showMessageDialog(this, "Them thanh cong");
            loadtable();
        } else {
            JOptionPane.showMessageDialog(this, "That bai");
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void tblsanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsanphamMouseClicked
        // TODO add your handling code here:
        int row = tblsanpham.getSelectedRow();
        String id = tblsanpham.getValueAt(row, 0).toString();
        ChiTietSP chiTietSP = chiTietSPServiceImpl.getById(id);
        txtgianhap.setText(chiTietSP.getGianhap() + "");
        txtmota.setText(chiTietSP.getMota());
        txtnambh.setText(chiTietSP.getNamBH() + "");
        txtsoluong.setText(chiTietSP.getSoluongton() + "");
    }//GEN-LAST:event_tblsanphamMouseClicked
    private void loadtable() {
        ArrayList<ChiTietSP> listctsp = chiTietSPServiceImpl.getlist();
        DefaultTableModel defaultTableModel = (DefaultTableModel) tblsanpham.getModel();
        defaultTableModel.setRowCount(0);
        for (ChiTietSP chiTietSP : listctsp) {
            SanPhamViewModel sanPhamViewModel = new SanPhamViewModel();
            sanPhamViewModel.setId(chiTietSP.getId());
            sanPhamViewModel.setNambh(chiTietSP.getNamBH());
            sanPhamViewModel.setMota(chiTietSP.getMota());
            sanPhamViewModel.setSoluongton(chiTietSP.getSoluongton());
            sanPhamViewModel.setGianhap(chiTietSP.getGianhap());
            if (chiTietSP.getSoluongton() > 900) {
                sanPhamViewModel.setTrangthai("Nhieu");
            } else {
                sanPhamViewModel.setTrangthai("it");
            }
            Object[] rowData = {
                sanPhamViewModel.getId(),
                sanPhamViewModel.getNambh(),
                sanPhamViewModel.getMota(),
                sanPhamViewModel.getSoluongton(),
                sanPhamViewModel.getGianhap(),
                sanPhamViewModel.getTrangthai()
            };
            defaultTableModel.addRow(rowData);
        }

    }

    private ChiTietSP getformdata() {

        int row = tblsanpham.getSelectedRow();
        String id = tblsanpham.getValueAt(row, 0).toString();
        int nambh = Integer.parseInt(txtnambh.getText());
        String mota = txtmota.getText();
        long gianhap = Long.parseLong(txtgianhap.getText());
        long soluongton = Long.parseLong(txtsoluong.getText());
        ChiTietSP chiTietSP = new ChiTietSP();
        chiTietSP.setId(id);
        chiTietSP.setGianhap(gianhap);
        chiTietSP.setSoluongton(soluongton);
        chiTietSP.setMota(mota);
        chiTietSP.setNamBH(nambh);
        return chiTietSP;

    }

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
            java.util.logging.Logger.getLogger(SPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SPhamView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cbbsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblsanpham;
    private javax.swing.JTextField txtgianhap;
    private javax.swing.JTextField txtmota;
    private javax.swing.JTextField txtnambh;
    private javax.swing.JTextField txtsoluong;
    // End of variables declaration//GEN-END:variables
}
