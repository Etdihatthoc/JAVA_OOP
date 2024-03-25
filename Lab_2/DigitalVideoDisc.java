package Lab_2;

public class DigitalVideoDisc
{
    private String title ;
    private String category ;
    private String direction ;
    private int length ;
    private float price ;
    private int ID;

    public boolean Check(DigitalVideoDisc b)
    {
        return (b.ID == this.ID && b.title == this.title && b.category == this.category && b.direction == this.direction && b.length == this.length && b.price == this.price);
    }

    public DigitalVideoDisc(String title)
    {
        this.title = title;
    }

    public DigitalVideoDisc(String category, String title, int price)
    {
        this.category = category;
        this.title = title;
        this.price = price;
    }

    public DigitalVideoDisc(String director,String category,String title, int price)
    {
        this.direction = director;
        this.category = category;
        this.title = title;
        this.price = price;
    }

    public DigitalVideoDisc(String director,String category,String title, int price, int length)
    {
        this.length = length;
        this.direction = director;
        this.category = category;
        this.title = title;
        this.price = price;
    }
    
}