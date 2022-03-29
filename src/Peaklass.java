import java.util.ArrayList;

public class Peaklass {
    public static void main(String[] args) {
        // initsialiseerimine
        Timer taimer = new Timer();
        ArrayList<Kasutaja> kasutajad = new ArrayList<>();
        Kasutajaliides liides = new Kasutajaliides();

        // esialgne sisse logimine
        System.out.println("Sisesta kasutajanimi:");
        String sisestus = liides.päringKasutajale();
        kasutajad.add(new Kasutaja(sisestus));
        Kasutaja aktiivneKasutaja = kasutajad.get(0);

        System.out.println();

        // põhiprogrammi tsükkel
        while (true) {
            // prindib programmi üldinfo ja annab kasutajale valikud
            System.out.println("Tervist kasutaja " + aktiivneKasutaja.getKasutajaNimi());
            System.out.println("Valikud on järgmised:");
            System.out.println("""
                    [0] - Alusta mängimist
                    [1] - Muuda kasutajat
                    [2] - Kasutaja info
                    [3] - Lõpeta programm""");

            sisestus = liides.päringKasutajale();

            System.out.println();

            // tehetele vastamise mängu voor [WIP]
            if (sisestus.equals("0")) {
                System.out.println();
                continue;
            }

            // vahetab kasutajat
            if (sisestus.equals("1")) {
                System.out.println("Sisesta kasutajanimi:");
                sisestus = liides.päringKasutajale();
                for (int i = 0; i < kasutajad.size(); i++) {
                    // kontrollib kas kasutaja on juba olemas
                    if (sisestus.equals(kasutajad.get(i).getKasutajaNimi())) {
                        aktiivneKasutaja = kasutajad.get(i);
                        break;
                    }
                    // kui kasutajanimi on uus, salvestab selle
                    if (i == kasutajad.size() - 1) {
                        kasutajad.add(new Kasutaja(sisestus));
                        aktiivneKasutaja = kasutajad.get(kasutajad.size() - 1);
                    }
                }
                System.out.println();
                continue;
            }

            // prindib ekraanile aktiivse kasutaja andmed
            if (sisestus.equals("2")) {
                System.out.println(aktiivneKasutaja);
                System.out.println("Jätkamiseks vajutage sisestusklahvi");
                liides.päringKasutajale();
                continue;
            }

            // programm lõpetab töö
            if (sisestus.equals("3")) {
                System.out.println("Programmi lõpp...");
                break;
            }

            // olukord, kus kasutaja sisestas ootamatu väljundi
            System.out.println("Ei saanud sisestusest aru, proovi uuesti.");
            System.out.println();
        }
    }
}
