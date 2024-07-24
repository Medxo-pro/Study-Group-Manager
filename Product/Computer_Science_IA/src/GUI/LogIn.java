/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Controllers.LogInController;
import DataBase.DbConnection1;
import java.awt.Color;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 *
 * @author Atmani
 * 
 */
public class LogIn extends javax.swing.JFrame { //LogIn extends JFrame in order to use its GUI functionalities.

    private LogInController controller = new LogInController(); //Instance of the "LogInController" controller class. 
    //Allows using functions of the "LogInController" class inside the "LogIn" class. 

    public LogIn() { //Constructor of the "LogIn" GUI class. 
        initComponents();

        /*
        I will soon implement a system to check if any of the Study groups Expired.
        If found, I will impelment another algorithms to eliminate them.
         */
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Password = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jTextFieldUserName = new javax.swing.JTextField();
        ForgotPass = new javax.swing.JButton();
        LogIn = new javax.swing.JButton();
        CreateAccount = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        UserName = new javax.swing.JLabel();
        UserName1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        Password.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        Password.setText("Password:");

        jPasswordFieldPassword.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordFieldPassword.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordFieldPassword.setText("jPasswordField1");
        jPasswordFieldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldPasswordFocusLost(evt);
            }
        });

        jTextFieldUserName.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldUserName.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldUserName.setText("Mehdi_Atmani_DP2");
        jTextFieldUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUserNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldUserNameFocusLost(evt);
            }
        });

        ForgotPass.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        ForgotPass.setText("Forgot password?");
        ForgotPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ForgotPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForgotPassActionPerformed(evt);
            }
        });

        LogIn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        LogIn.setText("Log-In");
        LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInActionPerformed(evt);
            }
        });

        CreateAccount.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        CreateAccount.setText("Create Account");
        CreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(137, 177, 211));

        UserName.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        UserName.setText("Log-In");
        UserName.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(UserName, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(199, 199, 199))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        UserName1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        UserName1.setText("User Name:");
        UserName1.setToolTipText("");

        jButton1.setBackground(new java.awt.Color(242, 242, 242));
        jButton1.setText("ⓘ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(242, 242, 242));
        jButton2.setText("ⓘ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(CreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ForgotPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserName1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(ForgotPass)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogIn)
                    .addComponent(CreateAccount))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInActionPerformed
        // TODO add your handling code here:

        String PASSWORD = jPasswordFieldPassword.getText(); //Obtain the password from the text field.
        String USERNAME = jTextFieldUserName.getText(); //Obtain the UserName from the text field.
        Boolean Flag1 = false;
        if (!PASSWORD.isEmpty() && !USERNAME.isEmpty()) { // This conditional will allow me to check if the user did actually enter the two fields of "User Name" & "Password".
            Flag1 = controller.Check(PASSWORD, USERNAME); // Here, by checking if the Account actually exists "Flag1" will take a value of either "true" or "false" depending on the result of the search.
            if (Flag1 == true) { // If user is found, the Menu class will open. 
                Menu x = new Menu(USERNAME);
                this.hide();
                x.setVisible(true);
            } else { // On the other hand, if the user is not found a message dialogue will be displayed.
                JOptionPane.showMessageDialog(null, "Error: Log-In unsuccessful, the Username or/and Password are incorrect");
            }
        }
        if (PASSWORD.isEmpty() && USERNAME.isEmpty() || PASSWORD.isEmpty() || USERNAME.isEmpty()) { // Handling the case in which the user did not input all the needed information (UserName and Password).
            JOptionPane.showMessageDialog(null, "Error: You must fill all the data");
                }    }//GEN-LAST:event_LogInActionPerformed

    private void CreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountActionPerformed
        // If the user doesn't have an account, and presses the button "Create Account", the code will open the SignIn form.
        SignIn x = new SignIn();
        this.hide();
        x.setVisible(true);

    }//GEN-LAST:event_CreateAccountActionPerformed

    private void jTextFieldUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUserNameFocusGained
        //This GUI event enhances the user experience through little details. 
        //Each text field has a pre-written sample text. 
        if (jTextFieldUserName.getText().equals("Mehdi_Atmani_DP2")) {
            //If the Textfield is clicked, the sample text will automatically disappear allowing the user to type:
            jTextFieldUserName.setText("");
            //The sample text is written in gray --> When the Textfield is pressed the color is changed to black:
            jTextFieldUserName.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextFieldUserNameFocusGained


    private void jTextFieldUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUserNameFocusLost
        //If the Textfield loses the User focus the prewritten text will be set again:
        if (jTextFieldUserName.getText().equals("")) {
            jTextFieldUserName.setText("Mehdi_Atmani_DP2");
            //Similarly, the color will be reset again to gray:
            jTextFieldUserName.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_jTextFieldUserNameFocusLost

    private void jPasswordFieldPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordFocusGained
        // TODO add your handling code here:
        // User Experience improvement.
        // If the user aplies focus on the TextField, the tempalte text will automatically disappear and change the color from grey to black.
        if (jPasswordFieldPassword.getText().equals("jPasswordField1")) {
            jPasswordFieldPassword.setText("");
            jPasswordFieldPassword.setForeground(Color.black);
        }
    }//GEN-LAST:event_jPasswordFieldPasswordFocusGained

    private void jPasswordFieldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordFocusLost
        // TODO add your handling code here:
        // User Experience improvement.
        // On the other hand, if the user losses the focus without writting anything, the template will come back, and the color will again change from Black to grey.
        if (jPasswordFieldPassword.getText().equals("")) {
            jPasswordFieldPassword.setText("jPasswordField1");
            jPasswordFieldPassword.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_jPasswordFieldPasswordFocusLost

    private void ForgotPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgotPassActionPerformed
        // TODO add your handling code here:
        if (jTextFieldUserName.getText().equals("")) { // This conditional will allow me to check if the user did actually enter the required field to start the process "UserName".
            System.out.println("Insert User");
            JOptionPane.showMessageDialog(null, "Insert User, and select the option again"); // If the user did not input the "UserName", a message dialogue will appear on the screen, asking for the user to complete the required information.
        } else {
            if (controller.CheckUserName(jTextFieldUserName.getText())) { // If the process is done without errors, the function will output a boolean "true" which will help me check that the user input is correct. 
                JOptionPane.showMessageDialog(null, "A message has been sent to you registered 'Email'"); // Hence showing a message saying that an email was sent containing the retrieved password from the Database.
            } else {
                JOptionPane.showMessageDialog(null, "User doesn't exist"); // If the search for the user in the database did not work, the system will display that the "User doesn't exist".
            }

        }
    }//GEN-LAST:event_ForgotPassActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Please enter the UserName used to create your account ");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Please enter the Password used to create your account ");

    }//GEN-LAST:event_jButton2ActionPerformed

    //
    //
    // Action Listeners End:
    //
    //
    //

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateAccount;
    private javax.swing.JButton ForgotPass;
    private javax.swing.JButton LogIn;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel UserName;
    private javax.swing.JLabel UserName1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
