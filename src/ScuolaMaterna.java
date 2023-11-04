import java.io.Serializable;
import java.util.ArrayList;

public class ScuolaMaterna implements Serializable {
    private String openStreetMapId;
    private String nome;
    private Comune comune;
    private String provincia;
    private String regione;
    private int annoInserimento;
    private String dataOraInserimento;
    private String longitudine;
    private String latitudine;

    public ScuolaMaterna() {

    }

    public ScuolaMaterna(String openStreetMapId, String nome, Comune comune,
                         String provincia, String regione, int annoInserimento,
                         String dataOraInserimento, String longitudine, String latitudine) {
        this.openStreetMapId = openStreetMapId;
        this.nome = nome;
        this.comune = comune;
        this.provincia = provincia;
        this.regione = regione;
        this.annoInserimento = annoInserimento;
        this.dataOraInserimento = dataOraInserimento;
        this.longitudine = longitudine;
        this.latitudine = latitudine;
    }

    public void setOpenStreetMapId(String s) {
        this.openStreetMapId = s;
    }
    public void setNome(String s) {
        this.nome = s;
    }
    public void setComune(Comune c) {
        this.comune = c;
    }
    public void setProvincia(String s) {
        this.provincia = s;
    }
    public void setRegione(String regione) {
        this.regione = regione;
    }
    public void setAnnoInserimento(int annoInserimento) {
        this.annoInserimento = annoInserimento;
    }
    public void setDataOraInserimento(String dataOraInserimento) {
        this.dataOraInserimento = dataOraInserimento;
    }
    public void setLongitudine(String longitudine) {
        this.longitudine = longitudine;
    }
    public void setLatitudine(String latitudine) {
        this.latitudine = latitudine;
    }
    public String getOpenStreetMapId() {
        return openStreetMapId;
    }

    public String getNome() {
        return nome;
    }
    public Comune getComune() {
        return comune;
    }
    public String getProvincia() {
        return provincia;
    }
    public String getRegione() {
        return regione;
    }
    public int getAnnoInserimento() {
        return annoInserimento;
    }
    public String getDataOraInserimento() {
        return dataOraInserimento;
    }
    public String getLongitudine() {
        return longitudine;
    }
    public String getLatitudine() {
        return latitudine;
    }
}
