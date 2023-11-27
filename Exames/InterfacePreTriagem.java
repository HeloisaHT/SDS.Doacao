package Exames;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane; // Importa a classe JOptionPane

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class InterfacePreTriagem extends JFrame {
    private JTextField nomeDoadorTextField;
    private JTextField cpfDoadorTextField;
    private JTextField idadeDoadorTextField;
    private JTextField pulsoDoadorTextField;
    private JTextField temperaturaDoadorTextField;
    private JTextField pressaoDoadorTextField;
    private JTextField pesoDoadorTextField;
    private JTextField hemoglobinaDoadorTextField;
    private JTextField hematocritoDoadorTextField;
    private JCheckBox habilitadoCheckBox;


    public InterfacePreTriagem() {
        super("Pré-Triagem");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        final JPanel painel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 0.5;
        

        JLabel nomeDoadorLabel = new JLabel("Nome do doador:");
        painel.add(nomeDoadorLabel, constraints);

        nomeDoadorTextField = new JTextField(20);
        constraints.gridx = 1;
        painel.add(nomeDoadorTextField, constraints);

        JLabel cpfDoadorLabel = new JLabel("CPF do doador:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        painel.add(cpfDoadorLabel, constraints);

        cpfDoadorTextField = new JTextField(20);
        constraints.gridx = 1;
        painel.add(cpfDoadorTextField, constraints);

        JLabel idadeDoadorLabel = new JLabel("Idade do doador:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        painel.add(idadeDoadorLabel, constraints);

        idadeDoadorTextField = new JTextField(20);
        constraints.gridx = 1;
        painel.add(idadeDoadorTextField, constraints);

        JLabel pulsoDoadorLabel = new JLabel("Pulso do doador:");
        constraints.gridx = 0;
        constraints.gridy = 3;
        painel.add(pulsoDoadorLabel, constraints);

        pulsoDoadorTextField = new JTextField(20);
        constraints.gridx = 1;
        painel.add(pulsoDoadorTextField, constraints);

        JLabel temperaturaDoadorLabel = new JLabel("Temperatura do doador:");
        constraints.gridx = 0;
        constraints.gridy = 4;
        painel.add(temperaturaDoadorLabel, constraints);

        temperaturaDoadorTextField = new JTextField(20);
        constraints.gridx = 1;
        painel.add(temperaturaDoadorTextField, constraints);

        JLabel pressaoDoadorLabel = new JLabel("Pressão do doador:");
        constraints.gridx = 0;
        constraints.gridy = 5;
        painel.add(pressaoDoadorLabel, constraints);

        pressaoDoadorTextField = new JTextField(20);
        constraints.gridx = 1;
        painel.add(pressaoDoadorTextField, constraints);

        JLabel pesoDoadorLabel = new JLabel("Peso do doador:");
        constraints.gridx = 0;
        constraints.gridy = 6;
        painel.add(pesoDoadorLabel, constraints);

        pesoDoadorTextField = new JTextField(20);
        constraints.gridx = 1;
        painel.add(pesoDoadorTextField, constraints);

        JLabel hemoglobinaDoadorLabel = new JLabel("Hemoglobina do doador:");
        constraints.gridx = 0;
        constraints.gridy = 7;
        painel.add(hemoglobinaDoadorLabel, constraints);

        hemoglobinaDoadorTextField = new JTextField(20);
        constraints.gridx = 1;
        painel.add(hemoglobinaDoadorTextField, constraints);

        JLabel hematocritoDoadorLabel = new JLabel("Hematócrito do doador:");
        constraints.gridx = 0;
        constraints.gridy = 8;
        painel.add(hematocritoDoadorLabel, constraints);

        hematocritoDoadorTextField = new JTextField(20);
        constraints.gridx = 1;
        painel.add(hematocritoDoadorTextField, constraints);

        JLabel habilitadoLabel = new JLabel("Habilitado para doação:");
        constraints.gridx = 0;
        constraints.gridy = 9;
        painel.add(habilitadoLabel, constraints);

        habilitadoCheckBox = new JCheckBox();
        constraints.gridx = 1;
        painel.add(habilitadoCheckBox, constraints);

        add(painel);
        setVisible(true);
        
        JButton salvarButton = new JButton("Salvar");
        constraints.gridx = 0;
        constraints.gridy = 10;
        constraints.gridwidth = 2;
        painel.add(salvarButton, constraints);

        // Adiciona um ActionListener ao botão
        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Verifica se a opção de doação está habilitada
                if (habilitadoCheckBox.isSelected()) {
                    // Se estiver habilitada, direciona para a InterfaceTriagem
                    dispose(); // Fecha a janela atual
                    new InterfaceTriagem(); // Abre a InterfaceTriagem
                } else {
                    // Se não estiver habilitada, exibe uma mensagem
                    JOptionPane.showMessageDialog(null, "Você não está apto para doar. Consulte seu médico para mais informações.");
                }
            }
        });
        add(painel);
        setVisible(true);
        

    }
}