package objectOrientedProgramming;

public class Product {
    public double price;

    public void setPrice(double price) {
        this.price = price;
    }




    public double getPrice() {
        return price;
    }
    public double getPrice(double quantity) {
        return price*quantity;
    }

    public static void main(String args[]){
        Product p1 = new Product();
        p1.setPrice(20000000);
        System.out.println("Price of qunatity before overloading :" +p1.getPrice());
        System.out.println("Price of quantity after overloading the get method is :"+ p1.getPrice(5));
    }
}
