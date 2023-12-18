import entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Seja bem vindo a loja Bolas Gamers SkAoZ!");

        System.out.println("----------------------------------------");

        System.out.println("Você é um Cliente ou um Funcionário?");
        char user = scanner.nextLine().charAt(0);
        System.out.println();
        Operacoes operacoes;

        switch (user) {
            case 'C':
                System.out.print("Escreva seu nome: ");
                String nome = scanner.nextLine();
                System.out.print("Escreva sua senha: ");
                String senha = scanner.nextLine();
                Operacoes operacoes1 = new Cliente(nome, senha);
                operacoes1.logar(nome, senha);
                System.out.printf("%n%n");
                inicializarCliente();
                break;
            case 'F':
                System.out.print("Escreva seu nome: ");
                nome = scanner.nextLine();
                System.out.print("Escreva sua senha: ");
                senha = scanner.nextLine();
                Operacoes operacoes2 = new Funcionario(nome, senha);
                operacoes2.logar(nome, senha);
                System.out.printf("%n%n");
                inicializarFuncionario();
                break;
        }

    }

    public static void inicializarCliente() {

        Scanner scanner = new Scanner(System.in);

        List<Produtos> produtos = new ArrayList<>();
        produtos.add(new Produtos("Mikasa V390W", 399.90, 50));
        produtos.add(new Produtos("Mikasa V370W", 299.90, 50));
        produtos.add(new Produtos("Wilson Professional", 699.90, 50));
        produtos.add(new Produtos("Molten 760V", 549.90, 50));
        produtos.add(new Produtos("Penalty VP2000", 149.90, 50));
        Carrinho carrinho = new Carrinho();

        System.out.println("Bolas disponíveis: ");
        int contador = 0;
        int i = 0;
        for (i = 0; i <= 4; i++) {
            System.out.println(produtos.get(contador));
            contador++;
        }



        System.out.print("Qual produto deseja comprar? (0, 1, 2, 3, 4): ");
        int compra = scanner.nextInt();
        System.out.println();
        Produtos produtao = produtos.get(compra);

        carrinho.adicionarItem(produtos.get(compra));
        System.out.print("Insira quantas unidades deseja comprar: ");
        int quantidade = scanner.nextInt();
        produtao.removeProdutos(quantidade);


        System.out.println();
        contador = 0;
        for (i = 0; i <= 4; i++) {
            System.out.println(produtos.get(contador));
            contador++;
        }

        System.out.println();

        carrinho.exibirItens();
        System.out.println(carrinho.calcularTotal());
        System.out.println();
        System.out.println("Fim do código.");

        scanner.close();

    }

    public static void inicializarFuncionario() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        List<Produtos> produtos = new ArrayList<>();
        produtos.add(new Produtos("Mikasa V390W", 399.90, 50));
        produtos.add(new Produtos("Mikasa V370W", 299.90, 50));
        produtos.add(new Produtos("Wilson Professional", 699.90, 50));
        produtos.add(new Produtos("Molten 760V", 549.90, 50));
        produtos.add(new Produtos("Penalty VP2000", 149.90, 50));

        int contador = 0;
        for (i = 0; i <= 4; i++) {
            System.out.println(produtos.get(contador));
            contador++;
        }



        System.out.print("Qual produto gostaria de modificar? (0, 1, 2, 3, 4): ");
        int indice = scanner.nextInt();
        scanner.nextLine();

        if (indice >= 0 && indice < produtos.size()) {
            Produtos produtao = produtos.get(indice);

            System.out.print("Você quer remover ou adicionar produtos? (Adicionar/Remover): ");
            char estoque = scanner.nextLine().charAt(0);

            if (estoque == 'A') {
                System.out.print("Insira quantas unidades deseja adicionar: ");
                int quantidade = scanner.nextInt();
                produtao.addProdutos(quantidade);
            } else {
                System.out.print("Insira quantas unidades deseja remover: ");
                int quantidade = scanner.nextInt();
                produtao.removeProdutos(quantidade);
            }
        } else {
            System.out.println("Índice inválido.");
        }

        scanner.close();

        System.out.println();
        System.out.println("Novos dados: ");
        StringBuilder sb = new StringBuilder();
        contador = 0;
        for (i = 0; i <= 4; i++) {
            sb.append(produtos.get(contador));
            sb.append(System.lineSeparator());
            contador++;
        }
        System.out.println(sb.toString() + "Fim do código.");
    }
}
