public class Bike {
//charactaristics
    int speed = 0;
    int noOfGears;
    String breaki;

//methods
    int acceleration() {
        System.out.println("Accelerating");
        return 0;
    };


    public static void main(String[] args) {
//Objects
        Bike hero = new Bike();
        Bike runner = new Bike();
        Bike honda = new Bike();
        Bike Yamaha= new Bike();
        System.out.println("Yamaha bikes initial speed:"+ Yamaha.speed);
    }


}