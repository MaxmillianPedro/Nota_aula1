import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Produto p = new Produto();
        String resp;

        do {
            System.out.println("Cadastro dos dados do produto: ");
            System.out.println("Nome do produto: ");
            p.setNome(sc2.nextLine());
            System.out.println("Código do produto: ");
            p.setCodigo(sc2.nextLine());
            System.out.println("Tamanho/peso do produto: ");
            p.setTam_peso(sc2.nextLine());
            System.out.println("Cor do produto: ");
            p.setCor(sc2.nextLine());
            System.out.println("Valor do produto: ");
            p.setValor(sc.nextDouble());
            System.out.println("Quantidade em estoque: ");
            p.setEstoque(sc.nextInt());
            p.mostrar_produtos();
            System.out.println("Para cadastrar outro produto digite: S");
            resp = sc.next();
            produtos.add(p);
        } while (resp.equalsIgnoreCase("S"));
    }
}
