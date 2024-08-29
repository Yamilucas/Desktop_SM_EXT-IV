package supermercado_marinho.view;

import javax.swing.*;
import java.awt.*;

public class Registro_TransacoesView extends JPanel {
    private JLabel lblTitulo;
    private JTable tabelaTransacoes;
    private JButton btnVoltarMain;

    public Registro_TransacoesView() {
        setLayout(new BorderLayout());

        // Painel principal com padding
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

        // Título centralizado
        lblTitulo = new JLabel("Registro de Transações", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Ubuntu", Font.BOLD, 24));
        mainPanel.add(lblTitulo, BorderLayout.NORTH);

        // Configuração da tabela
        String[] colunas = {"Cliente", "Categoria do Produto", "Produto", "Quantidade"};
        Object[][] dados = {
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""}
        };
        tabelaTransacoes = new JTable(dados, colunas);
        JScrollPane scrollPane = new JScrollPane(tabelaTransacoes);
        tabelaTransacoes.setFillsViewportHeight(true);

        // Painel central para a tabela
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(scrollPane, BorderLayout.CENTER);

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

        // Adiciona o painel de navegação à parte inferior da Registro_TransacoesView
        mainPanel.add(navigationPanel, BorderLayout.SOUTH);

        // Adiciona o painel principal ao Registro_TransacoesView
        add(mainPanel, BorderLayout.CENTER);
    }

    // Método para acessar o botão Voltar ao MainPanel
    public JButton getBtnVoltarMain() {
        return btnVoltarMain;
    }
}
