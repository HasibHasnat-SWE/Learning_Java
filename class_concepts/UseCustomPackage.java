package class_concepts;
import class_concepts.multiclass.customPackage;

public class UseCustomPackage {
    public static void main(String[] args) {
        customPackage customObject = new customPackage();
        System.out.println(customObject.x);
    }
}