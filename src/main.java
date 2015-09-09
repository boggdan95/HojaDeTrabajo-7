import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		BinaryTreeSet arbolTraductor = new BinaryTreeSet();
		Lector lector = new Lector();

		lector.lecturaAsociacion("diccionario.txt");
		System.out.println("Traduccion: ");
		System.out.println(lector.lecturaTraduccion("texto.txt"));
		
		
		//Bloque de codigo para revisar la cantidad de palabras en el diccionario (arbol)////////////////////////////
		System.out.println("Cantidad de palabras en el diccionario: "+lector.getArbol().getWordsQuantity());
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//Bloque de codigo para recorrido in-order del arbol traductor (Devuelve en orden alfabetico segun la 
		//palabra en ingles//////////////////////////////////////////////////////////////////////////////////////////
		lector.getArbol().resetIterator();
		while(lector.getArbol().hasNext()){
			Asociacion temp = lector.getArbol().next();
			System.out.println("English: "+temp.getKey()+" Spanish: "+temp.getValue());
		}
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	}

}
