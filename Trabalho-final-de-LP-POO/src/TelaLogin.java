import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Classe TelaLogin
public class TelaLogin extends JFrame {
    private JLabel lblUsuario;
    private JLabel lblSenha;
    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnLogin;

    public TelaLogin() {
        super("Login");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        lblUsuario = new JLabel("Usuário:");
        add(lblUsuario);

        txtUsuario = new JTextField(20);
        add(txtUsuario);

        lblSenha = new JLabel("Senha:");
        add(lblSenha);

        txtSenha = new JPasswordField(20);
        add(txtSenha);

        btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Verifica se o usuário e senha estão corretos
                if (txtUsuario.getText().equals("admin") && txtSenha.getText().equals("admin")) {
                    new TelaPrincipal().setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
                }
            }
        });
        add(btnLogin);

        pack();
        setVisible(true);
    }
}
