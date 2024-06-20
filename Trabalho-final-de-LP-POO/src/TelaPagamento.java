import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Classe TelaPagamento
public class TelaPagamento extends JFrame {
    private JLabel lblPagamento;
    private JLabel lblValorTotal;
    private JButton btnConfirmar;

    public TelaPagamento() {
        super("Pagamento");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        lblPagamento = new JLabel("Forma de Pagamento:");
        add(lblPagamento);

        String[] opcoes = {"Cartão de Crédito", "Cartão de Débito", "Boleto"};
        JComboBox<String> cbFormaPagamento = new JComboBox<>(opcoes);
        add(cbFormaPagamento);

        lblValorTotal = new JLabel("Valor Total: R$ " + Carrinho.getInstance().getValorTotal());
        add(lblValorTotal);

        btnConfirmar = new JButton("Confirmar Compra");
        btnConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!");
                Carrinho.getInstance().limparCarrinho();
                dispose();
            }
        });
        add(btnConfirmar);

        pack();
        setVisible(true);
    }
}
