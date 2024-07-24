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
public class Settings2Controller {

    private DbConnection1 db = new DbConnection1(); //Instance of the "DbConnection1" class. 
    //Allows using functions of the "DbConnection1" class. 

    public Settings2Controller() {
    }

    public ArrayList<String> GetPassword(String UN) { //Function + parameters.
        try {
            db.open(); //Open Database.
            ArrayList<String> rs = db.GetPassword(UN); //Allows storing the values of the "GetPassword" function in an Array-List data structure called "rs".
            db.close(); //Close Database.
            return rs; //The Array-List data structure "rs" is returned.
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: GetPassword Controller Settings2 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
        }
        return null;
    }

    public void updatePassword(String UserName, String Password) { //Function + parameters.
        try {
            db.open(); //Open Database.
            db.updatePassword(UserName, Password); //Calls the "updatePassword" function of the "DbConnection1" class with the required parameters.
            db.close(); //Close Database.
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: updatePassword Controller Settings2 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
        }
    }

    public void SendEmail(String Email, String Message) { //Function + parameters.
        try {
            MailUtil.sendMail(Email, Message, "ChangePassword"); //Calls the "sendMail" function with the required parameters.
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: updatePassword Controller Settings2 "); //Allows to exactly identify where is the error coming from.
        }
    }

    public ArrayList<String> GetEmail(String UN) { //Function + parameters.
        try {
            db.open(); //Open Database.
            ArrayList<String> rs = db.GetEmail(UN); //Allows storing the values of the "GetEmail" function in an Array-List data structure called "rs".
            db.close(); //Close Database.
            return rs; //The Array-List data structure "rs" is returned.
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: GetEmail Controller Settings2 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
        }
        return null;
    }

}
