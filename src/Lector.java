import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lector {
	
	private String lecturaAsociacion;
	private String[] arrayAsociacion;
	private String lecturaTraduccion;
	
	public Lector() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getArrayAsociacion(int i) {
		return arrayAsociacion[i];
	}

	public void setArrayAsociacion(String[] arrayAsociacion) {
		this.arrayAsociacion = arrayAsociacion;
	}

	public void lecturaAsociacion(File texto) throws FileNotFoundException{
	        FileReader fr = new FileReader(texto);
	        @SuppressWarnings("resource")
			BufferedReader bf = new BufferedReader(fr);

	        try {
	                lecturaAsociacion = bf.readLine();
	        } catch (IOException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	        }
	        
	        arrayAsociacion = lecturaAsociacion.split(","); 
	        
	        for (int i = 0; i < arrayAsociacion.length ; i++){
	        	arrayAsociacion[i] = arrayAsociacion[i].replace(' ','(');
	        	arrayAsociacion[i] = arrayAsociacion[i].replace(' ',')');
	        }
		
	}
	
	public void lecturaTraduccion(File texto) throws FileNotFoundException{
		FileReader fr = new FileReader(texto);
        @SuppressWarnings("resource")
		BufferedReader bf = new BufferedReader(fr);

        try {
                lecturaTraduccion = bf.readLine();
        } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        
	}

	
}


