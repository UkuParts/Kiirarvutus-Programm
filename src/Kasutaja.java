public class Kasutaja {
    // isendiväljad
    private final String kasutajaNimi;
    private int parimAegLihtne;
    private int parimAegKeskmine;
    private int parimAegRaske;
    private int mängudeArv;
    private int valedeVastusteArv;

    // konstruktor
    public Kasutaja(String kasutajaNimi) {
        this.kasutajaNimi = kasutajaNimi;
    }

    // get-meetodid
    public String getKasutajaNimi() {
        return kasutajaNimi;
    }

    // add-meetodid (lisab olemasolevale juurde)
    public void addMängudeArv(int mängudeArv) {
        this.mängudeArv += mängudeArv;
    }

    public void addValedeVastusteArv(int valedeVastusteArv) {
        this.valedeVastusteArv += valedeVastusteArv;
    }

    // parima aja uuendamine kui saadud aeg on parem kui eelnev parim aeg
    public void ajaKontroll(int saadudAeg, Genereerija raskusaste) {
        if (raskusaste instanceof GenereerijaLihtne)
            if (saadudAeg < parimAegLihtne || parimAegLihtne == 0) parimAegLihtne = saadudAeg;
        if (raskusaste instanceof GenereerijaKeskmine)
            if (saadudAeg < parimAegKeskmine || parimAegKeskmine == 0) parimAegKeskmine = saadudAeg;
        if (raskusaste instanceof GenereerijaRaske)
            if (saadudAeg < parimAegRaske || parimAegRaske == 0) parimAegRaske = saadudAeg;
    }

    // toString meetod
    @Override
    public String toString() {
        return "Kasutaja nimi: " + kasutajaNimi +
               "\nParim aeg (lihtne): " + parimAegLihtne +
               "\nParim aeg (keskmine): " + parimAegKeskmine +
               "\nParim aeg (raske): " + parimAegRaske +
               "\nLäbitud mängude arv: " + mängudeArv +
               "\nValede vastuste arv: " + valedeVastusteArv;
    }
}
