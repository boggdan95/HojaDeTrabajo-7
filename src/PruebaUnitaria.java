import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class PruebaUnitaria {

	@Test
	public void test() throws IOException {
		fail("Not yet implemented");
		
		Lector lector = new Lector();
		BinaryTreeSet arbolTraductor = new BinaryTreeSet(); 
		
		lector.lecturaAsociacion("diccionario.txt");
		
		arbolTraductor.addTranslation("Phone","Telefono");
		arbolTraductor.addTranslation("Zeta","Zeta");
		arbolTraductor.addTranslation("Tree","Arbol");
		arbolTraductor.addTranslation("Bee","Abeja");
		arbolTraductor.addTranslation("Zero","Cero");
		arbolTraductor.addTranslation("Car", "Carro");
		
		
		assertEquals("Telefono", arbolTraductor.getTranslation("Phone"));
		assertEquals("Zeta", arbolTraductor.getTranslation("Zeta"));
		assertEquals("Telefono", arbolTraductor.getTranslation("Tree"));
		assertEquals("Abeja", arbolTraductor.getTranslation("Bee"));
		assertEquals("Cero", arbolTraductor.getTranslation("Zero"));
		assertEquals("Carro", arbolTraductor.getTranslation("Car"));
		
		
	}
}
