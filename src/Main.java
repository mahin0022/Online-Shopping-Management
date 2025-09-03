import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> myProduct = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (;;){
            System.out.println("/n ===== Online Shopping Store =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display all Products");
            System.out.println("3. Search Product by Name");
            System.out.println("4. Calculate Total Price");
            System.out.println("5. EXIT");
            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1 ){
                System.out.println("Enter product Type(1. Electronics, 2. Clothing, 3. Book):");
                int type = sc.nextInt();
                System.out.print("Enter Product ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Product Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Product Price: ");
                int price = sc.nextInt();
                sc.nextLine();
                if (type == 1){
                    System.out.print("Enter Warranty Period: ");
                    int warranty = sc.nextInt();
                    sc.nextLine();
                    myProduct.add(new electronic(id,name,price,warranty));
                    System.out.println("Product Added");
                }
                if(type== 2){
                    System.out.print("Enter product Size");
                    String size = sc.nextLine();
                    myProduct.add(new Clothing(id,name,price,size));
                    System.out.println("Product Added");
                }

                if(type == 3){
                    System.out.print("Enter Author name ");
                    String author = sc.nextLine();
                    myProduct.add(new Book(id,name,price,author));

                    System.out.println("Product Added");
                }
            }

            if(choice == 2){
                for (Product p : myProduct){
                    p.displaydetails();
                }
            }

            if(choice == 3){
                System.out.println("Search Product by name ");
                String search = sc.nextLine();
                boolean found = false;
                for (Product p : myProduct) {
                    if (p.getName().equalsIgnoreCase(search)) {
                        System.out.print("Product Found: ");
                        p.displaydetails();
                        found = true;
                    }
                    if (!found){
                        System.out.println("Product not Found ");
                    }
                }
            }
            if (choice == 4){
                double total = 0;
                for (Product p : myProduct){
                    total = total + p.getPrice();
                }
                System.out.println("Total Price of all products");
            }
            if (choice == 5){
                System.out.println("Exiting... Thank you for using Online Shopping Store!");
                break;
            }
        }
    }
}