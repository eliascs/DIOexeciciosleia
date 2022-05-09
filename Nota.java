import java.util.Scanner;

    public class Nota {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int Nota;

            System.out.println("Nota: ");
            Nota = scan.nextInt();

           // while (Nota < 0 | Nota > 10) {
               // System.out.println("Nota Valida");
            //}
            //Nota = scan.nextInt();
            if (Nota <= 10) {
                System.out.println("NOTA É VALIDA");
            } else {
                System.out.println("Nota invalida! Digite Novamente: ");
            }
        }
    }

