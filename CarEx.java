public class CarEx {
    
   String brand ;
   String coloure;
   int price;
    int maxSpeed ;

    CarEx(String brand, String coloure, int price, int maxSpeed){
        
        this.brand = brand;
        this.coloure = coloure;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public static void main(String[] args) {
        CarEx c1 = new CarEx("BMW", "White", 3000, 300);
        CarEx c2 = new CarEx("Thar", "Black", 2000, 200);
        CarEx c3 = new CarEx("Tata","Red", 2000, 100);

        c1.display();
        c2.display();
        c3.display();
    }

    void display(){
      System.out.println("Brand is: "+brand);
      System.out.println("Colour is: "+coloure);
      System.out.println("Price is: "+price);
      System.err.println("Maximum speed is: "+maxSpeed);
      System.out.println("_________________________________");
    }
}