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
public class Tutoring1Controller {

    private DbConnection1 db = new DbConnection1(); //Instance of the "DbConnection1" class. 
    //Allows using functions of the "DbConnection1" class. 

    public Tutoring1Controller() {
    }

    public ArrayList<String> AllTutoring() { //Function.
        try {
            db.open(); //Open Database.
            ArrayList<String> rs = db.AllTutoring(); //Allows storing the values of the "AllTutoring" function in an Array-List data structure called "rs".
            db.close(); //Close Database. 
            return rs; //The Array-List data structure "rs" is returned.
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: AllTutoring Controller Tutoring1 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database. 
            return null;
        }
    }

    public ArrayList<String> GetAllTutoringInfo(String z) { //Function + parameters.
        try {
            db.open(); //Open Database.
            ArrayList<String> rs = db.GetAllTutoringInfo(z); //Allows storing the values of the "GetAllTutoringInfo" function in an Array-List data structure called "rs".
            db.close(); //Close Database. 
            return rs; //The Array-List data structure "rs" is returned.
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: GetAllTutoringInfo Controller Tutoring1 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database. 
            return null;
        }
    }

    public ArrayList<String> GetTutoringemail(String z) { //Function + parameters.
        try {
            db.open(); //Open Database.
            ArrayList<String> rs = db.GetTutoringemail(z); //Allows storing the values of the "GetTutoringemail" function in an Array-List data structure called "rs".
            db.close(); //Close Database. 
            return rs; //The Array-List data structure "rs" is returned.
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: GetAllTutoringInfo Controller Tutoring1 "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database. 
            return null;
        }
    }

}
