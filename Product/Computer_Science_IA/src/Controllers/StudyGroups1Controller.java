/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import DataBase.DbConnection1;
import GUI.StudyGroups1;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Atmani
 */
public class StudyGroups1Controller {

    private DbConnection1 db = new DbConnection1(); //Instance of the "DbConnection1" class. 
    //Allows using functions of the "DbConnection1" class. 

    public StudyGroups1Controller() {
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
            System.out.println("Error: GroupSubjects Controller StudyGroups1 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
            return null;
        }
    }

    public boolean CheckExistingGroup(String A, String B, String C) { //Function + parameters.
        try {
            db.open(); //Open Database.
            if (db.CheckExistingGroup(A, B, C)) { //If this condition is "true", the function will return a "true" boolean result. 
                db.close(); //Close Database.
                return true; //Return "true" boolean value.
            } else { //If the previous condition is not true, the function will return a "false" boolean result.
                db.close(); //Close Database.
                return false; //Return "false" boolean value.
            }
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: CheckExistingGroup Controller StudyGroups1 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
            return false; //Return "false" boolean value.
        }
    }

}
