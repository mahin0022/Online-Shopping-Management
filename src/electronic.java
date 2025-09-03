public class electronic extends Product {
    int warranty;

    public electronic(int id, String name, int price, int warranty) {
        super(id, name, price);
        this.warranty = warranty;
    }

    public void displaydetails(){
        System.out.println("Product ID: " + id + "Product Name: " + name + "Product Price: "+ price +"Product Warranty: "+warranty+"Years");
    }
}