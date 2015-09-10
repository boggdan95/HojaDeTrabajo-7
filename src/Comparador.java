/**
 *
 * @author Boggdan Barrientos, Bryan Chan, Christopher
 */

public class Comparador {
	public int comparar(String palabra1, String palabra2){
		char[] palabra1Array = palabra1.toCharArray();
		char[] palabra2Array = palabra2.toCharArray();
		
		int baseLenght;
		if(palabra1.length()<palabra2.length()){
			baseLenght = palabra1.length();
		} else {
			baseLenght = palabra2.length();
		}
		
		
		//Se compara letra por letra
		for(int i=0; i<baseLenght; i++){
			if(palabra1Array[i]<palabra2Array[i]){
				return 1;
			}
			
			if(palabra1Array[i]>palabra2Array[i]){
				return -1;
			}
		}
		
		//Si no ha sido posible definir la comparacion unicamente se compara la cantidad de letras
		if(palabra1Array.length<palabra2Array.length){
			return 1;
		}
		if(palabra1Array.length>palabra2Array.length){
			return -1;
		}
		if(palabra1Array.length==palabra2Array.length){
			return 0;
		}
		
		return 2;
	}
}
