package entities;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produtos> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produtos produto) {
        itens.add(produto);
    }

    public void exibirItens() {
        System.out.println("Carrinho de Compras: ");
        for (Produtos produtos : itens) {
            System.out.println(produtos);
        }
    }

    public String calcularTotal() {
        double total = 0;
        for (Produtos produto : itens) {
            total += produto.getPreco();
        }
        return "Valor total no carrinho: " + total;
    }
}
