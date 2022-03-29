public class Timer {
    // isendiväljad
    private long ajaAlgus;

    // alustab aja mõõtmist
    public void mõõdaAega() {
        ajaAlgus = System.currentTimeMillis();
    }

    // tagastab möödunud aja sekundites
    public int peataAeg() {
        return (int) (System.currentTimeMillis() - ajaAlgus) / 1000;
    }
}
