import javax.swing.JFrame;
import java.awt.BorderLayout;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Dimension;
public class StartSnake {
    static JFrame frame;
    static Menu Menu = new Menu();
    
    public StartSnake() {
        frame = new JFrame("Snake Game");
        
        frame.add(Menu, BorderLayout.NORTH);
        
        frame.setDefaultCloseOperation(3);
        frame.setLocationRelativeTo(null);
        frame.setMinimumSize(new Dimension(700, 600));
        frame.setExtendedState(MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
