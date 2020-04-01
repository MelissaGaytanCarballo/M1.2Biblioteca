package ecosistema;

public class Organismo {

	private Biotopo biotopo;

    public Organismo() {
        this.biotopo = new Biotopo();
    }

    public Biotopo getBiotopo() {
        return biotopo;
    }

    public void setBiotopo(Biotopo biotopo) {
        this.biotopo = biotopo;
    }
}