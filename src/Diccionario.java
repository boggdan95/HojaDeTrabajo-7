import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Diccionario {
	
	private String lectura;

	
	public String[] lecturaAsociacion(File texto) throws FileNotFoundException{
	        FileReader fr = new FileReader(texto);
	        @SuppressWarnings("resource")
			BufferedReader bf = new BufferedReader(fr);

	        try {
	                lectura = bf.readLine();
	        } catch (IOException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	        }
		
		return null;
		
	}
	
}


