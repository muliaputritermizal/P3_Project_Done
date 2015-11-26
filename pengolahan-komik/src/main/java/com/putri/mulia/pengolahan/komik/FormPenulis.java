/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.putri.mulia.pengolahan.komik;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 *
 * @author OWNER
 */
public class FormPenulis extends javax.swing.JFrame {

    /**
     * Creates new form FormPenulis
     */
    public FormPenulis() {
        initComponents();
        
        inputIdPenulis.setEditable(false);
        btnUbah.setEnabled(false);
        btnHapus.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelIdPenulis = new javax.swing.JLabel();
        labelNamaPenulis = new javax.swing.JLabel();
        labelAlamatPenulis = new javax.swing.JLabel();
        labelHpPenulis = new javax.swing.JLabel();
        inputIdPenulis = new javax.swing.JTextField();
        inputNamaPenulis = new javax.swing.JTextField();
        inputAlamaPenulis = new javax.swing.JTextField();
        inputHpPenulis = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePenulis = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        labelIdPenulis.setText("ID Penulis");

        labelNamaPenulis.setText("Nama Penulis");

        labelAlamatPenulis.setText("Alamat");

        labelHpPenulis.setText("No Hp");

        tablePenulis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "ID Penulis", "Nama ", "Alamat", "No Hp"
            }
        ));
        tablePenulis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePenulisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePenulis);

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIdPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNamaPenulis)
                            .addComponent(labelAlamatPenulis)
                            .addComponent(labelHpPenulis))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputIdPenulis, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(inputNamaPenulis)
                            .addComponent(inputAlamaPenulis)
                            .addComponent(inputHpPenulis))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUbah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIdPenulis)
                    .addComponent(inputIdPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNamaPenulis)
                    .addComponent(inputNamaPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUbah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlamatPenulis)
                    .addComponent(inputAlamaPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHpPenulis)
                    .addComponent(inputHpPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        showDataPenulis();
    }//GEN-LAST:event_formWindowActivated

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
       String nama_penulis = inputNamaPenulis.getText().replaceAll(" ", "%20");
       String alamat = inputAlamaPenulis.getText().replaceAll(" ", "%20");
       String no_hp = inputHpPenulis.getText().replaceAll(" ", "%20");
       
    
    
        if (nama_penulis.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Data Tidak Boleh Kosong", "Informasi", JOptionPane.ERROR_MESSAGE);

        } else {

            JOptionPane.showMessageDialog(this, "Data Berhasil disimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);

            String url = "http://localhost/komik_server/penulis/create/"  + nama_penulis + "/" + alamat + "/" + no_hp;

            getDataURL dataurl = new getDataURL();

            try {

                String data = dataurl.getData(url);
                System.out.println(data);

                inputNamaPenulis.setText("");
                inputAlamaPenulis.setText("");
                inputHpPenulis.setText("");
               

            } catch (IOException ex) {

                Logger.getLogger(FormPenulis.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void tablePenulisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePenulisMouseClicked
         int row = tablePenulis.getSelectedRow();

        String id_penulis = (tablePenulis.getModel().getValueAt(row, 1).toString());
        String nama_penulis = (tablePenulis.getModel().getValueAt(row, 2).toString());
        String alamat = (tablePenulis.getModel().getValueAt(row, 3).toString());
        String no_hp= (tablePenulis.getModel().getValueAt(row, 4).toString());

        System.out.println("ID Penulis : " + id_penulis);
        System.out.println("Nama Penulis : " + nama_penulis);
        System.out.println("Alamat : " + alamat);
        System.out.println("No Hp : " + no_hp);


       
        inputIdPenulis.setText(id_penulis);
        inputNamaPenulis.setText(nama_penulis);
        inputAlamaPenulis.setText(alamat);
        inputHpPenulis.setText(no_hp);
      

        btnTambah.setEnabled(false);
        btnHapus.setEnabled(true);
        btnUbah.setEnabled(true);
    }//GEN-LAST:event_tablePenulisMouseClicked

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
      
       String id_penulis = inputIdPenulis.getText(); 
       String nama_penulis = inputNamaPenulis.getText().replaceAll(" ", "%20");
       String alamat = inputAlamaPenulis.getText().replaceAll(" ", "%20");
       String no_hp = inputHpPenulis.getText().replaceAll(" ", "%20");  
        if (nama_penulis.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Data Tidak Boleh Kosong", "Informasi", JOptionPane.ERROR_MESSAGE);

        } else {

            JOptionPane.showMessageDialog(this, "Data Berhasil diupdate", "Informasi", JOptionPane.INFORMATION_MESSAGE);

            String url = "http://localhost/komik_server/penulis/update/" + id_penulis + "/" + nama_penulis + "/" + alamat + "/" + no_hp;

            getDataURL dataurl = new getDataURL();

            try {

                String data = dataurl.getData(url);
                System.out.println(data);

                inputIdPenulis.setText("");
                inputNamaPenulis.setText("");
                inputAlamaPenulis.setText("");
                inputHpPenulis.setText("");
      
                btnTambah.setEnabled(true);
                btnHapus.setEnabled(false);
                btnUbah.setEnabled(false);

            } catch (IOException ex) {

                Logger.getLogger(FormPenulis.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        String id_penulis = inputIdPenulis.getText();

        String url = "http://localhost/komik_server/penulis/delete/" + id_penulis;

        getDataURL dataurl = new getDataURL();

        try {

            System.out.println("Menghapus : " + id_penulis);

            String data = dataurl.getData(url);
            System.out.println(data);

            inputIdPenulis.setText("");
            inputNamaPenulis.setText("");
            inputAlamaPenulis.setText("");
            inputHpPenulis.setText("");

            btnTambah.setEnabled(true);
            btnHapus.setEnabled(false);
            btnUbah.setEnabled(false);

            showDataPenulis();

        } catch (IOException ex) {

            Logger.getLogger(FormPenulis.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_btnHapusActionPerformed

     public void showDataPenulis() {
        try {
            getDataURL dataurl = new getDataURL();
            DefaultTableModel model = (DefaultTableModel) tablePenulis.getModel();

            model.setRowCount(0);

            String url = "http://localhost/komik_server/penulis/read";

            String data = dataurl.getData(url);
            Object obj = JSONValue.parse(data);
            JSONArray dataArray = (JSONArray) obj;

            System.out.println("Banyak datanya : " + dataArray.size());

            for (int i = 0; i < dataArray.size(); i++) {
                JSONObject getData = (JSONObject) dataArray.get(i);

                Object[] row = {
                    i + 1,
                    getData.get("id_penulis"),
                    getData.get("nama_penulis"),
                    getData.get("alamat"),
                    getData.get("no_hp"),
                    getData.get("email")
                };

                model.addRow(row);
            }
        } catch (IOException ex) {
            Logger.getLogger(FormPenulis.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(FormPenulis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPenulis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPenulis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPenulis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPenulis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JTextField inputAlamaPenulis;
    private javax.swing.JTextField inputHpPenulis;
    private javax.swing.JTextField inputIdPenulis;
    private javax.swing.JTextField inputNamaPenulis;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAlamatPenulis;
    private javax.swing.JLabel labelHpPenulis;
    private javax.swing.JLabel labelIdPenulis;
    private javax.swing.JLabel labelNamaPenulis;
    private javax.swing.JTable tablePenulis;
    // End of variables declaration//GEN-END:variables

   
}
