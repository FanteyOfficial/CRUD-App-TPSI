import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class xmlReader {
    public static void main(String[] args) {
        // Deserialize the XML data using XMLDecoder
        ArrayList<ScuolaMaterna> scuoleMaterne = new ArrayList<>();

        try (XMLDecoder decoder = new XMLDecoder(new FileInputStream("scuoleMaterne.xml"))) {
            scuoleMaterne = (ArrayList<ScuolaMaterna>) decoder.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the deserialized data
        for (ScuolaMaterna scuolaMaterna : scuoleMaterne) {
            System.out.println("OpenStreetMapId: " + scuolaMaterna.getOpenStreetMapId());
            System.out.println("Nome: " + scuolaMaterna.getNome());
            System.out.println("Provincia: " + scuolaMaterna.getProvincia());
            System.out.println("Regione: " + scuolaMaterna.getRegione());
            System.out.println("AnnoInserimento: " + scuolaMaterna.getAnnoInserimento());
            System.out.println("DataOraInserimento: " + scuolaMaterna.getDataOraInserimento());
            System.out.println("Longitudine: " + scuolaMaterna.getLongitudine());
            System.out.println("Latitudine: " + scuolaMaterna.getLatitudine());
            System.out.println("Comune CodiceComune: " + scuolaMaterna.getComune().getCodiceComune());
            System.out.println("Classe Nome: " + scuolaMaterna.getComune().getClasse().getNome());
            System.out.println("Classe Classe: " + scuolaMaterna.getComune().getClasse().getClasse());
            System.out.println("-----");
        }
    }
}
