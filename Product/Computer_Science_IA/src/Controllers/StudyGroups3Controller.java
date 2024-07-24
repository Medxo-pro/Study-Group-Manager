/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import DataBase.DbConnection1;
import Mail.MailUtil;
import java.util.ArrayList;
import javax.mail.Message;
import javax.mail.internet.InternetAddress;

/**
 *
 * @author Atmani
 */
public class StudyGroups3Controller {

    private DbConnection1 db = new DbConnection1(); //Instance of the "DbConnection1" class. 
    //Allows using functions of the "DbConnection1" class. 

    public StudyGroups3Controller() {
    }

    //Function + parameters:
    public void insertNewGroup(String UserName, String Subject1, String Subject2, String Subject3, String Topic1, String Topic2, String Topic3, String Room, int FromT, int ToT) {
        try {
            db.open(); //Open Database.
            db.insertNewGroup(UserName, Subject1, Subject2, Subject3, Topic1, Topic2, Topic3, Room, FromT, ToT); //Calls the "insertNewGroup" function of the "DbConnection1" class with the required parameters.
            db.close(); //Close Database.  
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: insertNewGroup Controller StudyGroups3 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.          
        }
    }

    public ArrayList<String> GroupSubjects(String UN1) { //Function + parameters.      
        try {
            db.open(); //Open Database.
            System.out.println(UN1);
            ArrayList<String> rs = db.GroupSubjects(UN1); //Allows storing the values of the "GroupSubjects" function in an Array-List data structure called "rs".
            db.close(); //Close Database.
            return rs; //The Array-List data structure "rs" is returned.
        } //A "catch" is used if any of the previous processes fail:
        catch (Exception e) {
            System.out.println("Error: GroupSubjects Controller StudyGroups3 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
            return null;
        }
    }

    public void updateGroupStatus(String UserName, int Status, String Host) { //Function + parameters.
        try {
            db.open(); //Open Database.
            db.updateGroupStatus(UserName, Status, Host); //Calls the "updateGroupStatus" function of the "DbConnection1" class with the required parameters.
            db.close(); //Close Database.
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: updateGroupStatus Controller StudyGroups3 "); //Allows to exactly identify where is the error coming from.
            db.close();
        }
    }

    public ArrayList<String> EmailsToSendNotifications(String Subject1, String Subject2, String Subject3) { //Function + parameters.  
        try {
            db.open(); //Open Database.
            System.out.println();
            ArrayList<String> rs = db.EmailsToSendNotifications(); //Allows storing the values of the "EmailsToSendNotifications" function in an Array-List data structure called "rs".
            MailUtil.sendMailListPeople(rs, Subject1 + Subject2 + Subject3, "Groups"); //Calls the "sendMailListPeople" function with the required parameters.
            db.close(); //Close Database.
            return rs; //The Array-List data structure "rs" is returned.
        } //A "catch" is used if any of the previous processes fail:
        catch (Exception e) {
            System.out.println("Error: EmailsToSendNotifications Controller StudyGroups3 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
            return null;
        }
    }

    public ArrayList<String> EmailsToSendNotificationsV2(String Subject1, String Subject2, String Subject3) { //Function + parameters.
        try {
            db.open(); //Open Database.
            System.out.println();
            ArrayList<String> rs = db.EmailsToSendNotificationsV2(Subject1, Subject2, Subject3); //Allows storing the values of the "EmailsToSendNotificationsV2" function in an Array-List data structure called "rs".
            // If the variable "Subject1" is "null" it has to be set to "". 
            if (Subject1 == "null") {
                Subject1 = "";
            }
            // If the variable "Subject2" is "null" it has to be set to "".
            if (Subject2 == "null") {
                Subject2 = "";
            }
            // If the variable "Subject3" is "null" it has to be set to "".
            if (Subject3 == "null") {
                Subject3 = "";
            }
            //Thanks to this process, users will not receive "null" texts in their emails but rather blank spaces.
            System.out.print(rs);
            MailUtil.sendMailListPeople(rs, Subject1 + "" + Subject2 + "" + Subject3, "Groups"); //Calls the "sendMailListPeople" function with the required parameters.
            db.close(); //Close Database.
            return rs; //The Array-List data structure "rs" is returned.
        } //A "catch" is used if any of the previous processes fail:
        catch (Exception e) {
            System.out.println("Error: EmailsToSendNotificationsV2 Controller StudyGroups3 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
            return null;
        }
    }

}
