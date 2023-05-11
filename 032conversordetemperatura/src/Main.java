import javax.swing.*;
import java.awt.*;

public class Main {
    public static void criarTela(){

        JFrame tela = new JFrame("Conversor");
        JTextField campotexto = new JTextField(10);
        JLabel texto1 = new JLabel(("\u00B0C"));
        JButton botao = new JButton("Converter");
        JLabel texto2 = new JLabel("\u00B0F");

        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.setLayout (new GridLayout(2, 4, 2, 4));
        painelDeConteudo.add(campotexto);
        painelDeConteudo.add(texto1);
        painelDeConteudo.add(botao);
        painelDeConteudo.add(texto2);

        botao.addActionListener((e) -> {
            double celsius = Double.parseDouble(campotexto.getText());
            double fah = celsius / 5 * 9 + 32;
            texto2.setText(String.format("%.2f\u00B0F", fah));
        });

        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater (() -> {
            criarTela();

        });

    }
}