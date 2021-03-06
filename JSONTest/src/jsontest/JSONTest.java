package jsontest;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
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
	
		/* First we take arguments from the command line to use as student info
		 * 
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter student name: ");
		String name = input.nextLine();
		
		System.out.print("Enter student ID: ");
		String id = input.nextLine();
		
		// Create JSON object
		JSONObject root = new JSONObject();
		
		// Add the info we just entered into the JSON object
		root.put("name", name);
		root.put("id", id);
		
		// Create JSON Array for courses and grades
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
		
		// add the array to the root object
		root.put("assignments", assignments);
		System.out.println(root.toJSONString());
		System.out.println();
		
		/* Writes the JSON Object into a file called "StudentGrades.json"
		 * 
		 */
		
		File file = new File("StudentGrades.json");
		
		try (PrintWriter writer = new PrintWriter(file)) {
			writer.print(root.toJSONString());
		} catch (FileNotFoundException ex) {
			System.out.println(ex.toString());
		}
		
		
		/* Now we parse the JSON file we just created into regular Java objects
		 * 
		 */
		JSONParser parser = new JSONParser();
		
		try {
			Object obj = parser.parse(new FileReader("StudentGrades.json"));
			
			JSONObject jsonObject = (JSONObject) obj;
			
			String student_name = (String) jsonObject.get("name");
			System.out.println(student_name);
			
			String student_id = (String) jsonObject.get("id");
			System.out.println(student_id);
			
			JSONArray student_grades = (JSONArray) jsonObject.get("assignments");
			ArrayList<String> list = new ArrayList<String>();
			for (int i = 0; i < student_grades.size(); i++) {
				list.add(student_grades.get(i).toString());
			}
			System.out.println(list);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
