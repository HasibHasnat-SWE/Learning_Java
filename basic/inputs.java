import java.util.*;
public class inputs{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        /*nextBoolean()->reads boolean
          nextByte()->reads a byte
          nextDouble()->reads a double
          nextFloat()->reads a float
          nextInt()->reads an Integer
          nextLine()->reads a String
          nextLong()-> reads a long
          nextShort()->reads a short
           */
          //Integer
          System.out.println("Enter the nums: ");
          int firstNum=scanner.nextInt();
          System.out.println(firstNum);
          
          scanner.nextLine();
          //String 
          System.out.println("Enter Name: ");
          String username=scanner.nextLine();
          System.out.println(username);

    }
}
