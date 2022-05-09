import java.util.Scanner;

public class NomeEidade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome ");
            nome = scan.next();

            System.out.println("Idade ");
            idade = scan.nextInt();
        }
    }
}
