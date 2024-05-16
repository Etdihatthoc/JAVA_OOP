import AIMS.Store;
import Media.*;
import Screen.manager.StoreManagerScreen;

public class Aims 
{
    public static void main(String[] args) 
    {
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
        CompactDisc dvd9 = new CompactDisc("CD 9", "CD 9", "Director 1", 125, 21.99f,"Director 2");
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