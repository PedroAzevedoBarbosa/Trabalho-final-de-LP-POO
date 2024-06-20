import javax.swing.*;
import java.awt.*;

// Classe TelaPrincipal
public class TelaPrincipal extends JFrame {
    private JLabel titulo;
    private JButton btnLogin;
    private JButton btnCarrinho;
    private JButton btnProdutos;
    private JPanel painelProdutos;

    public TelaPrincipal() {
        super("Centauro");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        titulo = new JLabel("Bem-vindo à Centauro!");
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        add(titulo, BorderLayout.NORTH);

        btnLogin = new JButton("Login");
        btnLogin.addActionListener(e -> new TelaLogin().setVisible(true));
        add(btnLogin, BorderLayout.WEST);

        btnCarrinho = new JButton("Carrinho");
        btnCarrinho.addActionListener(e -> new TelaCarrinho().setVisible(true));
        add(btnCarrinho, BorderLayout.EAST);

        btnProdutos = new JButton("Produtos");
        btnProdutos.addActionListener(e -> painelProdutos.setVisible(true));
        add(btnProdutos, BorderLayout.CENTER);

        painelProdutos = new JPanel();
        painelProdutos.setLayout(new GridLayout(0, 2));
        add(painelProdutos, BorderLayout.CENTER);

        // Adiciona produtos à vitrine
        for (int i = 0; i < 10; i++) {
            Produto produto = new Produto("Produto " + i, "Descrição do produto " + i, 10.0);
            JButton btnProduto = new JButton(produto.getNome());
            btnProduto.addActionListener(e -> new TelaProduto(produto).setVisible(true));
            painelProdutos.add(btnProduto);
        }

        pack();
        setVisible(true);
    }
}
