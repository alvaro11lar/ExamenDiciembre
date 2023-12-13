package ejercicio3.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ejercicio3.entity.Producto;

public class ProductoDAO extends ConexionDAO{
	
//private static final Logger logger = LogManager.getLogger(BibliotecaDAO.class);
	

	public ProductoDAO() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Producto> getBibliotecas () throws SQLException {
		
		List<Producto> productos = new ArrayList<Producto>();

		Statement stmt = this.getConexion().createStatement();
		String query = "SELECT ID, NOMBRE, TIPO_PRODUCTO,PRECIO, STOCK FROM TB_PRODCUTOS";
		
		ResultSet rs = stmt.executeQuery(query);
		
		while (rs.next()) {
			int idProducto = rs.getInt("ID");
			String nombreProducto = rs.getString("NOMBRE");
			String tipoProducto = rs.getString("TIPO_PRODUCTO");
			double precio = rs.getDouble("PRECIO");
			int stock = rs.getInt("STOCK");

			Producto producto = new Producto(idProducto,nombreProducto,tipoProducto,precio,stock);
			
			productos.add(producto);
		}
		
		return productos;
	}
	
	
	
	
	public int insertarBiblioteca(Producto producto) throws SQLException {
		//logger.debug("insertarBiblioteca "+biblioteca);

		String query = "INSERT "
				+ "INTO TB_PRODUCTOS (NOMBRE,TIPO_PRODUCTO,PRECIO,STOCK) "
				+ "VALUES (?,?,?,?)";	
		
		//logger.debug("query: "+query);
		PreparedStatement ps = this.getConexion().prepareStatement(query);
		ps.setString(1, producto.getNombre());
		ps.setString(2, producto.getTipo());
		ps.setDouble(3, producto.getPrecio());
		ps.setInt(4, producto.getStock());
		
		
		int insertados = ps.executeUpdate();
		//logger.debug("Bibliotecas insertadas "+insertados);
		
		return insertados;
	}
	
	public List<String[]> funcionExtra() throws SQLException{
		String query = "SELECT TIPO_PRODUCTO, AVG(PRECIO), COUNT(TIPO_PRODUCTO) FROM TB_PRODUCTOS GROUP BY TIPO_PRODUCTO";
		Statement stmt = this.getConexion().createStatement();
		ResultSet rs = stmt.executeQuery(query);
		List<String[]> filas = new ArrayList<String[]>();
		
		while (rs.next()) {
			String tipo = rs.getString("TIPO_PRODUCTO");
			String avrg = String.valueOf(rs.getDouble("AVG(PRECIO)"));
			String count = String.valueOf(rs.getInt("COUNT(TIPO_PRODUCTO)"));
			String[] array = new String[3];
			array[0]= tipo;
			array[1]= avrg;
			array[2]= count;
			
			filas.add(array);
		
		}
		return filas;
		
	}
	

}
