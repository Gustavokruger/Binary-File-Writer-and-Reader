import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;


public class LeitorASCII {
  public static void main(String [] args) {
	
	  try {
		BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\est.gustavok\\eclipse-workspace\\SO\\src\\testeASCII.txt"));
		
			System.out.println(in.readLine());
			
				
			while(in.readLine() != null) {
				
				System.out.println(in.readLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

   
  }
}
