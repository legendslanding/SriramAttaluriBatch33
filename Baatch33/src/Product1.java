public class Product1 {
    public double price;
    public double quantity;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPrice(double price, double quantity) {
        this.price = price;
        this.quantity = quantity;
    }





    public double getPrice() {
        return price;
    }
    public double getPrice(double price,double quantity) {
        return price*quantity;
    }

    public static void main(String args[]){
        Product1 p1 = new Product1();
        p1.setPrice(20000000);
        System.out.println("Price of qunatity before overloading :" +p1.getPrice());
        System.out.println("Price of quantity after overloading the get method is :"+ p1.getPrice(2,5));
    }
}
