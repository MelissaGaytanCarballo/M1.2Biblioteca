package ecosistema;

import java.util.*;

public class Biotopo {

	private SistemaBiologico sistemaBiologico;
	private Collection<Organismo> organismos;

	public Biotopo(SistemaBiologico sistemaBiologico, Collection<Organismo> organismos) {
		this.sistemaBiologico = sistemaBiologico;
		this.organismos = organismos;
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
				"sistemaBiologico=" + sistemaBiologico +
				", organismos=" + organismos +
				'}';
	}
}