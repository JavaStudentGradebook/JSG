package jsontest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/* 
		 * We create a JSON object to represent the class itself, with a JSON array to hold a list of student JSON objects
		 */
		
		JSONObject classname = new JSONObject();
		JSONArray student_list = new JSONArray();
		
		/* First, let's get info about the class itself */
		Scanner class_input = new Scanner(System.in);
		
		System.out.print("Enter class name: ");
		String class_name = class_input.nextLine();
		
		System.out.print("Enter class year: ");
		String class_year = class_input.nextLine();
		
		System.out.print("Enter class semester: ");
		String class_semester = class_input.nextLine();
		
		System.out.print("Enter class size: ");
		int class_size = class_input.nextInt();
		
		classname.put("class name", class_name);
		classname.put("class year", class_year);
		classname.put("class semester", class_semester);
		classname.put("class size", class_size);
		
		
		for (int x = 0; x < class_size; x++) {
		// Create JSON object. This will represent a single student
	    JSONObject student = new JSONObject();
		
		Scanner input = new Scanner(System.in);

	    System.out.print("Enter student name: ");
	    String name = input.nextLine();

	    System.out.print("Enter student ID: ");
	    String id = input.nextLine();
	    
	 // Add the info we just entered into the JSON object
	    student.put("name", name);
	    student.put("id", id);

	    // Create JSON Array for assignments and grades
	    JSONArray assignments = new JSONArray();

	    while(true) {
	        System.out.println("Enter assignment name: ");
	        String assignment = input.nextLine();

	        // Check if user hit Enter
	        if (assignment.length() == 0) {
	            break;
	        }

	        System.out.println("Enter grade for assignment: ");
	        String grade = input.nextLine();

	        // Create a new JSON object for every assignment
	        JSONObject assgnObj = new JSONObject();
	        assgnObj.put("grade", grade);
	        assgnObj.put("name", assignment);
	        assignments.add(assgnObj);
	    }

	    // add the array to the root (student) object
	    student.put("assignments", assignments);
	 
	    student_list.add(student);
	}
		
		classname.put("students", student_list);
	    System.out.println(classname.toJSONString());
	    System.out.println();
	    
	    File file = new File("StudentGrades.json");

	    try (PrintWriter writer = new PrintWriter(file)) {
	        writer.print(classname.toJSONString());
	    } catch (FileNotFoundException ex) {
	        System.out.println(ex.toString());
	    }
	    
	    /* Now we parse the JSON file we just created into regular Java objects
		 * 
		 */
		JSONParser parser = new JSONParser();
		
		try {
			Object obj = parser.parse(new FileReader("StudentGrades.json"));
			
			JSONObject courseObject = (JSONObject) obj;
			
			String course_name = (String) courseObject.get("class name");
			System.out.println(course_name);
			
			String course_semester = (String) courseObject.get("class semester");
			System.out.println(course_semester);
			
			String course_year = (String) courseObject.get("class year");
			System.out.println(course_year);
			
			long course_size = (long) courseObject.get("class size");
			System.out.println(course_size);
			
			JSONArray students_list = (JSONArray) courseObject.get("students");
			for (int j = 0; j < course_size; j++) {
				JSONObject studentObj = (JSONObject) students_list.get(j);
				String studentObj_name = (String) studentObj.get("name");
				String studentObj_id = (String) studentObj.get("id");
				System.out.println(studentObj_name);
				System.out.println(studentObj_id);
				JSONArray studentObj_assignments = (JSONArray) studentObj.get("assignments");
				for (int x = 0; x < studentObj_assignments.size(); x++) {
					JSONObject studentObj_assignment = (JSONObject) studentObj_assignments.get(x);
					String grade = (String) studentObj_assignment.get("grade");
					String name = (String) studentObj_assignment.get("name");
					System.out.println(name + ": " + grade);
				}
				
			}
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    
	    
	    
	}
}

	    