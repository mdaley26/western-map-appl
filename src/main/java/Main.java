
/**
 * Main class for launching the LoginFrame GUI application.
 */
public class Main {

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
}
