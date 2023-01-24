import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    //1 - Up, 2 - Down, 3 - Left, 4 - Right
    int direction = 4;

    int x = 256;
    int y = 256;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dandy Tanks");
        frame.setMinimumSize(new Dimension(576,576));
        frame.getContentPane().add(new Main());
        frame.setLocation(0,0);
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
