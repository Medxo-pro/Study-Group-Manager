/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import DataBase.DbConnection1;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Atmani
 */
public class MenuController {

    private DbConnection1 db = new DbConnection1(); //Instance of the "DbConnection1" class. 
    //Allows using functions of the "DbConnection1" class. 

    public MenuController() {
    }

    public boolean CheckGroupStatus(String UN) { //Function + parameters.
        try {
            db.open(); //Open Database.
            if (db.CheckGroupStatus(UN)) { //If this condition is "true", the function will return a "true" boolean result. 
                db.close(); //Close Database.
                return true; //Return "true" boolean value.
            } else { //If the previous condition is not true, the function will return a "false" boolean result.
                db.close(); //Close Database.
                return false; //Return "false" boolean value.
            }
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: CheckGroupStatus Controller Menu "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
            return false; //Return "false" boolean value.
        }
    }

    public boolean insertGroupStatus(String UN, int Status, String Host) { //Function + parameters.
        try {
            db.open(); //Open Database.
            db.insertGroupStatus(UN, Status, Host); //Calls the "insertGroupStatus" function of the "DbConnection1" class with the required parameters.
            db.close(); //Close Database.
            return true; //Returns true to indicate that the try-catch error handling wasn't activated. 
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: insertGroupStatus Controller Menu "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
            return false; //Return "false" boolean value.
        }
    }

    public boolean CheckGroupStatusInit(String UN) { //Function + parameters.
        try {
            db.open(); //Open Database.
            if (db.CheckGroupStatusInit(UN)) { //If this condition is "true", the function will return a "true" boolean result. 
                db.close(); //Close Database.
                return true; //Return "true" boolean value.
            } else { //If the previous condition is not true, the function will return a "false" boolean result.
                db.close(); //Close Database.
                return false; //Return "false" boolean value.
            }
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: CheckGroupStatusInit Controller Menu "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
            return false; //Return "false" boolean value.
        }
    }

    public String GetHostGroupStatus(String UN) { //Function + parameters.
        try {
            db.open(); //Open Database.
            String x = db.GetHostGroupStatus(UN); //Allows storing the values of the "GetHostGroupStatus" function in a String variable called "x".
            db.close(); //Close Database.
            return x; //The String variable "x" is returned. 
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            db.close(); //Close Database.
            return null;
        }
    }

    public ArrayList<String> GroupSubjectsFromMenu(String Host) { //Function + parameters. 
        try {
            db.open(); //Open Database.
            System.out.println(Host);
            ArrayList<String> rs = db.GroupSubjectsFromMenu(Host); //Allows storing the values of the "GroupSubjectsFromMenu" function in an Array-List data structure called "rs".
            db.close(); //Close Database.
            return rs; //The Array-List data structure "rs" is returned.
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: GroupSubjectsFromMenu Controller Menu "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
            return null;

        }

    }

}
