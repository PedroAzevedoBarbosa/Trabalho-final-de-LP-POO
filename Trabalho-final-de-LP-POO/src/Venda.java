import java.util.ArrayList;
import java.util.List;

// Classe Venda
public class Venda {
    private int id;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<Produto> produtos;
    private double valorTotal;

    public Venda(int id, Cliente cliente, Vendedor vendedor) {
        this.id = id;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.produtos = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        valorTotal += produto.getPreco();
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
        valorTotal -= produto.getPreco();
    }
}
