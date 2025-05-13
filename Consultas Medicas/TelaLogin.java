
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaLogin extends JFrame {
    private JTextField campoUsuario;
    private JPasswordField campoSenha;

    public TelaLogin() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        campoUsuario = new JTextField(15);
        campoSenha = new JPasswordField(15);

        JButton btnEntrar = new JButton("Entrar");
        btnEntrar.addActionListener(e -> validarLogin());

        JPanel painel = new JPanel(new GridLayout(3, 2));
        painel.add(new JLabel("Usuário:"));
        painel.add(campoUsuario);
        painel.add(new JLabel("Senha:"));
        painel.add(campoSenha);
        painel.add(new JLabel(""));
        painel.add(btnEntrar);

        add(painel);
        setVisible(true);
    }

    private void validarLogin() {
        String usuario = campoUsuario.getText();
        String senha = new String(campoSenha.getPassword());

        if (usuario.equals("admin") && senha.equals("123")) {
            new TelaCadastroConsulta();
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos!");
        }
    }
}
