/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM.MainMenu;

import ATM.Class.ArraysClass;
import ATM.Exit.OperationDone;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Derakhshan
 */
public class ChangePassword extends javax.swing.JFrame {

    ArraysClass ac = new ArraysClass();
    int lan;

    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
        initComponents();
    }
    int i;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPassword1 = new javax.swing.JButton();
        btnPassword2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        laError = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        laErr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnPassword1.setText("رمز اول");
        btnPassword1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPassword1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassword1ActionPerformed(evt);
            }
        });

        btnPassword2.setText("رمز دوم");
        btnPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassword2ActionPerformed(evt);
            }
        });

        jLabel1.setText("رمز جدید خود را وارد کنید");

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

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        laErr.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword)
                    .addComponent(btnPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPassword2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                            .addComponent(laError, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(laErr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPassword1)
                .addGap(18, 18, 18)
                .addComponent(btnPassword2)
                .addGap(18, 18, 18)
                .addComponent(laErr, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(laError)
                .addGap(18, 18, 18)
                .addComponent(btnConfirm)
                .addGap(18, 18, 18)
                .addComponent(btnReturn)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        OtherServices o = new OtherServices();
        o.lan = this.lan;
        o.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        String question, confirm, save, error0, error1, error2;
        if (lan == 0) {
            question = "Are you sure?";
            confirm = "Confirm";
            save = "saved";
            error0 = "This password is not secure";
            error1 = "First password shoud have four digits";
            error2 = "Second Password shoud have six to eight digits";
        } else {
            question = "مطمئن هستید؟";
            confirm = "تایید";
            save = "ذخیره شد";
            error0 = "امنیت این رمز پایین است";
            error1 = "رمز اول کارت باید چهار رقمی باشد";
            error2 = "رمز دوم باید شش الی هشت رقمی باشد";
        }
        boolean done = false;
        int result = JOptionPane.showConfirmDialog(null, question, confirm,
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            int newPassword = Integer.parseInt(String.valueOf(txtPassword.getPassword()));

            if (i == 1) {
                if (newPassword == 0) {
                    laErr.setForeground(Color.red);
                    laErr.setText(error2);
                } else if (newPassword < 1000 || newPassword > 9999) {
                    laErr.setText(error1);
                } else {
                    ac.changePass1(newPassword);
                    done = true;
                }
            } else if (i == 2) {
                if (newPassword == 0) {
                    laErr.setText(error0);
                } else if (newPassword < 100000 || newPassword > 99999999) {
                    laErr.setText(error1);
                } else {
                    ac.changePass2(newPassword);
                    done = true;
                }

            }
            if (done) {
                OperationDone od = new OperationDone();
                od.lan = this.lan;
                od.setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassword1ActionPerformed
        i = 1;
        btnPassword2.setVisible(false);
        btnPassword2.setEnabled(false);
        btnPassword1.setEnabled(false);
        jLabel1.setVisible(true);
        txtPassword.setVisible(true);
        btnConfirm.setVisible(true);
    }//GEN-LAST:event_btnPassword1ActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed

    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnPassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassword2ActionPerformed
        i = 2;
        btnPassword1.setVisible(false);
        btnPassword1.setEnabled(false);
        btnPassword2.setEnabled(false);
        jLabel1.setVisible(true);
        txtPassword.setVisible(true);
        btnConfirm.setVisible(true);
    }//GEN-LAST:event_btnPassword2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (lan == 0) {
            jLabel1.setText("Enter your new password");
            btnConfirm.setText("Confirm");
            btnPassword1.setText("Password 1");
            btnPassword2.setText("Password 2");
            btnReturn.setText("Return");
        }
        jLabel1.setVisible(false);
        txtPassword.setVisible(false);
        btnConfirm.setVisible(false);

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnPassword1;
    private javax.swing.JButton btnPassword2;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel laErr;
    private javax.swing.JLabel laError;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
