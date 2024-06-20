import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Classe TelaProduto
public class TelaProduto extends JFrame {
    private Produto produto;

    public TelaProduto(Produto produto) {
        super("Produto");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        this.produto = produto;

        JLabel lblNome = new JLabel(produto.getNome());
        add(lblNome);

        JLabel lblDescricao = new JLabel(produto.getDescricao());
        add(lblDescricao);

        JLabel lblPreco = new JLabel("Preço: R$ " + produto.getPreco());
        add(lblPreco);

        JButton btnAdicionarCarrinho = new JButton("Adicionar ao Carrinho");
        btnAdicionarCarrinho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Carrinho.getInstance().adicionarProduto(produto);
                dispose();
            }
        });
        add(btnAdicionarCarrinho);

        pack();
        setVisible(true);
    }
}
