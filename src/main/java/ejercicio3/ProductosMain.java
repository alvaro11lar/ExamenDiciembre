package ejercicio3;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import ejercicio3.DAO.ProductoDAO;
import ejercicio3.entity.Producto;


public class ProductosMain {
	public static void main(String[] args) {
		try {
			ProductoDAO p = new ProductoDAO();
//			Producto p1 = new Producto(1,"p1","ALIMNETACION",25,10);
//			Producto p2 = new Producto(2,"p2","ALIMNETACION",35,20);
//			Producto p3 = new Producto(3,"p3","ELCTRONICA",45,30);
//			Producto p4 = new Producto(4,"p4","ELCTRONICA",55,40);
//			Producto p5 = new Producto(5,"p5","ROPA",55,50);
//			Producto p6 = new Producto(6,"p6","ROPA",65,60);
//			
//			List<Producto> productos = Arrays.asList(p1,p2,p3,p4,p5,p6);
//			
//			for (Producto producto : productos) {
//				p.insertarBiblioteca(producto);
//			}
			
			ProductosMain pp = new ProductosMain();
			pp.mostrar(p);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public void mostrar(ProductoDAO p) {
		try {
			List<String[]> filas = p.funcionExtra();
			for (String[] strings : filas) {
				System.out.println(strings[0] + " " + strings[1] + " " + strings[2]);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	



	
}
