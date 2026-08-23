public class Arrays{
    public static void main(String[] args) {
        int[] a= new int[5];
        //or
        int[] b= {10,20,30,40,50};

        //two dimensional array
        String[][] arr={
            {"a","b","c","d","e"},
            {"a","b","c","d","e"}
        };
        for(String[] row: arr){
            for(String elements: row){
                System.out.print(elements+" ");
            }
            System.out.println();
        }
    }
}