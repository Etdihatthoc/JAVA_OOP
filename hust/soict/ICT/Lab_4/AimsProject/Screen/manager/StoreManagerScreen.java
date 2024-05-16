package Screen.manager;
import Media.*;

import java.awt.event.*;
import java.util.ArrayList;


import javax.swing.*;

import AIMS.Store;

import java.awt.*;

public class StoreManagerScreen extends JFrame
{
    private Store store;
    
    JPanel createNorth()
    {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }
    
    JMenuBar createMenuBar() 
    {
        JMenu menu = new JMenu("Options");
        
        menu.add(new JMenuItem("View store"));

        JMenu smUpdateStore  = new JMenu("Update Store");

        JMenuItem addBook = new JMenuItem ("Add Book");
        smUpdateStore.add(addBook);
        addBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                new AddBookToStoreScreen(store);
                dispose();
            }
        });
        
        JMenuItem addCD = new JMenuItem ("Add CD");
        smUpdateStore.add(addCD);
        addCD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                new AddCompactDiscToStoreScreen(store);
                dispose();
            }
        });
        
        JMenuItem addDVD = new JMenuItem ("Add DVD");
        smUpdateStore.add(addDVD);
        addDVD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                new AddDigitalVideoDiscToStoreScreen(store);
                dispose();
            }
        });
        
        menu.add(smUpdateStore);
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);
        return menuBar;
    }

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

    JPanel createCenter() 
    {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout (3, 3, 2, 2));
        ArrayList<media> mediaInStore = store.getItemsInStore();
        for (int i = 0; i < mediaInStore.size(); ++i) {
        MediaStore cell = new MediaStore (mediaInStore.get(i)); center.add(cell);
        }
        return center;
    }

    public StoreManagerScreen(Store store) 
    {
        this.store = store;

        Container cp = getContentPane();
        cp.setLayout((new BorderLayout()));
        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setTitle("Store");
        setSize(1024,690);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
}
