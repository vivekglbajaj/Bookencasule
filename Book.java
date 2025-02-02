public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void settile(String title){
        this.title = title;
    }
    public String gettitle(){
        return title;
    }
    public void setauthor(String author){
        this.author = author;
    }
    public String getauthor(){
        return author;
    }
    private void setprice(double price){
        this.price = price;
    }
    private double getprice(){
        return price;
    }
    public static void display(String title, String author, double price){
        System.out.println("Title: " + title + "Author: " + author + "Price: " + price);
    }
    public static void main(String[] args) {
        Book book = new Book(" ", " ", 0);
        book.settile("adsf");
        book.setauthor("dfd");
        book.setprice(0);
        book.display(book.gettitle(), book.getauthor(), book.getprice());
    }
}
