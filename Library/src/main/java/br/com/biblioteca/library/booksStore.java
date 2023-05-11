/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.com.biblioteca.library;

import static br.com.biblioteca.library.PurchasesHistoric.historic;
import br.com.biblioteca.library.model.ModelBooks;
import static br.com.biblioteca.library.registerBook.bookJTF;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static br.com.biblioteca.library.registerBook.books;

/**
 *
 * @author Vaio
 */
public class booksStore extends javax.swing.JDialog {

    DefaultTableModel modelList = new DefaultTableModel();

    /**
     * Creates new form booksForSale
     */
    public booksStore(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listSaleJB = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        StoreTable = new javax.swing.JTable();
        BuyJB = new javax.swing.JButton();
        BorrowJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        listSaleJB.setText("List");
        listSaleJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listSaleJBActionPerformed(evt);
            }
        });

        StoreTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(StoreTable);

        BuyJB.setText("Buy");
        BuyJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyJBActionPerformed(evt);
            }
        });

        BorrowJB.setText("Borrow");
        BorrowJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(listSaleJB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuyJB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BorrowJB)
                .addGap(6, 6, 6))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listSaleJB)
                    .addComponent(BuyJB)
                    .addComponent(BorrowJB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listSaleJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listSaleJBActionPerformed

        modelList.setRowCount(0);
        modelList.setColumnCount(0);

        modelList.addColumn("Book");
        modelList.addColumn("Author");
        modelList.addColumn("Category");
        modelList.addColumn("Launch");

        for (ModelBooks BooksList : books) {

            modelList.addRow(new Object[]{
                BooksList.getName(), BooksList.getAuthor(), BooksList.getCategory(), BooksList.getLaunch()
            });
        }

        StoreTable.setModel(modelList);
        StoreTable.setDefaultEditor(Object.class, null);
    }//GEN-LAST:event_listSaleJBActionPerformed

    private void BuyJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyJBActionPerformed

        int rowSale = StoreTable.getSelectedRow();
        modelList.removeRow(rowSale);

        for (ModelBooks removeBooks : books) {
            books.remove(removeBooks);

            historic.add(removeBooks);

            JOptionPane.showMessageDialog(this, "Book Bought");
            this.dispose();
            break;
        }

    }//GEN-LAST:event_BuyJBActionPerformed

    private void BorrowJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowJBActionPerformed
        int rowSale = StoreTable.getSelectedRow();
        modelList.removeRow(rowSale);

        for (ModelBooks removeBooks : books) {
            books.remove(removeBooks);

            LoanHistoric.historicLoan.add(removeBooks);
            
            JOptionPane.showMessageDialog(this, "Book Borrowed");
            this.dispose();
            break;
        }
    }//GEN-LAST:event_BorrowJBActionPerformed

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
            java.util.logging.Logger.getLogger(booksStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(booksStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(booksStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(booksStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                booksStore dialog = new booksStore(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BorrowJB;
    private javax.swing.JButton BuyJB;
    private javax.swing.JTable StoreTable;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton listSaleJB;
    // End of variables declaration//GEN-END:variables
}
