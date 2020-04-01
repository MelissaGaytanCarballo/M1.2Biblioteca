package ecosistema;

import java.util.*;

public class SistemaBiologico {

	private String nombre;
	private Collection<Biocenosis> biocenosies;
	private Collection<Biotopo> biotopos;

	public SistemaBiologico(String nombre) {
		this.nombre = nombre;
		this.biocenosies = new Collection<Biocenosis> ();
		this.biotopos = new Collection<Biotopo>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Collection<Biocenosis> getBiocenosies() {
		return biocenosies;
	}

	public void setBiocenosies(Collection<Biocenosis> biocenosies) {
		this.biocenosies = biocenosies;
	}

	public Collection<Biotopo> getBiotopos() {
		return biotopos;
	}

	public void setBiotopos(Collection<Biotopo> biotopos) {
		this.biotopos = biotopos;
	}

	@Override
	public String toString() {
		return "SistemaBiologico{" +
				"nombre='" + nombre + '\'' +
				", biocenosies=" + biocenosies +
				", biotopos=" + biotopos +
				'}';
	}
}