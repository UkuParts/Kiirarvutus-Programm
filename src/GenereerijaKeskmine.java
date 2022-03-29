public class GenereerijaKeskmine extends Genereerija{
    @Override
    public void genereeriUus() {
        double random = Math.random();
        if(random < 0.33){ // liitmine
            genereeriTehe('+', 100, 60, true);
        }
        else if(random < 0.67){ // lahutamine
            genereeriTehe('-', 80, 40, false);
        }
        else{ // korrutamine
            genereeriTehe('*', 10, 10, false);
        }
    }
}
