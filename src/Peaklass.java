import java.util.ArrayList;
import java.util.List;

public class Peaklass {
    public static void main(String[] args) {
        // initsialiseerimine
        Timer taimer = new Timer();
        ArrayList<Kasutaja> kasutajad = new ArrayList<>();
        Kasutajaliides liides = new Kasutajaliides();
        Genereerija valitudRaskusaste;

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

            // mängu voor algab - tehetele vastamine
            if (sisestus.equals("0")) {
                System.out.println("Vali raskusaste:");
                System.out.println("""
                    [0] - Lihtne
                    [1] - Keskmine
                    [2] - Raske""");
                sisestus = liides.päringKasutajale();
                switch (sisestus) {
                    case "0":
                        valitudRaskusaste = new GenereerijaLihtne();
                        break;
                    case "1":
                        valitudRaskusaste = new GenereerijaKeskmine();
                        break;
                    case "2":
                        valitudRaskusaste = new GenereerijaRaske();
                        break;
                    default:
                        continue;
                }
                List<Kysimus> kysimused = new ArrayList<>();
                for(int i = 0; i < 10; i++) kysimused.add(new Kysimus(valitudRaskusaste));
                taimer.mõõdaAega();
                for (int i = 0; i < 10; i++) {
                    Kysimus kysimus = kysimused.get(i);
                    kysimus.genereeriKysimus();
                    boolean õigsus;
                    do {
                        System.out.println(kysimus.getKysimus());
                        sisestus = liides.päringKasutajale();
                        õigsus = kysimus.kontrolliVastus(Integer.parseInt(sisestus));
                        if (!õigsus) System.out.println("Vale vastus, proovi uuesti");
                    } while (!õigsus);
                }
                int saadudAeg = taimer.peataAeg();
                int valesidKokku = 0;
                for(Kysimus kysimus : kysimused) valesidKokku += kysimus.mituValet();
                aktiivneKasutaja.ajaKontroll(saadudAeg);
                aktiivneKasutaja.addValedeVastusteArv(valesidKokku);
                aktiivneKasutaja.addMängudeArv(1);
                System.out.println("Said aja " + saadudAeg + " sekundit");
                System.out.println("Vastasid valesti " + valesidKokku + " korda");
                System.out.println("Jätkamiseks vajuta sisestusklahvi");
                liides.päringKasutajale();
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
                System.out.println("Jätkamiseks vajuta sisestusklahvi");
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
