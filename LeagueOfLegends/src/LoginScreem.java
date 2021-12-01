import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;

public class LoginScreem extends JPanel {
    private final Color COR_FUNDO = Color.decode("#f9f9f9");
    private JLabel labelContaRiot;
    private JLabel backgraund;
    private JTextField campoUsuario;
    private JTextField campoSenha;
    private JButton botaoLogin;
    private JLabel logoLol;



    public LoginScreem() {
        this.setBackground(COR_FUNDO);
        this.setLayout(null);
        this.iniciarInterface();
    }

    public void iniciarInterface() {

        labelContaRiot = new JLabel("Fazer Login");
        labelContaRiot.setBounds(110, 120, 150, 35);
        labelContaRiot.setFont(new FontUIResource("Tahoma", Font.BOLD, 22));
        labelContaRiot.setForeground(Color.decode("#111111"));

        
        this.backgraund = this.setImagem("fundo.jpg", new Rectangle(340, 0, 1024, 600));
        
        this.campoUsuario = new JTextField();
        this.campoUsuario = this.estiloCampo("NOME DE USUÁRIO", 190);
        
        this.campoSenha = new JTextField();
        this.campoSenha = this.estiloCampo("SENHA", 250);
        
        this.botaoLogin = new JButton("Entrar");
        botaoLogin.setBounds(101, 435, 113, 43);
        botaoLogin.setBackground(COR_FUNDO);
        botaoLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
        botaoLogin.addActionListener(new ActionListener() { 

            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String senha = campoSenha.getText();
                String mensagem = String.format("Loggin relizado com sucesso!\nLogin: %s\nSenha: %s", usuario, senha);
                if (usuario.equals("tair") && senha.equals("123")) {

                    JOptionPane.showMessageDialog(null, "Bem-vindo Pinstouro", "Login", JOptionPane.PLAIN_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "Senha Inválida", "Login", JOptionPane.PLAIN_MESSAGE);
                }

            }

            });
        

        this.logoLol = this.setImagem("logo.jpg", new Rectangle(150, 30, 59, 59));
 
        this.add(labelContaRiot);
        this.add(campoUsuario);
        this.add(campoSenha);
        this.add(backgraund);
        this.add(botaoLogin);
        this.add(logoLol);

    }

    private JTextField estiloCampo(String placeHolder, int posicaoY) {
        JTextField campo = new JTextField(placeHolder);
        campo.setText(placeHolder);
        campo.setBounds(45, posicaoY, 260, 50);
        campo.setBackground(Color.decode("#ededed"));
        campo.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(), BorderFactory.createEmptyBorder(15,  15, 15, 15)));
        campo.setFont(new Font("Tahoma", Font.BOLD, 10));
        campo.setForeground(Color.decode("#999999"));   
        return campo;

    }

    private JLabel setImagem(String nomeImagem, Rectangle bounds) {
        JLabel labelImagem = new JLabel("");
        ImageIcon imagem = new ImageIcon(this.getClass().getResource("Imagens/"+nomeImagem));
        labelImagem.setIcon(imagem);
        labelImagem.setBounds(bounds);
        return labelImagem;
    }


}
