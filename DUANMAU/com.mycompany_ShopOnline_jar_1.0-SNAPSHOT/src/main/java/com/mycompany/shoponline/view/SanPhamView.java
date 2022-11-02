 package com.mycompany.shoponline.view;

import com.mycompany.shoponline.DomainModels.ChiTietSP;
import com.mycompany.shoponline.DomainModels.DongSP;
import com.mycompany.shoponline.DomainModels.MauSac;
import com.mycompany.shoponline.DomainModels.NSX;
import com.mycompany.shoponline.DomainModels.SanPham;
import com.mycompany.shoponline.service.ChiTietSPService;
import com.mycompany.shoponline.service.DongSPService;
import com.mycompany.shoponline.service.IMauSacService;
import com.mycompany.shoponline.service.Impl.ChiTietSPServiceImpl;
import com.mycompany.shoponline.service.Impl.DongSPServiceImpl;
import com.mycompany.shoponline.service.Impl.MauSacServiceImpl;
import com.mycompany.shoponline.service.Impl.NSXServiceImpl;
import com.mycompany.shoponline.service.Impl.SanPhamServiceImpl;
import com.mycompany.shoponline.service.NSXService;
import com.mycompany.shoponline.service.SanPhamService;
import com.mycompany.shoponline.ViewModel.ChiTietSPView;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SanPhamView extends javax.swing.JFrame {

    private NSXService nSXService = new NSXServiceImpl();
    private SanPhamService sanPhamService = new SanPhamServiceImpl();
    private IMauSacService iMauSacService = new MauSacServiceImpl();
    private DongSPService dongSPService = new DongSPServiceImpl();
    private ChiTietSPService chiTietSPService = new ChiTietSPServiceImpl();
    private DefaultComboBoxModel defaultComboBoxModel;

    public SanPhamView() {
        initComponents();
        List<SanPham> sp = sanPhamService.getAllSanPham();
        cbbSanPham.setModel(new DefaultComboBoxModel(sp.toArray()));

        List<NSX> nsx = nSXService.getAllNSX();
        cbbNSX.setModel(new DefaultComboBoxModel(nsx.toArray()));

        List<MauSac> mauSac = iMauSacService.getAllMauSac();
        cbbMauSac.setModel(new DefaultComboBoxModel(mauSac.toArray()));

        List<DongSP> dongsp = dongSPService.getAllDongSP();
        cbbDongSP.setModel(new DefaultComboBoxModel(dongsp.toArray()));

        clearform();
        loadtable();
    }

    public ChiTietSP getformdata() {

        SanPham sp = (SanPham) cbbSanPham.getSelectedItem();
        DongSP dongsp = (DongSP) cbbDongSP.getSelectedItem();
        MauSac mauSac = (MauSac) cbbMauSac.getSelectedItem();
        NSX nsx = (NSX) cbbNSX.getSelectedItem();
        String mota = txtMoTa.getText();
        int nambh = Integer.parseInt(txtNamBH.getText());
        long gianhap = Long.parseLong(txtGiaNhap.getText());
        long giaban = Long.parseLong(txtGiaBan.getText());
        long soluongton = Long.parseLong(txtSoLuongTon.getText());
        ChiTietSP chiTietSP = new ChiTietSP();
        chiTietSP.setNamBH(nambh);
        chiTietSP.setGiaban(giaban);
        chiTietSP.setGianhap(gianhap);
        chiTietSP.setDongSP(dongsp);
        chiTietSP.setMauSac(mauSac);
        chiTietSP.setNsx(nsx);
        chiTietSP.setSanpham(sp);
        chiTietSP.setSoluongton(soluongton);
        chiTietSP.setMota(mota);

        return chiTietSP;

    }

    private void loadtable() {
        List<ChiTietSP> listctsp = chiTietSPService.getlist();
        DefaultTableModel defaultTableModel = (DefaultTableModel) this.tblsanpham.getModel();
        defaultTableModel.setRowCount(0);
        for (ChiTietSP chiTietSP : listctsp) {
            ChiTietSPView chiTietSPView = new ChiTietSPView();
            chiTietSPView.setStt(chiTietSP.getId());
            chiTietSPView.setGiaban(chiTietSP.getGiaban());
            chiTietSPView.setGianhap(chiTietSP.getGianhap());
            chiTietSPView.setMota(chiTietSP.getMota());

            Object[] rowData = {
                chiTietSPView.getStt(),
                chiTietSPView.getMasp(),
                chiTietSPView.getTensp(),
                chiTietSPView.getNambh(),
                chiTietSPView.getMota(),
                chiTietSPView.getSoluongSp(),
                chiTietSPView.getGianhap(),
                chiTietSPView.getGiaban()
            };
            defaultTableModel.addRow(rowData);

        }
    }

    public void clearform() {
        txtGiaBan.setText("");
        txtGiaNhap.setText("");
        txtMoTa.setText("");
        txtNamBH.setText("");
        txtSoLuongTon.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        txtNamBH = new javax.swing.JTextField();
        txtGiaBan = new javax.swing.JTextField();
        txtSoLuongTon = new javax.swing.JTextField();
        txtGiaNhap = new javax.swing.JTextField();
        txtMoTa = new javax.swing.JTextField();
        cbbSanPham = new javax.swing.JComboBox<>();
        cbbNSX = new javax.swing.JComboBox<>();
        cbbMauSac = new javax.swing.JComboBox<>();
        cbbDongSP = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsanpham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        txtGiaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaBanActionPerformed(evt);
            }
        });

        cbbSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSanPhamActionPerformed(evt);
            }
        });

        jLabel2.setText("Nam BH");

        jLabel3.setText("Gia Ban");

        jLabel4.setText("So Luong Ton");

        jLabel5.setText("Gia Nhap");

        jLabel6.setText("Mo Ta");

        jLabel7.setText("San Pham");

        jLabel8.setText("Nha SX");

        jLabel9.setText("Mau Sac");

        jLabel10.setText("Dong SP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnadd)
                        .addGap(61, 61, 61)
                        .addComponent(btnupdate)
                        .addGap(38, 38, 38)
                        .addComponent(btndelete))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNamBH, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                        .addComponent(txtGiaBan)
                        .addComponent(txtGiaNhap)
                        .addComponent(txtSoLuongTon)
                        .addComponent(txtMoTa)))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbSanPham, 0, 97, Short.MAX_VALUE)
                    .addComponent(cbbNSX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbbMauSac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbbDongSP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnupdate)
                            .addComponent(btndelete))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnadd)
                        .addGap(41, 41, 41)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamBH, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtSoLuongTon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMoTa)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbDongSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Sản Phẩm");

        tblsanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Năm BH", "Mô tả", "SL SP", "Giá Nhập", "Giá Bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, true
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
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGiaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaBanActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        ChiTietSP chiTietSP = getformdata();

        if (chiTietSPService.add(chiTietSP)) {
            JOptionPane.showMessageDialog(this, "Thành công");

        } else {
            JOptionPane.showMessageDialog(this, "Thất bại");
        }
        loadtable();
        clearform();
    }//GEN-LAST:event_btnaddActionPerformed

    private void cbbSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbSanPhamActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int row = tblsanpham.getSelectedRow();
        String ma = tblsanpham.getValueAt(row, 0).toString();
        if (chiTietSPService.xoa(ma)) {
            JOptionPane.showMessageDialog(this, "Thanh cong");
            loadtable();
        } else {
            JOptionPane.showMessageDialog(this, "That bai");
        }
        clearform();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void tblsanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsanphamMouseClicked
        int row = tblsanpham.getSelectedRow();
        String id = tblsanpham.getValueAt(row, 0).toString();
        ChiTietSP chiTietSP = chiTietSPService.getById(id);
        txtGiaBan.setText(chiTietSP.getGiaban() + "");
        txtGiaNhap.setText(chiTietSP.getGianhap() + "");
        txtMoTa.setText(chiTietSP.getMota() + "");
        txtNamBH.setText(chiTietSP.getNamBH() + "");
        txtSoLuongTon.setText(chiTietSP.getSoluongton() + "");
        int spindex = findIndexComboboxSanPhamById(chiTietSP.getSanpham().getId());
        int dongspindex = findindexDongSP(chiTietSP.getDongSP().getId());
        int mausacindex = findIndexComboboxMauSacById(chiTietSP.getMauSac().getId());
        int nsxindex = findIndexComboboxNSXById(chiTietSP.getNsx().getId());

        cbbDongSP.setSelectedIndex(dongspindex);
        cbbMauSac.setSelectedIndex(mausacindex);
        cbbNSX.setSelectedIndex(nsxindex);
        cbbSanPham.setSelectedIndex(spindex);

    }//GEN-LAST:event_tblsanphamMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        ChiTietSP chiTietSP = getformdata();
        int row = tblsanpham.getSelectedRow();
        String ma = tblsanpham.getValueAt(row, 0).toString();

        if (chiTietSPService.update(ma, chiTietSP)) {
            JOptionPane.showMessageDialog(this, "Thành công");
            loadtable();
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại");
        }
        clearform();
    }//GEN-LAST:event_btnupdateActionPerformed

    private int findIndexComboboxSanPhamById(String id) {
        int total = cbbSanPham.getMaximumRowCount();
        for (int i = 0; i < total; i++) {
            SanPham sanPham = (SanPham) cbbSanPham.getItemAt(i);
            if (id.equals(sanPham.getId())) {
                return i;
            }
        }
        return -1;
    }

    private int findIndexComboboxMauSacById(String id) {
        int total = cbbMauSac.getMaximumRowCount();
        for (int i = 0; i < total; i++) {
            MauSac mauSac = (MauSac) cbbMauSac.getItemAt(i);
            if (id.equals(mauSac.getId())) {
                return i;
            }
        }
        return -1;
    }

    private int findIndexComboboxNSXById(String id) {
        int total = cbbNSX.getMaximumRowCount();
        for (int i = 0; i < total; i++) {
            NSX nsx = (NSX) cbbNSX.getItemAt(i);
            if (id.equals(nsx.getId())) {
                return i;
            }
        }
        return -1;
    }

    private int findindexDongSP(String id) {
        int total = cbbDongSP.getMaximumRowCount();
        for (int i = 0; i < total; i++) {
            DongSP dongSP = (DongSP) cbbDongSP.getItemAt(i);
            return i;
        }
        return -1;
    }

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
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SanPhamView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<DongSP> cbbDongSP;
    private javax.swing.JComboBox<MauSac> cbbMauSac;
    private javax.swing.JComboBox<NSX> cbbNSX;
    private javax.swing.JComboBox<SanPham> cbbSanPham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblsanpham;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtGiaNhap;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtNamBH;
    private javax.swing.JTextField txtSoLuongTon;
    // End of variables declaration//GEN-END:variables
}
