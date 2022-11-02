package com.mycompany.shoponline.view;

import com.mycompany.shoponline.DomainModels.ChiTietSP;
import com.mycompany.shoponline.DomainModels.HoaDon;
import com.mycompany.shoponline.DomainModels.HoaDonChiTiet;
import com.mycompany.shoponline.DomainModels.IdHoaDonChiTiet;
import com.mycompany.shoponline.DomainModels.NhanVien;
import com.mycompany.shoponline.service.ChiTietHoaDonService;
import com.mycompany.shoponline.service.ChiTietSPService;
import com.mycompany.shoponline.service.HoaDonService;
import com.mycompany.shoponline.service.Impl.ChiTietHoaDonServiceImpl;
import com.mycompany.shoponline.service.Impl.ChiTietSPServiceImpl;
import com.mycompany.shoponline.service.Impl.HoaDonServiceImpl;
import com.mycompany.shoponline.service.Impl.NhanVienServiceImpl;
import com.mycompany.shoponline.service.NhanVienService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class ShopView extends javax.swing.JFrame {

    HoaDonService hoaDonService = new HoaDonServiceImpl();
    ChiTietSPService chiTietSPService = new ChiTietSPServiceImpl();
    NhanVienService nhanVienService = new NhanVienServiceImpl();
    ChiTietHoaDonService chiTietHoaDonService = new ChiTietHoaDonServiceImpl();
    HoaDon hd = new HoaDon();

    /**
     * Creates new form ShopView
     */
    public ShopView() {
        initComponents();
        loadsanpham();
        loadhoadon();
        rdoall.setSelected(true);
    }

    private void loadsanpham() {
        List<ChiTietSP> ctsp = chiTietSPService.getlist();
        DefaultTableModel defaultTableModel = (DefaultTableModel) tblsp.getModel();
        defaultTableModel.setRowCount(0);
        for (ChiTietSP chiTietSP : ctsp) {
            Object[] rowdata = {
                chiTietSP.getId(),
                chiTietSP.getSanpham().getMa(),
                chiTietSP.getSanpham().getTen(),
                chiTietSP.getNamBH(),
                chiTietSP.getMota(),
                chiTietSP.getSoluongton(),
                chiTietSP.getGianhap(),
                chiTietSP.getGiaban()
            };
            defaultTableModel.addRow(rowdata);
        }
    }

    @SuppressWarnings("unchecked")

    private void loadhoadon() {
        List<HoaDon> listhoadon = hoaDonService.getAll();
        DefaultTableModel defaultTableModel = (DefaultTableModel) tblHoaDon.getModel();
        defaultTableModel.setRowCount(0);
        for (int i = 0; i < listhoadon.size(); i++) {
            Object[] rowData = {
                i + 1,
                listhoadon.get(i).getId(),
                listhoadon.get(i).getNgayTao(),
                listhoadon.get(i).getNhanVien().getTen(),
                listhoadon.get(i).getTinhtrang() == 0 ? "Chờ Thanh Toán" : "Đã Thanh Toán"

            };
            defaultTableModel.addRow(rowData);
        }
    }

    public void loadgiohang(ArrayList<HoaDonChiTiet> listhdonchitiet) {
        DefaultTableModel dtm = (DefaultTableModel) tblgiohang.getModel();
        dtm.setRowCount(0);
        for (int i = 0; i < listhdonchitiet.size(); i++) {
            Object[] rowData = {
                i + 1,
                listhdonchitiet.get(i).getIdHoaDonChiTiet().getChiTietSP().getSanpham().getMa(),
                listhdonchitiet.get(i).getIdHoaDonChiTiet().getChiTietSP().getSanpham().getTen(),
                listhdonchitiet.get(i).getSoLuong(),
                listhdonchitiet.get(i).getIdHoaDonChiTiet().getChiTietSP().getGiaban(),
                listhdonchitiet.get(i).getSoLuong() * listhdonchitiet.get(i).getIdHoaDonChiTiet().getChiTietSP().getGiaban()
            };

            dtm.addRow(rowData);
        }
    }

    private void loadhoadontheotrangthai(int trangthai) {
        List<HoaDon> listhoadon = hoaDonService.getByTrangThai(trangthai);
        DefaultTableModel dtm = (DefaultTableModel) this.tblHoaDon.getModel();
        dtm.setRowCount(0);
        for (int i = 0; i < listhoadon.size(); i++) {
            Object[] rowData = {
                i + 1,
                listhoadon.get(i).getId(),
                listhoadon.get(i).getNgayTao(),
                listhoadon.get(i).getNhanVien().getTen(),
                listhoadon.get(i).getTinhtrang() == 0 ? "Chờ Thanh Toán" : "Đã Thanh Toán"
            };

            dtm.addRow(rowData);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblgiohang = new javax.swing.JTable();
        rdochothanhtoan = new javax.swing.JRadioButton();
        rdoall = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        rdodathanhtoan = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblsp = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMaHd = new javax.swing.JTextField();
        txtNgayTao = new javax.swing.JTextField();
        txtNv = new javax.swing.JTextField();
        txtTongTien = new javax.swing.JTextField();
        txtKhachdua = new javax.swing.JTextField();
        txtKhachThua = new javax.swing.JTextField();
        btnthanhtoan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        btnTaoHoaDon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblgiohang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Số Lượng", "Đơn Giá", "Thành Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Long.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblgiohang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblgiohangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblgiohang);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        buttonGroup1.add(rdochothanhtoan);
        rdochothanhtoan.setText("Chờ Thanh Toán");
        rdochothanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdochothanhtoanActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoall);
        rdoall.setText("Tất Cả");
        rdoall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoallActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Đã Hủy");

        buttonGroup1.add(rdodathanhtoan);
        rdodathanhtoan.setText("Đã Thanh Toán");
        rdodathanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdodathanhtoanActionPerformed(evt);
            }
        });

        jLabel1.setText("Giỏ Hàng");

        jLabel2.setText("Sản Phẩm");

        tblsp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Năm BH", "Mô Tả", "SL SP", "Giá Nhập", "Giá bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblspMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblsp);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel4.setText("Mã HĐ");

        jLabel5.setText("Ngày Tạo");

        jLabel6.setText("Tên NV");

        jLabel7.setText("Tổng Tiền");

        jLabel8.setText("Tiền Khách Đưa");

        jLabel9.setText("Tiền Thừa");

        txtNgayTao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayTaoActionPerformed(evt);
            }
        });

        txtKhachdua.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtKhachduaFocusLost(evt);
            }
        });

        btnthanhtoan.setText("Thanh Toán");
        btnthanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthanhtoanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(35, 35, 35)
                        .addComponent(txtKhachThua))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKhachdua))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(34, 34, 34)
                        .addComponent(txtTongTien))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(48, 48, 48)
                        .addComponent(txtNv))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(35, 35, 35)
                        .addComponent(txtNgayTao))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(txtMaHd, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addComponent(btnthanhtoan)
                .addGap(133, 133, 133))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaHd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtKhachdua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtKhachThua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnthanhtoan)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLabel3.setText("Hóa Đơn");

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã HĐ", "Ngày Tạo", "Tên NV", "Tình Trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoaDon);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnTaoHoaDon.setText("Tao Hoa Don");
        btnTaoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 61, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(btnTaoHoaDon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdochothanhtoan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoall)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdodathanhtoan)))
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addGap(332, 332, 332))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdochothanhtoan)
                            .addComponent(rdoall)
                            .addComponent(jRadioButton3)
                            .addComponent(rdodathanhtoan)
                            .addComponent(btnTaoHoaDon))
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNgayTaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayTaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayTaoActionPerformed

    private void btnTaoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHoaDonActionPerformed
        // TODO add your handling code here:
        HoaDon hoaDon = new HoaDon();
        NhanVien nv = nhanVienService.getAll().get(0);
        hoaDon.setNhanVien(nv);
        hoaDon.setNgayTao(new Date());
        hoaDon.setTinhtrang(0);
        hoaDon.setMa("HD" + new Date().getTime());
        hoaDonService.add(hoaDon);
        loadhoadon();
    }//GEN-LAST:event_btnTaoHoaDonActionPerformed

    private void tblspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblspMouseClicked

        int row = tblsp.getSelectedRow();
        String id = tblsp.getValueAt(row, 0).toString();
        ChiTietSP chiTietSP = chiTietSPService.getById(id);
        String soluong = JOptionPane.showInputDialog(this, "Mời nhap so luong hàng");
        HoaDonChiTiet hoaDonChiTiet = new HoaDonChiTiet();
        hoaDonChiTiet.setSoLuong(Integer.parseInt(soluong));
        hoaDonChiTiet.setIdHoaDonChiTiet(new IdHoaDonChiTiet(hd, chiTietSP));

        if (chiTietHoaDonService.add(hoaDonChiTiet)) {
            JOptionPane.showMessageDialog(this, "Them thanh cong");
        } else {
            JOptionPane.showMessageDialog(this, "San pham đã tồn tại");
        }
        ArrayList<HoaDonChiTiet> list = chiTietHoaDonService.listhoadonct(hd.getId());
        loadgiohang(list);
    }//GEN-LAST:event_tblspMouseClicked

    private void tblgiohangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblgiohangMouseClicked

    }//GEN-LAST:event_tblgiohangMouseClicked

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        // TODO add your handling code here:
//        int row = tblHoaDon.getSelectedRow();
//        String hoadonid = tblHoaDon.getValueAt(row, 1).toString();
//        ArrayList<HoaDonChiTiet> listhoadonchitiet = chiTietHoaDonService.listhoadonct(hoadonid);
//        hd.setId(hoadonid);
//        loadgiohang(listhoadonchitiet);
//
//        txtMaHd.setText(tblHoaDon.getValueAt(row, 1).toString());
//        txtNgayTao.setText(tblHoaDon.getValueAt(row, 2).toString());
//        txtNv.setText(tblHoaDon.getValueAt(row, 3).toString());
//        int sodong = tblgiohang.getRowCount();
//        long tongtien = 0;
//        for (int i = 0; i < sodong; i++) {
//            tongtien = tongtien + Long.parseLong(tblgiohang.getValueAt(i, 5).toString());
//        }
//        txtTongTien.setText(tongtien + "");
int row = tblHoaDon.getSelectedRow();
String hoadonid= tblHoaDon.getValueAt(row, 1).toString();
ArrayList<HoaDonChiTiet>listhoadonchitiet=chiTietHoaDonService.listhoadonct(hoadonid);
hd.setId(hoadonid);
        loadgiohang(listhoadonchitiet);
        
        txtMaHd.setText(tblHoaDon.getValueAt(row, 1).toString());
        txtNgayTao.setText(tblHoaDon.getValueAt(row, 2).toString());
        txtNv.setText(tblHoaDon.getValueAt(row, 3).toString());
        int sodong=tblgiohang.getRowCount();
        long tongtien=0;
        for (int i = 0; i < sodong; i++) {
            tongtien=tongtien+Long.parseLong(tblgiohang.getValueAt(i, 5).toString());
            
        }txtTongTien.setText(tongtien+"");

    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void txtKhachduaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtKhachduaFocusLost
        long tienkhachdua = Long.parseLong(txtKhachdua.getText());
        long tongtien = Long.parseLong(txtTongTien.getText());
        txtKhachThua.setText((tienkhachdua - tongtien) + "");
    }//GEN-LAST:event_txtKhachduaFocusLost

    private void btnthanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthanhtoanActionPerformed
        // TODO add your handling code here:
        HoaDon hoadondathanhtoan = hoaDonService.getById(txtMaHd.getText());
        hoadondathanhtoan.setTinhtrang(1);
        hoaDonService.update(txtMaHd.getText(), hoadondathanhtoan);
        loadhoadon();
    }//GEN-LAST:event_btnthanhtoanActionPerformed

    private void rdochothanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdochothanhtoanActionPerformed
        loadhoadontheotrangthai(0);
    }//GEN-LAST:event_rdochothanhtoanActionPerformed

    private void rdodathanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdodathanhtoanActionPerformed
        loadhoadontheotrangthai(1);
    }//GEN-LAST:event_rdodathanhtoanActionPerformed

    private void rdoallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoallActionPerformed
        loadhoadon();
    }//GEN-LAST:event_rdoallActionPerformed

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
            java.util.logging.Logger.getLogger(ShopView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShopView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShopView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShopView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShopView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaoHoaDon;
    private javax.swing.JButton btnthanhtoan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rdoall;
    private javax.swing.JRadioButton rdochothanhtoan;
    private javax.swing.JRadioButton rdodathanhtoan;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTable tblgiohang;
    private javax.swing.JTable tblsp;
    private javax.swing.JTextField txtKhachThua;
    private javax.swing.JTextField txtKhachdua;
    private javax.swing.JTextField txtMaHd;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtNv;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables

}
