package ecosistema;

import java.util.*;

public class Biotopo {

	private String nombre;
	private SistemaBiologico sistemaBiologico;
	private Collection<Organismo> organismos;

	public Biotopo(SistemaBiologico sistemaBiologico, Collection<Organismo> organismos,String nombre) {
		this.sistemaBiologico = sistemaBiologico;
		this.organismos = organismos;
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

	public Collection<Organismo> getOrganismos() {
		return organismos;
	}

	public void setOrganismos(Collection<Organismo> organismos) {
		this.organismos = organismos;
	}

	@Override
	public String toString() {
		return "Biotopo{" +
				"nombre='" + nombre + '\'' +
				'}';
	}
}