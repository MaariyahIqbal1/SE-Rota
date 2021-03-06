/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insebase;

/**
 *
 * @author Doye
 */
//import java.io.*;

// Person class, Serializable allows for easy writing and reading to files
public class Person implements java.io.Serializable {
    private String fullName, shortName;
    private int maxHours, idNum;
    
    // For creation of a new person
    public Person(String name, String initials, int hours, int ID){
        fullName = name;
        shortName = initials;
        maxHours = hours;
        idNum = ID;
    }
    
    // Get methods, just returns the value
    public String getFullName(){
        return fullName;
    }
    public String getShortName(){
        return shortName;
    }
    public int getMaxHours(){
        return maxHours;               
    }
    public int getIdNumber(){
        return idNum;
    }
    
    //Set methods, changes the value
    public void setFullName(String newName){
        fullName = newName;
    }
    public void setShortName(String newShortName){
        shortName = newShortName;
    }
    public void setMaxHours(int newMaxHours){
        maxHours = newMaxHours;
    }
    public void setIdNumber(int newId){
        idNum = newId;
    }
}
