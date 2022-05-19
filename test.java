import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maior = 0;
        int media = 0;
        int nota1 = 0, soma = 0;
        int nota2 = 0;
        int nota3 = 0;
        int nota4 = 0;

        System.out.println("Nota do Primeiro Bimestre ");
        nota1 = scan.nextInt();

        System.out.println("Nota do Segundo Bimestre ");
        nota2 = scan.nextInt();

        System.out.println("Nota do Terceiro Bimestre ");
        nota3 = scan.nextInt();

        System.out.println("Nota do Quarto Bimestre ");
        nota4 = scan.nextInt();

        media = nota1 + nota2 + nota3 + nota4 / 4;

        System.out.println("Sua media foi " + media);

        if (media >= 7) {
            System.out.println("Parabéns, você foi Aprovado");
        } else {
            System.out.println("Voce foi Reprovado");
        }


      //  if () {
        }
    }

