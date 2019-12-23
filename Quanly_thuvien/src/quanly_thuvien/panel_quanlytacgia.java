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
public class panel_quanlytacgia extends javax.swing.JPanel {

   connect c=new connect();//khoi tao class connect để kết nối database
     private Connection conn;
    private DefaultTableModel dtm;
    public panel_quanlytacgia() {
        initComponents();
    
        
        dtm=(DefaultTableModel) jTabletacgia.getModel();
        dtm.setColumnIdentifiers(new Object[]{
        
       "Mã tác giả","Tên tác giả"
    });
        btnThemtacgia.setEnabled(false);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabletacgia = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        txttimkiem = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMatacgia = new javax.swing.JTextField();
        txtTentacgia = new javax.swing.JTextField();
        btnThemtacgia = new javax.swing.JButton();
        btnSuatacgia = new javax.swing.JButton();
        btnXoatacgia = new javax.swing.JButton();
        btnCapnhattacgia = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(950, 665));

        jPanel1.setPreferredSize(new java.awt.Dimension(930, 520));

        jTabletacgia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTabletacgia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTabletacgiaFocusLost(evt);
            }
        });
        jTabletacgia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabletacgiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabletacgia);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2), "Tìm kiếm tác giả", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 153, 0))); // NOI18N

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanly_thuvien/image/search.png"))); // NOI18N
        jButton4.setText("Tìm kiếm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2), "Chỉnh sửa tác giả", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 153, 0))); // NOI18N
        jPanel8.setMaximumSize(new java.awt.Dimension(483, 259));
        jPanel8.setMinimumSize(new java.awt.Dimension(483, 259));

        jLabel10.setText("Mã tác giả");

        jLabel11.setText("Tên tác giả");

        txtMatacgia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMatacgiaMouseClicked(evt);
            }
        });
        txtMatacgia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatacgiaKeyPressed(evt);
            }
        });

        btnThemtacgia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanly_thuvien/image/add.png"))); // NOI18N
        btnThemtacgia.setText("Thêm");
        btnThemtacgia.setPreferredSize(new java.awt.Dimension(90, 32));
        btnThemtacgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemtacgiaActionPerformed(evt);
            }
        });

        btnSuatacgia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanly_thuvien/image/edit.png"))); // NOI18N
        btnSuatacgia.setText("Sửa");
        btnSuatacgia.setPreferredSize(new java.awt.Dimension(90, 32));
        btnSuatacgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuatacgiaActionPerformed(evt);
            }
        });

        btnXoatacgia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanly_thuvien/image/delete.png"))); // NOI18N
        btnXoatacgia.setText("Xóa");
        btnXoatacgia.setPreferredSize(new java.awt.Dimension(90, 32));
        btnXoatacgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoatacgiaActionPerformed(evt);
            }
        });

        btnCapnhattacgia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanly_thuvien/image/restart.png"))); // NOI18N
        btnCapnhattacgia.setText("Cập nhât");
        btnCapnhattacgia.setPreferredSize(new java.awt.Dimension(90, 32));
        btnCapnhattacgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhattacgiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnThemtacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnSuatacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(35, 35, 35)
                        .addComponent(txtMatacgia, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnXoatacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnCapnhattacgia, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtTentacgia, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(txtTentacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemtacgia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuatacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoatacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapnhattacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTabletacgiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabletacgiaFocusLost
        
    }//GEN-LAST:event_jTabletacgiaFocusLost

    private void jTabletacgiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabletacgiaMouseClicked
        btnThemtacgia.setEnabled(false);

        String ma=maRowSelected();

        ResultSet rs=c.loadData("select * from tacgia where matacgia="+ma);

        //xoa de gan lai gia tri ứng với csdl
      

        try {
            if(rs.next()){
                txtMatacgia.setText(String.valueOf(rs.getInt(1)));
                txtTentacgia.setText(rs.getString(2));
                
            }} catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Lỗi khi click vào table");
            }
    }//GEN-LAST:event_jTabletacgiaMouseClicked

    private void txtMatacgiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMatacgiaMouseClicked

    }//GEN-LAST:event_txtMatacgiaMouseClicked

    private void txtMatacgiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatacgiaKeyPressed

        btnThemtacgia.setEnabled(true);
        
    }//GEN-LAST:event_txtMatacgiaKeyPressed

    private void btnThemtacgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemtacgiaActionPerformed
        
        int ma = Integer.parseInt(txtMatacgia.getText());
        String tentg = txtTentacgia.getText();
       

        String sql=String.format("insert into tacgia(matacgia,tentacgia) values(%d,N'%s')",ma,tentg);
        try{

            c.insert_remove_updateData(sql);//thực hiện thêm

            JOptionPane.showMessageDialog(this, "Thêm thành công");

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Thêm thất bại !"+e);
        }
    }//GEN-LAST:event_btnThemtacgiaActionPerformed

    private void btnSuatacgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuatacgiaActionPerformed

        String ma=maRowSelected();

        //ep kieu
        int makiemtra=Integer.parseInt(ma);

        int Mamoi = Integer.parseInt(txtMatacgia.getText());
        String Tenmoi = txtTentacgia.getText();
       

        String sql=String.format("update tacgia set matacgia=%d,tentacgia=N'%s' where masach=%d",Mamoi,Tenmoi,makiemtra );

        try{
            c.insert_remove_updateData(sql);
            JOptionPane.showMessageDialog(this, "Sửa thành công");

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Sửa thất bại !"+e);
        }
    }//GEN-LAST:event_btnSuatacgiaActionPerformed

    private void btnXoatacgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoatacgiaActionPerformed
        try{

            String ma=maRowSelected();
            if(JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không ?")==0){
                c.insert_remove_updateData("delete from tacgia where matacgia="+ma);
                JOptionPane.showMessageDialog(this, "Xóa thành công");
            }

        }  catch(Exception e){
            JOptionPane.showMessageDialog(this, "Xóa thất bại" +e);
        }
    }//GEN-LAST:event_btnXoatacgiaActionPerformed

    private void btnCapnhattacgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhattacgiaActionPerformed

       //reset null tất cả
        txtMatacgia.setText("");
        txtTentacgia.setText("");

        clearDataInTable();
        hienthidata();
    }//GEN-LAST:event_btnCapnhattacgiaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clearDataInTable();
        try {
            String gttimkiem=txttimkiem.getText();
            
            String sql="select * from tacgia where tentacgia like N'%"+gttimkiem+"%' or matacgia like '%"+gttimkiem+"%'";
            ResultSet rs=c.loadData(sql);
            
            while(rs.next()){
                
                dtm.addRow(new Object[]{
                    rs.getInt(1),rs.getString(2)
                });
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(panel_quanlysach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    public void hienthidata(){
       try {
                ResultSet rs=c.loadData("select * from tacgia");
             
            while(rs.next()){
                dtm.addRow(new Object[]{
                   rs.getInt(1),rs.getString(2)
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
         int row=jTabletacgia.getSelectedRow();
         String ma=this.jTabletacgia.getModel().getValueAt(row, 0).toString();
         
         return ma;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapnhattacgia;
    private javax.swing.JButton btnSuatacgia;
    private javax.swing.JButton btnThemtacgia;
    private javax.swing.JButton btnXoatacgia;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabletacgia;
    private javax.swing.JTextField txtMatacgia;
    private javax.swing.JTextField txtTentacgia;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}
