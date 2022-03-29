import java.util.Scanner;

public class Kasutajaliides {
    // isendiväljad
    private final Scanner scan = new Scanner(System.in);

    // loeb ja tagastab kasutaja sisestuse
    public String päringKasutajale() {
        return scan.nextLine();
    }
}
