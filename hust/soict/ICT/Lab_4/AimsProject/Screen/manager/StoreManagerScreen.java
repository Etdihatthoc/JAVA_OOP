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

    public static void main(String[] args) {
        Store a = new Store();

        // Tạo 9 đối tượng DVD với thông tin khác nhau
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("DVD 1", "Category 1", "Director 1", 120, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("DVD 2", "Category 2", "Director 2", 90, 14.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("DVD 3", "Category 1", "Director 3", 110, 17.49f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("DVD 4", "Category 3", "Director 2", 105, 15.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("DVD 5", "Category 2", "Director 1", 95, 12.99f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("DVD 6", "Category 3", "Director 3", 130, 20.49f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("DVD 7", "Category 1", "Director 3", 115, 18.99f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("DVD 8", "Category 2", "Director 2", 100, 16.49f);
        Track a1 = new Track("track1", 43);
        Track a2 = new Track("track2", 43);
        Track a3 = new Track("track3", 43);
        CompactDisc dvd9 = new CompactDisc("CD 9", "Category 3", "Director 1", 125, 21.99f,"Director 2");
        dvd9.addTrack(a1);
        dvd9.addTrack(a2);
        dvd9.addTrack(a3);

        // Thêm các đối tượng DVD vào danh sách
        a.addMedia(dvd1);
        a.addMedia(dvd2);
        a.addMedia(dvd3);
        a.addMedia(dvd4);
        a.addMedia(dvd5);
        a.addMedia(dvd6);
        a.addMedia(dvd7);
        a.addMedia(dvd8);
        a.addMedia(dvd9);
        
        new StoreManagerScreen(a);
    }
}
