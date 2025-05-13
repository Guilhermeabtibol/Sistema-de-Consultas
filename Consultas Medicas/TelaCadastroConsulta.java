
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class TelaCadastroConsulta extends JFrame {
    private JTextField campoPaciente, campoData;
    private JComboBox<String> comboMedico;
    public static ArrayList<String> consultas = new ArrayList<>();

    public TelaCadastroConsulta() {
        setTitle("Cadastro de Consultas");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        campoPaciente = new JTextField(20);
        campoData = new JTextField(10);
        comboMedico = new JComboBox<>(new String[]{"Dr. João", "Dra. Maria", "Dr. Pedro"});

        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(e -> cadastrarConsulta());

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem itemListar = new JMenuItem("Listar Consultas");
        itemListar.addActionListener(e -> {
            new TelaListaConsultas();
            dispose();
        });
        menu.add(itemListar);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        JPanel painel = new JPanel(new GridLayout(4, 2));
        painel.add(new JLabel("Paciente:"));
        painel.add(campoPaciente);
        painel.add(new JLabel("Data:"));
        painel.add(campoData);
        painel.add(new JLabel("Médico:"));
        painel.add(comboMedico);
        painel.add(new JLabel(""));
        painel.add(btnCadastrar);

        add(painel);
        setVisible(true);
    }

    private void cadastrarConsulta() {
        String paciente = campoPaciente.getText();
        String data = campoData.getText();
        String medico = (String) comboMedico.getSelectedItem();

        if (paciente.isEmpty() || data.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
        } else {
            consultas.add(paciente + " - " + medico + " - " + data);
            JOptionPane.showMessageDialog(this, "Consulta cadastrada com sucesso!");
            campoPaciente.setText("");
            campoData.setText("");
        }
    }
}
