import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class Gravar {

	public static void main(String[] args) {
		
		try {
			
			ObjectOutputStream w = new ObjectOutputStream(new FileOutputStream("C:\\Users\\est.gustavok\\Desktop\\testeBINARIO.bin"));
			
			int N = 1000;
			
			for(int i=0;i<N;i++) {
				
				w.writeInt(i);
			}
			
			w.close();
			
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}
		
		//ASCII
		
		try {
			
			PrintWriter writ = new PrintWriter(new FileWriter("C:\\Users\\est.gustavok\\Desktop\\testeASCII.txt"));
			
			int N = 1000;
			
			for(int i=0;i<N;i++) {
				
				writ.print(i);
				
			}
			
			writ.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("fim");
		
		

	}

}
