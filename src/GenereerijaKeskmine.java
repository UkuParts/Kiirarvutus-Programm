public class GenereerijaKeskmine extends Genereerija{
    @Override
    public void genereeriUus() {
        double random = Math.random();
        if(random < 0.33){ // liitmine
            genereeriTehe('+', 50, 30, true);
        }
        else if(random < 0.67){ // lahutamine
            genereeriTehe('-', 40, 20, false);
        }
        else{ // korrutamine
            genereeriTehe('*', 10, 20, false);
        }
    }
}
