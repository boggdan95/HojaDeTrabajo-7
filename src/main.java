import java.io.FileNotFoundException;
import java.util.Scanner;

public class main{

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		BinaryTreeSet arbolTraductor = new BinaryTreeSet();
		Lector lector = new Lector();
		
		int numero = 0;
		int a = 0;
		
		while(a == 0){
        System.out.println("Bienvenido a la calculadora");
        System.out.println("Ingrese el numero de traducciones a ingresar:");
        
        @SuppressWarnings("resource")
		Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        try {
			numero = entradaEscaner.nextInt();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("POR FAVOR! Ingrese un número");
			a = 0;
		}
       try {
		if (numero > 0 ){
		    	a = 1;
		   }
		   else{
			   a =0;
		   }
		}
        catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("POR FAVOR! Ingrese un número");
		a = 0;
        	}
	    }
		
		
		lector.lecturaAsociacion("diccionario.txt",6);
		
		 for(int e=0; e < 6; e++){
			  arbolTraductor.addTranslation(lector.getArrayIngles(e),lector.getArrayEspanol(e));
          }
		
		//Bloque de codigo ejemplo para obtener la traduccion de una palabra/////////////////////////////////////////
		System.out.println("La traduccion de Phone es "+arbolTraductor.getTranslation("Phone"));
		//(SI LA PALABRA NO ESTA EN EL DICCIONARIO, EL METODO getTranslation() devolvera NULL, por lo que tienen que
		//poner la palabra original en ingles pero entre asteriscos (Hacen un if si es null)
		System.out.println("La traduccion de Computer es "+arbolTraductor.getTranslation("Computer"));
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//Bloque de codigo para revisar la cantidad de palabras en el diccionario (arbol)////////////////////////////
		System.out.println("Cantidad de palabras en el diccionario: "+arbolTraductor.getWordsQuantity());
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//Bloque de codigo para recorrido in-order del arbol traductor (Devuelve en orden alfabetico segun la 
		//palabra en ingles//////////////////////////////////////////////////////////////////////////////////////////
		arbolTraductor.resetIterator();
		while(arbolTraductor.hasNext()){
			Asociacion temp = arbolTraductor.next();
			System.out.println("English: "+temp.getKey()+" Spanish: "+temp.getValue());
		}
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	}

}
