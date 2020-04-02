package ecosistema;

import java.util.*;

public class Ecosistema extends SistemaBiologico {

	private Bioma bioma;
	public Ecosistema(String nombre){
		super(nombre);
	}

	public Ecosistema(String nombre, Bioma bioma) {
		super(nombre);
		this.bioma = bioma;
	}

	public Bioma getBioma() {
		return bioma;
	}

	public void setBioma(Bioma bioma) {
		this.bioma = bioma;
	}

	@Override
	public String toString() {
		return "Ecosistema{" +
				"bioma=" + bioma +
				'}';
	}
}