package br.com.biblioteca.library;

import br.com.biblioteca.library.model.ModelBooks;
import javax.swing.table.DefaultTableModel;
import static br.com.biblioteca.library.registerBook.books;
import com.formdev.flatlaf.FlatDarkLaf;

public class LibraryJFrame extends javax.swing.JFrame {
    DefaultTableModel modelList = new DefaultTableModel();


    public LibraryJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        store = new javax.swing.JMenu();
        booksStore = new javax.swing.JMenuItem();
        register = new javax.swing.JMenu();
        registerBook = new javax.swing.JMenuItem();
        registerCustomer = new javax.swing.JMenuItem();
        view = new javax.swing.JMenu();
        customerList = new javax.swing.JMenuItem();
        loanHistoric = new javax.swing.JMenuItem();
        purchasesHistoric = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library");

        store.setText("Store");

        booksStore.setText("Book Store");
        booksStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksStoreActionPerformed(evt);
            }
        });
        store.add(booksStore);

        jMenuBar1.add(store);

        register.setText("Register");

        registerBook.setText("Register Book");
        registerBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBookActionPerformed(evt);
            }
        });
        register.add(registerBook);

        registerCustomer.setText("Register Customer");
        registerCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerCustomerActionPerformed(evt);
            }
        });
        register.add(registerCustomer);

        jMenuBar1.add(register);

        view.setText("View");

        customerList.setText("Customer List");
        customerList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerListActionPerformed(evt);
            }
        });
        view.add(customerList);

        loanHistoric.setText("Loan Historic");
        loanHistoric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanHistoricActionPerformed(evt);
            }
        });
        view.add(loanHistoric);

        purchasesHistoric.setText("Purchases Historic");
        purchasesHistoric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchasesHistoricActionPerformed(evt);
            }
        });
        view.add(purchasesHistoric);

        jMenuBar1.add(view);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerCustomerActionPerformed
        registerCustomer registerCustomerWindow = new registerCustomer(this, true);
        registerCustomerWindow.setVisible(true);
    }//GEN-LAST:event_registerCustomerActionPerformed

    private void customerListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerListActionPerformed
        CustomersList CustomersListWindow = new CustomersList(this, true);
        CustomersListWindow.setVisible(true);
    }//GEN-LAST:event_customerListActionPerformed

    private void registerBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBookActionPerformed
        registerBook registerBookWindow = new registerBook(this, true);
        registerBookWindow.setVisible(true);
    }//GEN-LAST:event_registerBookActionPerformed

    private void booksStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksStoreActionPerformed
        booksStore booksForSaleWindow = new booksStore(this, true);
        booksForSaleWindow.setVisible(true);
        
        
    }//GEN-LAST:event_booksStoreActionPerformed

    private void loanHistoricActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanHistoricActionPerformed
        LoanHistoric LoanHistoricWindow = new LoanHistoric(this, true);
        LoanHistoricWindow.setVisible(true);
    }//GEN-LAST:event_loanHistoricActionPerformed

    private void purchasesHistoricActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchasesHistoricActionPerformed
        PurchasesHistoric PurchasesHistoricWindow = new PurchasesHistoric(this, true);
        PurchasesHistoricWindow.setVisible(true);
    }//GEN-LAST:event_purchasesHistoricActionPerformed

   
    public static void main(String args[]) {
       try {
    //javax.swing.UIManager.setLookAndFeel(new FlatLightLaf()); // Light
    javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf()); // Dark
    //javax.swing.UIManager.setLookAndFeel(new FlatIntelliJLaf()); // Intellij
    //javax.swing.UIManager.setLookAndFeel(new FlatDarculaLaf()); // Dracula
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
    java.util.logging.Logger.getLogger(LibraryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibraryJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem booksStore;
    private javax.swing.JMenuItem customerList;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem loanHistoric;
    private javax.swing.JMenuItem purchasesHistoric;
    private javax.swing.JMenu register;
    private javax.swing.JMenuItem registerBook;
    private javax.swing.JMenuItem registerCustomer;
    private javax.swing.JMenu store;
    private javax.swing.JMenu view;
    // End of variables declaration//GEN-END:variables
}
