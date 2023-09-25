package GUI_TEST;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
public class prac5 extends JComponent {
    Image image;

    public prac5()
    {
        JFrame frame = new JFrame("Anime");
        frame.add(this);
        frame.setSize(220, 270);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        ArrayList<Image> images = new ArrayList<>();
        File[] files = new File("src/GUI_TEST/images").listFiles();
        for(File f : files) {
            images.add(new ImageIcon(f.getAbsolutePath()).getImage());
        }

        image = images.get(0);
        int i = 0;
        while (true){
            try
            {
                image = images.get(i);
                this.repaint();
                Thread.sleep(70);
                if(i < files.length-1)
                    i++;
                else
                    i = 0;
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }

    }
    public void paint(Graphics g){
        Graphics2D gr = (Graphics2D)g;
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        gr.drawImage(image, 0, 0,null);
    }

}
