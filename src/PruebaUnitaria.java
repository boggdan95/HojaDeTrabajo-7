import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

public class PruebaUnitaria {

	@Test
	public void test() throws FileNotFoundException {
		fail("Not yet implemented");
		
		Lector lector = new Lector();
		
		lector.lecturaAsociacion("diccionario.txt",5);
		
	}
}
