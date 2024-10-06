import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double soma_das_notas = 0;
        int contador = 0;
        double nota;
        double media = 0;
        String resp;

        System.out.println("Bem-vindo ao calculador de média do aluno(a)!");

        do {
            System.out.println("Insira uma nota: ");
            nota = sc.nextDouble();
            soma_das_notas += nota;
            contador++;

            System.out.println("Deseja inserir outra nota? (Digite 'S' para Sim, ou, 'N' para Não): ");
            resp = sc.next();

        } while (resp.equalsIgnoreCase("S"));

        if (contador > 0) {
            media = soma_das_notas / contador;
            System.out.printf("Média das notas: %.2f\n", media);
        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }

        if (media >= 7){
            System.out.println("Aluno(a) aprovado por média.");
        } else if (media < 7 && media >= 4) {
            System.out.println("Aluno(a) de recuperação.");
        } else {
            System.out.println("Aluno(a) reprovado(a).");
        }

        System.out.println("Obrigado por usar o programa!");
    }
}