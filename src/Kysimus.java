public class Kysimus {
    private Genereerija genereerija;
    private String tekst;
    private int vastus;
    private int valedVastused;


    public Kysimus(Genereerija genereerija){
        this.genereerija = genereerija;
    }

    public void genereeriKysimus(){
        genereerija.genereeriUus();
        tekst = genereerija.getTekst();
        vastus = genereerija.getVastus();
    }

    public boolean kontrolliVastus(double vastus){
        if(vastus == this.vastus){
            return true;
        }
        else {
            valedVastused++;
            return false;
        }
    }

    public String getKysimus() {
        return tekst;
    }

    public int mituValet(){
        return valedVastused;
    }
}
