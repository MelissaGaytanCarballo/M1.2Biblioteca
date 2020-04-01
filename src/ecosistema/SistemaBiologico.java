package ecosistema;

import java.util.*;

public class SistemaBiologico {

	private Collection<Biocenosis> biocenosies;
	private Collection<Biotopo> biotopos;

	public SistemaBiologico() {
		this.biocenosies = new Collection<Biocenosis> ();
		this.biotopos = new Collection<Biotopo>();
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
				"biocenosies=" + biocenosies +
				", biotopos=" + biotopos +
				'}';
	}
}