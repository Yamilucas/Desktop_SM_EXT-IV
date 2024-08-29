package supermercado_marinho.view;

import javax.swing.*;
import java.awt.*;

public class Principal extends JFrame {
    private JButton btnSimularVenda;
    private JButton btnGerenciarEstoque;
    private JButton btnLogin;
    private JButton btnCadastro;
    private JButton btnRegistroTransacoes;
    private JPanel mainPanel;
    private EstoqueView estoqueView;
    private VendaView vendaView;
    private LoginView loginView;
    private CadastroView cadastroView;
    private Registro_TransacoesView registroTransacoesView;
    private JLabel lblSM;

    public Principal() {
        // Configuração da Janela Principal
        setTitle("Supermercado Marinho");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Inicialização dos painéis de navegação
        mainPanel = new JPanel(new GridBagLayout());  // Altera para GridBagLayout
        estoqueView = new EstoqueView();
        vendaView = new VendaView();
        loginView = new LoginView();
        cadastroView = new CadastroView();
        registroTransacoesView = new Registro_TransacoesView();
        
        lblSM = new JLabel("Tela");
        lblSM.setFont(new Font("Ubuntu", Font.BOLD, 18));
        lblSM.setHorizontalAlignment(SwingConstants.CENTER);  // Centralizando o título

        // Configuração dos botões principais
        btnSimularVenda = new JButton("Simular Venda");
        btnGerenciarEstoque = new JButton("Gerenciar Estoque");
        btnLogin = new JButton("Login");
        btnCadastro = new JButton("Cadastro");
        btnRegistroTransacoes = new JButton("Registro de Transações");

        // Define tamanho fixo dos botões para manter simetria
        Dimension buttonSize = new Dimension(200, 40);
        btnSimularVenda.setPreferredSize(buttonSize);
        btnGerenciarEstoque.setPreferredSize(buttonSize);
        btnLogin.setPreferredSize(buttonSize);
        btnCadastro.setPreferredSize(buttonSize);
        btnRegistroTransacoes.setPreferredSize(buttonSize);

        // Define o layout manager e as constraints para centralizar os botões
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 0, 10, 0); // Margens entre os botões
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;

        // Adiciona a label ao painel principal no topo
        gbc.gridy = 0;  // Posição no topo
        gbc.anchor = GridBagConstraints.NORTH;
        mainPanel.add(lblSM, gbc);

        // Adiciona os botões ao painel principal
        gbc.gridy = 1;  // Muda para a próxima linha
        mainPanel.add(btnSimularVenda, gbc);

        gbc.gridy = 2;  // Muda para a próxima linha
        mainPanel.add(btnGerenciarEstoque, gbc);

        gbc.gridy = 3;  // Muda para a próxima linha
        mainPanel.add(btnLogin, gbc);

        gbc.gridy = 4;  // Muda para a próxima linha
        mainPanel.add(btnCadastro, gbc);

        gbc.gridy = 5;  // Muda para a próxima linha
        mainPanel.add(btnRegistroTransacoes, gbc);

        // Configura layout principal
        setLayout(new CardLayout());
        add(mainPanel, "mainPanel");
        add(estoqueView, "estoqueView");
        add(vendaView, "vendaView");
        add(loginView, "loginView");
        add(cadastroView, "cadastroView");
        add(registroTransacoesView, "registroTransacoesView");

        // Ação dos botões principais
        btnSimularVenda.addActionListener(e -> mostrarVendaView());
        btnGerenciarEstoque.addActionListener(e -> mostrarEstoqueView());
        btnLogin.addActionListener(e -> mostrarLoginView());
        btnCadastro.addActionListener(e -> mostrarCadastroView());
        btnRegistroTransacoes.addActionListener(e -> mostrarRegistroTransacoesView());

        // Ação dos botões de navegação
        estoqueView.getBtnVoltarMain().addActionListener(e -> mostrarMainPanel());
     

        vendaView.getBtnVoltarMain().addActionListener(e -> mostrarMainPanel());
       

        loginView.getBtnVoltarMain().addActionListener(e -> mostrarMainPanel());
        cadastroView.getBtnVoltarMain().addActionListener(e -> mostrarMainPanel());
        registroTransacoesView.getBtnVoltarMain().addActionListener(e -> mostrarMainPanel());
    }

    // Métodos para alternar entre os painéis
    private void mostrarMainPanel() {
        CardLayout layout = (CardLayout) getContentPane().getLayout();
        layout.show(getContentPane(), "mainPanel");
    }

    private void mostrarEstoqueView() {
        CardLayout layout = (CardLayout) getContentPane().getLayout();
        layout.show(getContentPane(), "estoqueView");
    }

    private void mostrarVendaView() {
        CardLayout layout = (CardLayout) getContentPane().getLayout();
        layout.show(getContentPane(), "vendaView");
    }

    private void mostrarLoginView() {
        CardLayout layout = (CardLayout) getContentPane().getLayout();
        layout.show(getContentPane(), "loginView");
    }

    private void mostrarCadastroView() {
        CardLayout layout = (CardLayout) getContentPane().getLayout();
        layout.show(getContentPane(), "cadastroView");
    }

    private void mostrarRegistroTransacoesView() {
        CardLayout layout = (CardLayout) getContentPane().getLayout();
        layout.show(getContentPane(), "registroTransacoesView");
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.setVisible(true);
    }
}
