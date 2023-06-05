import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.TextField;
import javax.swing.JRadioButton;
import java.awt.Dimension;
import javax.swing.JFrame;
public class Menu extends JPanel{
    JButton start;
    JLabel intructions;
    TextField name;
    JRadioButton[] difficulties = new JRadioButton[3];
    
    public Menu() {
        start = new JButton("Start game");
        intructions = new JLabel("Select a difficulty, set your name and enjoy!");
        name = new TextField(256);
        
        difficulties[0] = new JRadioButton("Easy", true);
        difficulties[1] = new JRadioButton("Medium");
        difficulties[2] = new JRadioButton("Hard");
        
        
    }
}
