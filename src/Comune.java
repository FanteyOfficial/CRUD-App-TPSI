import java.io.Serializable;
public class Comune implements Serializable {
    private Classe c;
    private String codiceComune;

    public Comune() {

    }
    public Comune(Classe c, String codiceComune) {
        this.c = c;
        this.codiceComune = codiceComune;
    }

    public void setClasse(Classe c) {
        this.c = c;
    }

    public void setCodiceComune(String codiceComune) {
        this.codiceComune = codiceComune;
    }

    public Classe getClasse() {
        return this.c;
    }

    public String getCodiceComune() {
        return this.codiceComune;
    }
}
