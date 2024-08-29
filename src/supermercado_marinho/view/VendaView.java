package supermercado_marinho.view;

import javax.swing.*;
import java.awt.*;

public class VendaView extends JPanel {
    private JButton btnVoltarMain;
    private JLabel lblCliente;
    private JComboBox<String> comboBoxCliente;
    private JLabel lblCategoriaProduto;
    private JComboBox<String> comboBoxCategoriaProduto;
    private JLabel lblProduto;
    private JComboBox<String> comboBoxProduto;
    private JLabel lblQuantidade;
    private JTextField txtQuantidade;
    private JButton btnSimularVenda;
    private JButton btnTerminarCompra;  // Botão "Terminar a compra"
    private JLabel lblSistemaDeVendas;

    public VendaView() {
        setLayout(new BorderLayout());
        
        Dimension buttonSize = new Dimension(200, 40);

        // Criando o painel principal com padding
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

        // Adicionando título "Sistema de Vendas"
        lblSistemaDeVendas = new JLabel("Sistema de Vendas");
        lblSistemaDeVendas.setFont(new Font("Ubuntu", Font.BOLD, 18));
        lblSistemaDeVendas.setHorizontalAlignment(SwingConstants.CENTER);  // Centralizando o título
        mainPanel.add(lblSistemaDeVendas, BorderLayout.NORTH);

        // Painel central para os elementos principais (centralizado)
        JPanel centerPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espaçamento entre os componentes
        gbc.fill = GridBagConstraints.HORIZONTAL; // Os componentes preenchem a horizontal

        // Dimensões uniformes dos componentes
        Dimension componentSize = new Dimension(200, 40);

        // Adicionando o Cliente Label e ComboBox
        lblCliente = new JLabel("Cliente:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        centerPanel.add(lblCliente, gbc);

        comboBoxCliente = new JComboBox<>(new String[]{"", "Cliente 1", "Cliente 2", "Cliente 3"});
        comboBoxCliente.setPreferredSize(componentSize);
        gbc.gridx = 1;
        centerPanel.add(comboBoxCliente, gbc);

        // Adicionando Categoria do Produto Label e ComboBox
        lblCategoriaProduto = new JLabel("Categoria do Produto:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        centerPanel.add(lblCategoriaProduto, gbc);

        comboBoxCategoriaProduto = new JComboBox<>(new String[]{"", "Categoria 1", "Categoria 2", "Categoria 3"});
        comboBoxCategoriaProduto.setPreferredSize(componentSize);
        gbc.gridx = 1;
        centerPanel.add(comboBoxCategoriaProduto, gbc);

        // Adicionando Produto Label e ComboBox
        lblProduto = new JLabel("Produto:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        centerPanel.add(lblProduto, gbc);

        comboBoxProduto = new JComboBox<>(new String[]{"", "Produto 1", "Produto 2", "Produto 3"});
        comboBoxProduto.setPreferredSize(componentSize);
        gbc.gridx = 1;
        centerPanel.add(comboBoxProduto, gbc);

        // Adicionando Quantidade Label e TextField
        lblQuantidade = new JLabel("Quantidade:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        centerPanel.add(lblQuantidade, gbc);

        txtQuantidade = new JTextField(5);
        txtQuantidade.setPreferredSize(componentSize);
        gbc.gridx = 1;
        centerPanel.add(txtQuantidade, gbc);

        // Botão de Simular Venda
        btnSimularVenda = new JButton("Comprar o produto.");
        btnSimularVenda.setPreferredSize(componentSize);
        gbc.gridx = 1;
        gbc.gridy = 4;
        centerPanel.add(btnSimularVenda, gbc);

        // Botão "Terminar a compra"
        btnTerminarCompra = new JButton("Terminar a compra");
        btnTerminarCompra.setPreferredSize(componentSize);
        gbc.gridy = 5;  // Adicionando abaixo do botão "Comprar o produto"
        centerPanel.add(btnTerminarCompra, gbc);

        // Adiciona o painel centralizado ao centro do mainPanel
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

        // Adiciona o painel de navegação à parte inferior do mainPanel
        mainPanel.add(navigationPanel, BorderLayout.SOUTH);

        // Adiciona o mainPanel à VendaView
        add(mainPanel, BorderLayout.CENTER);
    }

    public JButton getBtnVoltarMain() {
        return btnVoltarMain;
    }

    public JButton getBtnTerminarCompra() {  // Getter para o novo botão
        return btnTerminarCompra;
    }
}
