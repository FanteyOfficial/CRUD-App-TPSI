import java.io.Serializable;

public class Classe implements Serializable {
    private String nome;
    private String classe;

    public Classe () {

    }
    public Classe(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }
}

