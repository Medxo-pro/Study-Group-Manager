/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Controllers.LogInController;
import javax.swing.JOptionPane;
import Controllers.MenuController;
import java.util.ArrayList;

/*
 *
 * @author Atmani
 * 
 */
public class Menu extends javax.swing.JFrame { //Menu extends JFrame in order to use its GUI functionalities.

    private MenuController controller = new MenuController(); //Instance of the "MenuController" controller class. 
    //Allows using functions of the "MenuController" class inside the "Menu" class. 

    private String UN;

    public Menu(String USERNAME) { //Constructor of the "Menu" GUI class. 
        initComponents();
        UN = USERNAME;
        boolean Flag1 = false;
        Flag1 = controller.CheckGroupStatusInit(UN); //Check the group status of the user. 
        //If the status was already created or updated, "Flag1" will be equal to "true".
        //If not, the "insertGroupStatus" function will be called from the "MenuController" class. 
        if (Flag1 == true) {
            System.out.println("Status already updated");
        } else {
            controller.insertGroupStatus(UN, 0, "null");
        }
    }

    //This is another constructor of the "Menu" GUI class. 
    //It is used to be transferred to the "Menu" GUI class without parameters. 
    //The program does not crash because of Overloading. 
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Settings = new javax.swing.JButton();
        Groups = new javax.swing.JButton();
        AvailableRooms = new javax.swing.JButton();
        Tutoring = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        LogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Settings.setBackground(new java.awt.Color(204, 204, 204));
        Settings.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Settings.setText("Settings");
        Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsActionPerformed(evt);
            }
        });

        Groups.setBackground(new java.awt.Color(204, 204, 204));
        Groups.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Groups.setText("Study groups");
        Groups.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroupsActionPerformed(evt);
            }
        });

        AvailableRooms.setBackground(new java.awt.Color(204, 204, 204));
        AvailableRooms.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        AvailableRooms.setText("Available rooms");
        AvailableRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvailableRoomsActionPerformed(evt);
            }
        });

        Tutoring.setBackground(new java.awt.Color(204, 204, 204));
        Tutoring.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Tutoring.setText("Tutoring");
        Tutoring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TutoringActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(137, 177, 211));

        LogOut.setBackground(new java.awt.Color(204, 204, 204));
        LogOut.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        LogOut.setText("⬅");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(137, 177, 211));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 192, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(LogOut, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Groups, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tutoring, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AvailableRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AvailableRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Groups, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tutoring, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //
    //
    // Action Listeners End:
    //
    //
    private void GroupsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroupsActionPerformed
        // TODO add your handling code here:
        boolean Flag2 = false;
        Flag2 = controller.CheckGroupStatus(UN); //Checks if the user is already in a StudyGroup. 
        System.out.print("The flag is: " + Flag2);

        if (Flag2 == true) { //If not, the user will be transferred to the "StudyGroups1" GUI class. 
            StudyGroups1 x = new StudyGroups1(UN); //The "UN" parameter is also transferred in order to keep a trace of the UserName. 
            this.hide();
            x.setVisible(true);
        }
        if (Flag2 == false) { //If yes, the system will retrieve all the information of the group the user is in. 
            String Host = controller.GetHostGroupStatus(UN); //This function will extract the "Host".
            System.out.print(Host);

            ArrayList<String> rs = controller.GroupSubjectsFromMenu(Host);

            //A message dialogue is shown to inform the user that he/she is already in a group:
            JOptionPane.showMessageDialog(null, "It seems that you are already in a group! You will be redirected to your group...");
            StudyGroups4 x = new StudyGroups4(rs, Host, UN); //Three parameters a being passed by: (rs, Host, and UN) 
            this.hide();
            x.setVisible(true);

        }

    }//GEN-LAST:event_GroupsActionPerformed

    private void SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsActionPerformed
        //Create an instance of the Settings1 GUI class:
        Settings1 x = new Settings1(UN); //Pass by the parameter of "UserName".
        this.hide(); //Hide the current GUI.
        x.setVisible(true); //Show the Settings1 GUI.

    }//GEN-LAST:event_SettingsActionPerformed

    private void TutoringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TutoringActionPerformed
        //Create an instance of the Tutoring1 GUI class:
        Tutoring1 x = new Tutoring1(UN); //Pass by the parameter of "UserName".
        this.hide(); //Hide the current GUI.
        x.setVisible(true); //Show the Tutoring1 GUI.
    }//GEN-LAST:event_TutoringActionPerformed

    private void AvailableRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvailableRoomsActionPerformed
        //Create an instance of the AvailableRooms GUI class:
        AvailableRooms x = new AvailableRooms(UN); //Pass by the parameter of "UserName".
        this.hide(); //Hide the current GUI.
        x.setVisible(true); //Show the AvailableRooms GUI.
    }//GEN-LAST:event_AvailableRoomsActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        //Create an instance of the LogIn GUI class:
        LogIn x = new LogIn();
        this.hide(); //Hide the current GUI.
        x.setVisible(true); //Show the LogIn GUI.
    }//GEN-LAST:event_LogOutActionPerformed

    //
    //
    // Action Listeners End:
    //
    //

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AvailableRooms;
    private javax.swing.JButton Groups;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton Settings;
    private javax.swing.JButton Tutoring;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
