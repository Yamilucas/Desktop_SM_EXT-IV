package supermercado_marinho.view;

import javax.swing.*;
import java.awt.*;

public class CadastroView extends JPanel {
    private JLabel lblTitulo;
    private JLabel lblNome;
    private JTextField txtNome;
    private JLabel lblEmail;
    private JTextField txtEmail;
    private JLabel lblSenha;
    private JPasswordField txtSenha;
    private JButton btnCadastrar;
    private JButton btnVoltarMain;

    public CadastroView() {
        setLayout(new BorderLayout());

        // Painel principal com padding
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

        // Título centralizado
        lblTitulo = new JLabel("Cadastro de Cliente", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Ubuntu", Font.BOLD, 24));
        mainPanel.add(lblTitulo, BorderLayout.NORTH);

        // Configuração do painel central
        JPanel centerPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Configuração dos campos de nome, email e senha
        lblNome = new JLabel("Nome:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        centerPanel.add(lblNome, gbc);

        txtNome = new JTextField(20);
        gbc.gridx = 1;
        centerPanel.add(txtNome, gbc);

        lblEmail = new JLabel("Email:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        centerPanel.add(lblEmail, gbc);

        txtEmail = new JTextField(20);
        gbc.gridx = 1;
        centerPanel.add(txtEmail, gbc);

        lblSenha = new JLabel("Senha:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        centerPanel.add(lblSenha, gbc);

        txtSenha = new JPasswordField(20);
        gbc.gridx = 1;
        centerPanel.add(txtSenha, gbc);

        // Botão de cadastrar
        btnCadastrar = new JButton("Cadastrar");
        gbc.gridx = 1;
        gbc.gridy = 3;
        centerPanel.add(btnCadastrar, gbc);

        // Adiciona o painel centralizado ao painel principal
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // Painel de navegação
        JPanel navigationPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbcNav = new GridBagConstraints();
        gbcNav.insets = new Insets(10, 10, 10, 10);
        gbcNav.gridx = 0;
        gbcNav.gridy = 0;
        gbcNav.anchor = GridBagConstraints.SOUTH;
        gbcNav.weighty = 1.0; // Empurra o botão para o fundo do painel

        btnVoltarMain = new JButton("Voltar ao Painel Principal");
        navigationPanel.add(btnVoltarMain, gbcNav);

        // Adiciona o painel de navegação à parte inferior da CadastroView
        mainPanel.add(navigationPanel, BorderLayout.SOUTH);

        // Adiciona o painel principal ao CadastroView
        add(mainPanel, BorderLayout.CENTER);
    }

    // Métodos para acessar os componentes (getters)
    public String getNome() {
        return txtNome.getText();
    }

    public String getEmail() {
        return txtEmail.getText();
    }

    public char[] getSenha() {
        return txtSenha.getPassword();
    }

    public JButton getBtnCadastrar() {
        return btnCadastrar;
    }

    public JButton getBtnVoltarMain() {
        return btnVoltarMain;
    }
}
