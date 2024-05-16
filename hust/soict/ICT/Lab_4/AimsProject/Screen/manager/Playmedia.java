package Screen.manager;

import Media.*;

import javax.swing.*;

import java.awt.*;

public class Playmedia extends JFrame{
    private media me;

    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout (header, BoxLayout.X_AXIS));

        JLabel title= new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50)); 
        title.setForeground(Color.CYAN);

        header.add(Box.createRigidArea (new Dimension (10, 10))); 
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea (new Dimension (10, 10)));
        
        return header;
    }
    
    JPanel createNorth()
    {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createHeader());
        return north;
    }
    JPanel createCenter() {
    JPanel center = new JPanel();
    center.setLayout(new GridLayout());

    StringBuilder s = new StringBuilder();
    // Assume me is either CompactDisc or DigitalVideoDisc
    if (me instanceof CompactDisc) {
        CompactDisc cds = (CompactDisc) me;
        s = cds.playy();
    } else if (me instanceof DigitalVideoDisc) {
        DigitalVideoDisc dvd = (DigitalVideoDisc) me;
        s = dvd.playy();
    }
    //JLabel label = new JLabel("<html>First line<br>Second line</html>");
    JLabel label = new JLabel("<html>" + s.toString().replaceAll("\n", "<br>") + "</html>");
    center.add(label);

    return center;
}


    public Playmedia(media me) {
        this.me = me;
        
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());        
        cp.add(createCenter(), BorderLayout.CENTER);
        cp.add(createNorth(), BorderLayout.NORTH);

        setTitle("Media-play");
        setSize(300,345);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
