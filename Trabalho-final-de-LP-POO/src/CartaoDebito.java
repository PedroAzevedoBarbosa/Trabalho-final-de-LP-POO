// Classe CartaoDebito
public class CartaoDebito extends FormaPagamento {
    private String numeroCartao;
    private String titular;

    public CartaoDebito(String numeroCartao, String titular) {
        this.numeroCartao = numeroCartao;
        this.titular = titular;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento realizado com cartão de débito!");
    }
}
