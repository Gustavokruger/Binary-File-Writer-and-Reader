import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeitorBIn {

	public static void main(String[] args ) throws IOException {
		
		FileInputStream arq = new FileInputStream("C:\\Users\\est.gustavok\\eclipse-workspace\\SO\\src\\testeBINARIO.bin");
		ObjectInputStream in = new ObjectInputStream(arq);
		
		for(int i=0;i<1000;i++) {
			System.out.println(in.readInt());
		}

		
		

	}

}
