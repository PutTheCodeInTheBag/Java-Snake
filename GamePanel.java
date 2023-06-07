import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GamePanel extends JPanel {
    
    int gameSize = Menu.gridSpace;
    JPanel[] spaces = new JPanel[gameSize * gameSize];
    
    public GamePanel() {

        this.setLayout(new GridLayout(gameSize, gameSize));
        System.out.println(gameSize);
        for(JPanel j : spaces) {
            j = new JPanel();
            j.setBackground(Color.BLACK);
            this.add(j);
        }        
        SwingUtilities.updateComponentTreeUI(StartSnake.frame);
    }
}
