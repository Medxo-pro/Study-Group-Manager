/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Controllers.AvailableRoomsController;
import java.util.Calendar;
import javax.swing.DefaultListModel;

/**
 *
 * @author Atmani
 */
public class AvailableRooms extends javax.swing.JFrame { //AvailableRooms extends JFrame in order to use its GUI functionalities.

    private AvailableRoomsController controller = new AvailableRoomsController(); //Instance of the "AvailableRoomsController" controller class. 
    //Allows using functions of the "AvailableRoomsController" class inside the "AvailableRooms" class. 

    boolean[][][] MAT = new boolean[7][12][8]; //Creation of a multidimensional array of 3 dimensions called "MAT".
    //The 1st index represents [Days of the week] 
    //The 2nd index represents [Study Rooms] 
    //The 3rd index represents [Academic periods of the day]

    /**
     * Creates new form AvailableRooms
     */
    private String UN;

    public AvailableRooms(String UserName) { //Constructor of the "AvailableRooms" GUI class. 
        initComponents();
        UN = UserName; //Make a variable of the parameter of the constructor to be able to use it. 
        controller.FileInput("/Users/mac/Desktop/Computer_Science_IA/MAT.txt"); //Set the "FileInput" for the file parsing algorithm.         

        for (int i = 0; i < 5; i++) { //Loop to interate through the 1st index
            for (int j = 0; j < 12; j++) { // Loop to iterate through the 2nd index
                for (int k = 0; k < 8; k++) { //Loop to iterate through the 3rd index
                    MAT[i][j][k] = false; // Set all the values of 3-D array to false  
                }
            }
        }

        //This set of nested loops was needed to set all the positions of the 3-D Array to false. 
        //It is to be noticed that a false cell in the array refers to a study room being available.
        //This set of code will be used to parse data from a text file containing the indexes of the study rooms not available:
        //For instance, if a specific cell is set to true, it means that (a study room on a specific day and time) is busy. 
        for (int i = 0; i < 248; i++) { //Iterate through the 248 rows of the text file
            // Create a string variable with the values of the FileInput "/Users/mac/Desktop/Computer_Science_IA/MAT.txt":
            String txt = controller.nextString();
            // Create an array of String "values" that store the values of the FileInput separated by commas: 
            String[] values = txt.split(",");
            int[] indices = new int[3]; //Create an array of int "indices".
            for (int k = 0; k < 3; k++) //Loop through the values of "indices"
            {
                indices[k] = Integer.parseInt(values[k]); //Convert the values of the array "values" from String to int.
            }            //Insert the indices of the Array "indeces" in the Matrix "MAT":
            MAT[indices[0]][indices[1]][indices[2]] = true; //Set the elements of the Matrix "MAT" to true. 
        }

        /*
        Library of study rooms (indexes) ->
        ROOM 1            = 0
        ROOM 2            = 1
        ROOM 3/4          = 2
        ROOM 5            = 3
        ROOM 6            = 4
        ROOM 7            = 5
        ART ROOM          = 6
        LAB               = 7
        ESS ROOM          = 8
        GP ROOM           = 9
        Charney           = 10
        Dance Studio      = 11
         */
        //The following set of code will be used to extract the specific (day, hour, and minute) of a given moment. 
        //It will be used to derive the "period of the day" and the "day of the week" (two of the needed indexes). 
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime().toString());
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day: " + day);
        int a = day - 1;
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println("Hour: " + hour);
        int minute = calendar.get(Calendar.MINUTE);
        System.out.println("Minute: " + minute);
        //https://www.tutorialspoint.com/get-day-number-of-week-in-java

        int b = hour * 60 + minute; //Time in terms of minutes 
        int c = -1;

        //Period 1                  //Period 2                  //Period 3
        //8:30 = 510 min            //9:35 = 575 min            //10:50 = 650 min
        //9:30 = 570 min            //10:35 = 635 min           //11:50 = 710 min
        //Period 4                  //Period 5                  //Period 6
        //11:55 = 715 min           //13:40 = 820 min           //14:45 = 885 min
        //12:55 = 775 min           //14:40 = 880 min           //15:45 = 945 min
        //Period 7                  //Period 8
        //15:50 = 950 min           //17:00 = 1020 min
        //16:50 = 1010 min          //18:20 = 1100 min
        //The following code is supposed to derive the exact period thanks to the variable "c".
        //For instance if "c" is equal to "0" the period will be 1. 
        //If "c" is equal to "1" the period will be 2. 
        boolean Flag = true;
        if (b >= 510 && b <= 570) {
            c = 0;
        } else if (b >= 570 && b <= 635) {
            c = 1;
        } else if (b >= 650 && b <= 710) {
            c = 2;
        } else if (b >= 710 && b <= 775) {
            c = 3;
        } else if (b >= 820 && b <= 880) {
            c = 4;
        } else if (b >= 880 && b <= 945) {
            c = 5;
        } else if (b >= 945 && b <= 1010) {
            c = 6;
        } else if (b >= 1010 && b <= 1100) {
            c = 7;
        } else {
            Flag = false;
        }

        System.out.println(Flag);
        DefaultListModel x = new DefaultListModel();
        jList2.setModel(x);

        if (Flag == false || a == 5 || a == 6) { //If weekend or outside of class periods:
            x.addElement("Room 1");
            x.addElement("Room 2");
            x.addElement("Room 3/4");
            x.addElement("Room 5");
            x.addElement("Room 6");
            x.addElement("Room 7");
            x.addElement("Art Room");
            x.addElement("Lab");
            x.addElement("ESS Room");
            x.addElement("GP Room");
            x.addElement("Charney");
            x.addElement("Dance Studio");
            Flag = false;
        }
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        System.out.println(Flag);

        if (Flag == true && c != -1 || a != 5 & a != 6 && c != -1) { //If not in weekend and inside class periods: 
            for (int i = 0; i < 12; i++) {
                if (MAT[a][i][c] == false) {

                    if (i == 0) {
                        x.addElement("Room 1");
                        System.out.println("Room 1");
                    }
                    if (i == 1) {
                        x.addElement("Room 2");
                        System.out.println("Room 2");
                    }
                    if (i == 2) {
                        x.addElement("Room 3/4");
                        System.out.println("Room 3/4");
                    }
                    if (i == 3) {
                        x.addElement("Room 5");
                        System.out.println("Room 5");
                    }
                    if (i == 4) {
                        x.addElement("Room 6");
                        System.out.println("Room 6");
                    }
                    if (i == 5) {
                        x.addElement("Room 7");
                        System.out.println("Room 7");
                    }
                    if (i == 6) {
                        x.addElement("Art Room");
                        System.out.println("Art Room");
                    }
                    if (i == 7) {
                        x.addElement("Lab");
                        System.out.println("Lab");
                    }
                    if (i == 8) {
                        x.addElement("ESS Room");
                        System.out.println("ESS Room");
                    }
                    if (i == 9) {
                        x.addElement("GP Room");
                        System.out.println("GP Room");
                    }
                    if (i == 10) {
                        x.addElement("Charney");
                        System.out.println("Charney");
                    }
                    if (i == 11) {
                        x.addElement("Dance Studio");
                        System.out.println("Dance Studio");
                    }

                }

            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Reload = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Return = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(135, 176, 209));

        Reload.setBackground(new java.awt.Color(204, 204, 204));
        Reload.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        Reload.setText("↺");
        Reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReloadActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Available Rooms");

        Return.setBackground(new java.awt.Color(204, 204, 204));
        Return.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        Return.setText("⬅︎");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Reload, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Reload, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addComponent(Return, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jList2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void ReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReloadActionPerformed
        // TODO add your handling code here:
        controller.FileInput("/Users/mac/Desktop/Computer_Science_IA/MAT.txt");

        for (int i = 0; i < 248; i++) { //Iterate through the 248 rows of the text file
            // Create a string variable with the values of the FileInput "/Users/mac/Desktop/Computer_Science_IA/MAT.txt":
            String txt = controller.nextString();
            // Create an array of String "values" that store the values of the FileInput separated by commas: 
            String[] values = txt.split(",");
            int[] indices = new int[3]; //Create an array of int "indices".
            for (int k = 0; k < 3; k++) //Loop through the values of "indices"
            {
                indices[k] = Integer.parseInt(values[k]); //Convert the values of the array "values" from String to int.
            }            //Insert the indices of the Array "indeces" in the Matrix "MAT":
            MAT[indices[0]][indices[1]][indices[2]] = true; //Set the elements of the Matrix "MAT" to true. 
        }

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime().toString());
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day: " + day);
        int a = day - 1;
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println("Hour: " + hour);
        int minute = calendar.get(Calendar.MINUTE);
        System.out.println("Minute: " + minute);
        //https://www.tutorialspoint.com/get-day-number-of-week-in-java

        int b = hour * 60 + minute;
        int c = -1;

        boolean Flag = true;
        if (b >= 510 && b <= 570) {
            c = 0;
        } else if (b >= 570 && b <= 635) {
            c = 1;
        } else if (b >= 650 && b <= 710) {
            c = 2;
        } else if (b >= 710 && b <= 775) {
            c = 3;
        } else if (b >= 820 && b <= 880) {
            c = 4;
        } else if (b >= 880 && b <= 945) {
            c = 5;
        } else if (b >= 945 && b <= 1010) {
            c = 6;
        } else if (b >= 1010 && b <= 1100) {
            c = 7;
        } else {
            Flag = false;
        }

        System.out.println(Flag);
        DefaultListModel x = new DefaultListModel();
        jList2.setModel(x);

        if (Flag == false || a == 5 || a == 6) {
            x.addElement("Room 1");
            System.out.println("Reloaded");
            x.addElement("Room 2");
            System.out.println("Reloaded");
            x.addElement("Room 3/4");
            System.out.println("Reloaded");
            x.addElement("Room 5");
            System.out.println("Reloaded");
            x.addElement("Room 6");
            System.out.println("Reloaded");
            x.addElement("Room 7");
            System.out.println("Reloaded");
            x.addElement("Art Room");
            System.out.println("Reloaded");
            x.addElement("Lab");
            System.out.println("Reloaded");
            x.addElement("ESS Room");
            System.out.println("Reloaded");
            x.addElement("GP Room");
            System.out.println("Reloaded");
            x.addElement("Charney");
            System.out.println("Reloaded");
            x.addElement("Dance Studio");
            System.out.println("Reloaded");
            Flag = false;
        }
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        System.out.println(Flag);

        if (Flag == true && c != -1 || a != 5 & a != 6 && c != -1) {
            for (int i = 0; i < 12; i++) {
                if (MAT[a][i][c] == false) {

                    if (i == 0) {
                        x.addElement("Room 1");
                        System.out.println("Room 1");
                        System.out.println("Reloaded");
                    }
                    if (i == 1) {
                        x.addElement("Room 2");
                        System.out.println("Room 2");
                        System.out.println("Reloaded");
                    }
                    if (i == 2) {
                        x.addElement("Room 3/4");
                        System.out.println("Room 3/4");
                        System.out.println("Reloaded");
                    }
                    if (i == 3) {
                        x.addElement("Room 5");
                        System.out.println("Room 5");
                        System.out.println("Reloaded");
                    }
                    if (i == 4) {
                        x.addElement("Room 6");
                        System.out.println("Room 6");
                        System.out.println("Reloaded");
                    }
                    if (i == 5) {
                        x.addElement("Room 7");
                        System.out.println("Room 7");
                        System.out.println("Reloaded");
                    }
                    if (i == 6) {
                        x.addElement("Art Room");
                        System.out.println("Art Room");
                        System.out.println("Reloaded");
                    }
                    if (i == 7) {
                        x.addElement("Lab");
                        System.out.println("Lab");
                        System.out.println("Reloaded");
                    }
                    if (i == 8) {
                        x.addElement("ESS Room");
                        System.out.println("ESS Room");
                        System.out.println("Reloaded");
                    }
                    if (i == 9) {
                        x.addElement("GP Room");
                        System.out.println("GP Room");
                        System.out.println("Reloaded");
                    }
                    if (i == 10) {
                        x.addElement("Charney");
                        System.out.println("Charney");
                        System.out.println("Reloaded");
                    }
                    if (i == 11) {
                        x.addElement("Dance Studio");
                        System.out.println("Dance Studio");
                        System.out.println("Reloaded");
                    }

                }

            }

        }

    }//GEN-LAST:event_ReloadActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        // TODO add your handling code here:
        Menu x = new Menu(UN);
        this.hide();
        x.setVisible(true);
    }//GEN-LAST:event_ReturnActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reload;
    private javax.swing.JButton Return;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
