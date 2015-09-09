
public class main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeSet arbolTraductor = new BinaryTreeSet();
		Lector lector = new Lector();

		//Bloque ejemplo para agregar traducciones al diccionario (Deberan extraerlas del archivo)///////////////////
		arbolTraductor.addTranslation( lector.getArrayAsociacion(0),lector.getArrayAsociacion(1));
		arbolTraductor.addTranslation("Zeta","Zeta");
		arbolTraductor.addTranslation("Tree","Arbol");
		arbolTraductor.addTranslation("Bee","Abeja");
		arbolTraductor.addTranslation("Zero","Cero");
		arbolTraductor.addTranslation("Car", "Carro");
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
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
