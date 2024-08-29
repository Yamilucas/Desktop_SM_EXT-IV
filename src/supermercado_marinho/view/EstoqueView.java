package supermercado_marinho.view;

import javax.swing.*;
import java.awt.*;

public class EstoqueView extends JPanel {
    private JButton btnVoltarMain;
    private JLabel lblProduto;
    private JTextField txtProduto;
    private JLabel lblQuantidade;
    private JTextField txtQuantidade;
    private JLabel lblCategoria;
    private JTextField txtCategoria;
    private JButton btnAdicionar;
    private JButton btnAtualizar;
    private JButton btnRemover;
    private JLabel lblEstoqueSistema;

    public EstoqueView() {
        setLayout(new BorderLayout());

        Dimension buttonSize = new Dimension(200, 40);

        // Criando o painel principal com padding
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

        // Adicionando título "Estoque do sistema"
        lblEstoqueSistema = new JLabel("Estoque do sistema");
        lblEstoqueSistema.setFont(new Font("Ubuntu", Font.BOLD, 18));
        lblEstoqueSistema.setHorizontalAlignment(SwingConstants.CENTER);  // Centralizando o título
        mainPanel.add(lblEstoqueSistema, BorderLayout.NORTH);

        // Painel central para os elementos principais (centralizado)
        JPanel centerPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espaçamento entre os componentes
        gbc.fill = GridBagConstraints.HORIZONTAL; // Os componentes preenchem a horizontal

        // Dimensões uniformes dos componentes
        Dimension componentSize = new Dimension(200, 40);

        // Adicionando o Produto Label e TextField
        lblProduto = new JLabel("Produto:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        centerPanel.add(lblProduto, gbc);

        txtProduto = new JTextField(20);
        txtProduto.setPreferredSize(componentSize);
        gbc.gridx = 1;
        centerPanel.add(txtProduto, gbc);

        // Adicionando Quantidade Label e TextField
        lblQuantidade = new JLabel("Quantidade:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        centerPanel.add(lblQuantidade, gbc);

        txtQuantidade = new JTextField(5);
        txtQuantidade.setPreferredSize(componentSize);
        gbc.gridx = 1;
        centerPanel.add(txtQuantidade, gbc);

        // Adicionando Categoria Label e TextField
        lblCategoria = new JLabel("Categoria do Produto:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        centerPanel.add(lblCategoria, gbc);

        txtCategoria = new JTextField(20);
        txtCategoria.setPreferredSize(componentSize);
        gbc.gridx = 1;
        centerPanel.add(txtCategoria, gbc);

        // Botões de Adicionar, Atualizar e Remover
        btnAdicionar = new JButton("Adicionar");
        btnAdicionar.setPreferredSize(componentSize);
        gbc.gridx = 1;
        gbc.gridy = 3;
        centerPanel.add(btnAdicionar, gbc);

        btnAtualizar = new JButton("Atualizar");
        btnAtualizar.setPreferredSize(componentSize);
        gbc.gridy = 4;
        centerPanel.add(btnAtualizar, gbc);

        btnRemover = new JButton("Remover");
        btnRemover.setPreferredSize(componentSize);
        gbc.gridy = 5;
        centerPanel.add(btnRemover, gbc);

        // Adiciona o painel centralizado ao centro do EstoqueView
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // Painel inferior para os botões de navegação
        JPanel navigationPanel = new JPanel(new GridBagLayout());
        GridBagConstraints navGbc = new GridBagConstraints();
        navGbc.insets = new Insets(10, 10, 10, 10); // Espaçamento entre os botões
        navGbc.anchor = GridBagConstraints.CENTER; // Centraliza os botões

        // Botão Voltar ao Main
        btnVoltarMain = new JButton("Voltar ao Painel Principal");
        btnVoltarMain.setPreferredSize(buttonSize);

        // Adicionando o botão ao painel de navegação
        navGbc.gridx = 0;
        navGbc.gridy = 0;
        navigationPanel.add(btnVoltarMain, navGbc);

        // Adiciona o painel de navegação à parte inferior da EstoqueView
        mainPanel.add(navigationPanel, BorderLayout.SOUTH);

        // Adiciona o painel principal ao EstoqueView
        add(mainPanel, BorderLayout.CENTER);
    }

    public JButton getBtnVoltarMain() {
        return btnVoltarMain;
    }
}
