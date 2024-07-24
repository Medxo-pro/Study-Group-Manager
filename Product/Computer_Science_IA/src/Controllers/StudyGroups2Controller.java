/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import DataBase.DbConnection1;
import java.util.ArrayList;

/**
 *
 * @author Atmani
 */
public class StudyGroups2Controller {

    private DbConnection1 db = new DbConnection1(); //Instance of the "DbConnection1" class. 
    //Allows using functions of the "DbConnection1" class. 

    public StudyGroups2Controller() {
    }

    public ArrayList<String> AllGroupsStudy2(String A, String B, String C) { //Function + parameters.
        try {
            db.open(); //Open Database.
            ArrayList<String> rs = db.AllGroupsStudy2(A, B, C); //Allows storing the values of the "AllGroupsStudy2" function in an Array-List data structure called "rs".
            db.close(); //Close Database.
            return rs; //The Array-List data structure "rs" is returned.
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: AllGroupsStudy2 Controller StudyGroups2 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
            return null;
        }
    }

    public ArrayList<String> GetAllGroups2Info(String z) { //Function + parameters.
        try {
            db.open(); //Open Database.
            ArrayList<String> rs = db.GetAllGroups2Info(z); //Allows storing the values of the "GetAllGroups2Info" function in an Array-List data structure called "rs".
            db.close(); //Close Database.
            return rs; //The Array-List data structure "rs" is returned.
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: GetAllGroups2Info Controller StudyGroups2 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
            return null;
        }
    }

    public void updateGroupStatusFromStudy2(String UserName, int Status, String Host) { //Function + parameters.
        try {
            db.open(); //Open Database.
            db.updateGroupStatusFromStudy2(UserName, Status, Host); //Calls the "updateGroupStatusFromStudy2" function of the "DbConnection1" class with the required parameters.
            db.close(); //Close Database.
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: updateGroupStatusFromStudy2 Controller StudyGroups2 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
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
            System.out.println("Error: GroupSubjectsFromMenu Controller StudyGroups2 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
            return null;
        }
    }

}
