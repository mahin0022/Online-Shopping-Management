public class Product {
    int id;
    String name;
    int price;

    public Product(int id,String name,int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    public void displaydetails(){
        System.out.println("Product ID: " + id + "Product Name: " + name + "Product Price: " );
    }
}
