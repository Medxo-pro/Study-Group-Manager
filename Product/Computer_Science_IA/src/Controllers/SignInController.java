package Controllers;

import DataBase.DbConnection1;

public class SignInController {

    private DbConnection1 db = new DbConnection1(); //Instance of the "DbConnection1" class. 
    //Allows using functions of the "DbConnection1" class. 

    public SignInController() {
    }

    public boolean insertSign(String UserName, String Password, String Email) { //Function + parameters.
        try {
            db.open(); //Open Database.
            db.insertSign(UserName, Password, Email); //Calls the "insertSign" function of the "DbConnection1" class with the required parameters.
            db.close(); //Close Database.
            return true; //Returns "true" to indicate that the try-catch error handling wasn't activated.
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: insertSign Controller SignIn "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
            return false; //Return "false" boolean value.
        }
    }

    //Function + parameters:
    public boolean insertSubjects(String UserName, String Group1, String Group1Extra, String Group2, String Group2Extra, String Group3, String Group3Extra, String Group4, String Group4Extra, String Group5, String Group6) {
        try {
            db.open(); //Open Database.
            db.insertSubjects(UserName, Group1, Group1Extra, Group2, Group2Extra, Group3, Group3Extra, Group4, Group4Extra, Group5, Group6); //Calls the "insertSubjects" function of the "DbConnection1" class with the required parameters.
            db.close(); //Close Database.
            return true; //Returns "true" to indicate that the try-catch error handling wasn't activated.
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: insertSubjects Controller SignIn "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
            return false; //Return "false" boolean value.
        }
    }

    public boolean insertEmailing(String UserName, int Tutoring, int Groups) { //Function + parameters.
        try {
            db.open(); //Open Database.
            db.insertEmailing(UserName, Tutoring, Groups); //Calls the "insertEmailing" function of the "DbConnection1" class with the required parameters.
            db.close(); //Close Database.
            return true; //Returns "true" to indicate that the try-catch error handling wasn't activated.
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: insertEmailing Controller SignIn "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
            return false; //Return "false" boolean value.
        }
    }

    public boolean CheckExistingAccount(String UserName, String Password, String Email) { //Function + parameters.
        try {
            db.open(); //Open Database.
            if (db.CheckExistingAccount(UserName, Password, Email)) { //If this condition is "true", the function will return a "false" boolean result. 
                db.close(); //Close Database.
                return false; //Return "false" boolean value.
            } else { //If the previous condition is not true, the function will return a "true" boolean result.
                db.close(); //Close Database.
                return true; //Return "true" boolean value.
            }
            //A "catch" is used if any of the previous processes fail:
        } catch (Exception e) {
            System.out.println("Error: CheckExistingAccount Controller SignIn "); //Allows to exactly identify where is the error coming from.
            db.close(); //Close Database.
            return false; //Return "false" boolean value.
        }
    }

}
