/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import DataBase.DbConnection1;
import java.sql.ResultSet;

/**
 *
 * @author Atmani
 */
public class Settings5Controller {

    private DbConnection1 db = new DbConnection1(); //Instance of the "DbConnection1" class. 
    //Allows using functions of the "DbConnection1" class. 

    public Settings5Controller() {
    }

    public boolean CheckNotificationsGroups(String USERNAME) { //Function + parameters.
        try {
            db.open(); //Open Database.
            ResultSet rs = db.CheckNotificationsGroups(USERNAME); //Allows storing the values of the "CheckNotificationsGroups" function in a ResultSet variable called "rs".
            if (rs != null) { //If the ResultSet variable "rs" is not empty this condition will be true.
                db.close(); //Close Database.
                return true; //The function returns "true" to indicate that the condition (rs != null) was indeed "true".
            } else { //if the ResultSet variable "rs" is empty. 
                db.close(); //Close Database.
                return false; //Return "false" boolean value.
            }
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: CheckNotificationsGroups Controller Settings5 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
            return false; //Return "false" boolean value.
        }
    }

    public boolean CheckNotificationsTutoring(String USERNAME) { //Function + parameters.
        try {
            db.open();//Open the database before using it.
            //Store the values of the "CheckNotificationsTutoring" function in a ResultSet variable called "rs":
            ResultSet rs = db.CheckNotificationsTutoring(USERNAME);
            if (rs != null) { //Check if the ResultSet variable is null.
                //If yes, close the database.
                db.close();
                return true; //Return "true" boolean value.
            } else {
                //if not, close the database.
                db.close();
                return false; //Return "false" boolean value.
            }
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: CheckNotificationsTutoring Controller Settings5 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
            return false; //Return "false" boolean value.
        }
    }

    public void updateGroupNotifications(String UserName, int change) { //Function + parameters.
        try {
            db.open(); //Open Database.
            db.updateGroupNotifications(UserName, change); //Calls the "updateGroupNotifications" function of the "DbConnection1" class with the required parameters.
            db.close(); //Close Database.
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: updateGroupNotifications Controller Settings5 "); //Allows to exactly identify where is the error coming from.
            db.close();
        }
    }

    public void updateTutoringNotifications(String UserName, int change) { //Function + parameters.
        try {
            db.open(); //Open Database.
            db.updateTutoringNotifications(UserName, change); //Calls the "updateTutoringNotifications" function of the "DbConnection1" class with the required parameters.
            db.close(); //Close Database.
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: updateTutoringNotifications Controller Settings5 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
        }
    }

}
