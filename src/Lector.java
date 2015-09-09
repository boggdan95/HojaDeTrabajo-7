import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lector {
	
	private String lecturaAsociacion;
	private String[] arrayIngles = new String[100];
	private String[] arrayEspanol = new String[100];
	private String lecturaTraduccion;
	
	public Lector() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * Gets the array ingles.
	 *
	 * @param i the i
	 * @return the array ingles
	 */
	public String getArrayIngles(int i) {
		return arrayIngles[i];
	}



	/**
	 * Sets the array ingles.
	 *
	 * @param arrayIngles the new array ingles
	 */
	public void setArrayIngles(String[] arrayIngles) {
		this.arrayIngles = arrayIngles;
	}



	/**
	 * Gets the array espanol.
	 *
	 * @param i the i
	 * @return the array espanol
	 */
	public String getArrayEspanol(int i) {
		return arrayEspanol[i];
	}



	/**
	 * Sets the array espanol.
	 *
	 * @param arrayEspanol the new array espanol
	 */
	public void setArrayEspanol(String[] arrayEspanol) {
		this.arrayEspanol = arrayEspanol;
	}



	/**
	 * Lectura asociacion.
	 *
	 * @param string the string
	 * @param numero the numero
	 * @throws FileNotFoundException the file not found exception
	 */
	public void lecturaAsociacion(String string, int numero) throws FileNotFoundException{
	        FileReader fr = new FileReader(string);
	        @SuppressWarnings("resource")
			BufferedReader bf = new BufferedReader(fr);
	       
	        boolean fin = false;
	        StringBuffer sbf = new StringBuffer();
	        int i = 0;
	        try {
	        	
	        	while( i < numero ){
	            	   String linea = bf.readLine() ;
					   sbf.append(linea);
					   int coma = linea.indexOf(',');
	       	           String p1 = linea.substring(1,coma);
	       	           String p2 = linea.substring(coma+1,linea.length() -1);
					       	     arrayIngles[i] = p1;
					       	     arrayEspanol[i] = p2;
					   i++;
					   
					   
	        	}	               
	        }
	         catch (IOException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	        }      
	               
	        
	}
	
	/**
	 * Lectura traduccion.
	 *
	 * @param texto the texto
	 * @throws FileNotFoundException the file not found exception
	 */
	//EN ESTE HAY QUE TRABAJAR
	public void lecturaTraduccion(String texto) throws FileNotFoundException{
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


