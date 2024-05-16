package Screen.manager;
import Media.*;
import java.awt.event.*;
import javax.swing.*;

import AIMS.Store;

import java.awt.*;

public class AddBookToStoreScreen extends JFrame{
    private Store store;
    private JButton btnSubmit;
    public JTextField TfTitle, TfCost, TfID, TfCate;

    JPanel createSouth () {

        JPanel south = new JPanel();
        south.setLayout(new BoxLayout(south, BoxLayout.X_AXIS));
        btnSubmit = new JButton("Submit");
        btnSubmit.setAlignmentX(CENTER_ALIGNMENT);
        south.add(btnSubmit);
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                int numberIn = Integer.parseInt(TfID.getText());
                float c = Float.parseFloat(TfCost.getText());
                Books tmp = new Books(numberIn, TfCate.getText() ,TfTitle.getText(),c);
                store.addMedia(tmp);
                System.out.println(store.getItemsInStore().size());     
                //dispose();          
            }
            
        });
        return south;
    }
    JMenuBar createMenuBar() 
    {
        JMenu menu = new JMenu("Options");
        JMenuItem viewstore = new JMenuItem ("View store");
        menu.add(viewstore);
        viewstore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                new StoreManagerScreen(store);
                dispose();
            }
        });
        //menu.add(new JMenuItem("View store"));

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
    
    JPanel createNorth()
    {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }
    JPanel createCenter() {
        
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(4, 2, 5, 5));
        center.add(new JLabel("Enter the Title"));

        TfTitle = new JTextField();
        center.add(TfTitle);
        
        center.add(new JLabel("Enter the ID"));

        TfID = new JTextField();
        center.add(TfID);

        center.add(new JLabel("Enter the Cost"));

        TfCost = new JTextField();
        center.add(TfCost);

        center.add(new JLabel("Enter the Category"));

        TfCate = new JTextField();
        center.add(TfCate);
        return center;   
    }

    public AddBookToStoreScreen (Store store) {
        this.store = store;
        
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());        
        cp.add(createCenter(), BorderLayout.CENTER);
        cp.add(createSouth(), BorderLayout.SOUTH);
        cp.add(createNorth(), BorderLayout.NORTH);

        setTitle("Book");
        setSize(1024,690);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
