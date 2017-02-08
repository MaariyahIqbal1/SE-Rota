/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insebase;
// Importing array lists
import java.util.*;
/**
 *
 * @author Doye
 */
public class INSEBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialise Arraylist to contain the employees. Arraylist chosen for
        //its auto resizing.
        ArrayList<Person> empList = new ArrayList();
        
        //Test data adding employees to the list
        empList.add(new Person("Dave Jones", "DAJ", 20, 1));
        empList.add(new Person("Will Smith", "WSM", 20, 2));
        
        // Prints all employees in the list
        for(int i = 0; i < empList.size(); i++){
            System.out.println("---------------");
            System.out.println(empList.get(i).getFullName());
            System.out.println(empList.get(i).getShortName());
            System.out.println(empList.get(i).getMaxHours());
            System.out.println(empList.get(i).getIdNumber());
        }
        // Formatting line
        System.out.println("---------------");
    }
    
}
