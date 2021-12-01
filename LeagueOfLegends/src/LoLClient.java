import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class LoLClient {
    public static void main(String[] args) throws Exception {

        JFrame loginScreem = new JFrame();
        loginScreem.setBounds(150, 50, 1024, 600);
        loginScreem.setUndecorated(true);
        LoginScreem telaLogin = new LoginScreem();
        loginScreem.add(telaLogin);

        loginScreem.setVisible(true);
        loginScreem.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        
    }
}
