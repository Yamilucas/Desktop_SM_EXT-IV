package supermercado_marinho.view;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JPanel {
    private JLabel lblTitulo;
    private JLabel lblUsuario;
    private JTextField txtUsuario;
    private JLabel lblSenha;
    private JPasswordField txtSenha;
    private JButton btnLogin;
    private JButton btnVoltarMain;

    public LoginView() {
        setLayout(new BorderLayout());

        // Painel principal com padding
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

        // Configuração do painel central
        JPanel centerPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Título centralizado
        lblTitulo = new JLabel("Login", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Ubuntu", Font.BOLD, 24));
        mainPanel.add(lblTitulo, BorderLayout.NORTH);

        // Configuração dos campos de usuário e senha
        lblUsuario = new JLabel("Usuário:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        centerPanel.add(lblUsuario, gbc);

        txtUsuario = new JTextField(20);
        gbc.gridx = 1;
        centerPanel.add(txtUsuario, gbc);

        lblSenha = new JLabel("Senha:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        centerPanel.add(lblSenha, gbc);

        txtSenha = new JPasswordField(20);
        gbc.gridx = 1;
        centerPanel.add(txtSenha, gbc);

        // Botão de login
        btnLogin = new JButton("Login");
        gbc.gridx = 1;
        gbc.gridy = 2;
        centerPanel.add(btnLogin, gbc);

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

        // Adiciona o painel de navegação à parte inferior da LoginView
        mainPanel.add(navigationPanel, BorderLayout.SOUTH);

        // Adiciona o painel principal ao LoginView
        add(mainPanel, BorderLayout.CENTER);
    }

    // Métodos para acessar os componentes (getters)
    public String getUsuario() {
        return txtUsuario.getText();
    }

    public char[] getSenha() {
        return txtSenha.getPassword();
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }

    public JButton getBtnVoltarMain() {
        return btnVoltarMain;
    }
}
