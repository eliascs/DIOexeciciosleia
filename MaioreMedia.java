import java.util.Scanner;

public class MaioreMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        int maior = 0;

        int count = 0;


        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero > maior) maior = numero;

            count = count + 1;

            System.out.println("Maior: " + maior);

        } while(count < 5);
    }
}
