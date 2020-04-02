package ecosistema;

import java.util.*;

public class Biocenosis {

	private String nombre;
	private SistemaBiologico sistemaBiologico;
	private Collection<FactorAbiotico> factoresAbioticos;
	private Collection<FactorBiotico> factoresBioticos;

	public Biocenosis(SistemaBiologico sistemaBiologico,String nombre) {
		this.sistemaBiologico = sistemaBiologico;
		this.factoresAbioticos = new Collection<FactorAbiotico>();
		this.factoresBioticos = new Collection<FactorBiotico>();
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

	public Collection<FactorAbiotico> getFactoresAbioticos() {
		return factoresAbioticos;
	}

	public void setFactoresAbioticos(Collection<FactorAbiotico> factoresAbioticos) {
		this.factoresAbioticos = factoresAbioticos;
	}

	public Collection<FactorBiotico> getFactoresBioticos() {
		return factoresBioticos;
	}

	public void setFactoresBioticos(Collection<FactorBiotico> factoresBioticos) {
		this.factoresBioticos = factoresBioticos;
	}

	@Override
	public String toString() {
		return "Biocenosis{" +
				"nombre='" + nombre + '\'' +
				'}';
	}
}