import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    final int BF_WIDTH = 576;
    final int BF_HEIGHT = 576;

    //1 - Up, 2 - Down, 3 - Left, 4 - Right
    int direction = 1;

    int x = 256;
    int y = 256;

    void moveUp() throws Exception {
        direction = 1;
        while (y != 0 ){
            y--;
            Thread.sleep(33);
            repaint();
        }
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();

        main.moveUp();
    }

    Main(){
        JFrame frame = new JFrame("Dandy Tanks");
        frame.setMinimumSize(new Dimension(BF_WIDTH,BF_HEIGHT));
        frame.getContentPane().add(this);
        frame.setLocation(0,0);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    //Tank
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(x,y,64,64);

        g.setColor(Color.GREEN);
        if(direction == 1){
            g.fillRect(x + 20,y,24,34);
        }else if(direction == 2){
            g.fillRect(x + 20 ,y + 30,24,34);
        }else if(direction == 3){
            g.fillRect(x,y + 20,34,24);
        }else  if(direction == 4 ){
            g.fillRect(x + 30,y + 20,34,24);
        }



    }
}
