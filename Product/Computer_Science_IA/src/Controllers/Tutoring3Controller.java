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
public class Tutoring3Controller {

    private DbConnection1 db = new DbConnection1(); //Instance of the "DbConnection1" class. 
    //Allows using functions of the "DbConnection1" class.   

    public Tutoring3Controller() {
    }

    public ArrayList<String> GetEmail(String UN) { //Function + parameters.
        try {
            db.open(); //Open Database.
            ArrayList<String> rs = db.GetEmail(UN); //Allows storing the values of the "GetEmail" function in an Array-List data structure called "rs".
            db.close(); //Close Database. 
            return rs; //The Array-List data structure "rs" is returned.   
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: GetEmail Controller Tutoring3 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.        
        }
        return null;
    }

    public ArrayList<String> SendEmail(ArrayList<String> rs, String Description, String emitentUserName, String recipientUserName) { //Function + parameters.
        try {
            MailUtil.sendMailListPeople1(rs, Description, "Tutoring", emitentUserName, recipientUserName); //Calls the "sendMailListPeople1" function with the required parameters.
        } //A "catch" is used if any of the previous processes fail:
        catch (Exception e) {
            System.out.println("Error: SendEmail Controller Tutoring3 "); //Allows to exactly identify where is the error coming from.
        }
        return null;
    }

}
