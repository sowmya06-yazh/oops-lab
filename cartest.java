package one;
class Car { 
    String model; 
    String color; 
 
    Car(String model, String color) { 
        this.model = model; 
        this.color = color; 
    } 
 
    void start() { 
        System.out.println(model + " is star ng."); 
    } 
 
    void stop() { 
        System.out.println(model + " is stopping."); 
    } 
} 
 
public class cartest { 
    public static void main(String[] args) { 
        Car myCar = new Car("Toyota Corolla", "Red"); 
        System.out.println("Car Model: " + myCar.model); 
        System.out.println("Car Color: " + myCar.color); 
        myCar.start(); 
myCar.stop(); 
} 
}
