/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Atmani
 */
public class AvailableRoomsController {

    public AvailableRoomsController() {
    }

    private FileReader fr; //FileReader variable.
    private BufferedReader br; //BufferedReader variable.
    private String filename; //String variable for input file.

    public String nextString() {
        try {
            //The "readLine()" method is used to read one line of text at a time:
            return br.readLine();
            //A "catch" is used if the previous process fails:
        } catch (Exception e) {
            System.err.println("Exception encountered: " + e.getMessage() + "\n" + e.getStackTrace().toString());
            return null;
        }
    }

    public void FileInput(String file) {
        filename = file;
        try {
            fr = new FileReader(filename); //Used to read a file from the disk drive.
            br = new BufferedReader(fr); // Used to read data from character streams in the case the "fr" variable.
            //A "catch" is used if any of the previous steps fail:
        } catch (Exception e) {
            System.err.println("Exception encountered: " + e.getMessage() + "\n" + e.getStackTrace().toString());
            fr = null;
            br = null;
        }
    }

}
