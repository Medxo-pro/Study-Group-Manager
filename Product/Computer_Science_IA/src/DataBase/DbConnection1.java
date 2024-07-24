/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 *
 * @author Atmani
 * 
 */
public class DbConnection1 {

    public static Connection con1 = null;
    

    public DbConnection1() {
        try {
            Class.forName("org.sqlite.JDBC");
            //Connection is a unique SQL variable type, that is linked to a given database.
            //It is then used to execute SQL statements and retrieve the results.
            //Relative path: "jdbc:sqlite:/Users/mac/Desktop/Computer_Science_IA/DataBase.db"
            //Absolute path: "jdbc:sqlite:/DataBase.db"
            con1 = DriverManager.getConnection("jdbc:sqlite:/DataBase.db");
            //The "getConnection()" function allows to input the direction of the database in the computer.
            System.out.println("Connected!");
            //If for any reason the previous steps end up not working, the error handling catch method is activated:
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e + "");
            System.out.println("com.mycompany.Main.DataBase.DbConnection.<init>()");
        }
        //https://hacksmile.com/how-to-connect-any-java-program-to-a-database/
        //https://www.youtube.com/c/HackSmile/videos
    }

    public void open() {
        try {
            //The first step resides in terminating the connection and any of its ongoing procedures.
            //This is done in the case it wasn't previously terminated. 
            close();
            //By closing the connection, clashes between new and old procedures are avoided.
            //Relative path: "jdbc:sqlite:/Users/mac/Desktop/Computer_Science_IA/DataBase.db"
            //Absolute path: "jdbc:sqlite:/DataBase.db"
            Class.forName("org.sqlite.JDBC");
            //con1 is again used to enable a new connection
            con1 = DriverManager.getConnection("jdbc:sqlite:/DataBase.db");
            System.out.println("Connected!");
            //A "catch" is used if any of the previous steps fail.
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e + "");
            System.out.println("com.mycompany.Main.DataBase.DbConnection.<init>()");
        }
    }

    public void close() {
        try {
            //The only step to terminate the connection is done through the "close()" function.
            con1.close();
            //A "catch" is used if the previous process fails.
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void insertSign(String UserName, String Password, String Email) {
        PreparedStatement ps = null;
        try {
            String sql = "INSERT INTO Accounts(UserName,Password, Email) VALUES(?,?,?);";
            //Insert into the Accounts table the three values/parameters (UserName, Password, Email).
            ps = con1.prepareStatement(sql);
            //Indicates that the "UserName" value/parameter should be inserted in the 1st "?":
            ps.setString(1, UserName);
            //Indicates that the "Password" value/parameter should be inserted in the 2nd "?":
            ps.setString(2, Password);
            //Indicates that the "Email" value/parameter should be inserted in the 3rd "?":
            ps.setString(3, Email);
            ps.execute();
            System.out.println("Data has been inserted!");
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: insertSign"); //Allows to exactly identify where is the error coming from.
        }
    }

    public static void output() {
        PreparedStatement ps = null;
        try {
            String sql = "select * from  Accounts;";
            //select all columns from the Accounts table.
            ps = con1.prepareStatement(sql);
            //The execution is stored in a SQL ResultSet variable called "rs":
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //Loop over rs until there are no more values.
                //Print the results:
                System.out.println(rs.getString(1) + ", " + rs.getString(2));
            }
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: output"); //Allows to exactly identify where is the error coming from.
        }
    }

    public static ResultSet CheckUserName(String USERNAME) {
        PreparedStatement ps = null;
        try {
            String sql = "select * from Accounts where UserName == '" + USERNAME + "';";
            //Select all the values from the Accounts table where the UserName cell is equal to the "UserName" value/parameter.
            ps = con1.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); //The execution is stored in a ResultSet variable called "rs".
            if (rs.next()) { //Only if rs has values.
                //In this context it means that the research found a row with the required Username.
                return rs;
            }
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: CheckUserName"); //Allows to exactly identify where is the error coming from.
        }
        return null;
    }

    public static boolean Check(String PASSWORD, String USERNAME) {
        PreparedStatement ps = null;
        try {
            String sql = "select * from Accounts where Accounts.Password == '" + PASSWORD + "' and Accounts.UserName == '" + USERNAME + "';";
            //Select all the values from the Accounts table where the Password cell is equal to the "PASSWORD" value/parameter and ->
            //the UserName cell is equal to the "UserName" value/parameter.
            ps = con1.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); //The execution is stored in a ResultSet variable called "rs".
            System.out.println(rs.getRow());
            while (rs.next()) {
                //Loop over rs until there are no more values.
                //Print the results:
                System.out.println(rs.getString(1) + ", " + rs.getString(2));
                return true; //Return "true" to indicate that the cell was found.
            }
            return false; //Return "false" to indicate that the cell was not found.
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: Check"); //Allows to exactly identify where is the error coming from.
        }
        return false;
    }

    public static boolean CheckExistingAccount(String UserName, String Password, String Email) {
        PreparedStatement ps = null;
        try {
            String sql = "select * from Accounts where Accounts.UserName == '" + UserName + "' and Accounts.Password == '" + Password + "' and Accounts.Email == '" + Email + "';";
            //Select all the values from the Accounts table where the UserName cell is equal to the "UserName" value/parameter and ->
            //the Password cell is equal to the "Password" value/parameter and the Email cell is equal to the "Email" value/parameter. 
            ps = con1.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            System.out.println(rs.getRow());
            while (rs.next()) {
                //Loop over rs until there are no more values.
                //Print the results:
                System.out.println(rs.getString(1) + ", " + rs.getString(2));
                return true; //Return "true" to indicate that the cell was found.
            }
            return false; //Return "false" to indicate that the cell was not found.
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: CheckExistingAccount"); //Allows to exactly identify where is the error coming from.
        }
        return false;
    }

    public static void insertSubjects(String UserName, String Group1, String Group1Extra, String Group2, String Group2Extra, String Group3, String Group3Extra, String Group4, String Group4Extra, String Group5, String Group6) {
        PreparedStatement ps = null;
        try {
            String sql = "INSERT INTO IBSubjects(UserName,Group1,Group1Extra,Group2,Group2Extra,Group3,Group3Extra,Group4,Group4Extra,Group5,Group6) VALUES(?,?,?,?,?,?,?,?,?,?,?);";
            //Insert into the IBSubjects table the eleven values/parameters (UserName, Group1, Group1Extra, Group2, Group2Extra, Group3, Group3Extra, Group4, Group4Extra, Group5, Group6).
            ps = con1.prepareStatement(sql);
            //Indicates that the "UserName" value/parameter should be inserted in the 1st "?":
            ps.setString(1, UserName);
            //Indicates that the "Group1" value/parameter should be inserted in the 2nd "?":
            ps.setString(2, Group1);
            //Indicates that the "Group1Extra" value/parameter should be inserted in the 3rd "?":
            ps.setString(3, Group1Extra);
            //Indicates that the "Group2" value/parameter should be inserted in the 4th "?":
            ps.setString(4, Group2);
            //Indicates that the "Group2Extra" value/parameter should be inserted in the 5th "?":
            ps.setString(5, Group2Extra);
            //Indicates that the "Group3" value/parameter should be inserted in the 6th "?":
            ps.setString(6, Group3);
            //Indicates that the "Group3Extra" value/parameter should be inserted in the 7th "?":
            ps.setString(7, Group3Extra);
            //Indicates that the "Group4" value/parameter should be inserted in the 8th "?":
            ps.setString(8, Group4);
            //Indicates that the "Group4Extra" value/parameter should be inserted in the 9th "?":
            ps.setString(9, Group4Extra);
            //Indicates that the "Group5" value/parameter should be inserted in the 10th "?":
            ps.setString(10, Group5);
            //Indicates that the "Group6" value/parameter should be inserted in the 11th "?":
            ps.setString(11, Group6);
            ps.execute();
            System.out.println("Data has been inserted!");
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: insertSubjects "); //Allows to exactly identify where is the error coming from.
        }
    }

    public static void insertEmailing(String UserName, int Tutoring, int Groups) {
        PreparedStatement ps = null;
        try {
            String sql = "INSERT INTO Notifications(UserName, Tutoring, Groups) VALUES(?,?,?);";
            //Insert into the Notifications table the three values/parameters (UserName, Tutoring, Password)
            ps = con1.prepareStatement(sql);
            //Indicates that the "UserName" value/parameter should be inserted in the 1st "?":
            ps.setString(1, UserName);
            //Indicates that the "Tutoring" value/parameter should be inserted in the 2nd "?":
            ps.setInt(2, Tutoring); // If (Tutoring = 1) user agreed to receive emails for tutoring.
            //Indicates that the "Password" value/parameter should be inserted in the 3rd "?":
            ps.setInt(3, Groups);
            // If (Password = 1) user agreed to receive emails for StudyGroups.
            // If (Password = 0) user did not agree to receive emails for StudyGroups.
            ps.execute();
            System.out.println("Data has been inserted!");
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: insertEmailing"); //Allows to exactly identify where is the error coming from.
        }
    }

    public ArrayList<String> GroupSubjects(String UN1) {
        PreparedStatement ps = null;
        try {
            String sql = "select * from  IBSubjects where IBSubjects.UserName == '" + UN1 + "';";
            //Select all the values from the IBSubjects table where the UserName cell is equal to the "UN1" value/parameter.
            ps = con1.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); //The execution is stored in a ResultSet variable called "rs".
            while (rs.next()) {
                //Loop over rs until there are no more values.
                ArrayList<String> cars = new ArrayList<String>(); //Create Array-List data structure called "Password".
                cars.add(rs.getString(2)); //Add the 2nd value of "rs" in the Array-List "Password".
                cars.add(rs.getString(3)); //Add the 3rd value of "rs" in the Array-List "Password".
                cars.add(rs.getString(4)); //Add the 4th value of "rs" in the Array-List "Password".
                cars.add(rs.getString(5)); //Add the 5th value of "rs" in the Array-List "Password".
                cars.add(rs.getString(6)); //Add the 6th value of "rs" in the Array-List "Password".
                cars.add(rs.getString(7)); //Add the 7th value of "rs" in the Array-List "Password".
                cars.add(rs.getString(8)); //Add the 8th value of "rs" in the Array-List "Password".
                cars.add(rs.getString(9)); //Add the 9th value of "rs" in the Array-List "Password".
                cars.add(rs.getString(10)); //Add the 10th value of "rs" in the Array-List "Password".
                cars.add(rs.getString(11)); //Add the 11th value of "rs" in the Array-List "Password".
                return cars; //Return the Array-List "Password".
            }
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: GroupSubjects"); //Allows to exactly identify where is the error coming from.
        }
        return null;
    }

    public static boolean CheckExistingGroup(String A, String B, String C) {
        PreparedStatement ps = null;
        try {
            String sql = "select * from Groups where Groups.Subject1 == '" + A + "' OR Groups.Subject1 == '" + B + "' OR Groups.Subject1 == '" + C + "' OR Groups.Subject2 == '" + A + "' OR Groups.Subject2 == '" + B + "' OR Groups.Subject2 == '" + C + "' OR Groups.Subject3 == '" + A + "' OR Groups.Subject3 == '" + B + "' OR Groups.Subject3 == '" + C + "';";
            //Select all the values from the Password table where the Subject1 cell is equal to the "A" or "B" or "C" value/parameter or ->
            //the Subject2 cell is equal to the "A" or "B" or "C" value/parameter or ->
            //the Subject3 cell is equal to the "A" or "B" or "C" value/parameter.
            ps = con1.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); //The execution is stored in a ResultSet variable called "rs".
            System.out.println(rs.getRow());
            while (rs.next()) {
                //Loop over rs until there are no more values.
                //Print the results:
                System.out.println(rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3));
                return true; //Return "true" to indicate that the cell was found.
            }
            return false;
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: CheckExistingGroup"); //Allows to exactly identify where is the error coming from.
        }
        return false;
    }

    public static void insertNewGroup(String UserName, String Subject1, String Subject2, String Subject3, String Topic1, String Topic2, String Topic3, String Room, int FromT, int ToT) {
        PreparedStatement ps = null;
        try {
            String sql = "INSERT INTO Groups(UserName,Subject1,Subject2,Subject3,Topic1,Topic2,Topic3,Room,FromT,ToT) VALUES(?,?,?,?,?,?,?,?,?,?);";
            //Insert into the Accounts table the ten values/parameters (UserName, Subject1, Subject2, Subject3, Topic1, Topic2, Topic3, Room, FromT, ToT).
            ps = con1.prepareStatement(sql);
            //Indicates that the "UserName" value/parameter should be inserted in the 1st "?":
            ps.setString(1, UserName);
            //Indicates that the "Subject1" value/parameter should be inserted in the 2nd "?":
            ps.setString(2, Subject1);
            //Indicates that the "Subject2" value/parameter should be inserted in the 3rd "?":
            ps.setString(3, Subject2);
            //Indicates that the "Subject3" value/parameter should be inserted in the 4th "?":
            ps.setString(4, Subject3);
            //Indicates that the "Topic1" value/parameter should be inserted in the 5th "?":
            ps.setString(5, Topic1);
            //Indicates that the "Topic2" value/parameter should be inserted in the 6th "?":
            ps.setString(6, Topic2);
            //Indicates that the "Topic3" value/parameter should be inserted in the 7th "?":
            ps.setString(7, Topic3);
            //Indicates that the "Room" value/parameter should be inserted in the 8th "?":
            ps.setString(8, Room);
            //Indicates that the "FromT" value/parameter should be inserted in the 9th "?":
            ps.setInt(9, FromT);
            //Indicates that the "ToT" value/parameter should be inserted in the 10th "?":
            ps.setInt(10, ToT);
            ps.execute();
            System.out.println("Data has been inserted!");
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: insertNewGroup"); //Allows to exactly identify where is the error coming from.
        }
    }

    public static boolean CheckGroupStatus(String UN) {
        PreparedStatement ps = null;
        try {
            String sql = "select * from GroupStatus where GroupStatus.UserName == '" + UN + "' and GroupStatus.Status == '" + 0 + "' ;";
            //Select all the values from the GroupStatus table where the UserName cell is equal to the "UN" value/parameter and ->
            //the Status cell is equal to "0".
            ps = con1.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); //The execution is stored in a ResultSet variable called "rs".
            if (rs.next()) { //Only if rs has values.
                //In this context it means that the research found a row with the required Username and status.
                System.out.println(rs.getString(1));
                return true;
            }
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: CheckGroupStatus"); //Allows to exactly identify where is the error coming from.
        }
        return false;
    }

    public static void insertGroupStatus(String UserName, int Status, String Host) {
        PreparedStatement ps = null;
        try {
            String sql = "INSERT INTO GroupStatus (UserName,Status, Host) VALUES(?,?,?);";
            //Insert into the GroupStatus table the three values/parameters (UserName, Status, Host)
            ps = con1.prepareStatement(sql);
            //Indicates that the "UserName" value/parameter should be inserted in the 1st "?":
            ps.setString(1, UserName);
            //Indicates that the "Status" value/parameter should be inserted in the 2nd "?":
            ps.setInt(2, Status);
            //Indicates that the "Host" value/parameter should be inserted in the 3rd "?":
            ps.setString(3, Host);
            ps.execute();
            System.out.println("Data has been inserted!");
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: insertGroupStatus"); //Allows to exactly identify where is the error coming from.
        }
    }

    public static boolean CheckGroupStatusInit(String UN) {
        PreparedStatement ps = null;
        try {
            String sql = "select * from GroupStatus where GroupStatus.UserName == '" + UN + "';";
            //Select all the values from the GroupStatus table where the UserName cell is equal to the "UN" value/parameter.
            ps = con1.prepareStatement(sql); //The execution is stored in a ResultSet variable called "rs".
            ResultSet rs = ps.executeQuery();
            if (rs.next()) { //Only if rs has values.
                //In this context it means that the research found a row with the required Username.
                System.out.println(rs.getString(1));
                return true;
            }
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: CheckGroupStatusInit"); //Allows to exactly identify where is the error coming from.
        }
        return false;
    }

    public void updateGroupStatus(String UserName, int Status, String Host) {
        PreparedStatement ps = null;
        try {
            String sql = "UPDATE GroupStatus SET Host = ? , "
                    + "Status = ? "
                    + "WHERE UserName = ?";
            //Updates the status of a user.
            //If (Status = 1) the user is in a group.
            //If (Status = 0) the user is not in a group.
            //Host represents the UnserName of the creator of the Group.
            //If a random user is not in a group the "Host" is null.
            ps = con1.prepareStatement(sql);
            ps.setString(1, UserName); //Indicates that the "Username" value/parameter should be set in the 1st "?"
            ps.setInt(2, Status); //Indicates that the "Status" value/parameter should be set in the 2nd "?"
            ps.setString(3, Host); //Indicates that the "Host" value/parameter should be set in the 3rd "?"
            ps.executeUpdate();
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: updateGroupStatus"); //Allows to exactly identify where is the error coming from.
        }
    }

    public static String GetHostGroupStatus(String UN) {
        PreparedStatement ps = null;
        try {
            String sql = "select * from GroupStatus where GroupStatus.UserName == '" + UN + "' and GroupStatus.Status == '" + 1 + "' ;";
            //Select all values from the GroupStatus table where The UserName cell is = to the "UN" value/parameter 
            //and the Status cell is = to "1"
            ps = con1.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); //The execution is stored in a ResultSet variable called "rs".
            if (rs.next()) {//Only if rs has values.
                //In this context it means that the search found a row with the required Username and value of Status.
                String x = rs.getString(3); //stores the value of the 3rd (column/cell) "rs" value.
                System.out.println(rs.getString(3));
                return x;
            }
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: GetHostGroupStatus"); //Allows to exactly identify where is the error coming from.
        }
        return null;
    }

    public ArrayList<String> GroupSubjectsFromMenu(String Host) {
        PreparedStatement ps = null;
        try {
            String sql = "select * from  Groups where Groups.UserName == '" + Host + "';";
            //Select all the values from the Password table where the UserName cell is equal to the "Host" value/parameter.
            ps = con1.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); //The execution is stored in a ResultSet variable called "rs".
            while (rs.next()) {
                //Loop over rs until there are no more values.
                //Print the results:
                ArrayList<String> Groups = new ArrayList<String>(); //Create Array-List data structure called "Password".
                Groups.add(rs.getString(2)); //Add the 2nd value of "rs" in the Array-List "Password".
                Groups.add(rs.getString(3)); //Add the 3rd value of "rs" in the Array-List "Password".
                Groups.add(rs.getString(4)); //Add the 4th value of "rs" in the Array-List "Password".
                Groups.add(rs.getString(5)); //Add the 5th value of "rs" in the Array-List "Password".
                Groups.add(rs.getString(6)); //Add the 6th value of "rs" in the Array-List "Password".
                Groups.add(rs.getString(7)); //Add the 7th value of "rs" in the Array-List "Password".
                Groups.add(rs.getString(8)); //Add the 8th value of "rs" in the Array-List "Password".
                Groups.add(rs.getString(9)); //Add the 9th value of "rs" in the Array-List "Password".
                Groups.add(rs.getString(10)); //Add the 10th value of "rs" in the Array-List "Password".
                System.out.println(rs);
                return Groups; //Return the Array-List "Password".
            }
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: GroupSubjectsFromMenu"); //Allows to exactly identify where is the error coming from.
        }
        return null;
    }

    public ArrayList<String> EmailsToSendNotifications() {
        PreparedStatement ps = null;
        try {
            String sql = "select Email from Notifications N join Accounts A on N.UserName = A.UserName WHERE N.Groups = 1 ;";
            //Select all Password from the Accounts table where the Notifications table Username is = to the Accounts table Username
            //And that the Password value in the Notifications table is = to "1".
            ResultSet rs = ps.executeQuery(); //The execution is stored in a ResultSet variable called "rs".
            ArrayList<String> Emails = new ArrayList<String>(); //Create Array-List data structure called "Password".
            int i = 1;
            while (rs.next()) {
                //Loop over rs until there are no more values.
                Emails.add(rs.getString(1)); //Add the 1st value of "rs" in the Array-List "Password".
            }
            return Emails; //Return the Array-List "Password".
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: EmailsToSendNotifications"); //Allows to exactly identify where is the error coming from.
        }
        return null;
    }

    public ArrayList<String> EmailsToSendNotificationsV2(String Subject1, String Subject2, String Subject3) {
        PreparedStatement ps = null;
        try {
            String sql = "select Email from Notifications N join Accounts A on N.UserName = A.UserName join  IBSubjects I  on I.UserName = A.UserName WHERE  N.Groups = 1  and   (I.Group1 == '" + Subject1 + "' or I.Group1 == '" + Subject2 + "' or I.Group1 == '" + Subject3 + "' or  I.Group1Extra == '" + Subject1 + "' or I.Group1Extra == '" + Subject2 + "' or I.Group1Extra == '" + Subject3 + "' or  I.Group2 == '" + Subject1 + "' or I.Group2 == '" + Subject2 + "' or I.Group2 == '" + Subject3 + "' or I.Group2Extra == '" + Subject1 + "' or I.Group2Extra == '" + Subject2 + "' or I.Group2Extra == '" + Subject3 + "' or I.Group3 == '" + Subject1 + "' or I.Group3 == '" + Subject2 + "' or I.Group3 == '" + Subject3 + "' or I.Group3Extra == '" + Subject1 + "' or I.Group3Extra == '" + Subject2 + "' or I.Group3Extra == '" + Subject3 + "' or I.Group4 == '" + Subject1 + "' or I.Group4 == '" + Subject2 + "' or I.Group4 == '" + Subject3 + "' or I.Group4Extra == '" + Subject1 + "' or I.Group4Extra == '" + Subject2 + "' or I.Group4Extra == '" + Subject3 + "' or I.Group5 == '" + Subject1 + "' or I.Group5 == '" + Subject2 + "' or I.Group5 == '" + Subject3 + "' or I.Group6 == '" + Subject1 + "'or I.Group6 == '" + Subject2 + "'or I.Group6 == '" + Subject3 + "')";
            //Select all Password from the Accounts table where the Notifications table Username is = to the Accounts table Username and where the IBSubjects table Username is = to the Accounts table Username
            //And that the Password value in the Notifications table is = to "1".
            //And where the IB Subjects from the IBSubjects table are equal to (Subject1, Subject2, or Subject3).
            ps = con1.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); //The execution is stored in a ResultSet variable called "rs".
            ArrayList<String> Emails = new ArrayList<String>(); //Create Array-List data structure called "Password".
            int i = 1;
            while (rs.next()) {
                //Loop over rs until there are no more rows.
                //The values of rs are stored in an ArrayList:
                Emails.add(rs.getString(1)); //Add the 1st value of "rs" in the Array-List "Password".
            }
            return Emails; //Return the Array-List "Password".
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: EmailsToSendNotifications"); //Allows to exactly identify where is the error coming from.
        }
        return null;
        //https://programacionymas.com/blog/como-funciona-inner-left-right-full-join
    }

    public ArrayList<String> AllGroupsStudy2(String A, String B, String C) {
        PreparedStatement ps = null;
        try {
            String sql = "select * from Groups where Groups.Subject1 == '" + A + "' OR Groups.Subject1 == '" + B + "' "
                    + "OR Groups.Subject1 == '" + C + "' OR Groups.Subject2 == '" + A + "' OR Groups.Subject2 == '" + B + "' "
                    + "OR Groups.Subject2 == '" + C + "' OR Groups.Subject3 == '" + A + "' OR Groups.Subject3 == '" + B + "' "
                    + "OR Groups.Subject3 == '" + C + "';";
            //Select anywhere from the Password table that has the (Subject1, Subject2, or Subject3) equal to (A, B, or C).
            ps = con1.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();//The execution is stored in a ResultSet variable called "rs".
            ArrayList<String> ArrayGroups = new ArrayList<String>(); //Create Array-List data structure called "ArrayGroups".
            while (rs.next()) {
                //Loop over rs until there are no more values.
                //The values of rs are stored in an Array-List.
                //Add the (1st, 2nd, 3rd, and 4th) values of "rs" in the Array-List "ArrayGroups":
                ArrayGroups.add(rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4)); 
            }
            return ArrayGroups; //Return the Array-List "ArrayGroups".
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: AllGroupsStudy2 "); //Allows to exactly identify where is the error coming from.
        }
        return null;
    }

    public ArrayList<String> GetAllGroups2Info(String z) {
        PreparedStatement ps = null;
        try {
            String sql = "select * from  Groups where Groups.UserName == '" + z + "';";
            //Select all values from the Password table where The UserName cell is = to the "z" value/parameter 
            ps = con1.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); //The execution is stored in a ResultSet variable called "rs".
            while (rs.next()) {
                //Loop over rs until there are no more values.
                //Print the results:
                ArrayList<String> Groups = new ArrayList<String>(); //Create Array-List data structure called "Password".
                Groups.add(rs.getString(1)); //Add the 1st value of "rs" in the Array-List "Password".
                Groups.add(rs.getString(2)); //Add the 2nd value of "rs" in the Array-List "Password".
                Groups.add(rs.getString(3)); //Add the 3rd value of "rs" in the Array-List "Password".
                Groups.add(rs.getString(4)); //Add the 4th value of "rs" in the Array-List "Password".
                Groups.add(rs.getString(5)); //Add the 5th value of "rs" in the Array-List "Password".
                Groups.add(rs.getString(6)); //Add the 6th value of "rs" in the Array-List "Password".
                Groups.add(rs.getString(7)); //Add the 7th value of "rs" in the Array-List "Password".
                Groups.add(rs.getString(8)); //Add the 8th value of "rs" in the Array-List "Password".
                Groups.add(rs.getString(9)); //Add the 9th value of "rs" in the Array-List "Password".
                Groups.add(rs.getString(10)); //Add the 10th value of "rs" in the Array-List "Password".
                System.out.println(rs);
                return Groups; //Return the Array-List "Password".
            }
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: GetAllGroups2Info"); //Allows to exactly identify where is the error coming from.
        }
        return null;
    }

    public void updateGroupStatusFromStudy2(String UserName, int Status, String Host) {
        PreparedStatement ps = null;
        try {
            String sql = "UPDATE GroupStatus SET Host = ? , "
                    + "Status = ? "
                    + "WHERE UserName = ?";
            //Updates the Group status of a user.
            //If (Status = 1) the user is in a group.
            //If (Status = 0) the user is not in a group.
            //Host represents the UnserName of the creator of the Group.
            //If a random user is not in a group the "Host" is null.
            ps = con1.prepareStatement(sql);
            ps.setString(3, UserName); //Indicates that the "Username" value/parameter should be set in the 3rd "?".
            ps.setInt(2, Status); //Indicates that the "Status" value/parameter should be set in the 2nd "?".
            ps.setString(1, Host); //Indicates that the "Host" value/parameter should be set in the 1st "?".
            ps.executeUpdate();
        } //A "catch" is used if any of the previous processes fail.
        catch (SQLException e) {
            System.out.println("Error: updateGroupStatusFromStudy2"); //Allows to exactly identify where is the error coming from.
        }
    }

    public static void InsertTutoring(String UserName, String Subject, String Description) {
        PreparedStatement ps = null;
        try {
            String sql = "INSERT INTO Tutoring(UserName, Subject, Description) VALUES(?,?,?);";
            //Insert into the Tutoring table the three values/parameters (UserName, Subject, Description)
            ps = con1.prepareStatement(sql);
            //Indicates that the "UserName" value/parameter should be inserted in the 1st "?":
            ps.setString(1, UserName);
            //Indicates that the "Subject" value/parameter should be inserted in the 2nd "?":
            ps.setString(2, Subject);
            //Indicates that the "Description" value/parameter should be inserted in the 3rd "?":
            ps.setString(3, Description);
            ps.execute();
            System.out.println("Data has been inserted!");
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: InsertTutoring"); //Allows to exactly identify where is the error coming from.
        }
    }

    public ArrayList<String> EmailsToSendNotificationsTutoring(String UserName, String Subject) {
        PreparedStatement ps = null;
        try {
            String sql = "select Email from Notifications N join Accounts A on N.UserName = A.UserName join IBSubjects I  "
                    + "on I.UserName = A.UserName WHERE  N.Tutoring = 1  and   (I.Group1 = ? or  I.Group1Extra = ? "
                    + "or  I.Group2 = ? or  I.Group2Extra = ? or I.Group3 = ? or I.Group3Extra = ? or I.Group4= ? "
                    + "or I.Group4Extra = ? or I.Group5 = ? or I.Group6 = ?);";
            //Select all Password from the Accounts table where the Notifications table Username is = to the Accounts table Username
            //And where the IBSubjects table Username is = to the Accounts table Username
            //And where the Tutoring cell from the Notifications table is equal to 1
            //And where any of the IBSubjects cells from the IBSubjects table are equal to the "Subject" value/parameter.
            ps = con1.prepareStatement(sql);
            ps.setString(1, Subject);//Indicates that the "Subject" value/parameter should be set in the 1st "?"
            ps.setString(2, Subject);//Indicates that the "Subject" value/parameter should be set in the 2nd "?"
            ps.setString(3, Subject);//Indicates that the "Subject" value/parameter should be set in the 3rd "?"
            ps.setString(4, Subject);//Indicates that the "Subject" value/parameter should be set in the 4th "?"
            ps.setString(5, Subject);//Indicates that the "Subject" value/parameter should be set in the 5th "?"
            ps.setString(6, Subject);//Indicates that the "Subject" value/parameter should be set in the 6th "?"
            ps.setString(7, Subject);//Indicates that the "Subject" value/parameter should be set in the 7th "?"
            ps.setString(8, Subject);//Indicates that the "Subject" value/parameter should be set in the 8th "?"
            ps.setString(9, Subject);//Indicates that the "Subject" value/parameter should be set in the 9th "?"
            ps.setString(10, Subject);//Indicates that the "Subject" value/parameter should be set in the 10th "?"     
            ResultSet rs = ps.executeQuery(); //The execution is stored in a ResultSet variable called "rs".
            ArrayList<String> Emails = new ArrayList<String>(); //Create Array-List data structure called "Password".
            int i = 1;
            while (rs.next()) {
                //Loop over rs until there are no more values.
                //The values of rs are stored in an ArrayList:
                Emails.add(rs.getString(1)); //Add the 1st value of "rs" in the Array-List "Password".
            }
            return Emails; //Return the Array-List "Password".
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: EmailsToSendNotificationsTutoring"); //Allows to exactly identify where is the error coming from.
        }
        return null;
        //https://programacionymas.com/blog/como-funciona-inner-left-right-full-join
    }

    public void DeleteGroupExit(String UserName) {
        PreparedStatement ps = null;
        try {
            String sql = "Delete from Groups where Groups.UserName == '" + UserName + "';";
            //This completelly deletes the row that has a Username cell = to the "UserName" value/parameter.
            ps = con1.prepareStatement(sql);
            ps.executeUpdate();
        } //A "catch" is used if any of the previous processes fail.
        catch (SQLException e) {
            System.out.println("Error: DeleteGroupExit"); //Allows to exactly identify where is the error coming from.
        }
    }

    public void updateGroupStatusExit(String UserName, int Status, String Host) {
        PreparedStatement ps = null;
        try {
            String sql = "UPDATE GroupStatus SET Host = ? , "
                    + "Status = ? "
                    + "WHERE Host = ?"; 
            //Updates the status of a user.
            //If (Status = 1) the user is in a group.
            //If (Status = 0) the user is not in a group.
            //Host represents the UnserName of the creator of the Group.
            //If a random user is not in a group the "Host" is null.
            ps = con1.prepareStatement(sql);
            ps.setString(1, Host); //Indicates that the "Host" value/parameter should be set in the 1st "?"
            ps.setInt(2, Status); //Indicates that the "Status" value/parameter should be set in the 2nd "?"
            ps.setString(3, UserName); //Indicates that the "UserName" value/parameter should be set in the 3rd "?"
            ps.executeUpdate();
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: updateGroupStatusExit"); //Allows to exactly identify where is the error coming from.
        }
    }

    public ArrayList<String> AllTutoring() {
        PreparedStatement ps = null;
        try {
            //This query provides general access to the "Tutoring" table. 
            String sql = "select * from Tutoring;";
            // All SQL must be converted to a "prepare statement" object before it can be executed.
            ps = con1.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); // "rs" is a Java object that contains the results of executing an SQL Query.
            ArrayList<String> ArrayTutoring = new ArrayList<String>(); //Create ArrayList with name "ArrayTutoring"
            while (rs.next()) { // If "rs" has values.          
                ArrayTutoring.add(rs.getString(1) + ", " + rs.getString(2)); //Add the (1st, and  2nd) values of "rs" in the Array-List "ArrayTutoring".
            }
            return ArrayTutoring; //Return the ArrayList
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) { // In case there is an error:
            System.out.println("Error: AllTutoring"); //Allows to exactly identify where is the error coming from.
        }
        return null;
    }

    public ArrayList<String> GetAllTutoringInfo(String z) {
        PreparedStatement ps = null;
        try {
            String sql = "select * from  Tutoring where Tutoring.UserName == '" + z + "';";
            //Select all values from the Tutoring table where The UserName cell is = to the "z" value/parameter 
            ps = con1.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); //The execution is stored in a ResultSet variable called "rs".
            while (rs.next()) {
                //Loop over rs until there are no more values.
                //Print the results:
                ArrayList<String> Groups = new ArrayList<String>(); //Create Array-List data structure called "Password".
                Groups.add(rs.getString(1)); //Add the 1st value of "rs" in the Array-List "Password".
                Groups.add(rs.getString(2)); //Add the 2nd value of "rs" in the Array-List "Password".
                Groups.add(rs.getString(3)); //Add the 3rd value of "rs" in the Array-List "Password".
                System.out.println(rs);
                return Groups; //Return the Array-List "Password".
            }
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: GetAllTutoringInfo"); //Allows to exactly identify where is the error coming from.
        }
        return null;
    }

    public ArrayList<String> GetEmail(String UN1) {
        PreparedStatement ps = null;
        try {
            String sql = "select * from  Accounts where Accounts.UserName == '" + UN1 + "';";
            //Select all values from the Accounts table where The UserName cell is = to the "UN1" value/parameter 
            ps = con1.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); //The execution is stored in a ResultSet variable called "rs".
            while (rs.next()) {
                //Loop over rs until there are no more values.
                ArrayList<String> Emails = new ArrayList<String>(); //Create Array-List data structure called "Password".
                Emails.add(rs.getString(3)); //Add the 3rd value of "rs" in the Array-List "Password".
                return Emails; //Return the Array-List "Password".
            }
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: GetEmail"); //Allows to exactly identify where is the error coming from.
        }
        return null;
    }

    public ArrayList<String> GetTutoringemail(String z) {
        PreparedStatement ps = null;
        try {
            String sql = "select * from  Accounts where Accounts.UserName == '" + z + "';";
            //Select all values from the Accounts table where The UserName cell is = to the "z" value/parameter 
            ps = con1.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); //The execution is stored in a ResultSet variable called "rs".
            while (rs.next()) {
                //Loop over rs until there are no more values.
                //Print the results:
                ArrayList<String> Emails = new ArrayList<String>(); //Create Array-List data structure called "Password".
                Emails.add(rs.getString(3)); //Add the 3rd value of "rs" in the Array-List "Password".
                System.out.println(rs);
                return Emails; //Return the Array-List "Password".
            }
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: GetTutoringemail"); //Allows to exactly identify where is the error coming from.
        }
        return null;
    }

    public ArrayList<String> GetPassword(String UN1) {
        PreparedStatement ps = null;
        try {
            String sql = "select * from  Accounts where Accounts.UserName == '" + UN1 + "';";
            //Select all values from the Accounts table where The UserName cell is = to the "UN1" value/parameter
            ps = con1.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); //The execution is stored in a ResultSet variable called "rs".
            while (rs.next()) {
                //Loop over rs until there are no more values.
                ArrayList<String> Password = new ArrayList<String>(); //Create Array-List data structure called "Password".
                Password.add(rs.getString(2)); //Add the 2nd value of "rs" in the Array-List "Password".
                return Password; //Return the Array-List "Password".
            }
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: GetPassword"); //Allows to exactly identify where is the error coming from.
        }
        return null;
    }

    public void updatePassword(String UserName, String Password) {
        PreparedStatement ps = null;
        try {
            String sql = "UPDATE Accounts\n"
                    + "SET Password == ? \n"
                    + "WHERE UserName = ?;";
            //Updates the Password of a user.
            ps = con1.prepareStatement(sql);
            ps.setString(1, Password); //Indicates that the "Password" value/parameter should be set in the 1st "?".
            ps.setString(2, UserName); //Indicates that the "UserName" value/parameter should be set in the 2nd "?".
            ps.executeUpdate();
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: updatePassword"); //Allows to exactly identify where is the error coming from.
        }
    }

    public void UpdateUserName(String UserName, String NewUserName) {
        PreparedStatement ps = null;
        try {
            String sql = "UPDATE Accounts\n"
                    + "SET UserName == ? \n"
                    + "WHERE UserName = ?;";
            //Updates the UserName of a user.
            ps = con1.prepareStatement(sql);
            ps.setString(1, NewUserName); //Indicates that the "NewUserName" value/parameter should be set in the 1st "?".
            ps.setString(2, UserName); //Indicates that the "UserName" value/parameter should be set in the 2nd "?".
            ps.executeUpdate();
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: UpdateUserName"); //Allows to exactly identify where is the error coming from.
        }
    }

    public void updateEmail(String UserName, String Email) {
        PreparedStatement ps = null;
        try {
            String sql = "UPDATE Accounts\n"
                    + "SET Email == ? \n"
                    + "WHERE UserName = ?;";
            //Updates the Email of a user.
            ps = con1.prepareStatement(sql);
            ps.setString(1, Email); //Indicates that the "Email" value/parameter should be set in the 1st "?".
            ps.setString(2, UserName); //Indicates that the "UserName" value/parameter should be set in the 2nd "?".
            ps.executeUpdate();
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: updateEmail"); //Allows to exactly identify where is the error coming from.
        }
    }

    public static ResultSet CheckNotificationsGroups(String USERNAME) {
        PreparedStatement ps = null;
        try {
            String sql = "select * from Notifications where UserName == '" + USERNAME + "' and Groups == '" + 1 + "';";
            //Select all values from the Notifications table where 
            //the UserName cell = to the "USERNAME" value/parameter and the Groups cell = to "1";
            ps = con1.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); //The execution is stored in a ResultSet variable called "rs".
            if (rs.next()) { //Only if rs has values.
                //In this context it means that the search found a row with the required Username and value of Groups.
                return rs; //Return the ResultSet variable "rs".
            }
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: CheckNotificationsGroups"); //Allows to exactly identify where is the error coming from.
        }
        return null;
    }

    public static ResultSet CheckNotificationsTutoring(String USERNAME) {
        PreparedStatement ps = null;
        try {
            String sql = "select * from Notifications where UserName == '" + USERNAME + "' and Tutoring == '" + 1 + "';";
            //Select all values from the Notifications table where 
            //the UserName cell = to the "UserName" value/parameter and the Tutoring cell = to "1";
            ps = con1.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); //The execution is stored in a ResultSet variable called "rs".
            if (rs.next()) { //Only if rs has values.
                //In this context it means that the search found a row with the required Username and value of Tutoring.
                return rs; //Return the ResultSet variable "rs".
            }
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: CheckNotificationsTutoring"); //Allows to exactly identify where is the error coming from.
        }
        return null;
    }

    public void updateGroupNotifications(String UserName, int change) {
        PreparedStatement ps = null;
        try {
            String sql = "UPDATE Notifications\n"
                    + "SET Groups == ? \n"
                    + "WHERE UserName = ?;";
            //Updates the group notification setting of a user.
            ps = con1.prepareStatement(sql);
            ps.setInt(1, change); //Indicates that the "change" value/parameter should be set in the 1st "?".
            ps.setString(2, UserName); //Indicates that the "UserName" value/parameter should be set in the 2nd "?".
            ps.executeUpdate();
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: updateGroupNotifications"); //Allows to exactly identify where is the error coming from.
        }
    }

    public void updateTutoringNotifications(String UserName, int change) {
        PreparedStatement ps = null;
        try {
            String sql = "UPDATE Notifications\n"
                    + "SET Tutoring == ? \n"
                    + "WHERE UserName = ?;";
            //Updates the tutoring notification setting of a user.
            ps = con1.prepareStatement(sql);
            ps.setInt(1, change); //Indicates that the "change" value/parameter should be set in the 1st "?".
            ps.setString(2, UserName); //Indicates that the "UserName" value/parameter should be set in the 2nd "?".
            ps.executeUpdate();
            //A "catch" is used if any of the previous processes fail.
        } catch (SQLException e) {
            System.out.println("Error: updateTutoringNotifications"); //Allows to exactly identify where is the error coming from.
        }
    }

}
