import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


    //classe principal (mesmo nome do arquivo)
    public class InterfaceJava {
        public static void main(String[] args) {
            
            //cria a janela principal
            JFrame frame = new JFrame("Hello world");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 400);
            frame.setLayout(new FlowLayout(FlowLayout.LEFT));

            //campo de texto
            JTextField textField = new JTextField(15); //tamanho fixo
            frame.add(new JLabel("Digite seu nome:"));
            frame.add(textField);

            //botao para confirmar
            JButton button = new JButton("Entrar");
            frame.add(button);

            //açao do botao
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String nome = textField.getText().trim();
                    if (nome.isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "Por favor, digite seu nome.");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Seja bem-vindo, " + nome + "!");
                    }
                }
            });
            frame.setVisible(true);
        }
    }