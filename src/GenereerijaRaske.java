public class GenereerijaRaske extends Genereerija{
    @Override
    public void genereeriUus() {
        double random = Math.random();
        if(random < 0.33){ // liitmine
            genereeriTehe('+', 500, 1000, true);
        }
        else if(random < 0.67){ // lahutamine
            genereeriTehe('-', 350, 700, true);
        }
        else{ // korrutamine
            genereeriTehe('*', 15, 15, false);
        }
    }
}
