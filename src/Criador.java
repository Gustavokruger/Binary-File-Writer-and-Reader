import java.io.IOException;
import java.io.PrintWriter;

public class Criador {
	
	private static final String PATH_ASCII = "C:\\Users\\est.gustavok\\Desktop\\testeASCII.txt";
	private static final String PATH_BIN = "C:\\Users\\est.gustavok\\Desktop\\testeBINARIO.bin";
	private static final int N  =1000;
	
	public static void main(String[] args) {
		
		try(PrintWriter writer = new PrintWriter(PATH_ASCII, "US-ASCII")){
			for(int i=0;i<N;i++) 
				writer.print(i);
			
		}catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//binario
		
		try(PrintWriter writer = new PrintWriter(PATH_BIN)){
			
			for(int i=0;i<N;i++)
				writer.write(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("fim");
	}
}
