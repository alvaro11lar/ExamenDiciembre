package  ejercicio1;

public class Master extends CursoImpl{
	
	private boolean isOficial;

	public Master(String nombre, int codigo, int cupoMaximo, boolean isOficial) {
		super(nombre, codigo, cupoMaximo);
		this.isOficial=isOficial;
	}

	@Override
	public String obtenerNombre() {
		
		return this.getNombre();
	}

	@Override
	public int obtenerCodigo() {
		// TODO Auto-generated method stub
		return this.getCodigo();
	}

	@Override
	public boolean isOficial() {
		return this.isOficial();
	}

	
}
