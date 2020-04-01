package ecosistema;

public class Biocenosis {

	private String nombre;
	private SistemaBiologico sistemaBiologico;

	public Biocenosis(SistemaBiologico sistemaBiologico,String nombre) {
		this.sistemaBiologico = sistemaBiologico;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public SistemaBiologico getSistemaBiologico() {
		return sistemaBiologico;
	}

	public void setSistemaBiologico(SistemaBiologico sistemaBiologico) {
		this.sistemaBiologico = sistemaBiologico;
	}

	@Override
	public String toString() {
		return "Biocenosis{" +
				"nombre='" + nombre + '\'' +
				'}';
	}
}