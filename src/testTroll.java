import java.util.Scanner;

public class testTroll {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int vita, eta, altezza;
        String nome;

        Troll t1;

        System.out.print("Inserisci il nome del troll: ");
        nome= input.next();

        System.out.print("Inserisci la vita del troll: ");
        vita= input.nextInt();

        System.out.print("Inserisci l'età del troll: ");
        eta= input.nextInt();

        System.out.print("Inserisci l'altezza del troll: ");
        altezza= input.nextInt();

        t1= new Troll(vita, nome, altezza, eta);

    }
}
