import javax.swing.JFrame;
import java.awt.BorderLayout;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Dimension;
public class StartSnake {
    JFrame frame;
    
    public StartSnake() {
        frame = new JFrame("Snake Game");
        
        frame.add(new Menu(), BorderLayout.NORTH);
        
        frame.setDefaultCloseOperation(3);
        frame.setLocationRelativeTo(null);
        frame.setMinimumSize(new Dimension(600, 600));
        frame.setExtendedState(MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
