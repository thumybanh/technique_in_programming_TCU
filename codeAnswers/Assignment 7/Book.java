public class Book {
    private String title;
    private String author;
    private double price;
    private int pages;
    private boolean isDigital;

    public Book(String title, String author, double price, int pages, boolean digital){
        this.title = title;
        this.author = author;
        this.price = price;
        this.pages = pages;
        isDigital = digital;
    }
    public Book(Book other, double newPrice){
        this.title = other.getTitle();
        this.author = other.getAuthor();
        this.price = newPrice;
        this.pages = other.getPages();
        this.isDigital = other.isDigital();
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public int getPages(){
        return pages;
    }
    public boolean isDigital(){
        return isDigital;
    }
    public String toString(){
        return "Book title: " + title + "\nauthor: " + author + "\nPrice: " + price + "\nTotal pages: " + pages + "\nIs digital: " + isDigital;
    }
}
