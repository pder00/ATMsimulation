/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM.MainMenu;

import ATM.Class.ArraysClass;
import ATM.Exit.OperationDone;
import javax.swing.JOptionPane;

/**
 *
 * @author Derakhshan
 */
public class WithdrawCash extends javax.swing.JFrame {

    ArraysClass ac = new ArraysClass();
    int lan ;
    int amount, other = 0;
    boolean done = false;
    String not, question, confirm, save;
    int balance = ac.searchbalance();

    /**
     * Creates new form WithdrawCash
     */
    public WithdrawCash() {

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

        jLabel1 = new javax.swing.JLabel();
        btn20 = new javax.swing.JButton();
        btn80 = new javax.swing.JButton();
        btn120 = new javax.swing.JButton();
        btn40 = new javax.swing.JButton();
        btn100 = new javax.swing.JButton();
        btnOther = new javax.swing.JButton();
        txtEnter = new javax.swing.JTextField();
        btnReturn = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn200 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("مبلغ مورد نظر خود را انتخاب کنید");

        btn20.setText("20000");
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn80.setText("80000");
        btn80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn80ActionPerformed(evt);
            }
        });

        btn120.setText("120000");
        btn120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn120ActionPerformed(evt);
            }
        });

        btn40.setText("40000");
        btn40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn40ActionPerformed(evt);
            }
        });

        btn100.setText("100000");
        btn100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100ActionPerformed(evt);
            }
        });

        btnOther.setText("مبالغ دیگر");
        btnOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtherActionPerformed(evt);
            }
        });

        btnReturn.setText("بازگشت");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        btnConfirm.setText("تایید");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel2.setText("مبلغ مورد نظر خود را وارد کنید");

        btn200.setText("200000");
        btn200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn200ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn20, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(btn80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn40, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn100, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEnter, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnOther, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn120, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn200, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn20)
                    .addComponent(btn40))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn80)
                    .addComponent(btn100))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn120)
                    .addComponent(btn200))
                .addGap(18, 18, 18)
                .addComponent(btnOther)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirm)
                .addGap(18, 18, 18)
                .addComponent(btnReturn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        amount = 20000;
        int minus = amount;
        int result = JOptionPane.showConfirmDialog(null, question, confirm,
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            if (minus > balance) {
                JOptionPane.showMessageDialog(null, not);
            } else {
                int newbalance = balance - minus;
                ac.changeBalance(newbalance);
                done = true;
            }
            if (done) {
                OperationDone od = new OperationDone();
                od.lan = this.lan;
                od.setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_btn20ActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        UserMainMenu m = new UserMainMenu();
        m.lan = this.lan;
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtherActionPerformed
        btn120.setEnabled(false);
        btn120.setVisible(false);
        btn40.setEnabled(false);
        btn40.setVisible(false);
        btn100.setEnabled(false);
        btn100.setVisible(false);
        btn20.setEnabled(false);
        btn20.setVisible(false);
        btn80.setEnabled(false);
        btn80.setVisible(false);
        btn200.setVisible(false);
        btn200.setEnabled(false);
        txtEnter.setVisible(true);
        jLabel2.setVisible(true);
        jLabel1.setVisible(false);
        btnOther.setEnabled(false);
        other = 1;
    }//GEN-LAST:event_btnOtherActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if (other == 1) {
            amount = Integer.parseInt(String.valueOf(txtEnter.getText()));
        }
        int minus = amount;
        int result = JOptionPane.showConfirmDialog(null, question, confirm,
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            if (minus > balance) {
                JOptionPane.showMessageDialog(null, not);
            } else {
                int newbalance = balance - minus;
                ac.changeBalance(newbalance);
                done = true;
            }
            if (done) {
                OperationDone od = new OperationDone();
                od.lan = this.lan;
                od.setVisible(true);
                this.setVisible(false);
            }
        }

    }//GEN-LAST:event_btnConfirmActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (lan == 0) {
            jLabel1.setText("Select the amount");
            jLabel2.setText("Enter the amount");
            btnConfirm.setText("Confirm");
            btnOther.setText("Other amounts");
            btnReturn.setText("Return");
            question = "Are you sure?";
            confirm = "Confirm";
            not = "Your account balance is not enough";
        } else {
            question = "مطمئن هستید؟";
            confirm = "تایید";
            not = "موجودی حساب شما کافی نیست";
        }
        jLabel2.setVisible(false);
        txtEnter.setVisible(false);
        btnConfirm.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void btn40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn40ActionPerformed
        amount = 40000;
        int minus = amount;
        int result = JOptionPane.showConfirmDialog(null, question, confirm,
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            if (minus > balance) {
                JOptionPane.showMessageDialog(null, not);
            } else {
                int newbalance = balance - minus;
                ac.changeBalance(newbalance);
                done = true;
            }
            if (done) {
                OperationDone od = new OperationDone();
                od.lan = this.lan;
                od.setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_btn40ActionPerformed

    private void btn80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn80ActionPerformed
        amount = 800000;
        int minus = amount;
        int result = JOptionPane.showConfirmDialog(null, question, confirm,
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            if (minus > balance) {
                JOptionPane.showMessageDialog(null, not);
            } else {
                int newbalance = balance - minus;
                ac.changeBalance(newbalance);
                done = true;
            }
            if (done) {
                OperationDone od = new OperationDone();
                od.lan = this.lan;
                od.setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_btn80ActionPerformed

    private void btn100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100ActionPerformed
        amount = 100000;
        int minus = amount;
        int result = JOptionPane.showConfirmDialog(null, question, confirm,
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            if (minus > balance) {
                JOptionPane.showMessageDialog(null, not);
            } else {
                int newbalance = balance - minus;
                ac.changeBalance(newbalance);
                done = true;
            }
            if (done) {
                OperationDone od = new OperationDone();
                od.lan = this.lan;
                od.setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_btn100ActionPerformed

    private void btn120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn120ActionPerformed
        amount = 120000;
        int minus = amount;
        int result = JOptionPane.showConfirmDialog(null, question, confirm,
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            if (minus > balance) {
                JOptionPane.showMessageDialog(null, not);
            } else {
                int newbalance = balance - minus;
                ac.changeBalance(newbalance);
                done = true;
            }
            if (done) {
                OperationDone od = new OperationDone();
                od.lan = this.lan;
                od.setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_btn120ActionPerformed

    private void btn200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn200ActionPerformed
        amount = 200000;
        int minus = amount;
        int result = JOptionPane.showConfirmDialog(null, question, confirm,
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            if (minus > balance) {
                JOptionPane.showMessageDialog(null, not);
            } else {
                int newbalance = balance - minus;
                ac.changeBalance(newbalance);
                done = true;
            }
            if (done) {
                OperationDone od = new OperationDone();
                od.lan = this.lan;
                od.setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_btn200ActionPerformed

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
            java.util.logging.Logger.getLogger(WithdrawCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WithdrawCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WithdrawCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WithdrawCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WithdrawCash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn100;
    private javax.swing.JButton btn120;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn200;
    private javax.swing.JButton btn40;
    private javax.swing.JButton btn80;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnOther;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtEnter;
    // End of variables declaration//GEN-END:variables
}
