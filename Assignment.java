/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;

/**
 *
 * @author justinlesko
 */
public class Assignment {
    private String name;
    private int total;
    private int grade;
    
    public Assignment() {
        name = "";
        total = 0;
        grade = 0;
    }
    public Assignment(String n, int t, int g) {
        name = n;
        total = t;
        grade = g;
    }
    public String getAssignmentName() {
        return name;
    }
    public void printMembers() {
        System.out.printf("Name: %s\nTotal:%d\nGrade:%d\n", name, total, grade);
    }
}
