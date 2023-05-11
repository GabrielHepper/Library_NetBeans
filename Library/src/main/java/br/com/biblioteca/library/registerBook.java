/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.com.biblioteca.library;

import br.com.biblioteca.library.model.ModelBooks;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class registerBook extends javax.swing.JDialog {
   public static ArrayList<ModelBooks> books = new ArrayList<>();
 
   
    public registerBook(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookJL = new javax.swing.JLabel();
        bookAuthorJL = new javax.swing.JLabel();
        launchDateJL = new javax.swing.JLabel();
        categoryJL = new javax.swing.JLabel();
        bookJTF = new javax.swing.JTextField();
        bookAuthorJTF = new javax.swing.JTextField();
        launchJTF = new javax.swing.JTextField();
        categoryJTF = new javax.swing.JTextField();
        confirmBookJB = new javax.swing.JButton();
        clearBookJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bookJL.setText("Book");

        bookAuthorJL.setText("Book Author");

        launchDateJL.setText("Launch");

        categoryJL.setText("Category");

        bookJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookJTFActionPerformed(evt);
            }
        });

        bookAuthorJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAuthorJTFActionPerformed(evt);
            }
        });

        categoryJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryJTFActionPerformed(evt);
            }
        });

        confirmBookJB.setText("Confirm");
        confirmBookJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBookJBActionPerformed(evt);
            }
        });

        clearBookJB.setText("Clear");
        clearBookJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBookJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(confirmBookJB, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearBookJB, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bookJL, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(launchDateJL, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(launchJTF))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bookAuthorJL)
                            .addComponent(bookAuthorJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(categoryJL, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryJTF))))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookJL)
                    .addComponent(bookAuthorJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookAuthorJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookJTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(launchDateJL)
                    .addComponent(categoryJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(launchJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmBookJB)
                    .addComponent(clearBookJB))
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bookAuthorJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAuthorJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookAuthorJTFActionPerformed

    private void categoryJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryJTFActionPerformed

    private void bookJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookJTFActionPerformed

    private void confirmBookJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBookJBActionPerformed
        
        String name = bookJTF.getText();
        String author = bookAuthorJTF.getText();
        String category = categoryJTF.getText();
        String launch = launchJTF.getText();
        
        if(name.isEmpty() || author.isEmpty() || category.isEmpty() || launch.isEmpty()){
            JOptionPane.showMessageDialog(this, "Pleas, fill in the blank fields");
            return;
        }
        
        ModelBooks sale = new ModelBooks(name, author, category, launch);
        books.add(sale);
       
        JOptionPane.showMessageDialog(this, "Register Complete");
        this.dispose();
        
    }//GEN-LAST:event_confirmBookJBActionPerformed

    private void clearBookJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBookJBActionPerformed
        bookJTF.setText("");
        bookAuthorJTF.setText("");
        launchJTF.setText("");
        categoryJTF.setText("");
    }//GEN-LAST:event_clearBookJBActionPerformed

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
            java.util.logging.Logger.getLogger(registerBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                registerBook dialog = new registerBook(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookAuthorJL;
    private javax.swing.JTextField bookAuthorJTF;
    private javax.swing.JLabel bookJL;
    public static javax.swing.JTextField bookJTF;
    private javax.swing.JLabel categoryJL;
    private javax.swing.JTextField categoryJTF;
    private javax.swing.JButton clearBookJB;
    private javax.swing.JButton confirmBookJB;
    private javax.swing.JLabel launchDateJL;
    private javax.swing.JTextField launchJTF;
    // End of variables declaration//GEN-END:variables
}
