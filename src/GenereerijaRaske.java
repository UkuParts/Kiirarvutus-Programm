public class GenereerijaRaske extends Genereerija{
    @Override
    public void genereeriUus() {
        double random = Math.random();
        if(random < 0.33){ // liitmine
            genereeriTehe('+', 150, 200, true);
        }
        else if(random < 0.67){ // lahutamine
            genereeriTehe('-', 100, 150, true);
        }
        else{ // korrutamine
            genereeriTehe('*', 30, 40, false);
        }
    }
}
