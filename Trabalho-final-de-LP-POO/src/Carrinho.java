import java.util.ArrayList;
import java.util.List;

// Classe Carrinho
public class Carrinho {
    private static Carrinho instance;
    private List<Produto> produtos;

    private Carrinho() {
        produtos = new ArrayList<>();
    }

    public static Carrinho getInstance() {
        if (instance == null) {
            instance = new Carrinho();
        }
        return instance;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(int indice) {
        produtos.remove(indice);
    }

    public double getValorTotal() {
        double valorTotal = 0.0;
        for (Produto produto : produtos) {
            valorTotal += produto.getPreco();
        }
        return valorTotal;
    }

    public void limparCarrinho() {
        produtos.clear();
    }
}
