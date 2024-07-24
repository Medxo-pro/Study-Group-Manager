/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DataBase.DbConnection1;
import Controllers.SignInController;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 *
 * @author Atmani
 * 
 */
public class SignIn extends javax.swing.JFrame { //SignIn extends JFrame in order to use its GUI functionalities.

    private SignInController controller = new SignInController(); //Instance of the "SignInController" controller class. 
    //Allows using functions of the "SignInController" class inside the "SignIn" class. 

    public SignIn() { //Constructor of the "SignIn" GUI class.
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserName = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldPassword = new javax.swing.JTextField();
        SignIn = new javax.swing.JButton();
        Return = new javax.swing.JButton();
        Email1 = new javax.swing.JLabel();
        jCheckBoxGroups = new javax.swing.JCheckBox();
        jCheckBoxTutoring = new javax.swing.JCheckBox();
        Email2 = new javax.swing.JLabel();
        Email3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxGroup4 = new javax.swing.JComboBox<>();
        jComboBoxGroup6 = new javax.swing.JComboBox<>();
        jComboBoxGroup3Extra = new javax.swing.JComboBox<>();
        jComboBoxGroup2Extra = new javax.swing.JComboBox<>();
        jComboBoxGroup4Extra = new javax.swing.JComboBox<>();
        jComboBoxGroup2 = new javax.swing.JComboBox<>();
        jComboBoxGroup1 = new javax.swing.JComboBox<>();
        jComboBoxGroup5 = new javax.swing.JComboBox<>();
        jComboBoxGroup3 = new javax.swing.JComboBox<>();
        jComboBoxGroup1Extra = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(181, 242, 242));

        UserName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        UserName.setText("User Name:");

        Password.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Password.setText("Password:");

        jTextFieldUserName.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldUserName.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldUserName.setText("Mehdi_Atmani_DP2");
        jTextFieldUserName.setPreferredSize(new java.awt.Dimension(110, 39));
        jTextFieldUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUserNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldUserNameFocusLost(evt);
            }
        });

        jTextFieldEmail.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldEmail.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldEmail.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldEmail.setText("@em-is.org");
        jTextFieldEmail.setPreferredSize(new java.awt.Dimension(110, 39));
        jTextFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldEmailFocusLost(evt);
            }
        });

        jTextFieldPassword.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldPassword.setPreferredSize(new java.awt.Dimension(110, 39));

        SignIn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        SignIn.setText("Create Account");
        SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInActionPerformed(evt);
            }
        });

        Return.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Return.setText("Return");
        Return.setToolTipText("");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        Email1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Email1.setText("Email:");

        jCheckBoxGroups.setBackground(new java.awt.Color(135, 176, 209));
        jCheckBoxGroups.setText("Emailing ( New groups created in your subject )");

        jCheckBoxTutoring.setBackground(new java.awt.Color(135, 176, 209));
        jCheckBoxTutoring.setText("Emailing ( If you wish to provide tutoring/Help )");

        Email2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Email2.setText("Notifications:");

        Email3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Email3.setText(" Your subjects:");

        jLabel1.setText("Group 2 ( 2° Language)");

        jLabel5.setText("Group 1 ( 1° Language)");

        jLabel11.setText("Group 3 ( Humanities )");

        jLabel16.setText("Group 4 ( Sciences )");

        jLabel22.setText("Group 5 ( Mathematics )");

        jLabel25.setText("Group 6 ( Diverse )");

        jPanel1.setBackground(new java.awt.Color(137, 177, 211));

        jLabel6.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.borderColor"));
        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setText("Create Account");
        jLabel6.setPreferredSize(new java.awt.Dimension(410, 23));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jComboBoxGroup4.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBorderColor"));
        jComboBoxGroup4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jComboBoxGroup4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science ", "Physics", "Chemistry", "Biology", "ESS", " ", " " }));

        jComboBoxGroup6.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBorderColor"));
        jComboBoxGroup6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jComboBoxGroup6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Arts", "Dance", " " }));
        jComboBoxGroup6.setSize(new java.awt.Dimension(72, 23));

        jComboBoxGroup3Extra.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBorderColor"));
        jComboBoxGroup3Extra.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jComboBoxGroup3Extra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Economics", "Global Politics ", "Anthropology", "ESS", "Philosophy" }));

        jComboBoxGroup2Extra.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBorderColor"));
        jComboBoxGroup2Extra.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jComboBoxGroup2Extra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "English B", "Spanish Ab", "French Ab", " " }));

        jComboBoxGroup4Extra.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBorderColor"));
        jComboBoxGroup4Extra.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jComboBoxGroup4Extra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Computer Science", "Physics", "Quemestry", "Biology", "ESS" }));

        jComboBoxGroup2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBorderColor"));
        jComboBoxGroup2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jComboBoxGroup2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English B", "Spanish Ab", "French Ab", "" }));

        jComboBoxGroup1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBorderColor"));
        jComboBoxGroup1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jComboBoxGroup1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English A", "Hebrew A", "Arabic A", "Self-Taught A" }));

        jComboBoxGroup5.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBorderColor"));
        jComboBoxGroup5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jComboBoxGroup5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Math AA HL", "Math AA SL", "Math AI SL" }));

        jComboBoxGroup3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBorderColor"));
        jComboBoxGroup3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jComboBoxGroup3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economics", "Global Politics", "Anthropology", "ESS", "Philosophy", "" }));

        jComboBoxGroup1Extra.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBorderColor"));
        jComboBoxGroup1Extra.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jComboBoxGroup1Extra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "English A", "Hebrew A", "Arabic A", "Self-Taught A" }));
        jComboBoxGroup1Extra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGroup1ExtraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxGroups, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxTutoring, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(SignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addComponent(Email2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jComboBoxGroup5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBoxGroup3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxGroup3Extra, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBoxGroup1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxGroup1Extra, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBoxGroup6, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxGroup4Extra, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                                        .addComponent(jComboBoxGroup4, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                                        .addComponent(jComboBoxGroup2, javax.swing.GroupLayout.Alignment.LEADING, 0, 130, Short.MAX_VALUE)
                                        .addComponent(jComboBoxGroup2Extra, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(UserName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(Email1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Email1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(Email3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxGroup1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxGroup2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxGroup2Extra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxGroup1Extra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxGroup3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxGroup4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxGroup3Extra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxGroup4Extra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxGroup6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxGroup5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(Email2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxTutoring, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxGroups, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Return)
                    .addComponent(SignIn))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //
    //
    // Action Listeners Start:
    //
    //

    private void SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInActionPerformed

        String Password = jTextFieldPassword.getText(); //Obtain the password from the text field.
        String UserName = jTextFieldUserName.getText(); //Obtain the UserName from the text field.
        String Email = jTextFieldEmail.getText(); //Obtain the Email from the text field.

        String Group1 = jComboBoxGroup1.getSelectedItem().toString(); //Obtain the "Group1" subject from the text field.
        String Group1Extra = jComboBoxGroup1Extra.getSelectedItem().toString(); //Obtain the "Group1Extra" subject from the text field.
        String Group2 = jComboBoxGroup2.getSelectedItem().toString(); //Obtain the "Group2" subject from the text field.
        String Group2Extra = jComboBoxGroup2Extra.getSelectedItem().toString(); //Obtain the "Group2Extra" subject from the text field.
        String Group3 = jComboBoxGroup3.getSelectedItem().toString(); //Obtain the "Group3" subject from the text field.
        String Group3Extra = jComboBoxGroup3Extra.getSelectedItem().toString(); //Obtain the "Group3Extra" subject from the text field.
        String Group4 = jComboBoxGroup4.getSelectedItem().toString(); //Obtain the "Group4" subject from the text field.
        String Group4Extra = jComboBoxGroup4Extra.getSelectedItem().toString(); //Obtain the "Group4Extra" subject from the text field.
        String Group5 = jComboBoxGroup5.getSelectedItem().toString(); //Obtain the "Group5" subject from the text field.
        String Group6 = jComboBoxGroup6.getSelectedItem().toString(); //Obtain the "Group6" subject from the text field.

        if (Group1Extra == "N/A") { //If "Group1Extra" subject is left untouched "N/A", it will be set to "".
            Group1Extra = "";
        }
        if (Group2Extra == "N/A") { //If "Group2Extra" subject is left untouched "N/A", it will be set to "".
            Group2Extra = "";
        }
        if (Group3Extra == "N/A") { //If "Group3Extra" subject is left untouched "N/A", it will be set to "".
            Group3Extra = "";
        }
        if (Group4Extra == "N/A") { //If "Group4Extra" subject is left untouched "N/A", it will be set to "".
            Group4Extra = "";
        }
        if (Group6 == "N/A") { //If "Group6" subject is left untouched "N/A", it will be set to "".
            Group6 = "";
        }

        Boolean Flag0 = false;

        if (!UserName.isEmpty() && !Password.isEmpty() && !Email.isEmpty()) { //Check if the required fields are not empty.

            Flag0 = controller.CheckExistingAccount(Password, UserName, Email); //Check if the account already exists. 

            if (Flag0 == true) { //If the account doesn't exist... An account will be created:

                //Insert the (UserName, Password, and Email) to the Database:
                boolean Flag1 = controller.insertSign(UserName, Password, Email);
                //Insert the IB subjects to the Database:
                boolean Flag2 = controller.insertSubjects(UserName, Group1, Group1Extra, Group2, Group2Extra, Group3, Group3Extra, Group4, Group4Extra, Group5, Group6);

                //The next bits of code are used to insert the Notification settings of the user:
                //This is done for both the Group and Tutoring notifications. 
                if (jCheckBoxTutoring.isSelected() && jCheckBoxGroups.isSelected()) {
                    Boolean Flag3 = controller.insertEmailing(UserName, 1, 1);

                }

                if (jCheckBoxTutoring.isSelected() && !jCheckBoxGroups.isSelected()) {
                    Boolean Flag4 = controller.insertEmailing(UserName, 1, 0);

                }

                if (!jCheckBoxTutoring.isSelected() && jCheckBoxGroups.isSelected()) {
                    Boolean Flag4 = controller.insertEmailing(UserName, 0, 1);

                }

                if (!jCheckBoxTutoring.isSelected() && !jCheckBoxGroups.isSelected()) {
                    Boolean Flag4 = controller.insertEmailing(UserName, 0, 0);

                }

                //Create an instance of the LogIn GUI class:
                LogIn x = new LogIn();
                this.hide(); //Hide the current GUI.
                x.setVisible(true); //Show the LogIn GUI.

            } else { //If the account already exists, a message dialogue will appear informing the user of the error.
                JOptionPane.showMessageDialog(null, "Error: Log-In unsuccessful, Account already exists");
            }

        } else { //If the data is not entered, a message dialogue will appear informing the user of the error.
            JOptionPane.showMessageDialog(null, "Error: You must fill all the data");
        }


    }//GEN-LAST:event_SignInActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        //Create an instance of the LogIn GUI class:
        LogIn x = new LogIn();
        this.hide(); //Hide the current GUI.
        x.setVisible(true); //Show the LogIn GUI.
    }//GEN-LAST:event_ReturnActionPerformed

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

    private void jTextFieldEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEmailFocusGained
        //This GUI event enhances the user experience through little details. 
        //Each text field has a pre-written sample text. 
        if (jTextFieldEmail.getText().equals("@em-is.org")) {
            //The sample text is written in gray --> When the Textfield is pressed the color is changed to black:
            jTextFieldEmail.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextFieldEmailFocusGained

    private void jTextFieldEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEmailFocusLost

        if (jTextFieldEmail.getText().equals("@em-is.org")) {
            //Similarly, the color will be reset again to gray:
            jTextFieldEmail.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_jTextFieldEmailFocusLost

    private void jComboBoxGroup1ExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGroup1ExtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxGroup1ExtraActionPerformed

    //
    //
    // Action Listeners End:
    //
    //

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email1;
    private javax.swing.JLabel Email2;
    private javax.swing.JLabel Email3;
    private javax.swing.JLabel Password;
    private javax.swing.JButton Return;
    private javax.swing.JButton SignIn;
    private javax.swing.JLabel UserName;
    private javax.swing.JCheckBox jCheckBoxGroups;
    private javax.swing.JCheckBox jCheckBoxTutoring;
    private javax.swing.JComboBox<String> jComboBoxGroup1;
    private javax.swing.JComboBox<String> jComboBoxGroup1Extra;
    private javax.swing.JComboBox<String> jComboBoxGroup2;
    private javax.swing.JComboBox<String> jComboBoxGroup2Extra;
    private javax.swing.JComboBox<String> jComboBoxGroup3;
    private javax.swing.JComboBox<String> jComboBoxGroup3Extra;
    private javax.swing.JComboBox<String> jComboBoxGroup4;
    private javax.swing.JComboBox<String> jComboBoxGroup4Extra;
    private javax.swing.JComboBox<String> jComboBoxGroup5;
    private javax.swing.JComboBox<String> jComboBoxGroup6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
