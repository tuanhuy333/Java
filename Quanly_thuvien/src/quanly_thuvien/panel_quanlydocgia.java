/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanly_thuvien;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class panel_quanlydocgia extends javax.swing.JPanel {

    connect c=new connect();//khoi tao class connect để kết nối database
     private Connection conn;
    private DefaultTableModel dtm;
    public panel_quanlydocgia() {
        initComponents();
        
        dtm=(DefaultTableModel) jTabledocgia.getModel();
        dtm.setColumnIdentifiers(new Object[]{
            "Mã độc giả","Tên độc giả","Lớp"
        });
        btnThemdocgia.setEnabled(false);
        hienthidata();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablenxb = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtManxb = new javax.swing.JTextField();
        btnThemnxb = new javax.swing.JButton();
        btnSuanxb = new javax.swing.JButton();
        btnXoanxb = new javax.swing.JButton();
        btnCapnhatnxb = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtdiachi = new javax.swing.JTextField();
        txtTennxb = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabledocgia = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        txtTimkiem = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtMadocgia = new javax.swing.JTextField();
        btnThemdocgia = new javax.swing.JButton();
        btnSuadocgia = new javax.swing.JButton();
        btnXoadocgia = new javax.swing.JButton();
        btnCapnhatdocgia = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtlop = new javax.swing.JTextField();
        txtTendocgia = new javax.swing.JTextField();

        jPanel2.setPreferredSize(new java.awt.Dimension(930, 520));

        jTablenxb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablenxb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTablenxbFocusLost(evt);
            }
        });
        jTablenxb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablenxbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablenxb);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 204), 2), "Tìm kiếm NXB", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(102, 0, 204))); // NOI18N

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanly_thuvien/image/search.png"))); // NOI18N
        jButton4.setText("Tìm kiếm");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 204), 2), "Chỉnh sửa NXB", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(102, 0, 204))); // NOI18N
        jPanel8.setMaximumSize(new java.awt.Dimension(483, 259));
        jPanel8.setMinimumSize(new java.awt.Dimension(483, 259));

        jLabel10.setText("Mã nxb");

        jLabel11.setText("Tên nxb");

        txtManxb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtManxbMouseClicked(evt);
            }
        });
        txtManxb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtManxbKeyPressed(evt);
            }
        });

        btnThemnxb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanly_thuvien/image/add.png"))); // NOI18N
        btnThemnxb.setText("Thêm");
        btnThemnxb.setPreferredSize(new java.awt.Dimension(90, 32));
        btnThemnxb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemnxbActionPerformed(evt);
            }
        });

        btnSuanxb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanly_thuvien/image/edit.png"))); // NOI18N
        btnSuanxb.setText("Sửa");
        btnSuanxb.setPreferredSize(new java.awt.Dimension(90, 32));
        btnSuanxb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuanxbActionPerformed(evt);
            }
        });

        btnXoanxb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanly_thuvien/image/delete.png"))); // NOI18N
        btnXoanxb.setText("Xóa");
        btnXoanxb.setPreferredSize(new java.awt.Dimension(90, 32));
        btnXoanxb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoanxbActionPerformed(evt);
            }
        });

        btnCapnhatnxb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanly_thuvien/image/restart.png"))); // NOI18N
        btnCapnhatnxb.setText("Cập nhât");
        btnCapnhatnxb.setPreferredSize(new java.awt.Dimension(90, 32));
        btnCapnhatnxb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhatnxbActionPerformed(evt);
            }
        });

        jLabel1.setText("Địa chỉ");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnThemnxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnSuanxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(txtManxb, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnXoanxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnCapnhatnxb, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtTennxb, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(txtManxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTennxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuanxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoanxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapnhatnxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemnxb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setPreferredSize(new java.awt.Dimension(930, 520));

        jTabledocgia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTabledocgia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTabledocgiaFocusLost(evt);
            }
        });
        jTabledocgia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabledocgiaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTabledocgia);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2), "Tìm kiếm độc giả", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 102, 204))); // NOI18N

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanly_thuvien/image/search.png"))); // NOI18N
        jButton5.setText("Tìm kiếm");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2), "Chỉnh sửa độc giả", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 102, 204))); // NOI18N
        jPanel10.setMaximumSize(new java.awt.Dimension(483, 259));
        jPanel10.setMinimumSize(new java.awt.Dimension(483, 259));

        jLabel12.setText("Mã độc giả");

        jLabel13.setText("Tên độc giả");

        txtMadocgia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMadocgiaMouseClicked(evt);
            }
        });
        txtMadocgia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMadocgiaKeyPressed(evt);
            }
        });

        btnThemdocgia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanly_thuvien/image/add.png"))); // NOI18N
        btnThemdocgia.setText("Thêm");
        btnThemdocgia.setPreferredSize(new java.awt.Dimension(90, 32));
        btnThemdocgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemdocgiaActionPerformed(evt);
            }
        });

        btnSuadocgia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanly_thuvien/image/edit.png"))); // NOI18N
        btnSuadocgia.setText("Sửa");
        btnSuadocgia.setPreferredSize(new java.awt.Dimension(90, 32));
        btnSuadocgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuadocgiaActionPerformed(evt);
            }
        });

        btnXoadocgia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanly_thuvien/image/delete.png"))); // NOI18N
        btnXoadocgia.setText("Xóa");
        btnXoadocgia.setPreferredSize(new java.awt.Dimension(90, 32));
        btnXoadocgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoadocgiaActionPerformed(evt);
            }
        });

        btnCapnhatdocgia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanly_thuvien/image/restart.png"))); // NOI18N
        btnCapnhatdocgia.setText("Cập nhât");
        btnCapnhatdocgia.setPreferredSize(new java.awt.Dimension(90, 32));
        btnCapnhatdocgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhatdocgiaActionPerformed(evt);
            }
        });

        jLabel2.setText("Lớp");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnThemdocgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnSuadocgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMadocgia, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnXoadocgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnCapnhatdocgia, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtTendocgia, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(txtlop, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(txtMadocgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTendocgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtlop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuadocgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoadocgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapnhatdocgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemdocgia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTablenxbFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTablenxbFocusLost

    }//GEN-LAST:event_jTablenxbFocusLost

    private void jTablenxbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablenxbMouseClicked
        btnThemdocgia.setEnabled(false);

        String ma=maRowSelected();

        ResultSet rs=c.loadData("select * from sinhvien where masinhvien="+ma);

        //xoa de gan lai gia tri ứng với csdl

        try {
            if(rs.next()){
                txtMadocgia.setText(String.valueOf(rs.getInt(1)));
                txtTendocgia.setText(rs.getString(2));
                txtlop.setText(rs.getString(3));

            }} catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Lỗi khi click vào table");
            }
    }//GEN-LAST:event_jTablenxbMouseClicked

    private void txtManxbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtManxbMouseClicked

    }//GEN-LAST:event_txtManxbMouseClicked

    private void txtManxbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtManxbKeyPressed

        btnThemnxb.setEnabled(true);
    }//GEN-LAST:event_txtManxbKeyPressed

    private void btnThemnxbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemnxbActionPerformed

        int ma = Integer.parseInt(txtMadocgia.getText());
        String ten = txtTendocgia.getText();
        String diachi = txtlop.getText();

        String sql=String.format("insert into sinhvien(masinhvien,tensinhvien,lop) values(%d,N'%s',N'%s')",ma,ten,diachi);
        try{

            c.insert_remove_updateData(sql);//thực hiện thêm

            JOptionPane.showMessageDialog(this, "Thêm thành công");

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Thêm thất bại !"+e);
        }
    }//GEN-LAST:event_btnThemnxbActionPerformed

    private void btnSuanxbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuanxbActionPerformed

        String ma=maRowSelected();

        //ep kieu
        int makiemtra=Integer.parseInt(ma);

        int Mamoi = Integer.parseInt(txtMadocgia.getText());
        String Tenmoi = txtTendocgia.getText();
        String lopmoi = txtlop.getText();
        String sql=String.format("update sinhvien set masinhvien=%d,tensinhvien=N'%s',lop=N'%s' where masinhvien=%d",Mamoi,Tenmoi,lopmoi,makiemtra );

        try{
            c.insert_remove_updateData(sql);
            JOptionPane.showMessageDialog(this, "Sửa thành công");

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Sửa thất bại !"+e);
        }
    }//GEN-LAST:event_btnSuanxbActionPerformed

    private void btnXoanxbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoanxbActionPerformed
        try{

            String ma=maRowSelected();
            if(JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không ?")==0){
                c.insert_remove_updateData("delete from sinhvien where masinhvien="+ma);
                JOptionPane.showMessageDialog(this, "Xóa thành công");
            }

        }  catch(Exception e){
            JOptionPane.showMessageDialog(this, "Xóa thất bại" +e);
        }
    }//GEN-LAST:event_btnXoanxbActionPerformed

    private void btnCapnhatnxbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhatnxbActionPerformed

        //reset null tất cả
        txtMadocgia.setText("");
        txtTendocgia.setText("");
        txtlop.setText("");

        clearDataInTable();
        hienthidata();
    }//GEN-LAST:event_btnCapnhatnxbActionPerformed

    private void jTabledocgiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabledocgiaFocusLost

    }//GEN-LAST:event_jTabledocgiaFocusLost

    private void jTabledocgiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabledocgiaMouseClicked
        btnThemdocgia.setEnabled(false);

        String ma=maRowSelected();

        ResultSet rs=c.loadData("select * from sinhvien where masinhvien="+ma);

        //xoa de gan lai gia tri ứng với csdl

        try {
            if(rs.next()){
                txtMadocgia.setText(String.valueOf(rs.getInt(1)));
                txtTendocgia.setText(rs.getString(2));
                txtlop.setText(rs.getString(3));

            }} catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Lỗi khi click vào table");
            }
    }//GEN-LAST:event_jTabledocgiaMouseClicked

    private void txtMadocgiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMadocgiaMouseClicked

    }//GEN-LAST:event_txtMadocgiaMouseClicked

    private void txtMadocgiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMadocgiaKeyPressed

        btnThemdocgia.setEnabled(true);
    }//GEN-LAST:event_txtMadocgiaKeyPressed

    private void btnThemdocgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemdocgiaActionPerformed

        int ma = Integer.parseInt(txtMadocgia.getText());
        String ten = txtTendocgia.getText();
        String diachi = txtlop.getText();

        String sql=String.format("insert into sinhvien(masinhvien,tensinhvien,lop) values(%d,N'%s',N'%s')",ma,ten,diachi);
        try{

            c.insert_remove_updateData(sql);//thực hiện thêm

            JOptionPane.showMessageDialog(this, "Thêm thành công");

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Thêm thất bại !"+e);
        }
    }//GEN-LAST:event_btnThemdocgiaActionPerformed

    private void btnSuadocgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuadocgiaActionPerformed

        String ma=maRowSelected();

        //ep kieu
        int makiemtra=Integer.parseInt(ma);

        int Mamoi = Integer.parseInt(txtMadocgia.getText());
        String Tenmoi = txtTendocgia.getText();
        String diachimoi = txtlop.getText();
        String sql=String.format("update sinhvien set masinhvien=%d,tensinhvien=N'%s',lop=N'%s' where masinhvien=%d",Mamoi,Tenmoi,diachimoi,makiemtra );

        try{
            c.insert_remove_updateData(sql);
            JOptionPane.showMessageDialog(this, "Sửa thành công");

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Sửa thất bại !"+e);
        }
    }//GEN-LAST:event_btnSuadocgiaActionPerformed

    private void btnXoadocgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoadocgiaActionPerformed
        try{

            String ma=maRowSelected();
            if(JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không ?")==0){
                c.insert_remove_updateData("delete from sinhvien where masinhvien="+ma);
                JOptionPane.showMessageDialog(this, "Xóa thành công");
            }

        }  catch(Exception e){
            JOptionPane.showMessageDialog(this, "Xóa thất bại" +e);
        }
    }//GEN-LAST:event_btnXoadocgiaActionPerformed

    private void btnCapnhatdocgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhatdocgiaActionPerformed

        //reset null tất cả
        txtMadocgia.setText("");
        txtTendocgia.setText("");
        txtlop.setText("");

        clearDataInTable();
        hienthidata();
    }//GEN-LAST:event_btnCapnhatdocgiaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        clearDataInTable();
        try {
            String gttimkiem=txtTimkiem.getText();
            
            String sql="select * from sinhvien where tensinhvien like N'%"+gttimkiem+"%' or masinhvien like '%"+gttimkiem+"%'";
            ResultSet rs=c.loadData(sql);
            
            while(rs.next()){
                
                dtm.addRow(new Object[]{
                    rs.getInt(1),rs.getString(2),rs.getString(3)
                });
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(panel_quanlysach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed
public void hienthidata(){
       try {
                ResultSet rs=c.loadData("select * from sinhvien");
             
            while(rs.next()){
                dtm.addRow(new Object[]{
                   rs.getInt(1),rs.getString(2),rs.getString(3)
                });
                
            }
           
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(this, "Không có dữ liệu để hiển thị");
        }
    }
    public void clearDataInTable(){
        for(int i=dtm.getRowCount()-1;i>=0;--i){
            dtm.removeRow(i);
        }
    }  
    public String maRowSelected(){
         int row=jTabledocgia.getSelectedRow();
         String ma=this.jTabledocgia.getModel().getValueAt(row, 0).toString();
         
         return ma;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapnhatdocgia;
    private javax.swing.JButton btnCapnhatnxb;
    private javax.swing.JButton btnSuadocgia;
    private javax.swing.JButton btnSuanxb;
    private javax.swing.JButton btnThemdocgia;
    private javax.swing.JButton btnThemnxb;
    private javax.swing.JButton btnXoadocgia;
    private javax.swing.JButton btnXoanxb;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabledocgia;
    private javax.swing.JTable jTablenxb;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField txtMadocgia;
    private javax.swing.JTextField txtManxb;
    private javax.swing.JTextField txtTendocgia;
    private javax.swing.JTextField txtTennxb;
    private javax.swing.JTextField txtTimkiem;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtlop;
    // End of variables declaration//GEN-END:variables
}
