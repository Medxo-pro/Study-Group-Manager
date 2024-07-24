/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Mail.MailUtil;
import DataBase.DbConnection1;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Atmani
 */
public class LogInController {

    private DbConnection1 db = new DbConnection1(); //Instance of the "DbConnection1" class. 
    //Allows using functions of the "DbConnection1" class. 

    public LogInController() {
    }

    public boolean Check(String PASSWORD, String USERNAME) { //Function + parameters.
        try {
            db.open(); //Open Database.
            if (db.Check(PASSWORD, USERNAME)) { //If this condition is "true", the function will return a "true" boolean result. 
                db.close(); //Close Database.
                return true; //Return "true" boolean value.
            } else { //If the previous condition is not true, the function will return a "false" boolean result.
                db.close(); //Close Database.
                return false; //Return "false" boolean value.
            }
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: Check Controller LogIn "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
            return false; //Return "false" boolean value.
        }
    }

    public boolean CheckUserName(String USERNAME) { //Function + parameters.
        try {
            db.open();//Open Database
            ResultSet rs = db.CheckUserName(USERNAME); //Allows storing the values of the "CheckUserName" function in a ResultSet variable called "rs".
            if (rs != null) { //If the ResultSet variable "rs" is not empty this condition will be true.
                System.out.println(rs.getString(3)); //It will print the 3rd value of the ResultSet variable "rs".
                System.out.println(rs.getString(2)); //It will print the 2nd value of the ResultSet variable "rs".
                MailUtil.sendMail(rs.getString(3), rs.getString(2), "Password"); //Calls the "sendMail" function with the required parameters.
                db.close(); //Close Database.
                return true; //The function returns "true" to indicate that the condition (rs != null) was indeed "true" and that the previous processes were run.  
            } else { //if the ResultSet variable "rs" is empty. 
                db.close(); //Close Database.
                return false; //Return "false" boolean value.
            }
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: CheckUserName Controller LogIn "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
            return false; //Return "false" boolean value.
        }
    }

}
