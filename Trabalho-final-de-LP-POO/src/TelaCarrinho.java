import javax.swing.*;
import java.awt.*;

// Classe TelaCarrinho
public class TelaCarrinho extends JFrame {
    private JLabel lblCarrinho;
    private JList<Produto> lstProdutos;
    private JButton btnRemover;
    private JButton btnFinalizar;

    public TelaCarrinho() {
        super("Carrinho de Compras");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        lblCarrinho = new JLabel("Carrinho de Compras:");
        add(lblCarrinho, BorderLayout.NORTH);

        lstProdutos = new JList<>();
        add(new JScrollPane(lstProdutos), BorderLayout.CENTER);

        btnRemover = new JButton("Remover");
        btnRemover.addActionListener(e -> {
            int indice = lstProdutos.getSelectedIndex();
            if (indice != -1) {
                Carrinho.getInstance().removerProduto(indice);
                lstProdutos.setListData(Carrinho.getInstance().getProdutos().toArray(new Produto[0]));
            }
        });
        add(btnRemover, BorderLayout.WEST);

        btnFinalizar = new JButton("Finalizar Compra");
        btnFinalizar.addActionListener(e -> new TelaPagamento().setVisible(true));
        add(btnFinalizar, BorderLayout.EAST);

        pack();
        setVisible(true);
    }
}
