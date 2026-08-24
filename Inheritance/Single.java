class vehicle{
    void start(){
        System.out.println("Vehicle is starting");
    }
}
class Car extends vehicle{
    void accelerate(){
        System.out.println("Car is accelerating");
    }
}
public class Single{
    public static void main(String[] args) {
        Car toyotaChr=new Car();
        toyotaChr.start();
        toyotaChr.accelerate(); 
    }
}