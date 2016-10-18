/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;
import java.io.*;
import java.util.*;

/**
 *
 * @author justinlesko
 */
public class Gradebook {
    private List<String> classList = new ArrayList<String>();
    private List<Student> studentList = new ArrayList<Student>();
    private List<AssignmentType> assignmentTypes = new ArrayList<AssignmentType>();
   
    public static void main(String[] args) throws FileNotFoundException {
        Gradebook g1 = new Gradebook();
        g1.createClassList();
        
        Student temp = g1.searchStudentList("Emily", "Belmonte");
        if (temp == null) {
            System.out.println("Student not found.");
        }
        else
            temp.printMembers();
        temp.addAssignment("homework 1", 100, 85);
        Assignment a1= temp.searchAssignment("homework 1");
        
        if (a1 != null) {
            a1.printMembers();
        }
        
        
        
        g1.createGradeSchema();
        
    }
    
    public void createClassList() throws FileNotFoundException {
        try{
            FileReader input = new FileReader("/Users/justinlesko/NetBeansProjects/Gradebook/class_list.txt");
            BufferedReader buf = new BufferedReader(input);
            
            String line;
            
            while((line = buf.readLine()) != null) {
                String temp = line;
                String[] parts = temp.split(" ");
                studentList.add(new Student(parts[0], parts[1], parts[2]));
            }
            for (int i = 0; i < studentList.size(); i++) {
                Student s = studentList.get(i);
                s.printMembers();
            }
        }
        catch(IOException ex) {
            System.out.println(ex.toString());
        }
    }
    public String getStudent(int index) {
        return classList.get(index);
    }
    
    public void createGradeSchema() {
        System.out.println("Enter the different types of assignments delimited by commas:");
        Scanner input = new Scanner(System.in);
        String assignments = input.nextLine();
        String[] tmp = assignments.split(",\\s*");
        
        for (int i = 0; i < tmp.length; i++){
            System.out.printf("What percentage is %s worth? (enter number)\n", tmp[i]);
            int weight = input.nextInt();
            assignmentTypes.add(new AssignmentType(tmp[i], weight));
            
            for (int k = 0; k < assignmentTypes.size(); k++)
                assignmentTypes.get(k).print();
        }
   
    }
    public Student searchStudentList(String f, String l) {
        Student tmp = null;
        
        for (int i = 0; i < studentList.size(); i ++) {
            System.out.printf("Searching index: %d\n", i);
            System.out.printf("Looking for %s, current is %s\n", f, studentList.get(i).getFirstName());
            
            if (studentList.get(i).getFirstName().equals(f) ) {
                System.out.printf("Found student named %s\n", f);
                if (studentList.get(i).getLastName().equals(l)) {
                    System.out.printf("Found student with the last name %s\n", l);
                    tmp = studentList.get(i);
                    break;
                }
            }
        }
        return tmp;
    }

}
