package ecosistema;

import java.util.*;

public class Ecosistema extends SistemaBiologico {

	Collection<FactorBiotico> factoresBioticos;
	Collection<FactorAbiotico> factoresAbioticos;

	public Ecosistema(String nombre){
		super(nombre);
	}
}