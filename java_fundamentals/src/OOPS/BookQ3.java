package OOPS;
public class BookQ3 {
    private String name;
    private AuthorQ3 author;
    private double price;
    private int qtyInStock;

    public BookQ3(String name, AuthorQ3 author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public AuthorQ3 getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public String toString() {
        return "Book Name: " + name + "\n" +
               "Price: " + price + "\n" +
               "Quantity in Stock: " + qtyInStock + "\n" +
               author.toString();
    }
}
