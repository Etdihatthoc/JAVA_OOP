package Screen.manager;
import Media.*;

import java.awt.event.*;

import javax.swing.*;

import java.awt.*;

public class MediaStore extends JPanel{
    private media me; 

    public MediaStore(media me)
    {
        this.me = me;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(me.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 15));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel("" + me.getCost() +" $");
        title.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        if (me instanceof Playable)
        {
            JButton playButton = new JButton("Play");
            container.add(playButton);
            //JMenuItem addDVD = new JMenuItem ("Add DVD");
            //smUpdateStore.add(addDVD);
            playButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed (ActionEvent e) {
                    new Playmedia(me);
                }
            });
        
        }

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
