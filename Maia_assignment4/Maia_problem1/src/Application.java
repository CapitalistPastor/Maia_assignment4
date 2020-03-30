import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class Application {
	public static void main (String args[]) {

		String localDir = System.getProperty("user.dir");
		File problemFile = new File(localDir + "\\Desktop\\developer\\Maia_assignment4\\problem1.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(problemFile));
		String st; 
		  while ((st = br.readLine()) != null) 
		    System.out.println(st); 
	}
}
