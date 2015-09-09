
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeSet arbolTraductor = new BinaryTreeSet();


		arbolTraductor.addTranslation("Phone","Telefono");
		arbolTraductor.addTranslation("Tree","Arbol");
		arbolTraductor.addTranslation("Bee","Abeja");
		arbolTraductor.addTranslation("Zero","Cero");
		arbolTraductor.addTranslation("Car", "Carro");
		System.out.println("Cantidad de palabras en el diccionario: "+arbolTraductor.getWordsQuantity());
		
		arbolTraductor.resetIterator();
		while(arbolTraductor.hasNext()){
			Asociacion temp = arbolTraductor.next();
			System.out.println("English: "+temp.getKey()+" Spanish: "+temp.getValue());
		}
	}

}
