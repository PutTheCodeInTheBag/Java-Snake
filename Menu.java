
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.TextField;
import javax.swing.JRadioButton;

public class Menu extends JPanel{
    JButton start;
    JLabel instructions;
    TextField name;
    static JRadioButton[] difficulties = new JRadioButton[3];
    
    static int gridSpace = 10;
    
    public Menu() {
        start = new JButton("Start game");
        instructions = new JLabel("Select a difficulty, set your name and enjoy!");
        name = new TextField("Ghost", 16);
        
        difficulties[0] = new JRadioButton("Easy", true);
        difficulties[1] = new JRadioButton("Medium");
        difficulties[2] = new JRadioButton("Hard");
        
        start.addActionListener(e -> startGame());
        
        for(int i = 0; i < difficulties.length; i++) {
            int id = i;
            difficulties[i].addActionListener(e -> onlyActive(id));
        }
        
        this.add(name);
        this.add(instructions);
        this.add(difficulties[0]);
        this.add(difficulties[1]);
        this.add(difficulties[2]);
        this.add(start);
    }
    
    private static void onlyActive(int id) {
        for(int i = 0; i < 3; i++) {
            if(id != i) {
                difficulties[i].setSelected(false);
            }
        }
        switch(id) {
            case 0: gridSpace = 10;
            break;
            case 1: gridSpace = 12;
            break;
            case 2: gridSpace = 15;
            break;
        }
    }
    
    private static void startGame() {
        StartSnake.frame.remove(StartSnake.Menu);
        StartSnake.frame.add(new GamePanel(), BorderLayout.CENTER);
        
        new Snake();
    }
}
