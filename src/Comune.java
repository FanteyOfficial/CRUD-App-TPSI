import java.io.Serializable;

public class Comune implements Serializable {
    private Classe c;
    private String codiceComune;
    public void setClasse(Classe c) {
        this.c = c;
    }

    public void setCodiceComune(String s) {
        this.codiceComune = s;
    }
    public Classe getClasse() {
        return this.c;
    }

    public String getCodiceComune() {
        return this.codiceComune;
    }
}