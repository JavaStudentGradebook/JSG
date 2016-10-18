package csv_reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CSVReader {

	public static void main(String[] args) {
		String csvFile = "grades.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		
		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				String[] grade = line.split(cvsSplitBy);
				
				System.out.println(grade[0] + "\t" + grade[1] + "\t" + grade[2] + "\t" + grade[3] + "\t" + grade[4] + "\t" + grade[5] + "\t" + grade[6] + "\t" + grade[7]);
			}
			
		} catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
			
		}

	}

}
