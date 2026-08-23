class Box {
    double width;
    double height;
    double depth;

    // Constructor
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    void boxInit(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    protected void vol() {
        double total_volume = this.width * this.height * this.depth;
        System.out.println("Volume of box: " + total_volume);
    }
}
public class BoxDemonstration {
    public static void main(String[] args) {
        Box box1 = new Box(10, 5, 10);
        Box box2 = new Box(5, 10, 15);

        box1.vol();
        box2.vol();
        System.out.println("Width of box1: " + box1.width);

//        double volume = box1.width * box1.height * box1.depth;
//        System.out.println("Volume of box1: " + volume);

//        volume = box2.width * box2.height * box2.depth;
//        System.out.println("Volume of box2: " + volume);
    }
}