import javax.swing.JFrame;
/*
 * This class creates the window for the game
 * @auhtor Afnan Islam
 * @version 1.0
 */
public class App {
    public static void main(String[] args) throws Exception {
        /*To make the game we need row and columns. To define the height and width of the 
         * borad we need total coloum or row times each tile's pixcels.
         */
        int rowCount = 21;
        int columnCount = 19;
        int tileSize =  32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

   /*
    * using frame for the game
    */
        JFrame frame = new JFrame ("Pac Man");
        frame.setVisible(true); //setting the frame visivle
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null); //To pair with the sensor of the screen
        frame.setResizable(false); //Revoking the privillage for users to resize the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminate 

    PacMan pacmanGame = new PacMan();
    frame.add(pacmanGame);
    frame.pack();
    frame.setVisible(true);

    }
}
