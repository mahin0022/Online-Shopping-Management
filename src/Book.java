public class Book extends Product {
    String author;

    public Book(int id,String name,int price,String author){
        super(id,name,price);
        this.author = author;
    }
    public void displaydetails(){
        System.out.println("Product ID: " + id + "Product Name: " + name + "Product Price: "+ price+ "Author Name: "+ author);
    }
}
