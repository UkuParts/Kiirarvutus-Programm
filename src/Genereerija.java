public abstract class Genereerija {
    protected String tekst;
    protected int vastus;

    abstract void genereeriUus();

    /**
     * Genereerib tehte.
     * @param märk tehte märk
     * @param alampiir ühe tehte liikme alampiir
     * @param variatsioon kui palju võib üks tehte liige alampiirist suurem olla
     * @param trinaarne kas tehe on kolmeliikmeline
     */
    public void genereeriTehe(char märk, int alampiir, int variatsioon, boolean trinaarne){
        int esimeneLiige = (int)(Math.random() * variatsioon + alampiir);
        int teineLiige = (int)(Math.random() * variatsioon + alampiir);
        int kolmasLiige = (int)(Math.random() * variatsioon + alampiir);

        // tekst
        tekst = esimeneLiige + " " + märk + " " + teineLiige;
        if(trinaarne) tekst += " " + märk + " " + kolmasLiige;

        // vastus
        switch (märk) {
            case '+' -> {
                vastus = esimeneLiige + teineLiige;
                if(trinaarne) vastus += kolmasLiige;
            }
            case '-' -> {
                vastus = esimeneLiige - teineLiige;
                if(trinaarne) vastus -= kolmasLiige;
            }
            case '*' -> {
                vastus = esimeneLiige * teineLiige;
                if(trinaarne) vastus *= kolmasLiige;
            }
        }
    }

    public String getTekst(){
        return tekst;
    }
    public int getVastus(){
        return vastus;
    }
}
