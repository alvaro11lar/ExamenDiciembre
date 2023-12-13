package ejercicio1;

public abstract class CursoImpl implements Curso{
	
	private String nombre;
	private int codigo;
	private int cupoMaximo;
	
	public CursoImpl(String nombre, int codigo, int cupoMaximo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.cupoMaximo = cupoMaximo;
	}

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public int getCupoMaximo() {
		return cupoMaximo;
	}


	public void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}
	
	
}
