public class Kasutaja {
    // isendiväljad
    private final String kasutajaNimi;
    private int parimAeg;
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

    public int getParimAeg() {
        return parimAeg;
    }

    public int getMängudeArv() {
        return mängudeArv;
    }

    public int getValedeVastusteArv() {
        return valedeVastusteArv;
    }

    // set-meetodid
    public void setMängudeArv(int mängudeArv) {
        this.mängudeArv = mängudeArv;
    }

    public void setValedeVastusteArv(int valedeVastusteArv) {
        this.valedeVastusteArv = valedeVastusteArv;
    }

    // parima aja uuendamine kui saadud aeg on parem kui eelnev parim aeg
    public void ajaKontroll(int saadudAeg) {
        if (saadudAeg < parimAeg || parimAeg == 0) parimAeg = saadudAeg;
    }

    // toString meetod
    @Override
    public String toString() {
        return "Kasutaja nimi: " + kasutajaNimi +
               "\nParim aeg: " + parimAeg +
               "\nLäbitud mängude arv: " + mängudeArv +
               "\nValede vastuste arv: " + valedeVastusteArv;
    }
}
