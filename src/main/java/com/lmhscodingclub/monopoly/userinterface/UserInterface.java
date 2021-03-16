import java.awt.*;
import javax.swing.*;

class UserInterface extends JFrame {
  private static final long serialVersionUID = 1L;

  public static void main(String[] args) {
    UserInterface frame = new UserInterface();

  }

  public UserInterface() {
    // Font mainFont = new Font("Arial", Font.PLAIN, 20);
  
    JPanel gui = new JPanel();
    gui.setBackground(Color.LIGHT_GRAY);
    gui.setPreferredSize(new Dimension(300,0));

    //just placeholders for now
    int move=1;
    int player=1;
    int balance=1500;
    
    JLabel jMove = new JLabel("Turn: " + move);    
    JLabel jPlayer = new JLabel("Player: " + player);
    JLabel jBalance = new JLabel("Current Balance: $" + balance);
    JButton rollDice = new JButton("Roll Dice");
    JButton tradeProperty = new JButton("Trade Property");
    
    gui.setLayout(new FlowLayout());
    gui.add(jMove);
    gui.add(jPlayer);
    gui.add(jBalance);
    gui.add(rollDice);
    gui.add(tradeProperty);
    add(gui, BorderLayout.EAST);

    //board
    JPanel template = new JPanel();
    JPanel board = new JPanel();
    board.setBackground(Color.decode("#cde6d0"));
    board.setPreferredSize(new Dimension(750,750));
    board.setLayout(new GridBagLayout());
    board.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));

    JLabel logo = new JLabel("MONOPOLY");
    logo.setFont(new Font("Arial Black", Font.BOLD, 50));
    logo.setOpaque(true);
    logo.setBackground(Color.RED);
    logo.setForeground(Color.WHITE);
    logo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 7));
    template.add(board, BorderLayout.CENTER);
    board.add(logo);
    add(template);

    //spaces
    // JButton button = new JButton("Test");
    // board.add(button);
    // JButton button1 = new JButton("Test");
    // board.add(button1);
    
    //set resolution
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int height = (int)(screenSize.getHeight());
    int width = (int)(screenSize.getWidth());    
    setSize(width, height);    
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    setTitle("Monopoly");
  }
}