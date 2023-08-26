import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList {
	public static void main(String[] args) {

//		Check arguments
		if(args[0].equals("a")) {
			System.out.println("Loading data ...");			
			try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String dataLine = reader.readLine();
			String i[] = dataLine.split(",");
			for(String j : i) { System.out.println(j); }
			} catch (Exception e){} 
			System.out.println("Data Loaded.");
		}
		else if(args[0].equals("r")) 
		{
			System.out.println("Loading data ...");			
			try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String dataLine = reader.readLine();
			System.out.println(r);
			String i[] = dataLine.split(",");
			Random x = new Random();
				int y = x.nextInt();
					System.out.println(i[y]);
			} catch (Exception e){} 
			System.out.println("Data Loaded.");			
		}
		else if(args[0].contains("+")){
			System.out.println("Loading data ...");			
			try {
			BufferedWriter reader = new BufferedWriter(
					new FileWriter("students.txt", true));
			String t = args[0].substring(1);
	        Date currentDATE= new Date();
	        String datePattern = "dd/mm/yyyy-hh:mm:ss a";
	        DateFormat dateFormat = new SimpleDateFormat(df);
	        String formattedDate= dateFormat.format(d);
			s.write(", "+t+"\nList last updated on "+fd);
			s.close();
			} catch (Exception e){}
							
			System.out.println("Data Loaded.");	
		}
		else if(args[0].contains("?")) 
		{
			System.out.println("Loading data ...");			
			try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String dataLine = reader.readLine();
			String i[] = dataLine.split(",");
			boolean done = false;
			String t = args[0].substring(1);
			for(int idx = 0; idx<i.length && !done; idx++) {
				if(i[idx].equals(t)) {
					System.out.println("We found it!");
						done=true;
				}
			}
			} catch (Exception e){} 
			System.out.println("Data Loaded.");				
		}
		else if(args[0].contains("c")) 
		{
			System.out.println("Loading data ...");			
			try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String D = reader.readLine();
			char a[] = D.toCharArray();			
			boolean in_word = false;
			int count=0;
			for(char c:a) {
				if(c ==' ') 
				{
					if (!in_word) {	count++; in_word =true;	}
					else { in_word=false;}			
				}
			}
			System.out.println(count +" word(s) found " + a.length);
			} catch (Exception e){} 
			System.out.println("Data Loaded.");				
		}
	}
}