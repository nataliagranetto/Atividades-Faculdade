import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cliente cliente1 = new Cliente();
        Pedido pedido1 = new Pedido();

        System.out.println("Digite seu nome:");
        cliente1.setNome(sc.nextLine());

        System.out.println("Digite a quantidade:");
        cliente1.setQuantidade(sc.nextInt());

        System.out.println("  DADOS DO PEDIDO  ");
        System.out.println("Cliente: " + cliente1.getNome());
        System.out.println("Quantidade: " + cliente1.getQuantidade());
        System.out.println("Número do pedido: " + pedido1.getNumeroDoPedido());

        sc.close();
    }
}