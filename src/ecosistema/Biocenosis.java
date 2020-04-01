package ecosistema;

public class Biocenosis {

	private SistemaBiologico sistemaBiologico;

	public Biocenosis(SistemaBiologico sistemaBiologico) {
		this.sistemaBiologico = sistemaBiologico;
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
                "sistemaBiologico=" + sistemaBiologico +
                '}';
    }
}