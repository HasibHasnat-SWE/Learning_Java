public class TypeCasting{
    public static void main(String[] args) {
        //Implicit casting
        //hierarchy low to high
        //byte->short->char->int->long->float->double
        short firstNum=1;
        int secondNum=firstNum+20;
        System.out.println(secondNum);

        //Type casting
        double x1=1.1;
        //int y1=x1+2;
        int y1=(int)x1+3;
        System.out.println(y1);
    }
}