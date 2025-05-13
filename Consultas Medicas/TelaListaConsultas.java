import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

// adicionar mais seis inputs a tela de listar e editar e para cadastrar adicionar genero, data de nascimento e etc

public class TelaListaConsultas extends JFrame {
    private JList<String> lista;
    private DefaultListModel<String> modelo;

    public TelaListaConsultas() {
        setTitle("Lista de Consultas");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        modelo = new DefaultListModel<>();
        for (String consulta : TelaCadastroConsulta.consultas) {
            modelo.addElement(consulta);
        }

        lista = new JList<>(modelo);
        JScrollPane scroll = new JScrollPane(lista);

        JButton btnEditar = new JButton("Editar");
        JButton btnExcluir = new JButton("Excluir");

        btnEditar.addActionListener(e -> editarConsulta());
        btnExcluir.addActionListener(e -> excluirConsulta());

        JPanel botoes = new JPanel();
        botoes.add(btnEditar);
        botoes.add(btnExcluir);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem itemCadastro = new JMenuItem("Cadastrar Consulta");
        itemCadastro.addActionListener(e -> {
            new TelaCadastroConsulta();
            dispose();
        });
        menu.add(itemCadastro);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        add(scroll, BorderLayout.CENTER);
        add(botoes, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void editarConsulta() {
        int indice = lista.getSelectedIndex();
        if (indice != -1) {
            String consultaAntiga = modelo.get(indice);
            String novaConsulta = JOptionPane.showInputDialog(this, "Editar consulta:", consultaAntiga);
            if (novaConsulta != null && !novaConsulta.trim().isEmpty()) {
                modelo.set(indice, novaConsulta);
                TelaCadastroConsulta.consultas.set(indice, novaConsulta);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma consulta para editar.");
        }
    }

    private void excluirConsulta() {
        int indice = lista.getSelectedIndex();
        if (indice != -1) {
            int confirm = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                modelo.remove(indice);
                TelaCadastroConsulta.consultas.remove(indice);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma consulta para excluir.");
        }
    }
}
