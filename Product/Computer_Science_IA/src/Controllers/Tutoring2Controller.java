/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import DataBase.DbConnection1;
import Mail.MailUtil;
import java.util.ArrayList;

/**
 *
 * @author Atmani
 */
public class Tutoring2Controller {

    private DbConnection1 db = new DbConnection1(); //Instance of the "DbConnection1" class. 
    //Allows using functions of the "DbConnection1" class. 

    public Tutoring2Controller() {
    }

    public ArrayList<String> GroupSubjects(String UN1) { //Function + parameters.
        try {
            db.open(); //Open Database.
            System.out.println(UN1);
            ArrayList<String> rs = db.GroupSubjects(UN1); //Allows storing the values of the "GroupSubjects" function in an Array-List data structure called "rs".
            db.close(); //Close Database. 
            return rs; //The Array-List data structure "rs" is returned.
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: GroupSubjects Controller Tutoring2 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database. 
            return null;
        }
    }

    public void InsertTutoring(String UN, String Subject, String Description) { //Function + parameters.
        try {
            db.open(); //Open Database.
            db.InsertTutoring(UN, Subject, Description); //Calls the "InsertTutoring" function of the "DbConnection1" class with the required parameters.
            db.close(); //Close Database. 
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: InsertTutoring Controller Tutoring2 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database. 
        }
    }

    public ArrayList<String> EmailsToSendNotificationsTutoring(String UserName, String Subject, String Description) { //Function + parameters.
        try {
            db.open(); //Open Database.
            System.out.println();
            ArrayList<String> rs = db.EmailsToSendNotificationsTutoring(UserName, Subject); //Allows storing the values of the "EmailsToSendNotificationsTutoring" function in an Array-List data structure called "rs".
            System.out.println(rs);
            MailUtil.sendMailListPeople(rs, Description, "Tutoring"); //Calls the "sendMailListPeople" function with the required parameters.
            db.close(); //Close Database. 
            return rs; //The Array-List data structure "rs" is returned.
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: EmailsToSendNotifications Controller Tutoring2 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database. 
            return null;
        }
    }

}
