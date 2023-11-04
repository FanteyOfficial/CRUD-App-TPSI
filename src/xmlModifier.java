import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class xmlModifier {
    public static void main(String[] args) {
        ArrayList<ScuolaMaterna> scuoleMaterne = new ArrayList<>();

        ScuolaMaterna sm1 = new ScuolaMaterna(
                "257543657",
                "Asilo Comunale di Pieve di Sinalunga",
                new Comune(
                        new Classe(
                                "Lorenzo_1",
                                "5IA"
                        ),
                        "52033"
                ),
                "52",
                "9",
                2008,
                "2008-04-14T13:44:53Z",
                "11.741567",
                "43.2160801"
        );

        ScuolaMaterna sm2 = new ScuolaMaterna(
                "354540218",
                "Muzio Gallo",
                new Comune(
                        new Classe(
                                "Lorenzo_2",
                                "5IA"
                        ),
                        "42034"
                ),
                "42",
                "11",
                2009,
                "2009-03-07T20:15:55Z",
                "13.4768942",
                "43.4841404"
        );

        ScuolaMaterna sm3 = new ScuolaMaterna(
                "321846083",
                "Santelli",
                new Comune(
                        new Classe(
                                "Lorenzo_3",
                                "4IA"
                        ),
                        "49009"
                ),
                "49",
                "9",
                2011,
                "2011-10-28T14:35:10Z",
                "10.3153373",
                "43.5583449"
        );

        scuoleMaterne.add(sm1);
        scuoleMaterne.add(sm2);
        scuoleMaterne.add(sm3);

        try (XMLEncoder encoder = new XMLEncoder(new FileOutputStream("scuoleMaterne.xml"))) {
            encoder.writeObject(scuoleMaterne);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("ScuoleMaterne object serialized to XML successfully.");
    }
}
