package ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Fichero {
	
	public List<String> leerFichero(String ruta) {
		
			StringBuilder sb = new StringBuilder();
			File archivo = new File(ruta);
			List<String> lineas = new ArrayList<String>();

	        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){

	            String linea;
	            while ( (linea = reader.readLine()) != null){
	            	lineas.add(linea);
	                
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }	
	        
	        //SSystem.out.println(lineas.size());
	        return lineas;
	}
	
	public Map<Integer,String> guardarEnMapas(List<String> lineas) {
		Map<Integer,String> lines = new HashMap<Integer,String>();
		for (int i=0 ; i<lineas.size() ; i++) {
			if(lineas.get(i).contains("Java")) {
				lines.put(i+1, lineas.get(i));
			}
		}
		 return lines;	
	}

	
	public void mostarNumLinea(Map<Integer,String> lineas){
		
		for (int key : lineas.keySet()) {
			System.out.println(key);
		}
		
	
	}
	
	public void suma(Map<Integer,String> lineas) {
		for (Entry<Integer, String> lines : lineas.entrySet()) {
			int linea= 1;
			int key = lines.getKey();
			int valor = lines.getValue().length();
			System.out.println("En la linea " + linea + " hay " + (key + valor));
			linea++;
		}
	}
}
