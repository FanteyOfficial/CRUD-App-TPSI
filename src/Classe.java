import java.io.Serializable;

public class Classe implements Serializable {
    private String nome;
    private String classe;

    public void setClasse(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
    }

    public String getNome() {
        return this.nome;
    }
    public String getClasse() {
        return classe;
    }
}
