public class GenereerijaLihtne extends Genereerija{
    @Override
    public void genereeriUus() {
        if(Math.random() < 0.5){ // liitmine
            genereeriTehe('+', 15, 25, false);
        }
        else{ // korrutamine
            genereeriTehe('*', 5, 10, false);
        }
    }
}
