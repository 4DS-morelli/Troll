import java.util.Scanner;

public class testTroll {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int vita, danno, altezza;
        String nome;
        boolean cond=false;

        Troll t1;

        do {
            try {
                cond= true;
                System.out.print("Inserisci il nome del troll: ");
                nome = input.next();

                System.out.print("Inserisci la vita del troll (in punti vita): ");
                vita = input.nextInt();

                System.out.print("Inserisci il danno che fa il troll del troll: ");
                danno = input.nextInt();

                System.out.print("Inserisci l'altezza del troll (in metri): ");
                altezza = input.nextInt();

                t1 = new Troll(vita, nome, altezza, danno);
            }catch (Exception e){
                System.out.print(e.getMessage());
                cond=false;
            }
        }while(!cond);


    }
}
