public class Clothing extends Product {
    String size;
    public Clothing(int id,String name,int price,String size){
        super(id,name,price);
        this.size = size;
    }
    public void displaydetails(){
        System.out.println("Product ID: " + id + "Product Name: " + name + "Product Price: "+ price+"Product Size: "+size);
    }

}
