/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import DataBase.DbConnection1;

/**
 *
 * @author Atmani
 */
public class StudyGroups4Controller {

    private DbConnection1 db = new DbConnection1(); //Instance of the "DbConnection1" class. 
    //Allows using functions of the "DbConnection1" class. 

    public StudyGroups4Controller() {
    }

    public void updateGroupStatusFromStudy2(String UserName, int Status, String Host) { //Function + parameters.  
        try {
            db.open(); //Open Database.
            db.updateGroupStatusFromStudy2(UserName, Status, Host); //Calls the "updateGroupStatusFromStudy2" function of the "DbConnection1" class with the required parameters.
            db.close(); //Close Database.      
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: updateGroupStatus Controller StudyGroups4 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.         
        }
    }

    public void DeleteGroupExit(String UserName) { //Function + parameters.      
        try {
            db.open(); //Open Database.
            db.DeleteGroupExit(UserName); //Calls the "DeleteGroupExit" function of the "DbConnection1" class with the required parameters.
            db.close(); //Close Database. 
        } //A "catch" is used if any of the previous processes fail:
        catch (Exception e) {
            System.out.println("Error: DeleteGroupExit Controller StudyGroups4 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database. 
        }
    }

    public void updateGroupStatusExit(String UserName, int Status, String Host) { //Function + parameters.  
        try {
            db.open(); //Open Database.
            db.updateGroupStatusExit(UserName, Status, Host); //Calls the "updateGroupStatusExit" function of the "DbConnection1" class with the required parameters.
            db.close(); //Close Database. 
        } //A "catch" is used if any of the previous processes fail:
        catch (Exception e) {
            System.out.println("Error: updateGroupStatusExit Controller StudyGroups4 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database. 
        }
    }

}
