// Classe Boleto
public class Boleto extends FormaPagamento {
    private String codigoBoleto;

    public Boleto(String codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento realizado com boleto!");
    }
}
