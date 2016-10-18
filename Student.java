/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;

import java.util.*;

/**
 *
 * @author justinlesko
 */


public class Student {
    private String fname;
    private String lname;
    private String id;
    private List<Assignment> Assignments = new ArrayList<Assignment>();
    
    Student() {
        fname = "";
        lname = "";
    }
    Student(String first, String last, String idNum) {
        fname = first;
        lname = last;
        id = idNum;
    }
    public void printMembers() {
        System.out.printf("%s %s %s\n", fname, lname, id);
    }
    public Assignment searchAssignment( String n ) {
        Assignment tmp = null;
        for (int i = 0; i < Assignments.size(); i++) {
            if (Assignments.get(i).getAssignmentName() == n)
                tmp = Assignments.get(i);
        }
        return tmp;
    }
    public String getFirstName(){
        return fname;
    }
    public String getLastName(){
        return lname;
    }
    public void addAssignment(String n, int t, int g) {
        Assignments.add(new Assignment(n, t, g));
    }
    
}
