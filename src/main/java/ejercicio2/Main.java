package ejercicio2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Fichero fichero = new Fichero();
		List<String> lineas = fichero.leerFichero("./examen/FicheroEjercicio2.txt");
		Map<Integer,String> lines = fichero.guardarEnMapas(lineas);
		Set<Integer> claves = lines.keySet();
		fichero.mostarNumLinea(lines);
		fichero.suma(lines);
		

	}

}
