package ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
	/*System.out.println("Ingrese un codigo que desa borrar:");
	Scanner scan = new Scanner(System.in);
	int opcion = scan.nextInt();
	Main main = new Main();
	Map<Integer,Master> masters = main.crearMasters();
	main.eliminarXCodigo(opcion,masters);*/
	
	  Main main = new Main();
	  Map<Integer,Master> masters = main.crearMasters();
	  main.mostrarMast(masters);

		


	}

	public Map<Integer,Master> crearMasters() {
		Master master1 = new Master("nombre1",1,10,true);
		Master master2 = new Master("nombre2",2,20,false);
		Master master3 = new Master("nombre3",3,30,true);

		Map<Integer,Master> masters = new HashMap<Integer,Master>(); 
		masters.put(master1.getCodigo(), master1);
		masters.put(master2.getCodigo(), master2);
		masters.put(master3.getCodigo(), master3);
		System.out.println("Fure creado el mapa");
		return masters;

	}

	public void eliminarXCodigo(int codigo,  Map<Integer,Master> masters) {
		Master master = masters.get(codigo);

		if(master!=null) {
			masters.remove(codigo);
		}else {
			System.out.println("El master con codigo " + master + " no fue encontrado en el mapa");
		}

	}

	public void mostrarMast(Map<Integer,Master> masters) {

		//Stream<Master> misMasters =  masters.forEach((c,m)->System.out.println(m.); );

//		for (Entry<Integer, Master> master : masters.entrySet()) {
//			if(master.getValue().isOficial()) {
//				System.out.println(master.getValue());
//			}
//
//		}
		
		for (Integer key : masters.keySet()) {
			
			if(masters.get(key).isOficial()){
				System.out.println(masters.get(key));
			}
		}
	}

}
